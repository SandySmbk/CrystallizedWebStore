package com.fh.webshopdemo.demo.DTO;

public class PositionDTO {

    private Long id;
    private Long productID;
    private Integer quantity;

    //Getter und Setter generiert
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductID() {
        return productID;
    }
    public void setProductID(Long productID) {
        this.productID = productID;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
