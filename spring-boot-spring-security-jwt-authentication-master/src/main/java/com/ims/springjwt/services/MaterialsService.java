package com.ims.springjwt.services;

import com.ims.springjwt.models.Materials;

import java.util.List;

public interface MaterialsService {

    public Materials saveMaterialsServices(Materials materials);

    public List<Materials> getMaterialsServices();

    List<Materials> fetchMaterialsBasedOnUserService(Long userId);

    int quantityAvailable(Long materialId);
}
