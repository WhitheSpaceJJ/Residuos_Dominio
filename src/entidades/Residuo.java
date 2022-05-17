package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define o representa un residuo con todos los atributos generales de este.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Residuo {
/**
 * ID del residuo.
 */
    private ObjectId _id;
    /**
     * Codigo del residuo.
     */
    private String idResiduo;
    /**
     * Nombre del residuo.
     */
    private String nombre;
    /**
     * Descripcion del residuo.
     */
    private String descripcion;
    /**
     * ID de la empresa fabricante.
     */
    private ObjectId idEmpresaProductora;
    /**
     * Quimicos que componen el residuo.
     */
    private List<Quimico> quimicos;

    /**
     * Constructor vacio
     */
    public Residuo() {
    }

    /**
     * Constructor que recibe de parámetro todos los atributos generales de la
     * clase Residuo menos el id
     * @param idResiduo Codigo del residuo.
     * @param nombre Nombre del residuo.
     * @param descripcion Descripcion del residuo.
     * @param idEmpresaProductora ID de la empresa fabricante.
     * @param quimicos Quimicos que componen el residuo.
     */
    public Residuo(String idResiduo, String nombre, String descripcion, ObjectId idEmpresaProductora, List<Quimico> quimicos) {
        this.idResiduo = idResiduo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idEmpresaProductora = idEmpresaProductora;
        this.quimicos = quimicos;
    }

    /**
     * Constructor que recibe de parámetro todos los atributos generales de la
     * clase Residuo
     *
     * @param _id ID del residuo.
     * @param idResiduo Codigo del residuo.
     * @param nombre Nombre del residuo.
     * @param descripcion Descripcion del residuo.
     * @param idEmpresaProductora ID de la empresa fabricante.
     * @param quimicos Quimicos que componen el residuo.
     */
    public Residuo(ObjectId _id, String idResiduo, String nombre, String descripcion, ObjectId idEmpresaProductora, List<Quimico> quimicos) {
        this._id = _id;
        this.idResiduo = idResiduo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idEmpresaProductora = idEmpresaProductora;
        this.quimicos = quimicos;
    }

    /**
     * Devuelve el id
     *
     * @return ID del residuo.
     */ 
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id con el id ingresado como parámetro
     *
     * @param _id ID a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Devuelve el id del residuo
     *
     * @return Codigo del residuo.
     */
    public String getIdResiduo() {
        return idResiduo;
    }

    /**
     * Asigna el id de residuo con el id ingresado como parámetro
     *
     * @param idResiduo Codigo del residuo.
     */
    public void setIdResiduo(String idResiduo) {
        this.idResiduo = idResiduo;
    }

    /**
     * Devuelve el nombre
     *
     * @return Nombre del residuo.
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
     * Devuelve la descripción
     *
     * @return Descripcion del residuo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna la descripcion con la ingresada como parámetro
     *
     * @param descripcion Descripcion a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el id de la empresa productora
     *
     * @return ID de la empres aproductora.
     */ 
    public ObjectId getIdEmpresaProductora() {
        return idEmpresaProductora;
    }

    /**
     * Asigna el id de la empresa productora con el id ingresado como parámetro
     *
     * @param idEmpresaProductora ID de la empresa productora a asignar.
     */
    public void setIdEmpresaProductora(ObjectId idEmpresaProductora) {
        this.idEmpresaProductora = idEmpresaProductora;
    }

    /**
     * Devuelve la lista de químicos
     *
     * @return Quimicos que componen el residuo.
     */
    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    /**
     * Asigna los químicos con la lista ingresada como parámetro
     *
     * @param quimicos Quimicos a establecer que compondran al residuo.
     */
    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    /**
     * Método para aplicarle un hash al id
     *
     * @return El hashcode de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase residuo, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Residuo other = (Residuo) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Residuo
     *
     * @return Cadena de caracteres con todos los atributos de un residuo.
     */
    @Override
    public String toString() {
        return "Residuo{" + "_id=" + _id + ", idResiduo=" + idResiduo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", idEmpresaProductora=" + idEmpresaProductora + ", quimicos=" + quimicos + '}';
    }

}
