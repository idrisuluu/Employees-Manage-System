import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu() {     //MainMenu design

        Scanner scanner = new Scanner(System.in);
        Developers developer = new Developers("idris","ulu","DRS15678","Software development-2","developer", 2150,15,"Serkan","Java2, C#2",15);
        Managers manager = new Managers("serkan","tastbn","SRKN15514","Software development-2","Head Manager", 21550,28,"Tunc","PL/SQL",30,159);
        boolean isLoop = true;
        String operationsMenu=  "   1- View Employees\n" +
                                "   2- Change Department\n" +
                                "   3- Change Title\n" +
                                "   4- Salary Management\n" +
                                "   5- Exit";
        String viewSubMenu = "   1- Developers\n" +
                             "   2- Managers";


        while (isLoop) {
            System.out.println("***EMPLOYEES MANAGE SYSTEM***");
            System.out.println(operationsMenu);
            try {
                System.out.println("What kind of operation would you like to do?");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(viewSubMenu);
                        System.out.println("Please make your choice.");
                        int choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                developer.showInfo();
                                break;
                            case 2:
                                manager.showInfo();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println(viewSubMenu);
                        System.out.println("Please make your choice.");
                        int choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                developer.changeDepartment();
                                break;
                            case 2:
                                manager.changeDepartment();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println(viewSubMenu);
                        System.out.println("Please make your choice.");
                        int choice4 = scanner.nextInt();
                        switch (choice4) {
                            case 1:
                                developer.changeTitle();
                                break;
                            case 2:
                                manager.changeTitle();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println(viewSubMenu);
                        System.out.println("Please make your choice.");
                        int choice5 = scanner.nextInt();
                        switch (choice5) {
                            case 1:
                                developer.changeSalary();
                                break;
                            case 2:
                                manager.changeSalary();
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Signing out.y..");
                        isLoop = false;
                }
            }catch (Exception e) {
                System.out.println("Something went wrong." + e.getMessage());
                System.out.println("You are redirected to the menu");
                scanner.nextLine();
            }
        }
    }
}