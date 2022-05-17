package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Esta clase define objetos del tipo Empresa y los atributos generales.
 *
 * @author: Equipo 1. Jose/Abraham/Oroz.
 */
public class Empresa {

    /**
     * ID de la empresa.
     */
    protected ObjectId _id;
    /**
     * Nombre de la empresa.
     */
    protected String nombre;
    /**
     * Telefono de la empresa.
     */
    protected String telefono;
    /**
     * Direccion de la empresa.
     */
    protected String direccion;
    /**
     * Tamaño de la empresa.
     */
    protected double tamanho;
    /**
     * Tipo de empresa.
     */
    protected String tipoEmpresa;

    /**
     * Constructor por defecto.
     */
    public Empresa() {
    }

    /**
     * Constructor que inicializa el id de la empresa.
     *
     * @param _id ID de la empresa.
     */
    public Empresa(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Constructor que inicializa una empresa con el id y nombre.
     *
     * @param _id ID de la empresa.
     * @param nombre Nombre de la empresa.
     */
    public Empresa(ObjectId _id, String nombre) {
        this._id = _id;
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa los atributos generales de una empresa a
     * excepcion del id
     *
     * @param nombre Nombre de la empresa.
     * @param telefono Telefono de la empresa.
     * @param direccion Direccion de la empresa.
     * @param tamanho Tamaño de la empresa.
     */
    public Empresa(String nombre, String telefono, String direccion, double tamanho) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tamanho = tamanho;
    }

    /**
     * Constructor que inicializa todos los atributos generales de una empresa
     *
     * @param _id Id de la empresa.
     * @param nombre Nombre de la empresa.
     * @param telefono Telefono de la empresa.
     * @param direccion Direccion de la empresa.
     * @param tamanho Tamaño de la empresa.
     */
    public Empresa(ObjectId _id, String nombre, String telefono, String direccion, double tamanho) {
        this._id = _id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tamanho = tamanho;
    }

    /**
     * Devuelve el id de la empresa
     *
     * @return Id de la empresa.
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id de la empresa con el id ingresado como parámetro
     *
     * @param _id ID a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Devuelve el nombre de la empresa
     *
     * @return Nombre de la empresa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre de la empresa con el nombre ingresado como parámetro
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el teléfono de la empresa
     *
     * @return Telefono de la empresa.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Asigna el teléfono de la empresa con el teléfono ingresado como parámetro
     *
     * @param telefono Telefono a asignar.
     */ 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la dirección de la empresa
     *
     * @return Direccion de la empresa.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Asigna la dirección de la empresa con la dirección ingresada como
     * parámetro
     *
     * @param direccion Direcion a asignar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el tamaño
     *
     * @return Tamaño de la empresa.
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * Asigna el tamaño con el que fue ingresado como parámetro
     *
     * @param tamanho Tamaño a asignar.
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Devuelve el tipo de la empresa
     *
     * @return El tipo de empresa.
     */
    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    /**
     * Asigna el tipo de la empresa conb la ingresada como parámetro
     *
     * @param tipoEmpresa Tipo de empresa.
     */
    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    /**
     * Método que aplica un hash solamente al id de la empresa
     *
     * @return El hash code de la empresa.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Empresa, con el fin de comparar sin un objeto es el mismo que la clase.
     *
     * @param obj Objeto a comparar.
     * @return true si el objeto es el mismo que el actual, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Empresa
     *
      * @return Cadena de caracteres con todos los atributos de clase.
      */
    @Override
    public String toString() {
        return "Empresa{" + "_id=" + _id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", tamanho=" + tamanho + '}';
    }

}
