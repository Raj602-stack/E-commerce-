public class Cart {
    private String cartId;
    private Product[] listOfProducts;
    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    

    public void setlistOfProducts(Product[] product)
    {
        this.listOfProducts=product;
    }

    public Product[] getProductListed(){
        return listOfProducts;
        
    }
    public Boolean checkOut(){
        return true;

    }
}
