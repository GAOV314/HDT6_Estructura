import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Clase para leer un archivo JSON que contiene información de estudiantes y realizar búsquedas sobre ellos.
 */
public class LectorArchivo {
    private MapFactory<String, Estudiante> mapFactory;
    private Map<String, Estudiante> estudiantesPorLlave; // Mapa que almacena estudiantes por una clave específica (teléfono)
    private Map<String, List<Estudiante>> estudiantesPorNacionalidad; // Mapa que almacena listas de estudiantes por nacionalidad

    /**
     * Constructor de la clase LectorArchivo.
     * 
     * @param mapFactory Instancia de la fábrica de mapas.
     */
    public LectorArchivo(MapFactory<String, Estudiante> mapFactory) {
        this.mapFactory = mapFactory;
        this.estudiantesPorLlave = mapFactory.createMap(MapFactory.MapType.HASHMAP);
        this.estudiantesPorNacionalidad = mapFactory.createMap(MapFactory.MapType.HASHMAP);
    }

    /**
     * Método para leer el archivo JSON que contiene información de los estudiantes y almacenarla en los mapas correspondientes.
     * 
     * @param nombreArchivo Nombre del archivo JSON.
     */
    public void leerArchivo(String nombreArchivo) {
        JSONParser parser = new JSONParser();

        try {
            JSONArray estudiantes = (JSONArray) parser.parse(new FileReader(nombreArchivo));

            for (Object obj : estudiantes) {
                JSONObject estudianteJson = (JSONObject) obj;
                String nombre = (String) estudianteJson.get("name");
                String telefono = (String) estudianteJson.get("phone");
                String correo = (String) estudianteJson.get("email");
                String postalZip = (String) estudianteJson.get("postalZip");
                String nacionalidad = (String) estudianteJson.get("country");

                Estudiante estudiante = new Estudiante(nombre, telefono, correo, postalZip, nacionalidad);

                // Almacenar estudiante en el mapa por llave (teléfono)
                estudiantesPorLlave.put(telefono, estudiante);

                // Almacenar estudiante en el mapa por nacionalidad
                List<Estudiante> listaPorNacionalidad = estudiantesPorNacionalidad.getOrDefault(nacionalidad, new ArrayList<>());
                listaPorNacionalidad.add(estudiante);
                estudiantesPorNacionalidad.put(nacionalidad, listaPorNacionalidad);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para buscar un estudiante según la opción seleccionada por el usuario.
     */
    public void buscarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el método de búsqueda:");
        System.out.println("1. Por correo");
        System.out.println("2. Por teléfono");
        System.out.println("3. Por nacionalidad");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el correo del estudiante:");
                String correo = scanner.next();
                // Implementa la búsqueda por correo
                break;
            case 2:
                System.out.println("Ingrese el teléfono del estudiante:");
                String telefono = scanner.next();
                Estudiante estudiantePorTelefono = estudiantesPorLlave.get(telefono);
                if (estudiantePorTelefono != null) {
                    System.out.println("Estudiante encontrado:");
                    System.out.println(estudiantePorTelefono);
                } else {
                    System.out.println("Estudiante no encontrado.");
                }
                break;
            case 3:
                System.out.println("Ingrese la nacionalidad del estudiante:");
                String nacionalidad = scanner.next();
                List<Estudiante> estudiantesPorNac = estudiantesPorNacionalidad.get(nacionalidad);
                if (estudiantesPorNac != null) {
                    System.out.println("Estudiantes encontrados:");
                    for (Estudiante est : estudiantesPorNac) {
                        System.out.println(est);
                    }
                } else {
                    System.out.println("No se encontraron estudiantes con esa nacionalidad.");
                }
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    /**
     * Método main que instancia la clase LectorArchivo y realiza la lectura del archivo JSON y la búsqueda de estudiantes.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        MapFactory<String, Estudiante> mapFactory = new MapFactory<>();
        LectorArchivo lector = new LectorArchivo(mapFactory);
        lector.leerArchivo("estudiantes.json.json");
        lector.buscarEstudiante();
    }
}
