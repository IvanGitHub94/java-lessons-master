package ru.itmo.lessons.lesson6.hw06.Task02;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product(61, 73, 42);
        product1.setNameProduct("Гамбургер");
        product1.setKalorii(335);

        Product product2 = new Product(30, 4, 19);
        product2.setNameProduct("Салат");
        product2.setKalorii(175);

        Product product3 = new Product(52, 92, 112);
        product3.setNameProduct("Пицца пепперони");
        product3.setKalorii(401);

        Product product4 = new Product(11, 9, 39);
        product4.setNameProduct("Пряник");
        product4.setKalorii(92);

        // Массив
        Product[] arr1 = new Product[2];

        MyProducts myProducts1 = new MyProducts(50, 60, 40);
        myProducts1.setMaxKalorii(180);
        myProducts1.setMyArr(arr1);

        myProducts1.addProd(product2, product3, product4, product1);


        System.out.println("----------");
        for (Product pro : arr1) {
            if (pro != null) {
                System.out.println(pro.getNameProduct());
            }
        }
    }

}
