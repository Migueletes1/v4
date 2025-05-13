package com.v4.v4;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<producto, Long> {
    List<producto> findByNombreConiningIgnoreCase(String nombre);
    List<producto> findBycantidadlessThanEqual(int cantidad);

}
