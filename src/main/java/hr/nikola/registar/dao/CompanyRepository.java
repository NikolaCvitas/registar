package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hr.nikola.registar.entity.Company;

@RepositoryRestResource(path="companies")
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
