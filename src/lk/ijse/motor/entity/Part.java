/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.motor.entity;

/**
 *
 * @author Ranga Lankathilaka
 */
public class Part {
//    pid           | int(11)     | NO   | PRI | NULL    |       |
//| pname         | varchar(45) | NO   |     | NULL    |       |
//| buying_price  | varchar(45) | NO   |     | NULL    |       |
//| selling_price | varchar(45) | NO   |     | NULL    |       |
//| qty           | varchar(45) | NO   |     | NULL    |       |
//| supplier
    
    private int pid;
    private String pname;
    private int buying_price;
    private int selling_price;
    private int qty;
    private  String supplier;
   

    public Part() {
    }

    public Part(int pid, String pname, int buying_price, int selling_price, int qty, String supplier) {
        this.pid = pid;
        this.pname = pname;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.qty = qty;
        this.supplier = supplier;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(int buying_price) {
        this.buying_price = buying_price;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Part{" + "pid=" + pid + ", pname=" + pname + ", buying_price=" + buying_price + ", selling_price=" + selling_price + ", qty=" + qty + ", supplier=" + supplier + '}';
    }

   
   
    
    
    
}
