/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.common.utils.main.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dwin
 */
public class JavaUtilitiesTest {
    
    private JavaUtilities classUnderTest;
    
    @Before
    public void setUp() {
        classUnderTest = new JavaUtilities();
    }

    @Test
    public void asList_returnsList() {
        // setup
        String a = "a";
        String b = "b";
        String c = "c";
        
        // tested act
        Object actual = classUnderTest.asList(a, b, c);
        
        // expected
        Class<?> expected = List.class;
        
        // assertion
        assertThat(actual, instanceOf(expected));
    }
    
    @Test
    public void asList_preservesOrder() {
        // setup
        Integer a = 3;
        Integer b = 5;
        Integer c = 7;
        
        // tested act
        List<Integer> actual = classUnderTest.asList(a, b, c);
                
        // assertion
        assertEquals(actual.get(0), a);
        assertEquals(actual.get(1), b);
        assertEquals(actual.get(2), c);
    }
    
    @Test
    public void asList_canBeAddedTo() {
        // setup
        Integer a = 3;
        Integer b = 5;
        List<Integer> actual = classUnderTest.asList(a, b);
        
        Integer c = 7;
        
        
        // tested act
        actual.add(c);
        
        // expected
        List<Integer> expected = new ArrayList<>();
        expected.add(a);
        expected.add(b);
        expected.add(c);
                
        // assertion
        assertEquals(expected, actual);
    }
    
}
