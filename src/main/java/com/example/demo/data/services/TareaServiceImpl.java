package com.example.demo.data.services;

import com.example.demo.dao.TareaDao;
import com.example.demo.entities.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaDao tareaDao;

    @Override
    public Tareas crearTarea(Tareas tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    public void eliminarTarea(Long id) {
        if (tareaDao.existsById(id)) {
            tareaDao.deleteById(id);
        }
    }

    @Override
    public Tareas actualizarTarea(Long id, Tareas tarea) {
        if (tareaDao.existsById(id)) {
            tarea.setId(id);
            return tareaDao.save(tarea);
        }
        return null;
    }

    @Override
    public List<Tareas> listarTareas() {
        return (List<Tareas>) tareaDao.findAll();
    }

    @Override
    public Tareas buscarTarea(Long id) {
        return tareaDao.findById(id).orElse(null);
    }
}
