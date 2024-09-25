package com.example.javafx.service;

import com.example.javafx.entities.Libro;
import com.example.javafx.repository.LibroRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class LibroService {

    @Autowired
    private LibroRepository repository;


    public void guardarDatosLibro(Libro libro) {
        try{
            repository.save(libro);
        }catch (Exception e){
            System.out.println("Ocurrio un error en la capa de servicio. --- guardar datos libro");
        }
    }

    public void eliminarDatosLibro(Libro libro){
        try{
        repository.delete(libro);
        }catch (Exception e){
            System.out.println("Ocurrio un error en la capa de servicio. --- eliminar datos libro");
        }
    }


    private void validacion(Libro libro){
        if(libro.getIsbn() != Integer.MAX_VALUE){
            System.out.println("El valor debe ser un numero");
        }
    }
}
