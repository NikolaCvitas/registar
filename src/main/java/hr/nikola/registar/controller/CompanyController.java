package hr.nikola.registar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.nikola.registar.entity.Company;
import hr.nikola.registar.service.CompanyService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CompanyController {
	
	private CompanyService companyService;
	
    @Autowired
    public CompanyController(CompanyService p_companyService) {
    	companyService = p_companyService;
    }

    @GetMapping("/companies")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping("/companies/{id}")
    public Company findById(@PathVariable int id) {

        return companyService.findById(id);
    }

    @PostMapping("/companies")
    public void save(@RequestBody Company user) {

    	companyService.save(user);
    }

    @DeleteMapping("/companies/{id}")
    public void delete(@PathVariable int id) throws Exception {

        Company tempCompany = companyService.findById(id);

        if (tempCompany == null) {
            throw new Exception("Company id not found - " + id);
        }

        companyService.deleteById(id);
    
    }

}
