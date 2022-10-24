import Dog.*;

import java.util.Scanner;

public class Program {
    //* vì main là static nên thằng này cx can la static.
    //* thằng này được lưu ở vùng nhớ static
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Dog d1 = new Dog();
        d1.breed = scanner.nextString();
        d1.age = 5;
        d1.size = "Big";
        d1.color = "Black";
        System.out.println(d1.breed + " " + d1.size + " " + d1.age + " " + d1.color);*/
        Square s1 = new Square();
        System.out.println("Nhập vào độ dài cạnh: ");
        s1.x = scanner.nextFloat();
        System.out.println("Chu vi: " + s1.perimeter() + " Diện tích: " + s1.area());
    }
}
