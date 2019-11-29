package hr.nikola.registar.service;

import java.util.List;

import hr.nikola.registar.entity.Company;


public interface CompanyService {
	
    public List<Company> findAll();

    public Company findById(int theId);

    public void save(Company company);

    public void deleteById(int theId);

}
