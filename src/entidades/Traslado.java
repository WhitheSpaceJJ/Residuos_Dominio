package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Esta clase define o representa un traslado.
 *
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Traslado {

    /**
     * ID del traslado.
     */
    private ObjectId _id;
    /**
     *
     */
    private Date fechaLLegada;
    /**
     * Tratamiento a realizar.
     */
    private String tratamiento;
    /**
     * Destino del traslado.
     */
    private String destino;
    /**
     * Costo del traslado.
     */
    private double costo;
    /**
     * Kilometros a recorrer.
     */
    private double kilometros;
    /**
     * ID de la asignacion de traslado.
     */
    private ObjectId idAsignacionTraslado;
    /**
     * ID de la empresa de transporte.
     */
    private ObjectId idEmpresaTransporte;
    /**
     * Vehiculos a utilizar.
     */
    private List<Vehiculo> idVehiculos;

    /**
     * Constructor vacio
     */
    public Traslado() {
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Traslado menos el id de traslado
     *
     * @param fechaLLegada Fecha de llegada al destino.
     * @param tratamiento Tratamiento a realizar.
     * @param costo Costo del traslado.
     * @param kilometros Kilometros a recorrer.
     * @param idAsignacionTraslado ID de la asignacion de traslado.
     * @param idEmpresaTransporte ID de la empresa de transporte.
     * @param idVehiculos Vehiculos a utilizar.
     * @param destino Destino del traslado.
     */
    public Traslado(Date fechaLLegada, String tratamiento, double costo, double kilometros, ObjectId idAsignacionTraslado, ObjectId idEmpresaTransporte, List<Vehiculo> idVehiculos, String destino) {
        this.fechaLLegada = fechaLLegada;
        this.tratamiento = tratamiento;
        this.costo = costo;
        this.kilometros = kilometros;
        this.idAsignacionTraslado = idAsignacionTraslado;
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.idVehiculos = idVehiculos;
        this.destino = destino;
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Traslado
     *
     * @param _id ID del traslado.
     * @param fechaLLegada Fecha de llegada al destino.
     * @param tratamiento Tratamiento a realizar.
     * @param costo Costo del traslado.
     * @param kilometros Kilometros a recorrer.
     * @param idAsignacionTraslado ID de la asignacion de traslado.
     * @param idEmpresaTransporte ID de la empresa de transporte.
     * @param idVehiculos Vehiculos a utilizar.
     * @param destino Destino del traslado.
     */
    public Traslado(ObjectId _id, Date fechaLLegada, String tratamiento, double costo, double kilometros, ObjectId idAsignacionTraslado, ObjectId idEmpresaTransporte, List<Vehiculo> idVehiculos, String destino) {
        this._id = _id;
        this.fechaLLegada = fechaLLegada;
        this.tratamiento = tratamiento;
        this.costo = costo;
        this.kilometros = kilometros;
        this.idAsignacionTraslado = idAsignacionTraslado;
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.idVehiculos = idVehiculos;
        this.destino = destino;
    }

    /**
     * Devuelve el id
     *
     * @return El ID del traslado.
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Asigna el id con el ingresado de parámetro
     *
     * @param _id ID del traslado a establecer.
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Devuelve el destino.
     *
     * @return El destino del traslado.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Asigna el destino con el ingresado de parámetro
     *
     * @param destino Destino a establecer.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Devuelve la fecha de llegada
     *
     * @return Fecha de lllegada al destino.
     */
    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    /**
     * Asigna la fecha de llegada con la ingresada como parámetro
     *
     * @param fechaLLegada Fecha de llegada al destino.
     */
    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    /**
     * Devuelve el tratamiento
     *
     * @return Tratamiento del residuo.
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * Asigna el tratamiento con el ingresado de parámetro
     *
     * @param tratamiento Tratamiento a establecer.
     */
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     * Devuelve el costo
     *
     * @return El costo del traslado.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Asigna el costo con el ingresado de parámetro
     *
     * @param costo Costo a establecer.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Devuelve los kilómetros
     *
     * @return Kilometros del traslado a recorrer.
     */
    public double getKilometros() {
        return kilometros;
    }

    /**
     * Asigna los kilómetros con los ingresados de parámetro
     *
     * @param kilometros Kilometros del traslado a establcer.
     */
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    /**
     * Devuelve el id de asignación de traslado
     *
     * @return ID d ela asignacion de traslado.
     */
    public ObjectId getIdAsignacionTraslado() {
        return idAsignacionTraslado;
    }

    /**
     * Asigna el id de asignación de traslado con el id ingresado como parámetro
     *
     * @param idAsignacionTraslado ID de la asignacion de traslado a establecer.
     */
    public void setIdAsignacionTraslado(ObjectId idAsignacionTraslado) {
        this.idAsignacionTraslado = idAsignacionTraslado;
    }

    /**
     * Devuelve el id de la empresa de transporte
     *
     * @return ID de la empresa de transporte.
     */
    public ObjectId getIdEmpresaTransporte() {
        return idEmpresaTransporte;
    }

    /**
     * Asigna el id de la empresa de transporte con el ingresado como parámetro
     *
     * @param idEmpresaTransporte ID de la empresa de transporte a establecer.
     */
    public void setIdEmpresaTransporte(ObjectId idEmpresaTransporte) {
        this.idEmpresaTransporte = idEmpresaTransporte;
    }

    /**
     * Devuelve la lista de los id de vehículos
     *
     * @return Vehiculos a utilizar para el traslado.
     */
    public List<Vehiculo> getIdVehiculos() {
        return idVehiculos;
    }

    /**
     * Asigna el id de los vehiculos con la lista ingresada como parámetro
     *
     * @param idVehiculos Vehiculos a utilizar para el traslado .
     */
    public void setIdVehiculos(List<Vehiculo> idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    /**
     * Método para aplicarle el hash al id del traslado
     *
     * @return El hash code de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Traslado , con el fin de comparar sin un objeto
     * es el mismo que la clase.
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
        final Traslado other = (Traslado) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Traslado
     *
     * @return Cadena de caracteres con todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Traslado{" + "_id=" + _id + ", fechaLLegada=" + fechaLLegada + ", tratamiento=" + tratamiento + ", costo=" + costo + ", kilometros=" + kilometros + ", idAsignacionTraslado=" + idAsignacionTraslado + ", idEmpresaTransporte=" + idEmpresaTransporte + ", idVehiculos=" + idVehiculos + '}';
    }

}
