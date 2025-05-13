package com.v4.v4;

import java.util.List;
import com.v4.v4.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface productoRepository extends JpaRepository<producto, Integer> {
    List<producto> findByNombreConiningIgnoreCase(String nombre);
    List<producto> findBycantidadlessThanEqual(int cantidad);

}
