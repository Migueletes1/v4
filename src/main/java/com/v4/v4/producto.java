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
private int id;
@Column(nullable = false)
private String nombre;
@Column(nullable = false)
private int catidad;
@Column(nullable = false)
private double precio;
public producto() {
}
public producto(int id, String nombre, int catidad, double precio) {
    this.id = id;
    this.nombre = nombre;
    this.catidad = catidad;
    this.precio = precio;
}
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
        return catidad;
    }

    /**
     * @param catidad the catidad to set
     */
    public void setCatidad(int catidad) {
        this.catidad = catidad;
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
