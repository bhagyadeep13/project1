package project1.localrepo;

import java.util.Scanner;


abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract String getAdditionalInfo();
}

class Patient extends Person {
    public Patient(String name, int id) {
        super(name, id);
    }

    public String getAdditionalInfo() {
        return "";
    }
}

class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public String getAdditionalInfo() {
        return specialization;
    }
}
class Nurse extends Person {
    private String department;

    public Nurse(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getAdditionalInfo() {
        return department;
    }
}


class Hospital {
    private Nurse[] nurses;
    private Patient[] patients;
    private Doctor[] doctors;
    private int patientCount;
    private int doctorCount;
     private int nurseCount;

    public Hospital() {
        patients = new Patient[100];
        doctors = new Doctor[50];
        nurses = new Nurse[50];
        patientCount = 0;
        doctorCount = 0;
         nurseCount=0;
    }

    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Patient storage is full.");
        }
    }
    public void addNurse(Nurse Nurse) {
        if (nurseCount < nurses.length) {
            nurses[nurseCount] = Nurse;
            nurseCount++;
        } else {
            System.out.println("Nurse storage is full.");
        }
    }


    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        } else {
            System.out.println("Doctor storage is full.");
        }
    }

    public void listPatients() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println("Patient" + (i + 1) + ": " + patients[i].getName() + ", ID: " + patients[i].getId());
        }
    }

    public void listDoctors() {
        for (int i = 0; i < doctorCount; i++) {
            System.out.println("Doctor" + (i + 1) + ": " + doctors[i].getName() + ", ID: " + doctors[i].getId() + ", Specialization: " + doctors[i].getAdditionalInfo());
        }
    }

    public void listNurses() {
        for (int i = 0; i < nurseCount; i++) {
            System.out.println("Nurse" + (i + 1) + ": " + nurses[i].getName() + ", ID: " + nurses[i].getId() + ", Department: " + nurses[i].getAdditionalInfo());
        }
    }
}

class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Nurse");
            System.out.println("4. List Patients");
            System.out.println("5. List Doctors");
            System.out.println("6. List Nurses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        
                        System.out.print("Enter patient name: ");
                        String name = scanner.next();
                        System.out.print("Enter patient ID: ");
                        int id = scanner.nextInt();
                        Patient newPatient = new Patient(name, id);
                        hospital.addPatient(newPatient);
                        break;

                    case 2:
                        
                        System.out.print("Enter doctor name: ");
                        String doctorName = scanner.next();
                        System.out.print("Enter doctor ID: ");
                        int doctorId = scanner.nextInt();
                        System.out.print("Enter doctor specialization: ");
                        String specialization = scanner.next();
                        Doctor newDoctor = new Doctor(doctorName, doctorId, specialization);
                        hospital.addDoctor(newDoctor);
                        break;

                    case 3:
                        
                        System.out.print("Enter nurse name: ");
                        String nurseName = scanner.next();
                        System.out.print("Enter nurse ID: ");
                        int nurseId = scanner.nextInt();
                        System.out.print("Enter nurse department: ");
                        String department = scanner.next();
                        Nurse newNurse = new Nurse(nurseName, nurseId, department);
                        hospital.addNurse(newNurse);
                        break;

                    case 4:
                       
                        hospital.listPatients();
                        break;

                    case 5:
                       
                        hospital.listDoctors();
                        break;

                    case 6:
                        
                        hospital.listNurses();
                        break;

                    case 7:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.next(); 
            }
        }
    }
}


