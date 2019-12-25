package com.example.pruductoscrudrest.rest;

import org.springframework.web.bind.annotation.*;


@RestController         // Definimos la clase como controlador REST
@RequestMapping("/")    // Definimos la url o entrada de la API REST
public class ProductosRESTController {

    // Exponemos cada servicio
    //@RequestMapping @GetMapping @PostMapping (estos dos últimos no deginen la URL, si no toman la url base
    //@GetMapping Consume el servicio en la url raiz usando GET
    // @RequestMapping(value = "hola", method = RequestMethod.GET) de esta manera indicamos el protocolo y la URL de entrada

    //@GetMapping
    //@RequestMapping(value = "hola", method = RequestMethod.GET)
    public String hola(){
        return "Hola REST 2DAM";
    }
}
