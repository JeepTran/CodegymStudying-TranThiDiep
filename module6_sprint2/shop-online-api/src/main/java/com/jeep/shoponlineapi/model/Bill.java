package com.jeep.shoponlineapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;
    private Double shipFee;
    private String total;
    private Boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Coupon coupon;

    @OneToMany(mappedBy = "bill")
    private List<Cart> cartList;

    public Bill() {
    }

    public Bill(String code, Double shipFee, String total, Boolean isDeleted, Coupon coupon, List<Cart> cartList) {
        this.code = code;
        this.shipFee = shipFee;
        this.total = total;
        this.isDeleted = isDeleted;
        this.coupon = coupon;
        this.cartList = cartList;
    }

    public Bill(Integer id, String code, Double shipFee, String total, Boolean isDeleted, Coupon coupon, List<Cart> cartList) {
        this.id = id;
        this.code = code;
        this.shipFee = shipFee;
        this.total = total;
        this.isDeleted = isDeleted;
        this.coupon = coupon;
        this.cartList = cartList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getShipFee() {
        return shipFee;
    }

    public void setShipFee(Double shipFee) {
        this.shipFee = shipFee;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
}
