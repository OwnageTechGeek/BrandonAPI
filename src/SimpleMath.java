/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;


/**
 *
 * @author hogueb10289
 */
public class SimpleMath {
    
    public static int addInt(int x, int y) {
        return x+y;
    }
    
    public static double addDouble(double x, double y) {
        return x+y;
    }
    
    public static int subInt(int x, int y) {
        return x-y;
    }
    
    public static double subDouble(double x, double y) {
        return x-y;
    }
    
    public static double rounder(double number, int places) {
        long factor = (long) Math.pow(10, places);
        number = number * factor;
        long tmp = Math.round(number);
        return (double) tmp / factor;
    }
    
    public static double exponent(double a, double b) {
        double res =1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
        }
    
    public static double sqrt(double number) {
        return java.lang.Math.sqrt(number);
    }     
   
    public static double quadraticRoots(long a, long b, long c, boolean rootNum) {
        // General format of ax^2+bx+c
        double temp = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b +  temp) / (2*a) ;
        double root2 = (-b -  temp) / (2*a) ; 
        
        if (rootNum = false) {
            return root1;
        }
        if (rootNum = true) {
            return root2;
        }
        
        return 0;
    }
    
        
        
    
    }
