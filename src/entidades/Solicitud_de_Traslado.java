package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define o representa una solicitud de traslado.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Solicitud_de_Traslado {
/**
 * ID de la solicitud de traslado.
 */
    private ObjectId _id;
    /**
     * Fecha de la solicitud.
     */
    private Date fechaSolicitud;
    /**
     * Estatus de la solicitud.
     */
    private String estatus;
    /**
     * Residuos a transportar.
     */
    private List<Residuo_Transporte> residuos;
    /**
     * Empresa productora solicitante.
     */
    private Productora empresaProductora;

    /**
     * Constructor vacio
     */
    public Solicitud_de_Traslado() {
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Solicitud_de_Traslado
     *
     * @param _id ID de la solicitud de traslado.
     * @param fechaSolicitud  Fecha de la solicitud.
     * @param estatus Estatus de la solicitud.
     * @param residuos Residuos a transportar.
     * @param empresaProductora Empresa productora solicitante.
     */
    public Solicitud_de_Traslado(ObjectId _id, Date fechaSolicitud, String estatus, List<Residuo_Transporte> residuos, Productora empresaProductora) {
        this._id = _id;
        this.fechaSolicitud = fechaSolicitud;
        this.estatus = estatus;
        this.residuos = residuos;
        this.empresaProductora = empresaProductora;
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Solicitud_de_Traslado menos el id
     *
      * @param fechaSolicitud  Fecha de la solicitud.
     * @param estatus Estatus de la solicitud.
     * @param residuos Residuos a transportar.
     * @param empresaProductora Empresa productora solicitante.
     */
    public Solicitud_de_Traslado(Date fechaSolicitud, String estatus, List<Residuo_Transporte> residuos, Productora empresaProductora) {
        this.fechaSolicitud = fechaSolicitud;
        this.estatus = estatus;
        this.residuos = residuos;
        this.empresaProductora = empresaProductora;
    }

    /**
     * Devuelve el id
     *
     * @return ID de la solicitud.
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
     * Devuelve la fecha de solicitud
     *
     * @return La fecha de la solicitud.
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Asigna la fecha de solicitud con la ingresada como parámetro
     *
     * @param fechaSolicitud Fecha a establecer.
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    /**
     * Devuelve el estatus
     *
     * @return Estatus de la solicitud.
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Asigna el estatus con el ingresado como parámetro
     *
     * @param estatus Estatus a establecer.
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    /**
     * Devuelve la lista de residuos a transportar
     *
     * @return Residuos a transportar.
     */
    public List<Residuo_Transporte> getResiduos() {
        return residuos;
    }

    /**
     * Asigna la lista de residuos a transportar con la ingresada como parámetro
     *
     * @param residuos Residuos a establecer.
     */
    public void setResiduos(List<Residuo_Transporte> residuos) {
        this.residuos = residuos;
    }

    /**
     * Devuelve la empresa productora
     *
     * @return Empresa productora solicitante.
     */
    public Productora getEmpresaProductora() {
        return empresaProductora;
    }

    /**
     * Asigna la empresa productora con la empresa ingresada como parámetro
     *
     * @param empresaProductora Establece la empresa productora solicitante.
     */
    public void setEmpresaProductora(Productora empresaProductora) {
        this.empresaProductora = empresaProductora;
    }

    /**
     * Método para aplicarle el hash al id de la solicitud de traslado
     * 
     * @return EL hashCode de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Solicitud_de_Traslado, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Solicitud_de_Traslado other = (Solicitud_de_Traslado) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Solicitud_de_Traslado
     *
     * @return Una cadena de caracteres con todos los atributos de la solicitud.
     */
    @Override
    public String toString() {
        return "Solicitud_de_Traslado{" + "_id=" + _id + ", fechaSolicitud=" + fechaSolicitud + ", estatus=" + estatus + ", residuos=" + residuos + ", empresaProductora=" + empresaProductora + '}';
    }

}
