package FinalProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import FinalProject.Doctor.UserAccount;

public class Nurse extends MedicalStaff{
	private String name; 
	private int id;
	private String address;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public void login () {
	public class main  
	{

	    public void main(String[] args) 
	    {

	      Scanner input = new Scanner (System.in);  

	      String username;
	      String password;


	      System.out.println("Welcome to your Social network site!");
	      System.out.println("\nEnter your username and password to login to your account.");    

	      System.out.println("Username: ");
	        username = input.nextLine();

	      System.out.println("Password: ");
	        password = input.nextLine();

	        UserAccount login = new UserAccount(username, password);

	        if(login.checkPassword())
	            System.out.println("You are logged in!");
	        else
	            System.out.println("The username and password you entered are incorrect.");
	    }


	}public class UserAccount 
	{

	    private String username;
	    private String password;
	    private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};

	    public UserAccount(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }
	    public boolean checkPassword()
	    {

	        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
	            return true;
	        else
	            return false;
	    }

	    public void deactivateAccount()
	    {
	        boolean active = false;
	    }

	}
	public void viewCalender() {
		class viewCalender {

		    public void main(String[] args) {
		        int Y = 2016;    // year
		        int startDayOfMonth = 5;
		        int spaces = startDayOfMonth;

		        // startDayOfMonth

		        // months[i] = name of month i
		        String[] months = {
		                "",                               // leave empty so that we start with months[1] = "January"
		                "January", "February", "March",
		                "April", "May", "June",
		                "July", "August", "September",
		                "October", "November", "December"
		            };

		            // days[i] = number of days in month i
		            int[] days = {
		                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		            };

		            for (int M = 1; M <= 12; M++) {

		            // check for leap year
		            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
		                days[M] = 29;

		            
		            // print calendar header
		            // Display the month and year
		            System.out.println("          "+ months[M] + " " + Y);

		            // Display the lines
		            System.out.println("_____________________________________");
		            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

		            // spaces required
		               spaces = (days[M-1] + spaces)%7;
		            
		            // print the calendar
		            for (int i = 0; i < spaces; i++)
		                System.out.print("     ");
		            for (int i = 1; i <= days[M]; i++) {
		                System.out.printf(" %3d ", i);
		                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
		            }
		            
		            System.out.println();
		        }
		    }
}
		public void updatePatientRecords() {
			throws IOException {
				char l = 'n';
				Patient p2 = new Patient(patientID, patientName, patientAddress, age, patientSex, patientIllness,
						amountForAppointment, joindate);
				}
				do {
					System.out.println("Enter patient ID you want to update:");
					final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					final int idnum = Integer.parseInt(br.readLine());
					for (int i = 0; i < hm.arl.size(); i++) {
						if (idnum == hm.arl.get(i).patientID) {
							System.out.println(
									"Enter 1 to change patient's name \n 2 to change patient's address \n 3 to change patient's age \n 4 to change patient's illness \n 5 to change registration fees along with the medical expenses");
							final int ch = Integer.parseInt(br.readLine());
							switch (ch) {
							case 1:
								System.out.println("Enter new patient's name:");
								p2.patientName = br.readLine();
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.age = hm.arl.get(i).age;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i, p2);
								System.out.println("Patient updated !!!");
								break;
							case 2:
								System.out.println("Enter new patient Address:");
								p2.patientAddress = br.readLine();
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.age = hm.arl.get(i).age;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i, p2);
								System.out.println("Patient updated !!!");
								break;
							case 3:
								System.out.println("Enter new Patient age:");
								p2.age = Integer.parseInt(br.readLine());
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i, p2);
								System.out.println("Patient updated !!!");
								break;
							case 4:
								System.out.println("Enter new Patient illness:");
								p2.age = hm.arl.get(i).age;
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = br.readLine();
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i, p2);
								System.out.println("Patient updated !!!");
								break;
							case 5:
								System.out.println("Enter the new amount that patient needs to pay:");
								p2.age = hm.arl.get(i).age;
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = Float.parseFloat(br.readLine());
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i, p2);
								System.out.println("Patient details updated !!!");
								break;
							default:
								System.out.println("Invalid choice.");
								break;
							}
							/* End of switch block */ }
						/* End of if block */ }
					/* End of for block */ System.out.println("Do you want to continue updating (y/n):");
					l = (char) br.read();
				} while (l == 'y');
	
}
public void viewPatientrecords() {

	System.out.println(":::Patient Details:");

	System.out.println("Patient ID:"+p.getPatientId());

	System.out.println("Patient Name:"+p.getName());

	System.out.println("Patient Age:"+p.getAge());

	System.out.println("Patient Address:"+p.getAddress());

	System.out.println("Patient Illness:"+p.getIllness());

	p.getLastAppointment().add(Calendar.DAY_OF_MONTH, 15);      

	if(p.getLastAppointment().getTime().compareTo(new Date())>0)
	System.out.println("Customer Status: Active");

	else

	System.out.println("Customer Status: InActive");

	p.getLastAppointment().add(Calendar.DAY_OF_MONTH, -15);

	}
}