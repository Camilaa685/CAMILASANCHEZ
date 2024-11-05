public class EstudianteDiseño extends Estudiante {
     String modalidadEstudio;
     int cantidadAsignaturas;
     String serial;

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas, String serial) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serial = serial;
    }

    // Métodos y validaciones adicionales
}

