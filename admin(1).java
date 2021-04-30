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
        password = input.next();
            
            if (username.equals(user) && password.equals(pass)){
            System.out.println("You are logged in");
            System.out.println("manageUsers,manageAppointment,viewDoctor,appointment," +
                    "sendReminderToPatient,manageWaitingList");
            String menu = input.nextLine();
            if (menu.equals("manageUsers")){
                manageUsers();
            }else if (menu.equals("manageAppointment")){
                manageAppointment();
            }else if (menu.equals("viewDoctor")){
                viewDoctor();
            }else if (menu.equals("appointment")){
                appointment();
            }else if (menu.equals("sendReminderToPatient")){
                sendReminderToPatient();
            }else if (menu.equals("manageWaitingList")){
                manageWaitingList();
            }else{
                System.out.println("Error");
            }
        }



    }

   public void manageUsers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter(Y or N)");
        String str = sc.nextLine();
        if (str.equals("Y")){
            
            System.out.println("Add doctor or nurse(Y or N)");
            String s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("enter information");
                String info = sc.nextLine();
                System.out.println("successful");
            }
            System.out.println("update octor or nurse(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("enter information");
                String info = sc.nextLine();
                System.out.println("successful);
            }
            System.out.println("delete doctor or nurse(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")) {
                System.out.println("enter information");
                String info = sc.nextLine();
                System.out.println("successful");
            }
            System.out.println("User page(Y or N)");
            s = sc.nextLine();
            if (s.equals("Y")){
                User user = new User();
                System.out.println(user.toString());
            }
        }else if (str.equals("N")){
            System.out.println("Not entering user page");
        }else {
            System.out.println("error");
        }else {
            login(user,pass);
        }
    }

    public void manageAppointment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("manage appointment(Y or N)");
        String str = sc.nextLine();
        if (str.equals("Y")){
            System.out.println("Enter appointment managing page");
        }else if (str.equals("N")){
            login(user,pass);
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
            login(user,pass);
        }else {
            System.out.println("Error, please try again");
        }
    }
}
