/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import mx.itson.catrina.enumeradores.Moneda;
import mx.itson.catrina.enumeradores.Tipo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/**
 * Contiene los atributos y metodos de la clase Cuenta
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

    public static double calcularDepositos(Cuenta cuenta, String mes) {
        double deposito = 0;
        DateFormat dateFormat = new SimpleDateFormat("MMMM", new Locale("es", "MX")); //Obtiene el nombre del mes en español

        for (Movimiento movimiento : cuenta.getMovimientos()) {
            if (dateFormat.format(movimiento.getFecha()).toUpperCase().equals(mes)) {
                if (movimiento.getTipo() == Tipo.DEPOSITO) {
                    deposito += movimiento.getCantidad();
                }
            }
        }
        return deposito;
    }

    public static double calcularRetiros(Cuenta cuenta, String mes) {
        double retiro = 0;
        DateFormat dateFormat = new SimpleDateFormat("MMMM", new Locale("es", "MX")); //Obtiene el nombre del mes en español

        for (Movimiento movimiento : cuenta.getMovimientos()) {
            if (dateFormat.format(movimiento.getFecha()).toUpperCase().equals(mes)) {
                if (movimiento.getTipo() == Tipo.RETIRO) {
                    retiro += movimiento.getCantidad();
                }
            }
        }
        return retiro;
    }

    public static double calcularSaldoInicial(Cuenta cuenta, String mes) {
        double saldoInicial = 0; //saldo inicial del periodo seleccionado sumando los meses anteriores
        DateFormat dateFormat = new SimpleDateFormat("MMMM", new Locale("es", "MX")); //Obtiene el nombre del mes en español

        String mesesAnteriores[] = new String[12];
        mesesAnteriores[0] = "ENERO";
        mesesAnteriores[1] = "FEBRERO";
        mesesAnteriores[2] = "MARZO";
        mesesAnteriores[3] = "ABRIL";
        mesesAnteriores[4] = "MAYO";
        mesesAnteriores[5] = "JUNIO";
        mesesAnteriores[6] = "JULIO";
        mesesAnteriores[7] = "AGOSTO";
        mesesAnteriores[8] = "SEPTIEMBRE";
        mesesAnteriores[9] = "OCTUBRE";
        mesesAnteriores[10] = "NOVIEMBRE";
        mesesAnteriores[11] = "DICIEMBRE";

        for (int i = 0; i < mesesAnteriores.length; i++) {
            if (mesesAnteriores[i].equals(mes)) {
                for (int j = 0; j < i; j++) {
                    for (Movimiento movimiento1 : cuenta.getMovimientos()) {
                        if (dateFormat.format(movimiento1.getFecha()).toUpperCase().equals(mesesAnteriores[j])) {
                            if (movimiento1.getTipo() == Tipo.DEPOSITO) {
                                saldoInicial += movimiento1.getCantidad();
                            } else {
                                saldoInicial -= movimiento1.getCantidad();
                            }
                        }
                    }
                }
            }
        }
        return saldoInicial;
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
