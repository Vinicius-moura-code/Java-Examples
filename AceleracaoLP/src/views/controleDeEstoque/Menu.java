package views.controleDeEstoque;

import models.controleDeEstoque.Product;
import utils.CurrencyConverter;

import java.util.Scanner;

public class Menu {
    final Scanner tec = new Scanner(System.in);

    public Menu() {
        String name;
        double price;
        int quantity;

        System.out.println("Enter Product data :");
        System.out.print("Name: ");
        name = tec.next();
        System.out.print("Price: ");
        price = tec.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = tec.nextInt();
        Product prod = new Product(name, price, quantity);
        System.out.println("Product data: "+prod);
        System.out.println("Enter the number of products to be added in stock: ");
        prod.AddProducts(tec.nextInt());
        System.out.println("Updated data: "+prod);
        System.out.println("Enter the number of products to be removed in stock: ");
        prod.RemoveProducts(tec.nextInt());
        System.out.println("Updated data: "+prod + System.lineSeparator());

        System.out.println("Deseja converter valores para Real ? ");
        System.out.println(" y or n");
        String escolha = tec.next().substring(0,1);
        System.out.println(escolha);

        if ( escolha.equals("y")||escolha.equals("Y")){
            System.out.println("Qual a cotação atual do dollar em reais?");
            prod.ConverterMoeda(CurrencyConverter.converter(tec.nextDouble(), price));
        }
        System.out.println("Updated data: "+prod + System.lineSeparator());

        tec.close();
    }


}
