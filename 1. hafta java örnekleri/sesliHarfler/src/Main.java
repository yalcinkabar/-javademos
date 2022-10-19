public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın ünlüdür.");
                break;
            default:
                System.out.println("İnce ünlüdür.");

        }
    }
}