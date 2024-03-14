import org.junit.Test;
import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapFactoryTest {

    @Test
    public void testCreateHashMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.HASHMAP);
        assertNotNull(map);
        assertTrue(map instanceof HashMap);
    }

    @Test
    public void testCreateTreeMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.TREEMAP);
        assertNotNull(map);
        assertTrue(map instanceof TreeMap);
    }

    @Test
    public void testCreateLinkedHashMap() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        AbstractMap<Integer, String> map = factory.createMap(MapFactory.MapType.LINKEDHASHMAP);
        assertNotNull(map);
        assertTrue(map instanceof LinkedHashMap);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMapType() {
        MapFactory<Integer, String> factory = new MapFactory<>();
        factory.createMap(MapFactory.MapType.valueOf("INVALID_TYPE"));
    }
}
