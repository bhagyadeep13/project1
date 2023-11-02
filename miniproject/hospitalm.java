package project1.miniproject;
import java.util.Scanner;

class HospitalManagementSystem {
    public static void main(String[] args)
     {
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