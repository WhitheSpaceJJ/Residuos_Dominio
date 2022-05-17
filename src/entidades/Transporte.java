package entidades;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
/**
 * Esta clase define o representa una empresa de transporte con todos los atributos generales de esta.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Transporte extends Empresa {
/**
 * Vehiculos de la empresa de transporte.
 */
    private List<Vehiculo> vehiculos;

    /**
     * Constructor vacio que inicializa la empresa como empresa de transporte
     */
    public Transporte() {
        this.tipoEmpresa = "Empresa Transporte";
    }

    /**
     * Constructor que recibe de parámetro el id de la empresa de transporte
     * @param _id ID de la empresa transporte.
     */
    public Transporte(ObjectId _id) {
        super(_id);        this.tipoEmpresa = "Empresa Transporte";

    }

    /**
     * Constructor que recibe de parámetro el id y el nombre de la empresa de transporte
     * @param _id ID de la empresa de transporte.
     * @param nombre  Nombre de la empresa de transporte.
     */
    public Transporte(ObjectId _id, String nombre) {
        super(_id, nombre);        this.tipoEmpresa = "Empresa Transporte";

    }

    /**
     * Constructor que recibe de parámetro los atributos generales de la empresa menos el id y la lista de vehiculos
     * @param nombre  Nombre de la empresa de transporte.
     * @param telefono Telefono de la empresa de transporte.
     * @param direccion Direccion de la empresa de transporte.
     * @param tamanho  Tamaño de la empresa de transporte.
     */
    public Transporte(String nombre, String telefono, String direccion, double tamanho) {
        super(nombre, telefono, direccion, tamanho);
        this.tipoEmpresa = "Empresa Transporte";
    }

    /**
     * Constructor que recibe de parámetro los atributos generales de la empresa menos la lista de vehiculos
     * @param _id ID de la empresa de transporte.
         * @param nombre  Nombre de la empresa de transporte.
     * @param telefono Telefono de la empresa de transporte.
     * @param direccion Direccion de la empresa de transporte.
     * @param tamanho  Tamaño de la empresa de transporte.
     */
    public Transporte(ObjectId _id, String nombre, String telefono, String direccion, double tamanho) {
        super(_id, nombre, telefono, direccion, tamanho);
        this.tipoEmpresa = "Empresa Transporte";
    }

  

    /**
     * Devuelve la lista de vehiculos
     * @return  Vehiculos de la empresa de transporte.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Asigna la lista de vehiculos con la ingresada como parámetro
     * @param vehiculos Vehiculos de la empresa de transporte a establecer.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Método toString de la clase Transporte
     * @return  Cadena de caracteres con todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Empresa{" + "_id=" + _id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", tamanho=" + tamanho + "vehiculos=" + vehiculos + '}';
    }

}
