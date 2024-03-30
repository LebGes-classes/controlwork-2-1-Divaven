package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Map_Test {

    private Map map;

    @BeforeEach
    void SetUp() {
        map = new Map<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 2);
        map.put(3, 2);
    }

    @Test
    void testcontainsKey() {
        assertEquals(true, map.containsKey(2));
        assertEquals(true, map.containsKey(3));
        assertEquals(false, map.containsKey(4));
    }

    @Test
    void testcontainsValue() {
        assertEquals(true, map.containsValue(2));
        assertEquals(false, map.containsValue(3));
    }

    @Test
    void testGet() {
        assertEquals(2, map.get(1));
        assertEquals(2, map.get(2));
        assertEquals(2, map.get(3));
    }

}

