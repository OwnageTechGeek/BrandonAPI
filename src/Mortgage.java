/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


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
        double monthlyPayment = (((SimpleMath.exponent((1 + R),N) * R) / ((SimpleMath.exponent((1 + R),N)) - 1)) * P);     
        double finalmonthlyPayment = SimpleMath.rounder(monthlyPayment, round);
        double totalPayments = finalmonthlyPayment * months;
        double totalInterest = totalPayments - principal; 
        return monthlyPayment;
        }
            
        public static double interestPayed(double principal, double annualRate, int years, int round) {
        double months = years * 12;
        double N = months;
        double P = principal;
        double decannualRate = annualRate / 100;
        double monthlyRate = decannualRate / 12;
        double R = monthlyRate;
        double monthlyPayment = (((SimpleMath.exponent((1 + R),N) * R) / ((SimpleMath.exponent((1 + R),N)) - 1)) * P);
        double totalPayments = monthlyPayment * months;
        double totalInterest = totalPayments - principal; 
        return totalInterest;
        }
  
        public static double totalPayments(double principal, double annualRate, int years, int round) {
        double months = years * 12;
        double N = months;
        double P = principal;
        double decannualRate = annualRate / 100;
        double monthlyRate = decannualRate / 12;
        double R = monthlyRate;
        double monthlyPayment = (((SimpleMath.exponent((1 + R),N) * R) / ((SimpleMath.exponent((1 + R),N)) - 1)) * P);
        monthlyPayment = SimpleMath.rounder(monthlyPayment, round);
        double totalPayments = monthlyPayment * months;
        double totalInterest = totalPayments - principal; 
        return totalPayments;
        }
    
    }
