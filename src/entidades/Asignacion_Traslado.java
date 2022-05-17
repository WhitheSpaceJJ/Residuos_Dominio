package entidades;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase que representa una asignacion de traslado a una empresa tansportadora.
 *
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Asignacion_Traslado {

    /**
     * Id de la asignacion de traslado.
     */
    private ObjectId _id;
    /**
     * Estatus de la signacion de traslado.
     */
    private String estatus;
    /**
     * Total de la carga.
     */
    private double totalCarga;
    /**
     * Especificacion del residuo.
     */
    private String especificacionCarga;
    /**
     * Fecha de la solicitud.
     */
    private Date fechaSolicitud;
    /**
     * Id de la empresa de transporte.
     */
    private ObjectId idEmpresaTransporte;
    /**
     * Empresa productora.
     */
    private Productora empresaProductora;
    /**
     * Residuo de la asignacion.
     */
    private Residuo residuo;

    /**
     * Constructor vacio
     */
    public Asignacion_Traslado() {
    }

    /**
     * Constructor que recibe de parámetros todas las variables menos el id de
     * la asignación de traslado y asigna a todas sus variables los valores
     * ingresados como parámetros
     *
     * @param estatus Estatus de la asignacion.
     * @param totalCarga Total de carga.
     * @param fechaSolicitud Fecha de la solicitud.
     * @param idEmpresaTransporte Id de la empresa de transporte.
     * @param empresaProductora Empresa Productora.
     * @param residuo Residuo de la asignacion.
     */
    public Asignacion_Traslado(String estatus, double totalCarga, Date fechaSolicitud, ObjectId idEmpresaTransporte, Productora empresaProductora, Residuo residuo) {
        this.estatus = estatus;
        this.totalCarga = totalCarga;
        this.fechaSolicitud = fechaSolicitud;
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.empresaProductora = empresaProductora;
        this.residuo = residuo;
    }

    /**
     * Constructor que recibe de parámetros todas las variables menos el id de
     * la asignación de traslado y asigna a todas sus variables los valores
     * ingresados como parámetros
     *
     * @param estatus Estatus de la asignacion.
     * @param totalCarga Total de carga.
     * @param fechaSolicitud Fecha de la solicitud.
     * @param idEmpresaTransporte Id de la empresa de transporte.
     * @param empresaProductora Empresa Productora.
     * @param residuo Residuo de la asignacion.
     * @param especificacionCarga Especificacion de la carga.
     */
    public Asignacion_Traslado(String estatus, double totalCarga, Date fechaSolicitud, ObjectId idEmpresaTransporte, Productora empresaProductora, Residuo residuo, String especificacionCarga) {
        this.estatus = estatus;
        this.totalCarga = totalCarga;
        this.fechaSolicitud = fechaSolicitud;
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.empresaProductora = empresaProductora;
        this.residuo = residuo;
        this.especificacionCarga = especificacionCarga;
    }

    /**
     * Metodo para obtener la especificacion de la carga.
     *
     * @return Especificacion de la carga.
     */
    public String getEspecificacionCarga() {
        return especificacionCarga;
    }

    /**
     * Metodo para establecer la especificacion de la carga.
     *
     * @param especificacionCarga Especificacion de la carga.
     */
    public void setEspecificacionCarga(String especificacionCarga) {
        this.especificacionCarga = especificacionCarga;
    }

    /**
     * Regresa el id
     *
     * @return ID de la asignacion
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id ingresado de parámetro
     *
     * @param _id Id a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     *
     * Regresa el estatus
     *
     * @return Estatus de la asignacion.
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Asigna el estatus ingresado de parámetro
     *
     * @param estatus El estatus a establecer.
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    /**
     * Regresa el total de carga
     *
     * @return El total de la carga.
     */
    public double getTotalCarga() {
        return totalCarga;
    }

    /**
     * Asigna el total de carga ingresado como parámetro
     *
     * @param totalCarga El total de carga a asignar.
     */
    public void setTotalCarga(double totalCarga) {
        this.totalCarga = totalCarga;
    }

    /**
     * Devuelve la fecha de solicitud
     *
     * @return La fecha de solicitud.
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Asigna la fecha de solicitud ingresada como parámetro
     *
     * @param fechaSolicitud Fecha a establecer.
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    /**
     * Devuelve el id de la empresa de transporte
     *
     * @return El id de la empresa de transporte.
     */
    public ObjectId getIdEmpresaTransporte() {
        return idEmpresaTransporte;
    }

    /**
     * Asigna el id de la empresa de transporte ingresado como parámetro
     *
     * @param idEmpresaTransporte ID de la empresa de transporte a establecer.
     */
    public void setIdEmpresaTransporte(ObjectId idEmpresaTransporte) {
        this.idEmpresaTransporte = idEmpresaTransporte;
    }

    /**
     * Devuelve el residuo
     *
     * @return El residuo de la asgnacion.
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Asigna el residuo ingresado como parámetro
     *
     * @param residuo Residuo a establecer.
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    /**
     * Devuelve la empresa productora
     *
     * @return Empresa productora del residuo de la asignacion.
     */
    public Productora getEmpresaProductora() {
        return empresaProductora;
    }

    /**
     * Asigna la empresa productora ingresada como parámetro
     *
     * @param empresaProductora Empresa productora.
     */
    public void setEmpresaProductora(Productora empresaProductora) {
        this.empresaProductora = empresaProductora;
    }

    /**
     * Funcion Hash para la clase de asignación traslado para aplicarle un hash
     * solo al id de la asignación de traslado
     *
     * @return El hash code de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Funcion equals para la clase de asignación traslado, con el fin de
     * comparar sin un objeto es el mismo que la clase.
     *
     * @param obj Objeto a comparar.
     * @return true si el objeto es el mismo que el actual, false en caso
     * contrario.
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
        final Asignacion_Traslado other = (Asignacion_Traslado) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Asignacion_Traslado
     *
     * @return Cadena de caracteres con todos los atributos de clase.
     */
    @Override
    public String toString() {
        return "Asignacion_Traslado{" + "_id=" + _id + ", estatus=" + estatus + ", totalCarga=" + totalCarga + ", fechaSolicitud=" + fechaSolicitud + ", idEmpresaTransporte=" + idEmpresaTransporte + ", empresaProductora=" + empresaProductora + ", residuo=" + residuo + '}';
    }

}
