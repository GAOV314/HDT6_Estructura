import java.util.*;

/**
 * Factory class for creating instances of AbstractMap with different implementations.
 * @param <K> The type of keys maintained by the map.
 * @param <V> The type of mapped values.
 */
public class MapFactory<K, V> {

    /**
     * Enum for specifying the type of map to create.
     */
    public enum MapType {
        HASHMAP,        // HashMap implementation
        TREEMAP,        // TreeMap implementation
        LINKEDHASHMAP   // LinkedHashMap implementation
    }

    /**
     * Creates a new instance of AbstractMap based on the specified map type.
     * 
     * @param type The type of map to create.
     * @return A new instance of AbstractMap with the specified implementation.
     * @throws IllegalArgumentException If an invalid map type is provided.
     */
    public Map<String, List<Estudiante>> createMap(MapType type) {
        switch (type) {
            case HASHMAP:
                return new HashMap<>();
            case TREEMAP:
                return new TreeMap<>();
            case LINKEDHASHMAP:
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("Invalid map type");
        }
    }
}
