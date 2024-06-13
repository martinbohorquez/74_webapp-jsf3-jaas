package org.mbohorquez.webapp.jsf3.repositories;

import org.mbohorquez.webapp.jsf3.models.entities.Producto;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto> {
    List<Producto> buscarPorNombre(String nombre);
}
