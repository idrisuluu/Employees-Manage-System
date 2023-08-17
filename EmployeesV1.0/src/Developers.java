public class Developers extends Employees{
    private String programming_languages; //extra fields.
    private int extra_workingHours;

    public Developers(  //Constructors.
            String name, String surname, String emp_id, String department,
            String title_exact, double salary, int annual_leave, String attached_person,
            String programming_languages, int extra_workingHours) {
        super(name, surname, emp_id, department, title_exact, salary, annual_leave, attached_person); //call superclass's constructors.
        this.programming_languages = programming_languages; // for additional fields that I have created.
        this.extra_workingHours = extra_workingHours;

    }

    @Override   //Override from showInfo, Employees class.
    public void showInfo() {
        super.showInfo();
        System.out.println("Programming languages: " + this.programming_languages);
        System.out.println("Extra working hours: " + this.extra_workingHours);

    }

    //getter and setters.
    public String getProgramming_languages() {
        return programming_languages;
    }

    public void setProgramming_languages(String programming_languages) {
        this.programming_languages = programming_languages;
    }

    public int getExtra_workingHours() {
        return extra_workingHours;
    }

    public void setExtra_workingHours(int extra_workingHours) {
        this.extra_workingHours = extra_workingHours;
    }
}
