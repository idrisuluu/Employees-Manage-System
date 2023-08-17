public class Managers extends Developers{
    public int numberOf_responsible;


    public Managers(String name, String surname, String emp_id, String department, String title_exact, double salary, int annual_leave, String attached_person, String programming_languages, int extra_workingHours, int numberOf_responsible) {
        super(name, surname, emp_id, department, title_exact, salary, annual_leave, attached_person, programming_languages, extra_workingHours);
        this.numberOf_responsible = numberOf_responsible;
    }

    @Override   //override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of people responsible: " + numberOf_responsible);
    }

    public int getNumberOf_responsible() {
        return numberOf_responsible;
    }

    public void setNumberOf_responsible(int numberOf_responsible) {
        this.numberOf_responsible = numberOf_responsible;
    }
}
