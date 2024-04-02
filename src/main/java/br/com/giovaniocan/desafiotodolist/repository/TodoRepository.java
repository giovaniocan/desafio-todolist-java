package br.com.giovaniocan.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovaniocan.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
