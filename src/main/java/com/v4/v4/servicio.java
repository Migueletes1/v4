package com.v4.v4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class servicio {
@Autowired
private productoRepository productoRepository;
public List<producto> obtenerProductos() {
    return productoRepository.findAll();
}
public Optional<producto> obtenerProductoPorId(Long id) {
    return productoRepository.findById(id);
}
public producto guardarProducto(producto producto) {
    return productoRepository.save(producto);
}
public void borrarProducto(Long id) {
    productoRepository.deleteById(id);
}
public List<producto> buscarProductoPorNombre(String nombre) {
    return productoRepository.findByNombreConiningIgnoreCase(nombre);
}
public List<producto> buscarStockBajo(int cantidad) {
    return productoRepository.findBycantidadlessThanEqual(cantidad);
}
public void actualizarCantidad(Long id, int cantidad) {
    Optional<producto> productoOpt = productoRepository.findById(id);
    if (productoOpt.isPresent()) {
        producto producto = productoOpt.get();
        producto.setCatidad(cantidad);
        productoRepository.save(producto);
    } 
}
}