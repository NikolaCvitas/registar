package hr.nikola.registar.service;

import hr.nikola.registar.entity.Company;

import java.util.List;


public interface CompanyService {
	
     List<Company> findAll();

     Company findById(int theId);

     void save(Company company);

     void deleteById(int theId);

}
