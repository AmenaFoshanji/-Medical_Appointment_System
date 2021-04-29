package servlet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Appointment {
    public Appointment(int appointmentNo, Date appointmentNate) {
        this.appointmentNo = appointmentNo;
        this.appointmentDate = appointmentDate;
    }

    private int appointmentNo;
    private Date appointmentDate;

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public Date getAppointmentNate() {
        return appointmentDate;
    }

    public void setAppointmentNate(Date appointmentNate) {
        this.appointmentDate = appointmentNate;
    }

    public Appointment() {
    }

    public void cancelAppointment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("确定要删除此预约吗（Y OR N）");
        String s = sc.nextLine();
        if (s.equals("Y")){

        }
    }
    public void addAppointment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter time");
        String s1 = sc.nextLine();
        Date date = new Date(s1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(date);
        System.out.println("Successful");
    }
    public void searchAppointment(){
        System.out.println(this.toString());
    }
    public void changeAppointment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter time");
        String s1 = sc.nextLine();
        Date date = new Date(s1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(date);
        System.out.println("Successful");
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentNo=" + appointmentNo +
                ", appointmentNate=" + appointmentDate +
                '}';
    }
}
