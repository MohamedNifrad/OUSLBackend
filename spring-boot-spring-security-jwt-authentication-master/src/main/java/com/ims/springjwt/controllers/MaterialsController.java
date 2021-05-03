package com.ims.springjwt.controllers;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.services.MaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/materials")
public class MaterialsController {
    @Autowired
    MaterialsService materialsService;

    @PostMapping("/save")
    public Materials save(@RequestBody Materials materials)
    {
        return materialsService.saveMaterialsServices(materials);
    }


    @GetMapping("/get")
    public List<Materials> get()
    {
        return materialsService.getMaterialsServices();
    }

    @GetMapping("/get-materials/{userId}")
    public List<Materials> getMaterials(@PathVariable Long userId)
    {
        return materialsService.fetchMaterialsBasedOnUserService(userId);
    }

}
