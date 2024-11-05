 public class EstudianteIngenieria extends Estudiante {
     int semestre;
     float promedio;
     String serial;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestre, float promedio, String serial) {
        super(cedula, nombre, apellido, telefono);
        this.semestre = semestre;
        this.promedio = promedio;
        this.serial = serial;
    }

    // Métodos y validaciones adicionales
}
 
    

