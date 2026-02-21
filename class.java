package bhavnaapplication;

import java.util.Scanner;       //25CS044


public class clas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        String uniName = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();

        System.out.print("Enter Total Number of Students: ");
        int totalStudents = sc.nextInt();

        System.out.println();
        System.out.println("University Name: " + uniName);
        System.out.println("Department Name: " + deptName);
        System.out.println();

        for (int i = 1; i <= totalStudents; i++) {
            System.out.println("Roll No:25CS" + i);
        }

        sc.close();
    }
}

