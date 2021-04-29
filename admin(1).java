package servlet;

import java.util.Scanner;

public class admin {
    private String name;
    private int ID;
    private int age;

    public void login(String user,String pass) {
        Scanner input = new Scanner(System.in);

        String username;
        String password;

        System.out.println("Log in:");
        System.out.println("username: ");
        username = input.next();

        System.out.println("password: ");
        password = input.next();、
、/* still revising

        if (username.equals(user) && password.equals(pass)){
            System.out.println("You are logged in");
            System.out.println("Menu: manageUsers,manageAppointment,viewDoctor,appointment," +
                    "sendRemainerToPatient,manageWaitingList");
            String menu = input.nextLine();
            if (menu.equals("manageUsers")){
                System.out.println("manageUsers");
            }else if (menu.equals("manageAppointment")){
                System.out.println("manageAppointment");
            }else if (menu.equals("viewDoctor")){
                System.out.println("viewDoctor");
            }else if (menu.equals("appointment")){
                System.out.println("appointment");
            }else if (menu.equals("sendRemainerToPatient")){
                System.out.println("sendRemainerToPatient");
            }else if (menu.equals("manageWaitingList")){
                System.out.println("manageWaitingList");
            }else{
                System.out.println("");
            }
        }
*/


    }

    public void manageUsers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yes to manage users");
        String str = sc.nextLine();
        if (str.equals("Y")){
           
            System.out.println("Add doctor/nurse(Y or N)");
            String s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("Please enter the info");
                String info = sc.nextLine();
                System.out.println("Successful!");
            }
            System.out.println("Update doctor/nurse(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("Please enter the information you would like to update");
                String info = sc.nextLine();
                System.out.println("Information has updated to "+info);
            }
            System.out.println("Delete doctor/nurse(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("Enter the name of teh person's info you'd like to delete");
                String info = sc.nextLine();
                System.out.println("Successful!");
            }
            System.out.println("Enter user page(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")){
                User user = new User();
                System.out.println(user.toString());
            }
        }else if (str.equals("N")){
            System.out.println("Not entering user page");
        }else {
            System.out.println("Error, please try again");
        }
    }

    public void manageAppointment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("manage appointment(Y or N)");
        String str = sc.nextLine();
        if (str.equals("Y")){
            System.out.println("Enter appointment managing page");
        }else if (str.equals("N")){
            System.out.println("Not enter appointment managing page");
        }else {
            System.out.println("Error, please try again");
        }
        System.out.println("Enter the name of the doctor you would like to make an appointment with");
        String s = sc.nextLine();
        if (s.equals("doctor")){
            Doctor doctor = new Doctor();
            System.out.println("Appointment created");
        }
       
        
        else {
            System.out.println("Error, please try again");
        }
    }

    public void viewDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thhe name: ");
        String str = sc.nextLine();
        Doctor doctor = new Doctor();
        doctor.setName = str;
        System.out.println(doctor.toString);
    }

    public void appointment(){
        AppointMent appointMent = new AppointMent();
        System.out.println(appointMent.toString);
    }

    public void sendReminderToPatient(){
        Patient patient = new Patient();
        Appointment appointment = new Appointment();
        Doctor doctor = new Doctor();
        int day = appointment.getAppointmentNate().getDay();
        day--;
        System.out.println("This is a a reminder that your appointment with"+doctor.getName+doctor.getAddress+appointment.getAppointmentNate());
    }

    public void manageWaitingList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Manage waiting list(Y or N)");
        String str = sc.nextLine();
        if (str.equals("Y")){
            System.out.println("entering manageWaitingList page");
        }else if (str.equals("N")){
            System.out.println("not entering manageWaitingList page");
        }else {
            System.out.println("Error, please try again");
        }
    }
}
