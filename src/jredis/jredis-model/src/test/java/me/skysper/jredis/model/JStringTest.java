package me.skysper.jredis.model;


import org.junit.Test;

public class JStringTest {
    @Test
    public void testString(){

        char[] array = new char[10];
        array[0] = '\0';
        array[1]='a';
        JString string = JString.create(array, 10);
        System.out.println(string);
    }
}
