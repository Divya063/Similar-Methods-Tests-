/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Tests for the method getFileExtension (guava)
 */
package tests;

import com.google.common.io.Files;
import org.junit.Test;
import static org.junit.Assert.*;

public class fileExtension{
    
    public static void main(String args[]){
        testGetFileExtension();
    }
     
    public static void testGetFileExtension() {
    String s= Files.getFileExtension("blah.txt");
    System.out.println(s);
    assertEquals("txt", s );
    assertEquals("txt", Files.getFileExtension("blah.txt"));
    assertEquals("txt", Files.getFileExtension("blah..txt"));
    assertEquals("txt", Files.getFileExtension(".blah.txt"));
    assertEquals("txt", Files.getFileExtension("/tmp/blah.txt"));
    assertEquals("gz", Files.getFileExtension("blah.tar.gz"));
    String s1 = Files.getFileExtension("blah.tar.gz");
    System.out.println(s1);
    assertEquals("", Files.getFileExtension("/"));
    assertEquals("", Files.getFileExtension("."));
    assertEquals("", Files.getFileExtension(".."));
    assertEquals("", Files.getFileExtension("..."));
    assertEquals("", Files.getFileExtension("blah"));
    assertEquals("", Files.getFileExtension("blah."));
    assertEquals("", Files.getFileExtension(".blah."));
    assertEquals("", Files.getFileExtension("/foo.bar/blah"));
    assertEquals("", Files.getFileExtension("/foo/.bar/blah"));
  }
    
        
}

   
