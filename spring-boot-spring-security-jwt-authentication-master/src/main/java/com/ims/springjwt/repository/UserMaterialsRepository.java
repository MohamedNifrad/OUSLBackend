package com.ims.springjwt.repository;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.models.UserMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserMaterialsRepository extends JpaRepository<UserMaterials, Long> {
    @Query(value ="select * from materials inner join user_materials um on materials.id = um.material_id where user_id = ?1",nativeQuery = true)
    List<Materials> fetchMaterialsBasedOnUser(Long userId);
}
