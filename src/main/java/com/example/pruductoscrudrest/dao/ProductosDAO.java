package com.example.pruductoscrudrest.dao;

import com.example.pruductoscrudrest.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Iimplementa todas las funciones de un CRUD de forma automática
 * JDataObject
 * https://www.baeldung.com/spring-dao-jpa
 */
public interface ProductosDAO extends JpaRepository<Producto,Long> {
}
