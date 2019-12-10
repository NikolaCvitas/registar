package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hr.nikola.registar.entity.Company;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path="companies")
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
