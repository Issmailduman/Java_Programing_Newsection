package day_06;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 65;
        boolean isEven = number%2==0;

        if(number %2==0){
            System.out.println(number +" is Even number " + true);

        }else {
            System.out.println(number +" is Odd number " + true);
        }

        System.out.println("----------------------------------------------------------------");
        if(isEven){
            System.out.println(number +" is Even number " + true);

        }else {
            System.out.println(number +" is Odd number " + true);
        }
    }
}
