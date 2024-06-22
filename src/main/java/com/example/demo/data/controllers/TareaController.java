package com.example.demo.data.controllers;

import com.example.demo.data.services.TareaService;
import com.example.demo.entities.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tareas> getTareas() {
        return tareaService.listarTareas();
    }

    @GetMapping("/{id}")
    public Tareas getTarea(@PathVariable Long id) {
        return tareaService.buscarTarea(id);
    }

    @PostMapping
    public Tareas addTarea(@RequestBody Tareas tarea) {
        return tareaService.crearTarea(tarea);
    }

    @PutMapping("/{id}")
    public Tareas updateTarea(@PathVariable Long id, @RequestBody Tareas tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void deleteTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}
