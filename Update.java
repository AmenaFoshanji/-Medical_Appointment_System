package servlet;


import java.util.Scanner;

public class Update extends User {
    public void update_Speciality_certification_experience(){
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.println("Update speciality");
        s = sc.nextLine();
        System.out.println("Update certification");
        s = sc.nextLine();
        System.out.println("Update experience");
        s = sc.nextLine();
    }

    public void add_Speciality_certification_experience(){
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.println("add speciality");
        s = sc.nextLine();
        System.out.println("add certification");
        s = sc.nextLine();
        System.out.println("add experience");
        s = sc.nextLine();
    }
}
