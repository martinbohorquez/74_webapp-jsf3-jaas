package org.mbohorquez.webapp.jsf3.services;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.mbohorquez.webapp.jsf3.models.entities.Categoria;
import org.mbohorquez.webapp.jsf3.models.entities.Producto;
import org.mbohorquez.webapp.jsf3.repositories.CrudRepository;
import org.mbohorquez.webapp.jsf3.repositories.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Stateless
@DeclareRoles({"USER", "ADMIN"})
public class ProductoServiceImpl implements ProductoService {
    @Inject
    private ProductoRepository productoRepository;
    @Inject
    private CrudRepository<Categoria> categoriaRepository;

    @PermitAll
    @Override
    public List<Producto> listar() {
        return productoRepository.listar();
    }

    @RolesAllowed({"USER", "ADMIN"})
    @Override
    public Optional<Producto> porId(Long id) {
        return Optional.ofNullable(productoRepository.porId(id));
    }

    @RolesAllowed({"ADMIN"})
    @Override
    public void guardar(Producto producto) {
        productoRepository.guardar(producto);
    }

    @RolesAllowed({"ADMIN"})
    @Override
    public void eliminar(Long id) {
        productoRepository.eliminar(id);
    }

    @RolesAllowed({"USER", "ADMIN"})
    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.listar();
    }

    @RolesAllowed({"USER", "ADMIN"})
    @Override
    public Optional<Categoria> porIdCategoria(Long id) {
        return Optional.ofNullable(categoriaRepository.porId(id));
    }

    @RolesAllowed({"USER", "ADMIN"})
    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.buscarPorNombre(nombre);
    }
}
