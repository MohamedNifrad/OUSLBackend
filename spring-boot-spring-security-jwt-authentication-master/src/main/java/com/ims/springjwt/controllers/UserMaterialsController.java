package com.ims.springjwt.controllers;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.models.UserMaterials;
import com.ims.springjwt.services.UserMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user-materials")
public class UserMaterialsController {

    @Autowired
    UserMaterialsService userMaterialsService;
    @PostMapping("/save")
    public UserMaterials save(@RequestBody UserMaterials userMaterials)
    {
        return userMaterialsService.saveMyUserMaterialsServices(userMaterials);
    }


    @GetMapping("/get")
    public List<UserMaterials> get()
    {
        return userMaterialsService.getUserMaterialsServices();
    }

    @GetMapping("/getmaterials/{userId}")
    public List<Materials> getMaterials(@PathVariable Long userId)
    {
        return userMaterialsService.fetchMaterialsBasedOnUser(userId);
    }
}
