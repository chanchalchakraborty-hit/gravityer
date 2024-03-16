package com.assignment.service;

import com.assignment.dto.DiscountResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DiwaliDiscountService {
    public DiscountResponse applyBOGODiscount1(List<Integer> productPriceList) {
        DiscountResponse response = new DiscountResponse();
        Collections.sort(productPriceList);
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();
        int i = productPriceList.size()-1;
        while (i >= 0) {
            payableItems.add(productPriceList.get(i));
            i--;
            if (i >= 0) {
                discountedItems.add(productPriceList.get(i));
                i--;
            }
        }
        response.setDiscountedItems(discountedItems);
        response.setPayableItems(payableItems);
        return response;
    }

    public DiscountResponse applyBOGODiscount2(List<Integer> productPriceList) {
        DiscountResponse response = new DiscountResponse();
        Collections.sort(productPriceList);
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();
        int i = productPriceList.size()-1;
        int equalPriceNo=0;
        while (i >= 0) {
            if(equalPriceNo==0){
                payableItems.add(productPriceList.get(i));
                i--;
            }else if(productPriceList.get(i+1).equals(productPriceList.get(i))){
                payableItems.add(productPriceList.get(i));
                equalPriceNo++;
                i--;
            }else{
                for(int m=0; m<=equalPriceNo; m++){
                    discountedItems.add(productPriceList.get(i));
                    i--;
                }
                equalPriceNo=0;
                continue;
            }
            if (i >= 0) {
                if(productPriceList.get(i+1).equals(productPriceList.get(i))){
                    payableItems.add(productPriceList.get(i));
                    equalPriceNo++;
                }else{
                    discountedItems.add(productPriceList.get(i));
                }
                i--;
            }
        }
        response.setDiscountedItems(discountedItems);
        response.setPayableItems(payableItems);
        return response;
    }
}
