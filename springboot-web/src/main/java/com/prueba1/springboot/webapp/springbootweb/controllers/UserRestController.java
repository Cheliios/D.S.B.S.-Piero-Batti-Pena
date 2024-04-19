package com.prueba1.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //solo para model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map; //solo para map

import com.prueba1.springboot.webapp.springbootweb.model.User;

//Deberia colocar asi para la url: /api/details
@RestController
@RequestMapping("/api") //Endpoint base
public class UserRestController {

    @GetMapping("/details") //endpoint
    //@RequestMapping (path="/details", method = RequestMethod.GET)// para especificar el tipo de funcion 
    //@ResponseBody// para usar con controller
    public Map<String, Object> details() { //ui

        User usuario = new User("Piero","Batti");
        Map<String, Object> body = new HashMap();

        body.put("titulo", "Hola mundo CERTUS"); //addAtribute => attributeName / attributeValue
        body.put("usuario", usuario);
        return body;
    }
}