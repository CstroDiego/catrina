package mx.itson.catrina.entidades;

import mx.itson.catrina.enumeradores.Tipo;

import java.util.Date;

/**
 * Métodos y atributos que corresponden a la entidad de movimiento
 *
 * @author Diego Castro Arce
 */
public class Movimiento {
    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;

    /**
     * Obtiene el valor del atributo fecha.
     *
     * @return El atributo fecha.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Asigna el valor del atributo fecha.
     *
     * @param fecha El valor del atributo fecha.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el valor del atributo descripcion.
     *
     * @return El atributo descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna el valor del atributo descripcion.
     *
     * @param descripcion El valor del atributo descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el valor del atributo cantidad.
     *
     * @return El atributo cantidad.
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Asigna el valor del atributo cantidad.
     *
     * @param cantidad El valor del atributo cantidad.
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor del atributo tipo.
     *
     * @return El atributo tipo.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Asigna el valor del atributo tipo.
     *
     * @param tipo El valor del atributo tipo.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
