package com.ims.springjwt.services.impl;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.repository.MaterialsRepository;
import com.ims.springjwt.services.MaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialsServiceimpl implements MaterialsService {
    @Autowired
    MaterialsRepository materialsRepository;


    @Override
    public Materials saveMaterialsServices(Materials materials) {
        return materialsRepository.save(materials);
    }

    @Override
    public List<Materials> getMaterialsServices() {
        return materialsRepository.findAll();
    }

    @Override
    public List<Materials> fetchMaterialsBasedOnUserService(Long userId) {
        return materialsRepository.fetchMaterialsBasedOnUser(userId);
    }

    @Override
    public int quantityAvailable(Long materialId) {
        int x = materialsRepository.countUserMaterials(materialId);
        int y = materialsRepository.findById(materialId).get().getQty();
        int z = y - x;
        return z;
    }
}
