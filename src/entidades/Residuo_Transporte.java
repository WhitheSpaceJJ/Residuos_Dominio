package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define o representa un residuo que sera transportado en una solicitud de traslado
 * ya que estos poseen especificaciones directas de acuerdo al residuo a trasnportar..
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Residuo_Transporte {
/**
 * Id del residuo de transporte.
 */
    private ObjectId idResiduoTransporte;
    /**
     * Especificacion del residuo.
     */
    private String especificacion;
    /**
     * Estatus del residuo a transportar.
     */
    private String estatus;
    /**
     * Cantidad a transportar.
     */
    private double cantidad;
    /**
     * Residuo a transportar.
     */
    private Residuo residuo;

    /**
     * Constructor vacio
     */
    public Residuo_Transporte() {
    }

    /**
     * Constructor que recibe todos los atributos de la clase Residuo_Transporte
     *
     * @param idResiduoTransporte ID del residuo de transporte.
     * @param especificacion Especificacion KG/LT
     * @param estatus Estatus del residuo.
     * @param cantidad Cantidad a transportar.
     * @param residuo Residuo a transportar.
     */
    public Residuo_Transporte(ObjectId idResiduoTransporte, String especificacion, String estatus, double cantidad, Residuo residuo) {
        this.idResiduoTransporte = idResiduoTransporte;
        this.especificacion = especificacion;
        this.estatus = estatus;
        this.cantidad = cantidad;
        this.residuo = residuo;
    }

    /**
     * Devuelve el id del residuo a transportar
     *
     * @return ID del residuo de transporte.
     */
    public ObjectId getIdResiduoTransporte() {
        return idResiduoTransporte;
    }

    /**
     * Asigna el id del residuo a transportar con el id ingresado como parámetro
     *
     * @param idResiduoTransporte ID dell residuo a establecer.
     */
    public void setIdResiduoTransporte(ObjectId idResiduoTransporte) {
        this.idResiduoTransporte = idResiduoTransporte;
    }

    /**
     * Devuelve la especificación
     *
     * @return Especificacion del residuo a transportar.
     */
    public String getEspecificacion() {
        return especificacion;
    }

    /**
     * Asigna la especificación con la ingresada como parámetro
     *
     * @param especificacion Especificacion a establecer.
     */
    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    /**
     * Devuelve el estatus
     *
     * @return Estatus del residuo a transportar.
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
     * Devuelve la cantidad
     *
     * @return Cantidad a transportar.
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Asigna la cantidad con la ingresada como parámetro
     *
     * @param cantidad Cantidad a establecer.
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el residuo
     *
     * @return El Residuo a transportar.
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * Asigna el residuo con el ingresado como parámetro
     *
     * @param residuo El residuo a establecer.
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    /**
     * Método para aplicarle un hash al id del residuo a transportar
     *
     * @return El hash Code de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idResiduoTransporte);
        return hash;
    }

    /**
     * Método equals de la clase Residuo_Transporte, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Residuo_Transporte other = (Residuo_Transporte) obj;
        if (!Objects.equals(this.idResiduoTransporte, other.idResiduoTransporte)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Residuo_transporte
     *
     * @return Cadena de caracteres con todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Residuo_Transporte{" + "idResiduoTransporte=" + idResiduoTransporte + ", especificacion=" + especificacion + ", estatus=" + estatus + ", cantidad=" + cantidad + ", residuo=" + residuo + '}';
    }

}
