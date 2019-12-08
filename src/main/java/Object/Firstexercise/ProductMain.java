package Object.Firstexercise;

/*1. Grocery Shopping
        Create class Product, it should contain at least two fields – name and price.
        Create an empty array of Products – it's size should be at least 5.
        Fill it within while loop. Simulate the process of doing shopping:
        ask for a product,
        add it to the cart (array),
        change index,
        if index will be greater than 5 – finish shopping,
        *pay for the products.*/


import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Product[] products = getProductArray();

        int totalSum = getSum(products);
        System.out.println("produktu suma yra " + totalSum);
    }

    private static Product[] getProductArray(){
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        Product[] products = new Product[5];
        int index = 0;
        while (index < 5) {
            System.out.println("enter product");
            String productName = inputText.nextLine();

            System.out.println("enter price");
            int productPrice = inputNum.nextInt();

            new Product(productName, productPrice);

            products[index] = new Product(productName, productPrice);
            index++;
        }
        return products;
    }

    private static int getSum(Product[] products) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + products[i].getPrice();
        } return sum;
    }
}
