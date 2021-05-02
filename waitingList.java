package finalproject;

public class waitingList {

private void addWaitingList() throws DoctorNotFoundException, PatientNotFoundException, ParseException {
        System.out.println("Add Patient to waiting List***\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doctor:");
        System.out.println("Id |Name");
        
        List<DoctorEntity> allDoctors = doctorEntityControllerRemote.retrieveAllDoctors();
        for (DoctorEntity doctor : allDoctors) {
            System.out.println(doctor.getDoctorId()+"  |" + doctor.getFirstName() + " " + doctor.getLastName());
        }
        System.out.println();
        
        Long selectedDoctorId = null;
        boolean checkValidDoctorId = false;
        while (checkValidDoctorId == false) {
            System.out.print("Enter Doctor Id> ");
            selectedDoctorId = scanner.nextLong();
            if (selectedDoctorId > 0 && selectedDoctorId <= allDoctors.size()) {
                checkValidDoctorId = true;
                break;
            } else {
                System.out.println("Invalid Doctor Id entered!");
            }
        }
      
        System.out.print("Enter Date> ");
        String date = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date todayDate = c.getTime();
        Date enteredDate = null;

        try {
            enteredDate = dateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Date entered in wrong format!");
            return;
        }

        if (!enteredDate.after(todayDate)) {
            System.out.println("Invalid!");
            return;
        }


        DoctorEntity selectedDoctor = new DoctorEntity();
        selectedDoctor = doctorEntityControllerRemote.retrieveDoctorByDoctorId(selectedDoctorId);
        
        System.out.println();
        System.out.println("Add your name for the wait list for " + selectedDoctor.getFirstName() + " " + selectedDoctor.getLastName() + " "
                + "on " + date + ":");
        
        List<AppointmentEntity> allDoctorAppointments = appointmentControllerRemote.retrieveAppointmentsByDateAndDoctor(date, selectedDoctor);
        
        List<String> allTimings = new ArrayList<String>();
        allTimings.add("9:00");
        allTimings.add("9:30");
        allTimings.add("10:00");
        allTimings.add("10:30");
        allTimings.add("11:00");
        allTimings.add("11:30");
        allTimings.add("12:00");
        allTimings.add("12:30");
        allTimings.add("13:00");
        allTimings.add("13:30");
        allTimings.add("14:00");
        allTimings.add("14:30");
        allTimings.add("15:00");
        allTimings.add("15:30");
        allTimings.add("16:00");
        allTimings.add("16:30");
        
        for(String thisTiming : allTimings)
        {
            boolean free = true;
            for (int i=0; i<allDoctorAppointments.size(); i++) {
                if (allDoctorAppointments.get(i).getTime().equals(thisTiming)) {
                    free = false;
                    break;
                }
            }
            if (free == true) {
                System.out.print(thisTiming + " ");
            }
        }
        
        System.out.println("\n");
}}
        // to update waiting list
        patientEntityControllerRemote.addAppointmentToPatient(retrievedPatient.getPatientId(), newAppointment.getAppointmentId());
        
        System.out.println("Appointment: " + selectedDoctor.getFirstName() + " " + selectedDoctor.getLastName() + " and "
                + retrievedPatient.getFirstName() + " " + retrievedPatient.getLastName() + " at " + newAppointment.getTime() 
                + " on " + date + " has been added.");
               
    }

    private void deleteWaitingList() throws PatientNotFoundException, EntityManagerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cancel Waiting List ***\n");
        System.out.print("Enter Patient Identity Number> ");
        PatientEntity patient = new PatientEntity();
        patient = patientEntityControllerRemote.retrievePatientByIdentityNumber(scanner.next());
        System.out.println();
        System.out.println("Appointments: ");
        System.out.println("Id |Date        |Time |Doctor");
        
        // print the list of patient's appointments
        List<AppointmentEntity> patientAppointments = appointmentControllerRemote.retrieveAppointmentsByPatient(patient);
        if (patientAppointments.isEmpty()) {
            return;
        }
        for (AppointmentEntity appointment : patientAppointments) 
        {
            System.out.println(appointment.getAppointmentId() + " |" + appointment.getDate() + " |"
                                + appointment.getTime() + " |" + appointment.getDoctor().getFirstName() + " "
                                + appointment.getDoctor().getLastName());
        }
        System.out.println();
        
        System.out.print("Enter Appointment Id> ");
        AppointmentEntity appointment = new AppointmentEntity();
        try {
            appointment = appointmentControllerRemote.retrieveAppointmentByAppointmentId(scanner.nextLong());
        }
        catch(Exception e) {
            System.out.println("Invalid appointment Id entered!");
            return;
        }
        
        if (!patientAppointments.contains(appointment)) {
            System.out.println("Invalid appointment Id entered!");
            return;
        }
        System.out.println("Appointment: " + patient.getFirstName()+ " " + patient.getLastName() + " and "
                            + appointment.getDoctor().getFirstName() + " " + appointment.getDoctor().getLastName()
                            + " at " + appointment.getTime() + " on " + appointment.getDate() + " has been cancelled.");
        
