/**
 * Método main que instancia la clase LectorArchivo y realiza la lectura del archivo JSON y la búsqueda de estudiantes.
 *
 */


 public class Main {
    public static void main(String[] args) {
        MapFactory<String, Estudiante> mapFactory = new MapFactory<>();
        LectorArchivo lector = new LectorArchivo(mapFactory);
        lector.leerArchivo("estudiantes.json.json");
        lector.buscarEstudiante();
    }
}