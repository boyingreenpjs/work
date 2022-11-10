import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        int storona = scanner.nextInt();
        int S = storona * 4;
        int S2 = storona * storona;
        System.out.println("Периметр квадрата = " + S);
        System.out.println("Площадь квадрата = " + S2);
    }
}