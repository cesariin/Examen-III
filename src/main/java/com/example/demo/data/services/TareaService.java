package com.example.demo.data.services;

import com.example.demo.entities.Tareas;

import java.util.List;

public interface TareaService {
    public Tareas crearTarea(Tareas tarea);
    public void eliminarTarea(Long id);
    public Tareas actualizarTarea(Long id, Tareas tarea);
    public List<Tareas> listarTareas();
    public Tareas buscarTarea(Long id);
}
