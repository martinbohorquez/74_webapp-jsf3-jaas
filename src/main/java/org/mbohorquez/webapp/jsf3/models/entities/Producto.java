package org.mbohorquez.webapp.jsf3.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "el campo nombre no puede ser vacío!")
    private String nombre;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    @NotNull
    @Min(5)
    @Max(100000)
    private Integer precio;

    @NotEmpty
    @Size(min=4, max=10)
    private String sku;

    @NotNull
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;


    public Producto() {
    }

    public Producto(String nombre) {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

//    @PrePersist
    public void prePersist() {
        fechaRegistro = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", sku='" + sku + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
