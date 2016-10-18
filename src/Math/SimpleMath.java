/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;

package Math;

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
    
    public static int gcf(int numberone, int numbertwo) {
        int gcf = Math.Max(numberone, numbertwo) - Math.Min(numberone,numbertwo)
        return gcf;
    }
    
    public static long gcd(long numberOne, long numberTwo)
    {
    while (remainder > 0)
    {
        long temp = numberTwo;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
    }
    
    public static double quadraticRoots(long a, long b, long c, int rootNum) {
        // General format of ax^2+bx+c
        double temp = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b +  temp) / (2*a) ;
        double root2 = (-b -  temp) / (2*a) ; 
        
        if (rootNum = 1) {
            return root1;
        }
        if (rootNum = 2) {
            return root2;
        }
    }
    
        
        
    
    }
