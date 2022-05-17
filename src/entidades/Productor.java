package entidades;

import org.bson.types.ObjectId;
/**
 * Esta clase define un usuario productor y sus datos generales.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Productor extends Usuario {
     /**
      * Id de la empresa productora que pertenece.
      */
    private ObjectId _idEmpresaProductora;
/**
 * Empresa productora que pertenece.
 */
    private Productora productora;

    /**
     * Constructor vacio que inicializa el tipo de usuario como productor
     */
    public Productor() {
        this.tipoUsuario = "Productor";
    }

    /**
     * Constructor que recibe el id, el nombre, la contraseña y el correo del
     * usuario productor
     *
     * @param _id Id del productor.
     * @param nombreUsuario Nombre de usuario clase productor. 
     * @param contrasena Contraseña del usuario productor.
     * @param correo Correo del usuario productor.
     */
    public Productor(ObjectId _id, String nombreUsuario, String contrasena, String correo) {
        super(_id, nombreUsuario, contrasena, correo);
        this.tipoUsuario = "Productor";

    }

    /**
     * Constructor que recibe de parámetros solamente el nombre de usuario, la
     * contraseña y el correo del productor
     *
        * @param nombreUsuario Nombre de usuario clase productor. 
     * @param contrasena Contraseña del usuario productor.
     * @param correo Correo del usuario productor.
     */
    public Productor(String nombreUsuario, String contrasena, String correo) {
        super(nombreUsuario, contrasena, correo);
        this.tipoUsuario = "Productor";

    }

    /**
     * Constructor que recibe de parámetro todos los atributos generales
     *
      * @param _id Id del productor.
     * @param nombreUsuario Nombre de usuario clase productor. 
     * @param contrasena Contraseña del usuario productor.
     * @param correo Correo del usuario productor.
     * @param tipoUsuario Tipo de duario.
     */
    public Productor(ObjectId _id, String nombreUsuario, String contrasena, String correo, String tipoUsuario) {
        super(_id, nombreUsuario, contrasena, correo, tipoUsuario);
        this.tipoUsuario = "Productor";
    }

    /**
     * Devuelve el id de la empresa productora
     *
     * @return Id de la empresa productora a la que pertence.
     */
    public ObjectId getIdEmpresaProductora() {
        return _idEmpresaProductora;
    }

    /**
     * Asigna el id de la empresa productora con el que ha sido ingresado como
     * parámetro
     *
     * @param _idEmpresaProductora ID de la empresa productora a establecer.
     */
    public void setIdEmpresaProductora(ObjectId _idEmpresaProductora) {
        this._idEmpresaProductora = _idEmpresaProductora;
    }

    /**
     * Devuelve la empresa productora
     *
     * @return Empresa productora.
     */
    public Productora getProductora() {
        return productora;
    }

    /**
     * Asigna la empresa productora con la ingresada como parámetro
     *
     * @param productora Empresa contructora a establecer.
     */
    public void setProductora(Productora productora) {
        this.productora = productora;
    }

}
