package com.ims.springjwt.services;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.models.UserMaterials;

import java.util.List;

public interface UserMaterialsService {

    public UserMaterials saveMyUserMaterialsServices(UserMaterials userMaterials);

    public List<UserMaterials> getUserMaterialsServices();

    List<Materials> fetchMaterialsBasedOnUser(Long userId);
}
