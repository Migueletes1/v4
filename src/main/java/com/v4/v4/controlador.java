package com.v4.v4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class controlador {
@Autowired
private servicio servicio;
@GetMapping("/")
public String ListarProductos(Model model) {
    model.addAttribute("productos", servicio.obtenerProductos());
    return "lista";
}
@GetMapping("/nuevo")
public String nuevoProductoForm(Model model) {
    model.addAttribute("producto", new producto());
    return "formulario";
}
@PostMapping("/guardar")
public String guardarproducto(@ModelAttribute producto producto) {
servicio.guardarProducto(producto);
    
    return "redirect";
}
@GetMapping("/editar/{id}")
public String editarProductoForm(@PathVariable Long id, Model model) {
    model.addAttribute("producto", servicio.obtenerProductoPorId(id).orElse(new producto()));
    return "formulario";
}
@GetMapping("eliminar/{id}")
public String eliminarProducto(@PathVariable Long id) {
    servicio.borrarProducto(id);
    return "redirect:/";
}
@GetMapping("/buscar")
public String buscarProducto(@RequestParam String nombre, Model model) {
    model.addAttribute("productos", servicio.buscarProductoPorNombre(nombre));
    return "lista";
}
@GetMapping("/stock-bajo")
public String buscarStockBajo(Model model) {
    model.addAttribute("productos", servicio.buscarStockBajo(5));
    return "lista";
}
}