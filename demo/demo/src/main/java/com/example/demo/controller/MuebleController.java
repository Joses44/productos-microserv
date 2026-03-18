package com.example.demo.controller;


import com.example.demo.model.Mueble;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class MuebleController {

    private List<Mueble> listaMuebles = new ArrayList<>();

    public MuebleController() {
        // crea los 3 muebles con el patrón Builder
        listaMuebles.add(new Mueble.Builder()
                .conNombre("Mesa Comedor")
                .conMaterial("Madera Nativa")
                .conPrecio(150000)
                .build());

        listaMuebles.add(new Mueble.Builder()
                .conNombre("Silla Oficina")
                .conMaterial("Malla Ergonómica")
                .conPrecio(85000)
                .build());

        listaMuebles.add(new Mueble.Builder()
                .conNombre("Estante malo jajaja")
                .conMaterial("Acrílico y LED")
                .conPrecio(45000)
                .build());
    }

    @GetMapping
    public List<Mueble> obtenerTodos() {
        return listaMuebles;
    }

    @PostMapping
    public Mueble agregarMueble(@RequestBody Mueble nuevo) {
        listaMuebles.add(nuevo);
        return nuevo;
    }
}