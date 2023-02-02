public class Customer extends User {
   private Cart cart;
    @Override
    public Boolean verifyUser() {
       
        return true;
    }

    public Cart getcart(){
        return cart;
    }

    public void setCart(Cart cart){
        this.cart=cart;
    }

    
}
