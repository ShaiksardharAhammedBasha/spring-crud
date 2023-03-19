package com.ms.springcrud.controllers;

import com.ms.springcrud.exception.GlobalExceptionHandlerCls;
import com.ms.springcrud.models.Company;
import com.ms.springcrud.services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "home.ms")
public class CompanyControllers {

    @Autowired
    private CompanyServices services;

    @PostMapping(value = "/save")
    public void saveCompany(@RequestBody Company company) {
        services.saveCompanyData(company);
    }

    @GetMapping(value = "/{id}")
    public Optional<Company> fetchCompById(@PathVariable("id") Integer id) throws Exception {
        Optional<Company> compId = services.fetchCompanyById(id);
        if(compId.isEmpty()  || !compId.isPresent()){
            throw new Exception("Id Doesn't Exist:"+compId);
        }
        return services.fetchCompanyById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCompanyById(@PathVariable("id") Integer id) {
        services.deleteCompanyById(id);

    }
}
