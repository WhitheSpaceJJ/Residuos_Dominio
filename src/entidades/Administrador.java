package entidades;

import org.bson.types.ObjectId;

/**
 * Clase que representa un usuario administrador.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Administrador extends Usuario {

    /**
     * Constructor vacio que asigna como administrador al tipo de usuario
     */
    public Administrador() {
        this.tipoUsuario = "Administrador";
    }

    /**
     * Constructor que toma todos los atributos heredados de la clase usuario y asigna coomo administrador al tipo de usuario
     * @param _id Id del usuario
     * @param nombreUsuario Nombre del usuario
     * @param contrasena COntraseña del usuario.
     * @param correo Correo del usuario.
     */
    public Administrador(ObjectId _id, String nombreUsuario, String contrasena, String correo) {
        super(_id, nombreUsuario, contrasena, correo);
        this.tipoUsuario = "Administrador";
    }

    /**
     * Constructor que toma todos los atributos heredados menos el id de la clase usuario y asigna coomo administrador al tipo de usuario
    * @param nombreUsuario Nombre del usuario
     * @param contrasena COntraseña del usuario.
     * @param correo Correo del usuario.
     */
    public Administrador(String nombreUsuario, String contrasena, String correo) {
        super(nombreUsuario, contrasena, correo);
        this.tipoUsuario = "Administrador";
    }

}
