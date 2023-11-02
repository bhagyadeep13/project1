package project1.miniproject;

class Nurse extends Person
 {
    private String department;

    public Nurse(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getAdditionalInfo() {
        return department;
    }
}