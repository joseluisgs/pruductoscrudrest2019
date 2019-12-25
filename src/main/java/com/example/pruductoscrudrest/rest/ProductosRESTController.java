package com.example.pruductoscrudrest.rest;

import com.example.pruductoscrudrest.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@RestController         // Definimos la clase como controlador REST
@RequestMapping("/")    // Definimos la url o entrada de la API REST, este caso la raíz: localhost:8080/
public class ProductosRESTController {

    /**
    //@RequestMapping @GetMapping @PostMapping (estos dos últimos no deginen la URL, si no toman la url base
    //@GetMapping Consume el servicio en la url raiz usando GET localhots:8080/
    // @RequestMapping(value = "hola", method = RequestMethod.GET) de esta manera indicamos el protocolo y la URL de entrada
     // localhost:8080/hola
    */

    //@GetMapping
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String hola(){
        return "Hola REST 2DAM. Todo OK";
    }

    //*** Comenzado los servicios rest

    /**
     * Método de prueba con Productos
     * @return
     */
    /*
    @RequestMapping(value = "productos", method = RequestMethod.GET)
    public ResponseEntity<Producto> getProducto(){
        Producto p = new Producto(1L,"Producto");
        // Devolvemos le producto
        return ResponseEntity.ok(p);
    }
    */

    // GET Todos los productos
    @RequestMapping(value = "productos", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Producto>> getProducto(){
        Producto p = new Producto(1L,"Producto");
        ArrayList<Producto> l = new ArrayList<Producto>();
        l.add(p);
        // Devolvemos le producto
        return ResponseEntity.ok(l);
    }
}
