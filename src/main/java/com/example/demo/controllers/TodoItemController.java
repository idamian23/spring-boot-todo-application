package com.example.demo.controllers;

import java.time.Instant;
import java.time.ZoneId;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.TodoItemRepository;

@Controller
public class TodoItemController {
    private final Logger logger = LoggerFactory.getLogger(TodoItemController.class);

    @Autowired
    private TodoItemRepository todoItemRepository;

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems",todoItemRepository.findAll());


        return modelAndView;
    }

}
