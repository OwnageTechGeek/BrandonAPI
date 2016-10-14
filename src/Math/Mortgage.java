/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author hogueb10289
 */
public class Mortgage {
    
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
