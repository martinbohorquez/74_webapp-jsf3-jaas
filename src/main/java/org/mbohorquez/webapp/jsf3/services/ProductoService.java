package org.mbohorquez.webapp.jsf3.services;

import jakarta.ejb.Local;
import org.mbohorquez.webapp.jsf3.models.entities.Categoria;
import org.mbohorquez.webapp.jsf3.models.entities.Producto;

import java.util.List;
import java.util.Optional;

@Local
public interface ProductoService {
    List<Producto> listar();

    Optional<Producto> porId(Long id);

    void guardar(Producto producto);

    void eliminar(Long id);

    List<Categoria> listarCategorias();

    Optional<Categoria> porIdCategoria(Long id);

    List<Producto> buscarPorNombre(String nombre);
}
