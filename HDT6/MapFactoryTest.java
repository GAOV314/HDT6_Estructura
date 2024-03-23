import org.junit.Test;
import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Clase de prueba para la clase MapFactory.
 */
public class MapFactoryTest {

    /**
     * Prueba para crear un HashMap.
     */
    @Test
    public void testCreateHashMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.HASHMAP);
        assertNotNull(map);
        assertTrue(map instanceof HashMap);
    }

    /**
     * Prueba para crear un TreeMap.
     */
    @Test
    public void testCreateTreeMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.TREEMAP);
        assertNotNull(map);
        assertTrue(map instanceof TreeMap);
    }

    /**
     * Prueba para crear un LinkedHashMap.
     */
    @Test
    public void testCreateLinkedHashMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.LINKEDHASHMAP);
        assertNotNull(map);
        assertTrue(map instanceof LinkedHashMap);
    }

    /**
     * Prueba para un tipo de mapa no válido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMapType() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        factory.createMap(MapFactory.MapType.valueOf("INVALID_TYPE"));
    }
}

