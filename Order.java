public class Order {
    private Customer user;
    private String orderId;

    public void setUserId(Customer user){
        this.user=user;
    }
    public void setOrderId(String orderid){
        this.orderId=orderid;
    }
    public Customer getUser(){
        return user;
    }
    public String getOrderId(){
        return orderId;
    }
    


}
