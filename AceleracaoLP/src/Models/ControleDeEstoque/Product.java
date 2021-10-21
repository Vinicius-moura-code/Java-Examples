package Models.ControleDeEstoque;

import java.text.DecimalFormat;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public Product(String name, double price, int quantity){
        this.Name = name;
        this.Price = price;
        this.Quantity = quantity;
    }

    private String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    private double getPrice() {
        return Price;
    }

    private void setPrice(double price) {
        Price = price;
    }

    private int getQuantity() {
        return Quantity;
    }

    private void setQuantity(int quantity) {
        Quantity = quantity;
    }


    public double TotalValueInStock(){
        return getPrice() * getQuantity();
    }
    public void AddProducts(int quantity){
        this.setQuantity(getQuantity() + quantity);
    }
    public void RemoveProducts(int quantity){
        if(getQuantity()>0){
            this.setQuantity(getQuantity() - quantity);
        }else {
            System.out.println("The values entered cannot be less than the quantity in stock");
        }
    }

    public void ConverterMoeda(double valorConvertido){
        setPrice(valorConvertido);
    }


    public static String format(double x ){
        return String.format("%.2f", x);
    }
    @Override
    public String toString(){
        DecimalFormat formato = new DecimalFormat("#.##");
        return Name+", $ "+Price+", "+Quantity+" units, Total: $ "+ format(TotalValueInStock());
    }

}
