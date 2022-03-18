package ru.itmo.lessons.lesson6.hw06.Task02;

import ru.itmo.lessons.lesson6.hw06.Alpinist;

public class MyProducts {
    private int maxKalorii;
    private int maxBelki;
    private int maxZhiry;
    private int maxUglevody;
    private Product[] myArr;

    // Конструкторы
    public MyProducts(int maxKalorii) {
        setMaxKalorii(maxKalorii);
    }

    public MyProducts(int maxBelki, int maxZhiry, int maxUglevody) {
        setMaxBelki(maxBelki);
        setMaxZhiry(maxZhiry);
        setMaxUglevody(maxUglevody);
    }

    // Сеттеры
    public void setMaxKalorii(int maxKalorii) {
        if (maxKalorii < 1) {
            throw new IllegalArgumentException("Значение maxKalorii должно быть минимум 1");
        }
        this.maxKalorii = maxKalorii;
    }

    public void setMaxBelki(int maxBelki) {
        if (maxBelki < 1) {
            throw new IllegalArgumentException("Значение maxBelki должно быть минимум 1");
        }
        this.maxBelki = maxBelki;
    }

    public void setMaxZhiry(int maxZhiry) {
        if (maxZhiry < 1) {
            throw new IllegalArgumentException("Значение maxZhiry должно быть минимум 1");
        }
        this.maxZhiry = maxZhiry;
    }

    public void setMaxUglevody(int maxUglevody) {
        if (maxUglevody < 1) {
            throw new IllegalArgumentException("Значение maxUglevody должно быть минимум 1");
        }
        this.maxUglevody = maxUglevody;
    }

    public void setMyArr(Product[] myArr) {
        if (myArr.length == 0) {
            throw new IllegalArgumentException("Массив должен иметь минимум 1 элемент");
        }
        this.myArr = myArr;
    }

    // Геттеры
    public int getMaxKalorii() {
        return maxKalorii;
    }

    public int getMaxBelki() {
        return maxBelki;
    }

    public int getMaxZhiry() {
        return maxZhiry;
    }

    public int getMaxUglevody() {
        return maxUglevody;
    }

    public Product[] getMyArr() {
        return myArr;
    }

    ////////////////////////////////////////////////
    public void addProd(Product product) {

            for (int i = 0; i < myArr.length; i++) {
                if (myArr[i] == null) {
                    if (product.getKalorii() > maxKalorii) {
                        System.out.println("Норма калорий в продукте " + product.getNameProduct() + " превышена.");
                    }
                    else if (product.getBelki() > maxBelki) {
                        System.out.println("Норма белков в продукте " + product.getNameProduct() + " превышена.");
                    }
                    else if (product.getZhiry() > maxZhiry) {
                        System.out.println("Норма жиров в продукте " + product.getNameProduct() + " превышена.");
                    }
                    else if (product.getUglevody() > maxUglevody) {
                        System.out.println("Норма углеводов в продукте " + product.getNameProduct() + " превышена.");
                    }
                    else {
                        myArr[i] = product;
                    }
                    return;
                }
            }
            System.out.println("Список продуктов полон.");
            System.out.println("Продукту " + product.getNameProduct() + " не хватило места в списке.");
    }

    public void addProd(Product... products){
        for (Product p : products) {
                addProd(p);
        }
    }
}
