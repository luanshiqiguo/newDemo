package com.example.newdemo.controller;

import com.example.newdemo.bean.Depart;
import com.example.newdemo.service.DepartService;
import com.example.newdemo.service.DepartServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartController {
    @Resource
    private DepartService departService = new DepartServiceImpl();

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<Depart> selectAll() {
        List<Depart> list = departService.selectAll();
        return list;
    }
}