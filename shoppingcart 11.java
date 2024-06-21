public interface PaymentStrategy 
{
    public void pay(int amount);
}


// FILE NAME: ShoppingCart.java

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
    List<Item> items;
    
    public ShoppingCart()
    {
        this.items=new ArrayList<Item>();
    }
    
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }

    public int calculateTotal()
    {
        int sum = 0;
        for(Item item : items)
        {
            sum += item.getPrice();
        }
    
        return sum;
    }
    
    public void pay(PaymentStrategy paymentMethod)
    {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}


// FILE NAME: Item.java

public class Item 
{
    private String upcCode;
    private int price;
    
    public Item(String upc, int cost)
    {   
        this.upcCode=upc;
        this.price=cost;
    }
    
    public String getUpcCode() 
    {
        return upcCode;
    }
    
    public int getPrice() 
    {
        return price;
    }
}


// FILE NAME: PaypalStrategy.java

public class PaypalStrategy implements PaymentStrategy 
{
    private String emailId;
    private String password;
    
    public PaypalStrategy(String email, String pwd)
    {
        this.emailId=email;
        this.password=pwd;
    }
    
    @Override
    public void pay(int amount) 
    {
        System.out.println(amount + " paid using Paypal.");
    }
}



// FILE NAME: BitCoinStrategy.java

public class BitCoinStrategy implements PaymentStrategy 
{
    private String recipient_bitcoin_address;
    
    public BitCoinStrategy(String recipient_bitcoin_address)
    {
        this.recipient_bitcoin_address=recipient_bitcoin_address;
    }
    
    @Override
    public void pay(int amount) 
    {
        System.out.println(amount + " paid using Bitcoin.");
    }
}


// FILE NAME: CreditCardStrategy.java

public class CreditCardStrategy implements PaymentStrategy 
{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate)
    {
    this.name=nm;
    this.cardNumber=ccNum;
    this.cvv=cvv;
    this.dateOfExpiry=expiryDate;
    }
    
    @Override
    public void pay(int amount) 
    {
        System.out.println(amount +" paid with credit/debit card.");
    }
}



// FILE NAME: Assignment_11.java

public class Main1 {    
    public static void main(String[] args) 
    {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Plate",60);
        Item item2 = new Item("Glasses",120);
        Item item3 = new Item("Rice 5 kg",250);
        Item item4 = new Item("Oil 15L Pack",1400);
        Item item5 = new Item("Shoes",250);
        Item item6 = new Item("Men's Shirt",400);
        Item item7 = new Item("Tea Powder",80);
        Item item8 = new Item("Coffee Powder",100);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);

        cart.pay(new PaypalStrategy("abc@gmail.com", "PaSsWoRd"));
        cart.pay(new CreditCardStrategy("vcg", "12365896574", "125", "11/24"));
        cart.pay(new BitCoinStrategy("and@bitcoin.sbi"));
    }
}