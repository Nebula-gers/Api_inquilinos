package com.reservas.InquilinosApi.controller;

import com.reservas.InquilinosApi.dto.PropiedadDto;
import com.reservas.InquilinosApi.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquilerController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDto devolverPropiedad(@PathVariable Long id){
        
    }
}
