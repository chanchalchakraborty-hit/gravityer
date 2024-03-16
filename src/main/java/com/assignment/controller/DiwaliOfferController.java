package com.assignment.controller;

import com.assignment.dto.DiscountResponse;
import com.assignment.service.DiwaliDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/offers")
public class DiwaliOfferController {

    @Autowired
    private DiwaliDiscountService diwaliDiscountService;

    @GetMapping(value = {"/rule1"})
    public DiscountResponse getOfferForRule1(@RequestBody List<Integer> productPriceList)  {
        return diwaliDiscountService.applyBOGODiscount1(productPriceList);
    }

    @GetMapping(value = {"/rule2"})
    public DiscountResponse getOfferForRule2(@RequestBody List<Integer> productPriceList)  {
        return diwaliDiscountService.applyBOGODiscount2(productPriceList);
    }

    @GetMapping(value = {"/rule3"})
    public DiscountResponse getOfferForRule3(@RequestBody List<Integer> productPriceList)  {
        return diwaliDiscountService.applyBOGODiscount2(productPriceList);
    }

    //To test the result by providing hard coded
    //Due to time shortage skipp writing test cases
    //Open below codes if You want to test the codes providing hardcoded values
    /*@GetMapping(value = {"/rule1"})
    public DiscountResponse getOfferForRule1(@RequestBody List<Integer> productPriceList)  {
        List<Integer> productPriceList=Arrays.asList(10,20,30,40,50,50,60);
        return diwaliDiscountService.applyBOGODiscount1(productPriceList);
    }

    @GetMapping(value = {"/rule2"})
    public DiscountResponse getOfferForRule2(@RequestBody List<Integer> productPriceList)  {
        List<Integer> productPriceList=Arrays.asList(10,20,30,40,50,50,50,60);
        return diwaliDiscountService.applyBOGODiscount2(productPriceList);
    }

    @GetMapping(value = {"/rule3"})
    public DiscountResponse getOfferForRule3()  {
        List<Integer> productPriceList=Arrays.asList(5,5,10,20,30,40,50,50,50,60);
        return diwaliDiscountService.applyBOGODiscount2(productPriceList);
    }*/
}
