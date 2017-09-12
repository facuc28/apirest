/*
 * Creado por Facundo Crusta 2017 @THCODE
 */
package com.thcode.apirest.repositorios;

import com.thcode.apirest.dominio.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

    Cliente findByNombre(String nombre);
}
