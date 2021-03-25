package br.fatec.agenda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ControllerInterface<T> {
	ResponseEntity<List<T>> getAll();
	ResponseEntity<?> get(Long id);
	ResponseEntity<?> post(T obj);
	ResponseEntity<?> update(T obj);
	ResponseEntity<?> delete(Long id);
}
