public class Main {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("For loop counting up to 10:");

        for (int i = num; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("For loop counting down to 1 from 10");
        System.out.println();
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}