import java.lang.System;
import java.util.Scanner;
class javasample2{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String name=scan.nextLine();
     int age=scan.nextInt();
     scan.nextLine();
     String address=scan.nextLine();
     System.out.println("my name is :"+name);
     System.out.println("my age is :"+age);
     System.out.println("my address is :"+address);  
    }
}
