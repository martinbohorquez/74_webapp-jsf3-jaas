package org.mbohorquez.webapp.jsf3.converters;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.mbohorquez.webapp.jsf3.models.entities.Categoria;
import org.mbohorquez.webapp.jsf3.services.ProductoService;

import java.util.Optional;

@RequestScoped
@Named("categoriaConverter")
public class CategoriaConverter implements Converter<Categoria> {
    @Inject
    private ProductoService service;

    @Override
    public Categoria getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        /*if (id == null) {
            return null;
        }
        Optional<Categoria> categoria = service.porIdCategoria(Long.valueOf(id));
        return categoria.orElse(null);*/
        return Optional.ofNullable(id)
                .map(Long::valueOf)
                .flatMap(service::porIdCategoria)
                .orElse(null);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Categoria categoria) {
        return Optional.ofNullable(categoria)
//                .map(c -> c.getId() != null ? c.getId().toString() : "0")
                .map(c -> c.getId().toString())
                .orElse("0");
    }
}
