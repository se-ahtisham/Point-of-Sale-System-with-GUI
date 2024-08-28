/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author HP
 */
public class productclass {

    private int productId;
    private String ProductName;
    private String ProductCatagory;
    private int productStock;
    private double productRetailPrice;
    private double wholeSalePrice;

    public productclass() {
        productId=0;
        ProductName="";
        ProductCatagory="";
        productStock=0;
        productRetailPrice=0.0;
        wholeSalePrice=0.0;    
    }

    public productclass(int productId, String ProductName, String ProductCatagory, int productStock, double productRetailPrice, double wholeSalePrice) {
        this.productId = productId;
        this.ProductName = ProductName;
        this.ProductCatagory = ProductCatagory;
        this.productStock = productStock;
        this.productRetailPrice = productRetailPrice;
        this.wholeSalePrice = wholeSalePrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductCatagory() {
        return ProductCatagory;
    }

    public void setProductCatagory(String ProductCatagory) {
        this.ProductCatagory = ProductCatagory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductRetailPrice() {
        return productRetailPrice;
    }

    public void setProductRetailPrice(double productRetailPrice) {
        this.productRetailPrice = productRetailPrice;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public void setWholeSalePrice(double wholeSalePrice) {
        this.wholeSalePrice = wholeSalePrice;
    }

}
