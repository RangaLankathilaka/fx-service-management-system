/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.motor.entity;

import java.util.Date;

/**
 *
 * @author Ranga Lankathilaka
 */
public class CustomerDetail {
    
    
    private Date date;
    private CustomerDetail_PK customerDetail_PK;

    public CustomerDetail() {
    }

    public CustomerDetail(Date date, CustomerDetail_PK customerDetail_PK) {
        this.date = date;
        this.customerDetail_PK = customerDetail_PK;
    }
    
    public CustomerDetail(Date date,int cid,int pid) {
        this.date = date;
        this.customerDetail_PK =new CustomerDetail_PK(cid, pid);
    }
    
    
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerDetail_PK getCustomerDetail_PK() {
        return customerDetail_PK;
    }

    public void setCustomerDetail_PK(CustomerDetail_PK customerDetail_PK) {
        this.customerDetail_PK = customerDetail_PK;
    }
    
            
            
    
}
