package project1.miniproject;

class Hospital 
{
    private Nurse[] nurses;
    private Patient[] patients;
    private Doctor[] doctors;
    private int patientCount;
    private int doctorCount;
     private int nurseCount;

    public Hospital()
     {
        patients = new Patient[100];
        doctors = new Doctor[50];
        nurses = new Nurse[50];
        patientCount = 0;
        doctorCount = 0;
         nurseCount=0;
    }

    public void addPatient(Patient patient) 
    {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Patient storage is full.");
        }
    }
    public void addNurse(Nurse Nurse)
     {
        if (nurseCount < nurses.length) {
            nurses[nurseCount] = Nurse;
            nurseCount++;
        } else {
            System.out.println("Nurse storage is full.");
        }
    }


    public void addDoctor(Doctor doctor) 
    {
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