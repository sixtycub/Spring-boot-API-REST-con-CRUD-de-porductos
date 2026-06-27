package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Productos;



public interface ProductosRepository extends  JpaRepository <Productos, Integer> {
    
}
