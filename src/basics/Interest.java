package basics;

import java.util.Scanner;

class SimpleInterest{
    double principle, time, rate;

    SimpleInterest(double p, double r, double t){
        principle=p;
        rate=r;
        time=t;
    }
    double calculate(){
        return ((principle*rate*time)/100);
    }
}

class CompoundInterest{
    double principle, time, rate;

    CompoundInterest(double p,double r, double t){
        principle=p;
        rate=r;
        time=t;
    }
    double calculate(){
        double result=principle*(Math.pow(1+(rate/100), time));
        return result;
    }
}
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r=sc.nextDouble();
        System.out.print("Enter Time Duration: ");
        double t=sc.nextDouble();

        SimpleInterest interest1=new SimpleInterest(p,r,t);
        System.out.println("Simple Interest: "+interest1.calculate());

        CompoundInterest interest2=new CompoundInterest(p,r,t);
        System.out.println("Compound Interest: "+interest2.calculate());
    }
}
