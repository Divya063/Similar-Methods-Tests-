/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package tests;
import org.apache.commons.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author divya rani
 */
public class apacheFileExtension {
    
    public static void main(String args[]){
        testGetExtension();
    }
    
    
    public static void testGetExtension() {
        String s= FilenameUtils.getExtension("blah.txt");
         System.out.println(s);
        assertEquals(null, FilenameUtils.getExtension(null));
        assertEquals("ext", FilenameUtils.getExtension("file.ext"));
        assertEquals("", FilenameUtils.getExtension("README"));
        assertEquals("com", FilenameUtils.getExtension("domain.dot.com"));
        assertEquals("jpeg", FilenameUtils.getExtension("image.jpeg"));
        assertEquals("", FilenameUtils.getExtension("a.b/c"));
        assertEquals("txt", FilenameUtils.getExtension("a.b/c.txt"));
        assertEquals("", FilenameUtils.getExtension("a/b/c"));
        assertEquals("", FilenameUtils.getExtension("a.b\\c"));
        assertEquals("txt", FilenameUtils.getExtension("a.b\\c.txt"));
        assertEquals("", FilenameUtils.getExtension("a\\b\\c"));
        assertEquals("", FilenameUtils.getExtension("C:\\temp\\foo.bar\\README"));
        assertEquals("ext", FilenameUtils.getExtension("../filename.ext"));
        String s1 = FilenameUtils.getExtension("blah.tar.gz");
        System.out.println(s1);

      
    }

    
}
