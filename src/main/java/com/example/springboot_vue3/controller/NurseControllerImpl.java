// NurseControllerImpl.java
package com.example.springboot_vue3.controller;

import com.example.springboot_vue3.model.Nurse;
import com.example.springboot_vue3.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NurseControllerImpl extends NurseController {
    private final NurseRepository nurseRepository;

    @Autowired
    public NurseControllerImpl(NurseRepository nurseRepository) {
        super(nurseRepository);
        this.nurseRepository = nurseRepository;
    }

    @GetMapping("/All_nurses")
    public List<Nurse> getNurses() {
        return nurseRepository.findAll();
    }

}