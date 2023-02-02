public class Seller extends User {
   private Product[] productsListed;

    public Boolean verifyUser() {
        return true;
    }

    public void setProductListed(Product[] product)
    {
        this.productsListed=product;
    }

    public Product[] getProductListed(){
        return productsListed;
        
    }
    
}
