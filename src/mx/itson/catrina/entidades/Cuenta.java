package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import mx.itson.catrina.enumeradores.Moneda;
import mx.itson.catrina.enumeradores.Tipo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/**
 * Métodos y atributos que corresponden a la entidad de cuenta
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

    /**
     * Utilizando la librería GSON, convierte un archivo JSON a un objeto de la clase Cuenta.
     *
     * @param contenido El contenido del archivo JSON.
     *
     * @return Un objeto de tipo Cuenta.
     */
    public Cuenta deserealizar(String contenido) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta = new Gson().fromJson(contenido, Cuenta.class);
        } catch (Exception e) {
            System.out.println("Error al deserealizar");
        }
        return cuenta;
    }

    /**
     * Calcula el total de depósitos en un mes en específico.
     *
     * @param cuenta Un objeto de tipo Cuenta.
     * @param mes    El mes en el que se desea calcular el total de depósitos.
     *
     * @return El total de depósitos en el mes especificado.
     */
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

    /**
     * Calcula el total de retiros en un mes en específico.
     *
     * @param cuenta Un objeto de tipo Cuenta.
     * @param mes    El mes en el que se desea calcular el total de retiros.
     *
     * @return El total de retiros en el mes especificado.
     */
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

    /**
     * Calcula el saldo inicial tomando en cuenta los movimientos previos al mes especificado.
     *
     * @param cuenta Un objeto de tipo Cuenta.
     * @param mes    El mes en el que se desea calcular el saldo inicial.
     *
     * @return El saldo inicial en el mes especificado.
     */
    public static double calcularSaldoInicial(Cuenta cuenta, String mes) {
        double saldoInicial = 0;
        DateFormat dateFormat = new SimpleDateFormat("MMMM", new Locale("es", "MX")); //Obtiene el nombre del mes en español

        String[] mesesAnteriores = new String[12];
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

    /**
     * Obtiene el valor del atributo producto.
     *
     * @return El atributo producto.
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Asigna un valor al atributo producto.
     *
     * @param producto El valor del atributo producto.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el valor del atributo cuenta.
     *
     * @return El atributo cuenta.
     */
    public long getCuenta() {
        return cuenta;
    }

    /**
     * Asigna un valor al atributo cuenta.
     *
     * @param cuenta El valor del atributo cuenta.
     */
    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el valor del atributo clabe.
     *
     * @return El atributo clabe.
     */
    public long getClabe() {
        return clabe;
    }

    /**
     * Asigna un valor al atributo clabe.
     *
     * @param clabe El valor del atributo clabe.
     */
    public void setClabe(long clabe) {
        this.clabe = clabe;
    }

    /**
     * Obtiene el valor del atributo moneda.
     *
     * @return El atributo moneda.
     */
    public Moneda getMoneda() {
        return moneda;
    }

    /**
     * Asigna un valor al atributo moneda.
     *
     * @param moneda El valor del atributo moneda.
     */
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    /**
     * Obtiene el valor del atributo cliente.
     *
     * @return El atributo cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Asigna un valor al atributo cliente.
     *
     * @param cliente El valor del atributo cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el valor del atributo movimientos.
     *
     * @return El atributo movimientos.
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Asigna un valor al atributo movimientos.
     *
     * @param movimientos El valor del atributo movimientos.
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
