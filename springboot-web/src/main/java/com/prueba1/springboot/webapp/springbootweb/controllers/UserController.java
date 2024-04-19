package com.prueba1.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //solo para model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba1.springboot.webapp.springbootweb.model.User;

import java.util.Map; //solo para map


@Controller
public class UserController {

    @GetMapping("/details") //endpoint
    public String details(Model modelo, User usuario) { //ui
        //metodo con los setters
        modelo.addAttribute("titulo", "Hola mundo CERTUS"); //addAtribute => attributeName / attributeValue
        usuario.setNombre("Piero");
        usuario.setApellido("Batti");
        modelo.addAttribute("usuario", usuario);
        return "details";
    }

    //Otra forma
    //@GetMapping("/details") //endpoint
    // public String details(Model modelo) { //ui
    //    User user = new User("Piero", "Batti");
    //    modelo.addAttribute("titulo", "Hola mundo CERTUS"); //addAtribute => attributeName / attributeValue
    //    modelo.addAttribute("User", user);
    //   return "details";//
    //}

}
