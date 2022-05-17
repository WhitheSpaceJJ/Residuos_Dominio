package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;
/**
 * Esta clase define objetos del tipo usuario y los atributos generales.
 *
 * @author: Equipo 1. Jose,Abraham,Oroz.
 */
public class Usuario {
/**
 * ID del usuario.
 */
    protected ObjectId _id;
    /**
     * Nombre del usuario.
     */
    protected String nombreUsuario;
 /**
  * Tipo de usuario.
  */
    protected String tipoUsuario;
    /**
     * Correo del usuario.
     */
    protected String correo;
    /**
     * Contraseña del usuario.
     */
    protected String contrasena;

    /**
     * Constructor vacio
     */
    public Usuario() {
    }

    /**
     * Constructor que recibe de parámetro todos los atributos de la clase
     * Usuario sin contar el tipo de usuario
     *
     * @param _id ID del usuario.
     * @param nombreUsuario Nombre del usuario.
     * @param contrasena Contraseña del usuario.
     * @param correo Correo del usuario.
     */
    public Usuario(ObjectId _id, String nombreUsuario, String contrasena, String correo) {
        this._id = _id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    /**
     * Constructor que nomas recibe de parámetros el nombre de usuario, la
     * contraseña y el correo
     *
         * @param nombreUsuario Nombre del usuario.
     * @param contrasena Contraseña del usuario.
     * @param correo Correo del usuario.
     */
    public Usuario(String nombreUsuario, String contrasena, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    /**
     * Constructor que recibe todos los atributos de la clase Usuario
     *
    * @param _id ID del usuario.
     * @param nombreUsuario Nombre del usuario.
     * @param contrasena Contraseña del usuario.
     * @param correo Correo del usuario.
     * @param tipoUsuario Tipo de usuario.
     */
    public Usuario(ObjectId _id, String nombreUsuario, String contrasena, String correo, String tipoUsuario) {
        this._id = _id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Devuelve el id
     *
     * @return ID del usuario.
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
     * Devuelve el nombre del usuario
     *
     * @return Nombre del usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Asigna el nombre del usuario con el ingresado como parámetro
     *
     * @param nombreUsuario Nombre a establecer.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Devuelve la contraseña
     *
     * @return Contraseña del usuario.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Asigna la contraseña con la ingresada como parámetro
     *
     * @param contrasena Contraseña a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Devuelve el correo
     *
     * @return Correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Asigna el correo con el ingresado como parámetro
     *
     * @param correo Correo a establecer.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve el tipo de usuario
     * 
     * @return Tipo de usuario.
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Asigna el tipo de usuario con el ingresado como parámetro
     *
     * @param tipoUsuario Tipo de usuario a establecer.
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Método para aplicarle el hash al id del usuario
     *
     * @return Hash code de la clase.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this._id);
        return hash;
    }

    /**
     * Método equals de la clase Usuario, con el fin de comparar sin un objeto es el mismo que la clase.
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }

    /**
     * Método toString de la clase Usuario
     *
      * @return Cadena de caracteres con todos los atributos de clase.
     */
    @Override
    public String toString() {
        return "Usuario{" + "_id=" + _id + ", nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", correo=" + correo + ", tipoUsuario=" + tipoUsuario + '}';
    }

}
