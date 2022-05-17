package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define o representa un quimico que estara presente en un residuo.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Quimico {
   /**
    * Id del quimico.
    */
    private ObjectId _id;
    /**
     * Nombre del quimico.
     */
    private String nombre;
    /**
     * Descripcion del quimico.
     */
    private String descripcion;

    /**
     * Constructor vacio
     */
    public Quimico() {
    }

    /**
     * Constructor que recibe el nombre y la descripcion del químico
     * @param nombre Nombre del quimico.
     * @param descripcion Descripcion del quimico.
     */
    public Quimico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    

    /**
     * Constructor que recibe de parámetros todos los atributos de la clase Químico
     * @param _id Id del quimico.
     * @param nombre Nombre del quimico.
     * @param descripcion  Descripcion del quimico.
     */
    public Quimico(ObjectId _id, String nombre, String descripcion) {
        this._id = _id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el id del químico
     * @return El id del quimico.
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id con el que ha sido ingresado como parámetro
     * @param _id ID del quimico a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Devuelve el nombre del químico
     * @return El nombre del quimico,
     */
    public String getNombre() {
        return nombre;
    }
    

    /**
     * Asigna el nombre del químico con el que fue ingresado como parámetro
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripción del químico
     * @return  Descripcion del quimico.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna la descripción del químico con la que fue ingresada de parámetro
     * @param descripcion Descripcion a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método hash para aplicarselo al id del químico
     * @return El hash code la clase.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Quimico, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Quimico other = (Quimico) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString que devuelve todos los atributos de la clase Quimico
     * @return Cadena de caracteres con todos los atributos de un quimico.
     */
    public String toString2() {
        return "Quimico{" + "_id=" + _id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    /**
     * Método toString que solamente devuelve el nombre del químico
     * @return El nombre del quimico.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
