package com.example.timetable.controller.ui;

import com.example.timetable.form.RoomForm;
import com.example.timetable.model.Classroom;
import com.example.timetable.services.classroom.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        service.reNew();
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }

    @GetMapping("/create")
    String create(Model model){
        RoomForm roomForm = new RoomForm();
        model.addAttribute("form",roomForm);
        return "createroom";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("form") RoomForm form){
        Classroom classroom = new Classroom();
        classroom.setName(form.getName());
        classroom.setCapacity(form.getCapacity());
        service.create(classroom);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }

    @GetMapping("/update/{id}")
    String update(Model model,  @PathVariable("id") String id){
        Classroom classroom =service.get(id);
        RoomForm roomForm = new RoomForm();
        roomForm.setId(classroom.getId());
        roomForm.setName(classroom.getName());
        roomForm.setCapacity(classroom.getCapacity());
        model.addAttribute("form",roomForm);
        return "updateform";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    String update(Model model, @ModelAttribute("form") RoomForm form){
        Classroom classroom = new Classroom();
        classroom.setId(form.getId());
        classroom.setName(form.getName());
        classroom.setCapacity(form.getCapacity());
        service.update(classroom);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
}
