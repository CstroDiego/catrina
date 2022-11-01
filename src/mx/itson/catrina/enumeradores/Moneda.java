package mx.itson.catrina.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Contiene los valores de Moneda.
 *
 * @author Diego Castro Arce
 */
public enum Moneda {

    /**
     * Moneda de tipo dólares.
     */
    @SerializedName("1")
    USD,

    /**
     * Moneda de tipo pesos mexicanos.
     */
    @SerializedName("2")
    MXN,

    /**
     * Moneda de tipo euros.
     */
    @SerializedName("3")
    EUR

}
