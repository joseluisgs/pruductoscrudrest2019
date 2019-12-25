package com.example.pruductoscrudrest.model;

import javax.persistence.*;

/**
 * Clase modelo de producto
 */

// Le decimos a Spring que es una Entidad y la tabla.
@Entity
@Table(name="productos")
public class Producto {

    // Indicamos los campos
    // ID, columna id de la tabla productos y es autoincrementable
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // nombre, columna nombre, no nulo, longitud de 30
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    public Producto() {
    }

    public Producto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format(
                "Producto[id=%d, nombre='%s']",
                id, nombre);
    }
}
