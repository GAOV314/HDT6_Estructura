import java.util.*;

public class MapFactory<K, V> {

    public enum MapType {
        HASHMAP,
        TREEMAP,
        LINKEDHASHMAP
    }

    public AbstractMap<K, V> createMap(MapType type) {
        switch (type) {
            case HASHMAP:
                return new HashMap<K, V>();
            case TREEMAP:
                return new TreeMap<K, V>();
            case LINKEDHASHMAP:
                return new LinkedHashMap<K, V>();
            default:
                throw new IllegalArgumentException("Invalid map type");
        }
    }
}
