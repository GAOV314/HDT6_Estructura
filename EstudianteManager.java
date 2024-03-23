import java.util.List;
import java.util.Map;

public class EstudianteManager {

    private Map<String, Estudiante> estudiantesPorLlave;
    private Map<String, List<Estudiante>> estudiantesPorNacionalidad;

    // Constructor
    public EstudianteManager(Map<String, Estudiante> estudiantesPorLlave, Map<String, List<Estudiante>> estudiantesPorNacionalidad) {
        this.estudiantesPorLlave = estudiantesPorLlave;
        this.estudiantesPorNacionalidad = estudiantesPorNacionalidad;
    }

    // Método para buscar estudiante por llave seleccionada
    public Estudiante buscarPorLlave(String llave) {
        return estudiantesPorLlave.get(llave);
    }

    // Método para buscar estudiantes por nacionalidad
    public List<Estudiante> buscarPorNacionalidad(String nacionalidad) {
        return estudiantesPorNacionalidad.get(nacionalidad);
    }
}
