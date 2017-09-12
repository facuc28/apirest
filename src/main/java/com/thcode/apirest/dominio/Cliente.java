/*
 * Creado por Facundo Crusta 2017 @THCODE
 */
package com.thcode.apirest.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente extends Persona {
    @JsonIgnore
    private int id_cliente;
//    private Contrato contrato;
    private String CUIL;
    private String CUIT;
//    private Propiedad propiedad;
//    private Pago pago;
}
