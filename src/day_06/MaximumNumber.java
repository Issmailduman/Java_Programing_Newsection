package day_06;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1=15;
        num2=122;
        if(num1<num2){
            System.out.println(num2+ " is greater than "+ num1);
        } else if (num1>num2) {
            System.out.println(num1+ " is greater than "+ num2);
        }else {
            System.out.println(num1 +" equal "+ num2);
        }
    }
}
