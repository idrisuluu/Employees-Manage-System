import java.util.Scanner;

public class Employees {    //fields.
    private String name;
    private String surname;
    private String emp_id;
    private String department;
    private String title_exact;
    private double salary;
    private int annual_leave;
    private String attached_person;

    public Employees() {    // Empty Constructor.
        this("No information", "No information", "No information", "No information", "No information",0.00, 0, "No information");
    }
    public Employees(   //Constructor.
            String name, String surname, String emp_id, String department, String title_exact, double salary, int annual_leave, String attached_person) {
        this.name = name;
        this.surname = surname;
        this.emp_id = emp_id;
        this.department = department;
        this.title_exact = title_exact;
        this.salary = salary;
        this.annual_leave = annual_leave;
        this.attached_person = attached_person;

    }

    public void showInfo() {    //print information method.
        System.out.println("Name: " + this.name +
                "\nSurname: " + this.surname +
                "\nCompany identity : " + this.emp_id +
                "\nDepartment : " + this.department +
                "\nTitle: " + this.title_exact +
                "\nSalary: " + this.salary +
                "\nAttached position: " + this.attached_person);
    }

    public void changeDepartment() {    // method that changes employee departments.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the identity number of the employee whose department you want to change.");
        String holdId = scanner.nextLine();

        if (holdId.equals(emp_id)) {
            System.out.println(emp_id + "'s Department: " + department);
            System.out.println("Please enter the new department of the employee.");
            String newDepartment = scanner.nextLine();
            department = newDepartment;
            System.out.println(emp_id + "'s Department has been changed.\n" +
                    emp_id + "'s new department is " + newDepartment );
        }
        else {
            System.out.println("invalid identity number.Please try again.");
        }
    }

    public void changeTitle() { //method that changes employee title.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the identity number of the employee whose title you want to change.");
        String holdId = scanner.nextLine();

        if (holdId.equals(emp_id)) {
            System.out.println(emp_id + "'s Title: " + title_exact);
            System.out.println("Please enter the new title of the employee.");
            String newTitle = scanner.nextLine();
            title_exact = newTitle;
            System.out.println(emp_id + "'s Title has been changed.\n" +
                    emp_id + "'s new title is " + newTitle);
        }
        else {
            System.out.println("invalid identity number.Please try again.");
        }
    }

    public void changeSalary() {    //method that changes employee salary.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the identity number of the employee whose salary you want to change.");
        String holdId = scanner.nextLine();

        if (holdId.equals(emp_id)) {
            System.out.println(emp_id + "'s Salary: " + salary);
            System.out.println("please enter the rate of increase in salary");
            double rateSalaryIncrease = scanner.nextDouble();
            salary += (salary * rateSalaryIncrease) / 100;
            System.out.println(emp_id + "'s Salary has been changed.\n" +
                    emp_id + "'s new salary is " + salary);
        }
        else {
            System.out.println("invalid identity number.Please try again.");
        }

    }

    //getter and setters for fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle_exact() {
        return title_exact;
    }

    public void setTitle_exact(String title_exact) {
        this.title_exact = title_exact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAnnual_leave() {
        return annual_leave;
    }

    public void setAnnual_leave(int annual_leave) {
        this.annual_leave = annual_leave;
    }

    public String getAttached_person() {
        return attached_person;
    }

    public void setAttached_person(String attached_person) {
        this.attached_person = attached_person;
    }
}
