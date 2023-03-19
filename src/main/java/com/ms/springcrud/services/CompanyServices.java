package com.ms.springcrud.services;

import com.ms.springcrud.models.Company;
import com.ms.springcrud.repositories.CompanyRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServices {

    @Autowired
    private CompanyRepositories repositories;


    // save comp data
    public void saveCompanyData(Company company) {
        repositories.save(company);
    }

    public Optional<Company> fetchCompanyById(Integer id) {
        return repositories.findById(id);
    }

    public void deleteCompanyById(Integer id) {
        repositories.deleteById(id);
    }
}
