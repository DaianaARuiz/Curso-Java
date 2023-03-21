package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        //1. Get the number of hours worked
            System.out.println("Ingrese las horas trabajadas");
            Scanner scannerV = new Scanner(System.in); //Creo objeto java para escanear la info
            int hours = scannerV.nextInt();

        //2. Get the hourly pay rate
            System.out.println("Ingrese el pago por hora");
            double rate = scannerV.nextDouble();

        //3. Multiply hours and pay rate
            double grossPay = hours * rate;
        //4. Display result
        System.out.println("El salario bruto será"+grossPay);
    }
}
