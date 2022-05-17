package entidades;

import org.bson.types.ObjectId;
/**
 * Esta clase define o representa una empresa productora de residuos.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Productora extends Empresa {

    /**
     * Constructor vacio que inicializa la empresa como empresa productora
     */
    public Productora() {
        this.tipoEmpresa = "Empresa Productora";
    }

    /**
     * Constructor que recibe los parámetros id y nombre de la clase empresa.
     *
     * @param _id ID de la empresa productora.
     * @param nombre Nombre de la empresa productora.
     */
    public Productora(ObjectId _id, String nombre) {
        super(_id, nombre);
        this.tipoEmpresa = "Empresa Productora";

    }

    /**
     * Constructor que recibe de parámetros todos los atributos generales de la
     * clase empresa excepto el id
     *
     * @param nombre Nombre de la empresa.
     * @param telefono Telefono de la empresa.
     * @param direccion Direccion de la empresa.
     * @param tamanho Tamaño de la empresa.
     */
    public Productora(String nombre, String telefono, String direccion, double tamanho) {
        super(nombre, telefono, direccion, tamanho);
        this.tipoEmpresa = "Empresa Productora";

    }

    /**
     * Constructor que recibe de parámetros todos los atributos generales de la
     * clase empresa
     *
     * @param _id ID de la empresa productora.
         * @param nombre Nombre de la empresa.
     * @param telefono Telefono de la empresa.
     * @param direccion Direccion de la empresa.
     * @param tamanho Tamaño de la empresa.
     */
    public Productora(ObjectId _id, String nombre, String telefono, String direccion, double tamanho) {
        super(_id, nombre, telefono, direccion, tamanho);
        this.tipoEmpresa = "Empresa Productora";

    }

}
