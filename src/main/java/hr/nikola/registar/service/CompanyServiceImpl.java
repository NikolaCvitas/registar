package hr.nikola.registar.service;

import java.util.List;
import java.util.Optional;

import hr.nikola.registar.dao.CompanyRepository;
import hr.nikola.registar.entity.Company;
import hr.nikola.registar.entity.User;

import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	private CompanyRepository companyRepository;

	@Override
	public List<Company> findAll() {
		
		return companyRepository.findAll();
	}

	@Override
	public Company findById(int theId) {
		
		Optional<Company> result = companyRepository.findById(theId);

		Company company = null;

		if (result.isPresent()) {
			company = result.get();
		}
		
		return company;
	}

	@Override
	public void save(Company company) {
		
		companyRepository.save(company);
		
	}

	@Override
	public void deleteById(int theId) {
		
		companyRepository.deleteById(theId);
		
	}

}
