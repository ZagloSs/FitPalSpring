package com.fitpal.spring.controllers;


import com.fitpal.spring.models.DiaGym;
import com.fitpal.spring.services.DiaGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diagym")
public class DiaGymController {

    @Autowired
    private DiaGymService service;

    @GetMapping("/all")
    public List<DiaGym> getAllDays(){
        return service.getAllDays();
    }
}
