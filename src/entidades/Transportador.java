package entidades;

import org.bson.types.ObjectId;
/**
 * Esta clase define o representa un usuario clase transportador.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class Transportador extends Usuario {

    private ObjectId idEmpresaTransporte;
    private Transporte empresaTransporte;

    /**
     * Constructor vacio que inicializa al tipo de usuario como transportador
     */
    public Transportador() {
        this.tipoUsuario = "Transportador";
    }

    /**
     * Constructor que recibe de parámetro el nombre del usuario transportador, el correo y la contraseña
     * @param nombreUsuario Nombre de usario de clase transportador.
     * @param contrasena COntraseña del usuario transportador.
     * @param correo Correo del usuario transportador.
     */
    public Transportador(String nombreUsuario, String contrasena, String correo) {
        super(nombreUsuario, contrasena, correo);
        this.tipoUsuario = "Transportador";

    }

    /**
     * Constructor que recibe de parámetro el id de la empresa de transporte, su propio id, su nombre de usuario, contraseña y correo
     * @param idEmpresaTransporte ID de la empresa de transporte.
     * @param _id Id del usuario. 
     * @param nombreUsuario Nombre de usario de clase transportador.
     * @param contrasena COntraseña del usuario transportador.
     * @param correo Correo del usuario transportador.
     */
    public Transportador(ObjectId idEmpresaTransporte, ObjectId _id, String nombreUsuario, String contrasena, String correo) {
        super(_id, nombreUsuario, contrasena, correo);
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.tipoUsuario = "Transportador";

    }

    /**
     * Constructor que recibe de parámetros el id de la empresa de transporte, su nombre de usuario, su contraseña y correo
      * @param idEmpresaTransporte ID de la empresa de transporte.
     * @param nombreUsuario Nombre de usario de clase transportador.
     * @param contrasena COntraseña del usuario transportador.
     * @param correo Correo del usuario transportador.
     */
    public Transportador(ObjectId idEmpresaTransporte, String nombreUsuario, String contrasena, String correo) {
        super(nombreUsuario, contrasena, correo);
        this.idEmpresaTransporte = idEmpresaTransporte;
        this.tipoUsuario = "Transportador";

    }

    /**
     * Devuelve el id de la empresa de transporte
     * @return  El ID de la empresa de transporte. 
     */
    public ObjectId getIdEmpresaTransporte() {
        return idEmpresaTransporte;
    }

    /**
     * Asigna el id de la empresa de transporte con el ingresado como parámetro
     * @param idEmpresaTransporte ID a establecer.
     */
    public void setIdEmpresaTransporte(ObjectId idEmpresaTransporte) {
        this.idEmpresaTransporte = idEmpresaTransporte;
    }

    /**
     * Devuelve la empresa de transporte
     * @return La empresa de transporte.
     */
    public Transporte getEmpresaTransporte() {
        return empresaTransporte;
    }

    /**
     * Asigna la empresa de transporte con la ingresada como parámetro
     * @param empresaTransporte Empresa de transporte.
     */
    public void setEmpresaTransporte(Transporte empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }

    /**
     * Método toString de la clase Transportador
     * @return Cadena de caracteres con todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Usuario{" + "_id=" + _id + ", nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", correo=" + correo + ", empresaT=" + idEmpresaTransporte + '}';
    }


}
