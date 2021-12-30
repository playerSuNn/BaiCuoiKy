package project_cuoiky;

import java.util.Scanner;

public class SuperMarkettestDrive {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        SuperMarketManager manager = new SuperMarketManager();
        int maHangId;
 
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine(); 
            switch (choose) {
            case "1":
                manager.add();
                break;
            case "2":
                maHangId = manager.inputId();
                manager.edit(maHangId);
                break;
            case "3":
                maHangId = manager.inputId();
                manager.delete(maHangId);
                break;
            case "4":
            case "5":
            case "6":
                manager.show();
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    
}
