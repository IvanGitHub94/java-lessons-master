package ru.itmo.lessons.lesson6.hw06.Task02;

public class Product {
    private String nameProduct;
    private int belki;
    private int zhiry;
    private int uglevody;
    private int kalorii;

    public Product() {
    }

    public Product(String nameProduct) {
        setNameProduct(nameProduct);
    }

    public Product(int kalorii) {
        setKalorii(kalorii);
    }

    public Product(int belki, int zhiry, int uglevody) {
        setBelki(belki);
        setZhiry(zhiry);
        setUglevody(uglevody);
    }

    // Сеттеры
    public void setNameProduct(String nameProduct) {
        if (nameProduct == null || nameProduct.length() < 2) {
            throw new IllegalArgumentException("Название продукта должно быть не менее 2 символов");
        }
        this.nameProduct = nameProduct;
    }

    public void setBelki(int belki) {
        if (belki < 0) {
            throw new IllegalArgumentException("Продукт не может содержать отрицательное количество белков.");
        }
        this.belki = belki;
    }

    public void setZhiry(int zhiry) {
        if (zhiry < 0) {
            throw new IllegalArgumentException("Продукт не может содержать отрицательное количество жиров.");
        }
        this.zhiry = zhiry;
    }

    public void setUglevody(int uglevody) {
        if (uglevody < 0) {
            throw new IllegalArgumentException("Продукт не может содержать отрицательное количество углеводов.");
        }
        this.uglevody = uglevody;
    }

    public void setKalorii(int kalorii) {
        if (kalorii < 0) {
            throw new IllegalArgumentException("Продукт не может содержать отрицательное количество калорий.");
        }
        this.kalorii = kalorii;
    }

    // Геттеры

    public String getNameProduct() {
        return nameProduct;
    }

    public int getBelki() {
        return belki;
    }

    public int getZhiry() {
        return zhiry;
    }

    public int getUglevody() {
        return uglevody;
    }

    public int getKalorii() {
        return kalorii;
    }
}
