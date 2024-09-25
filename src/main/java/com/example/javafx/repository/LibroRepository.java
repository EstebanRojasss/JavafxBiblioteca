package com.example.javafx.repository;

import com.example.javafx.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LibroRepository extends JpaRepository<Libro, String> {

}
