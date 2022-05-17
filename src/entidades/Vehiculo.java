package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define objetos del tipo vehiculo y los atributos generales.
 *
 * @author: Equipo 1. Jose,Abraham,Oroz.
 */
public class Vehiculo {
/**
 * ID del vehiculo.
 */
    private ObjectId _id;
    /**
     * Nombre del vehiculo.
     */
    private String nombre;
    /**
     * Modelo del vehiculo.
     */
    private String modelo;
    /**
     * Marca del vehiculo.
     */
    private String marca;
    /**
     * Tipo de vehiculo.
     */
    private String tipo;
    /**
     * Matricula del vehiculo.
     */
    private String matricula;

    /**
     * Constructor vacio
     */
    public Vehiculo() {
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Vehiculo
     *
     * @param _id  ID del vehiculo.
     * @param nombre Nombre del vehiculo.
     * @param modelo  Modelo del vehiculo.
     * @param marca Marca del vehiculo.
     * @param tipo  Tipo de vehiculo.
     * @param matricula Matricula del vehiculo.
     */
    public Vehiculo(ObjectId _id, String nombre, String modelo, String marca, String tipo, String matricula) {
        this._id = _id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Vehiculo menos el id
     *
    * @param nombre Nombre del vehiculo.
     * @param modelo  Modelo del vehiculo.
     * @param marca Marca del vehiculo.
     * @param tipo  Tipo de vehiculo.
     * @param matricula Matricula del vehiculo.
     */
    public Vehiculo(String nombre, String modelo, String marca, String tipo, String matricula) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    /**
     * Devuelve el id
     *
     * @return ID del vehiculo.
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id con el ingresado como parámetro
     *
     * @param _id ID a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Devuelve el nombre
     *
     * @return Nombre del vehiculo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre con el ingresado como parámetro
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el modelo del vehículo
     *
     * @return Modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Asigna el modelo con el ingresado como parámetro
     *
     * @param modelo Modelo a establecer.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve la marca del vehículo
     *
     * @return  Marca del vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Asigna la marca del vehiculo con la asignada como parámetro
     *
     * @param marca Marca a establecer.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve el tipo de vehiculo
     *
     * @return Tipo de vehiculo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Asigna el tipo de vehiculo con el ingresado como parámetro
     *
     * @param tipo Tipo de vehiculo a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la matrícula del vehículo
     *
     * @return Matricula del vehiculo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Asigna la matrícula del vehículo con la ingresada como parámetro
     *
     * @param matricula Matricula a establecer.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método que aplica el hash al id del vehículo
     *
     * @return El hashcode de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Vehiculo, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Vehiculo
     *
      * @return Cadena de caracteres con todos los atributos de clase.
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "_id=" + _id + ", nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + ", matricula=" + matricula + '}';
    }

}
