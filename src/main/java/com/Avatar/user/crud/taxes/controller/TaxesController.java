package com.Avatar.user.crud.taxes.controller;
import com.Avatar.user.crud.taxes.entity.Taxes;
import com.Avatar.user.crud.taxes.services.TaxesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/v2")
public class TaxesController {

    @Autowired
    TaxesService taxesService;



//    @ResponseBody
//    @GetMapping("/taxes")
//    public List<Taxes> getTaxes(){
//        return taxesService.getAllTaxes();
//    }

    @PostMapping("/taxes")
    public ResponseEntity<?> addTax(@RequestBody Taxes taxes){
        Taxes tax = taxesService.addTax(taxes);
        return new ResponseEntity<>(tax, HttpStatus.CREATED);
    }



}
