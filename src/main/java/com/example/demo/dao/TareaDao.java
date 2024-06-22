package com.example.demo.dao;

import com.example.demo.entities.Tareas;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tareas, Long> {
}
