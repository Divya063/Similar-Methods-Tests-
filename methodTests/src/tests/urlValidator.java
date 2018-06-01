/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.apache.commons.validator.UrlValidator;

/**
 *
 * @author divya rani
 */
public class urlValidator {
    
    public static void main(String args[]){
        
        UrlValidator urlValidator = new UrlValidator();
        System.out.println(urlValidator.isValid("http://usr:pwd@localhost")); // false
        System.out.println(urlValidator.isValid("http://username:password@192.168.10.10:4010/")); //false
        
    }
    
}
