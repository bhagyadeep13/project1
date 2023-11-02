package project1.miniproject;

class Doctor extends Person
 {
    private String specialization;

    public Doctor(String name, int id, String specialization) 
    {
        super(name, id);
        this.specialization = specialization;
    }

    public String getAdditionalInfo()
     {
        return specialization;
    }
}
