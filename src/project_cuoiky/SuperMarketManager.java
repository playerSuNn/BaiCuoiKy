package project_cuoiky;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SuperMarketManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<SuperMarketKhohang> khoHang;
    private SuperMarketListhanghoa hangHoa;
     
    
    public SuperMarketManager()
    {
        hangHoa = new SuperMarketListhanghoa();
        khoHang = hangHoa.read();
    }
 
    public void add() {
        int id = (khoHang.size() > 0) ? (khoHang.size() + 1) : 1;
        System.out.println("MA HANG id = " + id);
        String name = inputName();
        String price = scanner.nextLine();
        int inventory = scanner.nextInt();
        SuperMarketKhohang  khohangSMK = new SuperMarketKhohang();
        khoHang.add(khohangSMK);
        hangHoa.write(khoHang);
    }
 
    public void edit(int id) {
        boolean isExisted = false;
        int size = khoHang.size();
        for (int i = 0; i < size; i++) {
            if (khoHang.get(i).getId() == id) {
                isExisted = true;
                khoHang.get(i).setName(inputName());
                //khoHang.get(i).setPrice(inputPrice());
                //khoHang.get(i).setInventory(inputInventory());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            hangHoa.write(khoHang);
        }
    }
 
    public void delete(int id) {
        SuperMarketKhohang khohang = null;
        int size = khoHang.size();
        for (int i = 0; i < size; i++) {
            if (khoHang.get(i).getId() == id) {
                khohang = khoHang.get(i);
                break;
            }
        }
        if (khohang != null) {
            khoHang.remove(khohang);
            hangHoa.write(khoHang);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
 
    public void show() {
        for(SuperMarketKhohang khohang : khoHang)
        {
            System.out.format("%5d | ",khohang.getId());
            System.out.format("%20s | ",khohang.getName());
            System.out.format("%50d | ",khohang.getPrice());
            System.out.format("%20s | ",khohang.getInventory());
        }
    }
 
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
     
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }
 
    private String inputPrice() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }
 
    public List<SuperMarketKhohang> getkhoHang() {
        return khoHang;
    }
 
    public void setStudentList(List<SuperMarketKhohang> khoHang) {
        this.khoHang = khoHang;
    }
    
}
