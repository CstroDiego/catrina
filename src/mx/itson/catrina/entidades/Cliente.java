package mx.itson.catrina.entidades;

/**
 * Métodos y atributos que corresponden a la entidad de cliente
 *
 * @author Diego Castro Arce
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private int cp;

    /**
     * Obtiene el valor del atributo codigo.
     *
     * @return El atributo codigo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Asigna el valor del atributo codigo.
     *
     * @param codigo El valor del atributo codigo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el valor del atributo nombre.
     *
     * @return El atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor del atributo nombre.
     *
     * @param nombre El valor del atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del atributo domicilio.
     *
     * @return El atributo domicilio.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Asigna el valor del atributo domicilio.
     *
     * @param domicilio El valor del atributo domicilio.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el valor del atributo ciudad.
     *
     * @return El atributo ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Asigna el valor del atributo ciudad.
     *
     * @param ciudad El valor del atributo ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el valor del atributo rfc.
     *
     * @return El atributo rfc.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Asigna el valor del atributo rfc.
     *
     * @param rfc El valor del atributo rfc.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el valor del atributo cp.
     *
     * @return El atributo cp.
     */
    public int getCp() {
        return cp;
    }

    /**
     * Asigna el valor del atributo cp.
     *
     * @param cp El valor del atributo cp.
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
}
