package com.shm.controller;

import com.shm.entity.Studentt;
import com.shm.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class StuController {
    @Autowired
    private StuService service;

    @RequestMapping("/list")
    public String list(Model model){
        List<Studentt> list =service.getList();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
}
