import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

class Store{
    public static void main(String[] args) {
        System.out.println("Welcome to my E-commerce!");
        System.out.println("Which user are you? 1. Customer 2.Seller 3.Admin");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        String typeOfUser;
        if(choice==1){
            typeOfUser="Customer";
            Customer current =new Customer();
            System.out.println("what is  your user-Id?");
            sc.nextLine();
            current.setUserId(sc.nextLine()); 
            System.out.println("what is  your password?");
            sc.nextLine();
            current.setPassword(sc.nextLine());
            if(current.verifyUser()){
            System.out.println("user verified!");

            while(true){

            System.out.println("Do you want to 1. view products 2.view cart 3.contact-us 4.Exit");

            choice= sc.nextInt();
            if(choice==1){
            Catalogue catalogue=new Catalogue();
            Product[] allProducts=catalogue.getListOfAllProducts();
            for(int i=0;i<allProducts.length;i++){
            System.out.println(allProducts[i].getProductId()+" "+allProducts[i].getProductName()+" "+allProducts[i].getCost());
                
            }
            System.out.println("do you want to add any product in the cart? Y/N");
            sc.nextLine();

            String addToCart=sc.nextLine();
            if(addToCart.equals("Y")){
                System.out.println("Input the product id of the product you want to add in the cart");

                String productId=sc.nextLine();

                Product[] cartProducts=new Product[1];

                for(int i=0;i<allProducts.length;i++){
                    if(allProducts[i].getProductId().equals(productId)){
                        cartProducts[0]=allProducts[i];

                    }
                    Cart cart=new Cart();
                    cart.setCartId("1");
                    cart.setlistOfProducts(cartProducts);
                    current.setCart(cart);
                    System.out.println("The product has been successfully added to the cart.");

                }
     
            }
            
           }

           else if(choice==2){
            Product[] cartProducts=current.getcart().getProductListed();
            System.out.println(current.getcart().getCartId());
            for(int i=0;i<cartProducts.length;i++){
                System.out.println(cartProducts[i].getProductId()+" "+cartProducts[i].getProductName()+" "+cartProducts[i].getCost());
                    
                }
                System.out.println("Do you want to checkout? Y/N");
                sc.nextLine();
                String checkout=sc.nextLine();
                if(checkout.equals("Y")){
                    if(current.getcart().checkOut()){
                        System.out.println("Your order has been placed successfully");
                    }
                }
           }

           else if(choice==3){
            System.out.println("To contact  us,please mail us at store@ecommerce.com");
           }
           else if(choice==4){
            break;
           }

           else{
            System.out.println("invalid Request,try again");
           }
        }
           }

        }
        else if(choice==2){
            typeOfUser="Seller";
            System.out.println("hi seller1");
            // seller

            typeOfUser="Seller";
            Seller current =new Seller();
            System.out.println("what is  your user-Id?");
            sc.nextLine();
            current.setUserId(sc.nextLine()); 
            System.out.println("what is  your password?");
            sc.nextLine();
            current.setPassword(sc.nextLine());
            if(current.verifyUser()){
            System.out.println("Seller verified!");

            while(true){

                System.out.println("Do you want to 1. Add a product 2.View the product 3.contact-us 4.Exit");

                int selection=sc.nextInt();
                if(selection==1){
                    Product p=new Product();
                    System.out.println("what is the name of the product?");
                    System.out.println("press Enter");
                    sc.nextLine();
                    p.setProductName(sc.nextLine());
                    
                    

                    System.out.println("Enter the ID of the product");
                    
                    p.setProductId(sc.nextLine());
                    System.out.println("press Enter");
                    sc.nextLine();
                    
                    System.out.println("The cost of the product?");
                    
                    p.setCost(sc.nextLine());
                    System.out.println("press Enter");
                    sc.nextLine();
                   

                    Product[] newproduct=new Product[1];
                    newproduct[0]=p;
                    current.setProductListed(newproduct);

                    System.out.println("The item successfully added!");

                    

                }
                else if(selection==2){
                    Product[] p=new Product[1];
                    p=current.getProductListed();
                  
                    System.out.println("The id of the product you added is "+ p[0].getProductId());
                    System.out.println("The name of the product you have added is  "+ p[0].getProductName());
                    System.out.println("The cost of the product is " +p[0].getCost());

                }
                else if(selection==3){
                    System.out.println("contact us at store@ecommerce.com");
                }
                else{
                    break;
                }





            }

            






            // seller
        }
        else if(choice==3){
            typeOfUser="Admin";
            System.out.println("The admin is currently not available! Try again later");
        }
        else{
            System.out.println("invalid Input!.Try again");
        }

    }
}
}