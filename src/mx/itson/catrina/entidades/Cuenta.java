/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import mx.itson.catrina.enumeradores.Moneda;
import mx.itson.catrina.enumeradores.Tipo;

import java.util.List;

/**
 *Contiene los atributos y metodos de la clase Cuenta
 *
 * @author Diego Castro Arce
 */
public class Cuenta {
    private String producto;
    private long cuenta;
    private long clabe;
    private Moneda moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;

    public Cuenta deserealizar(String contenido) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta = new Gson().fromJson(contenido, Cuenta.class);
        } catch (Exception e) {
            System.out.println("Error al deserealizar");
        }
        return cuenta;
    }



    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public long getClabe() {
        return clabe;
    }

    public void setClabe(long clabe) {
        this.clabe = clabe;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
