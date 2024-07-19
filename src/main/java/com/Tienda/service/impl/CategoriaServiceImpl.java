
package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activo) {
        List<Categoria> lista= categoriaDao.findAll();
        
        
        //Filltar en caso de querer solo activos
        if(activo){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
    
}
