public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(3,5,6,7);

    }
    public static void add(){
        System.out.println("Eklendi");

    }
    public static void remove(){
        System.out.println("Silindi");

    }
    public static void update(){
        System.out.println("Güncellendi");

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }

}