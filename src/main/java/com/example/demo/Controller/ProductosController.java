package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.Entity.Productos;
import com.example.demo.Repository.ProductosRepository;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    private final ProductosRepository repository;

    public ProductosController(ProductosRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Productos> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Productos create(@RequestBody Productos producto) {
        return repository.save(producto);
    }

    @PutMapping("/{id}")
    public Productos update(@PathVariable Integer id, @RequestBody Productos producto) {
        producto.setId(id);
        return repository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
