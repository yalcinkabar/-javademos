public class Main {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        //System.out.println(remainder);
        int i =2;
        for (i=2; i<=number; i++) {
            if (number % i == 0) {
            break;
            }
        }
        if(number==i){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }

        }

}