package com.v4.v4;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String nombre;
@Column(nullable = false)
private int cantidad;
@Column(nullable = false)
private double precio;
public producto() {
}
public producto( String nombre, int catidad, double precio) {
    this.nombre = nombre;
    this.cantidad = catidad;
    this.precio = precio;
}
    /**
     * @return int return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the catidad
     */
    public int getCatidad() {
        return cantidad;
    }

    /**
     * @param catidad the catidad to set
     */
    public void setCatidad(int catidad) {
        this.cantidad = catidad;
    }

    /**
     * @return double return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
