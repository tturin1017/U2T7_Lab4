package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProblemsTest{
    @Test
    void testEndsly1(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = true;
        boolean studentOutput= o.endsLy("oddly");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testEndsly2(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = false;
        boolean studentOutput= o.endsLy("y");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testEndsly3(){
        StringProblems o = new StringProblems();
        boolean expectedOutput = false;
        boolean studentOutput= o.endsLy("oddy");
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testConcat1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "abcat";
        String studentOutput= o.conCat("abc","cat");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testConcat2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "dogcat";
        String studentOutput= o.conCat("dog","cat");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testConcat3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "abc";
        String studentOutput= o.conCat("abc","");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDefront1(){
        StringProblems o = new StringProblems();
        String expectedOutput = "llo";
        String studentOutput= o.deFront("Hello");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDefront2(){
        StringProblems o = new StringProblems();
        String expectedOutput = "va";
        String studentOutput= o.deFront("java");
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDefront3(){
        StringProblems o = new StringProblems();
        String expectedOutput = "aay";
        String studentOutput= o.deFront("away");
        assertEquals(expectedOutput,studentOutput);
    }
}
