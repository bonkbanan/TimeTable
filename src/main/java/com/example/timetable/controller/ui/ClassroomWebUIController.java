package com.example.timetable.controller.ui;

import com.example.timetable.services.classroom.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/rooms")
public class ClassroomWebUIController {

    @Autowired
    ClassroomService service;

    @RequestMapping()
    String getAll(Model model){
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
    @RequestMapping("/delete/{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
    @RequestMapping("/renew")
    String getAll2(Model model){
        model.addAttribute("rooms",service.reNew());
        return "classrooms";
    }
}
