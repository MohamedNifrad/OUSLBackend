package com.ims.springjwt.services.impl;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.models.UserMaterials;
import com.ims.springjwt.repository.UserMaterialsRepository;
import com.ims.springjwt.services.UserMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMaterialsServiceimpl implements UserMaterialsService {
    @Autowired
    UserMaterialsRepository userMaterialsRepository;

    @Override
    public UserMaterials saveMyUserMaterialsServices(UserMaterials userMaterials) {
        return userMaterialsRepository.save(userMaterials);
    }

    @Override
    public List<UserMaterials> getUserMaterialsServices() {
        return userMaterialsRepository.findAll();
    }

    @Override
    public List<Materials> fetchMaterialsBasedOnUser(Long userId) {
        return userMaterialsRepository.fetchMaterialsBasedOnUser(userId);
    }
}
