/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public static double mortagePayment(double principal, double annualRate, int years, int round) {
        double months = years * 12;
        double N = months;
        double P = principal;
        double decannualRate = annualRate / 100;
        double monthlyRate = decannualRate / 12;
        double R = monthlyRate;
        double monthlyPayment = (((exponent((1 + R),N) * R) / ((exponent((1 + R),N)) - 1)) * P);
        double finalmonthlyPayment = rounder(monthlyPayment, round);
        double totalPayments = finalmonthlyPayment * months;
        double totalInterest = totalPayments - principal; 
        return monthlyPayment;
    }
    
    }