package praticeExam.Exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("Nhap Balance:");
        b.setBanlance(sc.nextInt());
        System.out.println("Nhap Rate:");
        b.setRate(sc.nextInt());
        b.calculateInterest();
        System.out.println("Interest is :"+ b.calculateInterest()+"USD");
    }

}
