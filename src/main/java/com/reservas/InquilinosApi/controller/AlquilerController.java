package com.reservas.InquilinosApi.controller;

import com.reservas.InquilinosApi.dto.PropiedadDTO;
import com.reservas.InquilinosApi.model.Inquilino;
import com.reservas.InquilinosApi.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquilerController {

    @GetMapping ("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad (@PathVariable Long id) {
        //que a través de la id buscamos la propiedad
        //trajimos al inquilino asociado a esa propiedad
        Propiedad prop = new Propiedad(15487L, "Casa", "308 Negro Arroyo Lane", 200.0, 40000.0);
        Inquilino inqui = new Inquilino(1L, "12345678", "Walter", "White", "Profesor de química");

        PropiedadDTO propiDTO = new PropiedadDTO();
        //asignamos los datos que necesitamos de propiedad
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        //asignamos los datos que necesitamos de Inquilino
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());

        return propiDTO;
    }

}
