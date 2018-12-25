package Beans;

/**
 *
 * @author Pedro
 */
public class OrderBeans {
    private int orderCode;
    private int orderClient;
    private int orderStaff;
    private int orderDeliverer;
    private String orderDate;
    private String orderTime;
    private Double orderTotal;
    private String orderStatus;

    public OrderBeans() {
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public int getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(int orderClient) {
        this.orderClient = orderClient;
    }

    public int getOrderStaff() {
        return orderStaff;
    }

    public void setOrderStaff(int orderStaff) {
        this.orderStaff = orderStaff;
    }

    public int getOrderDeliverer() {
        return orderDeliverer;
    }

    public void setOrderDeliverer(int orderDeliverer) {
        this.orderDeliverer = orderDeliverer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    
    
}
