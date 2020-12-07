/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class OrderRequest extends WorkRequest {
    private Restaurant restaurant;
    private UserAccount manager;
//    private boolean delivered;
    private int state; // 0 means pending decided, 1 means accepted, -1 means denied, 2 means delivered
    private Menu menu;
    private int quantity;
    private double price;

    public OrderRequest(UserAccount customer, Restaurant restaurant, Menu menu, int quantity) {
        super(customer);
        this.restaurant = restaurant;
        this.menu = menu;
        this.quantity = quantity;
        this.price = menu.getUnitPrice() * quantity;
        this.state = 0;
//        this.delivered = false;
        super.setStatus("Pending Accepted");
    }
    
    public boolean isPendingReview() {
        if (state == 0) {
            return true;
        }
        return false;
    }
    
    public boolean isAccepted() {
        if (state == 1) {
            return true;
        }
        return false;
    }
    
    public boolean isDenied() {
        if (state == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isDelivered() {
        if (state == 2) {
            return true;
        }
        return false;
    }
    
    public void deliverOrder() {
        setState(2);
        super.setStatus("Delivered");
        super.setResolveDate(new Date());
    }
    
    public void acceptOrder() {
        setState(1);
        super.setStatus("Pending Assigning Delivery Man");
    }
    
    public void denyOrder() {
        setState(-1);
        super.setStatus("Denied");
    }
    
    public void chooseDeliveryMan(UserAccount deliveryMan) {
        super.setReceiver(deliveryMan);
//        setDelivered(true);
        super.setStatus("Pending Delivering");
//        super.setResolveDate(new Date());
    }

    @Override
    public String toString() {
        return super.getStatus();
    }
    
    public void addComment(String comment) {
        super.setMessage(comment);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
    }
    
    private int getState() {
        return state;
    }

    private void setState(int state) {
        this.state = state;
    }
    
//    public boolean isDelivered() {
//        return delivered;
//    }

//    public void setDelivered(boolean delivered) {
//        this.delivered = delivered;
//    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
}
