package com.example.demo.Controlador;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface BaseController<E, ID> {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getAll(Pageable pageable);

    ResponseEntity<?> getOne(ID id);

    ResponseEntity<?> save(E entity);

    ResponseEntity<?> update(ID id, E entity);

    ResponseEntity<?> delete(ID id);
}