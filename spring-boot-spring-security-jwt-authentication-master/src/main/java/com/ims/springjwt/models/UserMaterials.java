package com.ims.springjwt.models;

import javax.persistence.*;

@Entity
public class UserMaterials {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "materialId", referencedColumnName = "id")
    private Materials materials;

    public UserMaterials() {
    }

    public UserMaterials(User user, Materials materials) {
        this.user = user;
        this.materials = materials;
    }

    public UserMaterials(Long id, User user, Materials materials) {
        this.id = id;
        this.user = user;
        this.materials = materials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "UserMaterials{" +
                "id=" + id +
                ", user=" + user +
                ", materials=" + materials +
                '}';
    }
}

