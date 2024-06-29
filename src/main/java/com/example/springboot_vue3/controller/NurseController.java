// NurseController.java
package com.example.springboot_vue3.controller;

import com.example.springboot_vue3.model.Nurse;
import com.example.springboot_vue3.repository.NurseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NurseController {
    private final NurseRepository nurseRepository;

    public NurseController(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }

    @GetMapping("/nurses")
    public List<Nurse> getNurses() {
        return nurseRepository.findAll();
    }

    @GetMapping("/nurses/search")
    public List<Nurse> searchNurses(@RequestParam(required = false) String name, @RequestParam(required = false) String sex ,@RequestParam(required = false) String room, @RequestParam(required = false) String grade) {
        return nurseRepository.findByNameAndSexAndRoomAndGrade(name, sex, room, grade);
    }
}