package com.sena.senaapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.sena.senaapi.entity.Local;
import com.sena.senaapi.service.LocalService;

import java.util.List;

@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAll")
    public List<Local> findAll(){
        return localService.findAll();
    }
}
