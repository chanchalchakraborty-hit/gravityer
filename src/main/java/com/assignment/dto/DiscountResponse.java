package com.assignment.dto;

import java.util.List;

public class DiscountResponse {
    private List<Integer> discountedItems;
    private List<Integer> payableItems;

    public List<Integer> getDiscountedItems() {
        return discountedItems;
    }

    public void setDiscountedItems(List<Integer> discountedItems) {
        this.discountedItems = discountedItems;
    }

    public List<Integer> getPayableItems() {
        return payableItems;
    }

    public void setPayableItems(List<Integer> payableItems) {
        this.payableItems = payableItems;
    }
}
