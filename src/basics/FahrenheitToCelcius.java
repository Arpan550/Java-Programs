package basics;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temparature value at fahrenheit: ");
        double temp_f=sc.nextDouble();
        double temp_c=((temp_f-32)/9)*5;
        System.out.println("Corresponding Celcius temparature: "+temp_c);
    }
}
