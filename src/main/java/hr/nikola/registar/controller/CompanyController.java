package hr.nikola.registar.controller;

import hr.nikola.registar.entity.Company;
import hr.nikola.registar.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void save(@RequestBody Company company) {

    	companyService.save(company);
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
