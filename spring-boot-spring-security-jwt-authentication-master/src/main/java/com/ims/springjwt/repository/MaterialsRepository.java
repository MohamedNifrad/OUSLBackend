package com.ims.springjwt.repository;

import com.ims.springjwt.models.Materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialsRepository extends JpaRepository<Materials, Long> {
    @Query(value ="select * from materials inner join user_materials um on materials.id = um.material_id where user_id = ?1",nativeQuery = true)
    List<Materials> fetchMaterialsBasedOnUser(Long userId);

    @Query(value ="select count(*) from user_materials where material_id = ?1",nativeQuery = true)
    int countUserMaterials(Long materialId);
}
