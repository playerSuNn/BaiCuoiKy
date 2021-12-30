package project_cuoiky;

import java.io.Serializable;

public class SuperMarketKhohang implements Serializable{
    private int id;//mã hàng hóa
    private String name;//tên hàng hóa
    private double price;//giá cả
    private int inventory;//số lượng tồn kho
 
    public SuperMarketKhohang(){

    }

    public SuperMarketKhohang(int id,String name,double price,int inventory)
    {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    
}
