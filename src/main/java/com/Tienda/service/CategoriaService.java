package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    // Metodo que obtiene una lista de categoria
     public List<Categoria> getCategorias(boolean activo);
    
}

