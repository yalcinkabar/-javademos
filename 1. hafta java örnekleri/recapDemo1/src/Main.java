public class Main {
    public static void main(String[] args) {
        int sayi1=266;
        int sayi2=25;
        int sayi3=26;
        int enBüyük = sayi1;

        if (enBüyük<sayi2){
            enBüyük = sayi2;
        }
        else if(enBüyük<sayi3){
            enBüyük= sayi3;
        }
        System.out.println("En büyük sayi : "+enBüyük);



    }
}