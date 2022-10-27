/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import mx.itson.catrina.enumeradores.Moneda;

import java.util.List;

/**
 *Contiene los atributos y metodos de la clase Cuenta
 *
 * @author Diego Castro Arce
 */
public class Cuenta {
    private String producto;
    private int cuenta;
    private int clabe;
    private Moneda moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;


}
