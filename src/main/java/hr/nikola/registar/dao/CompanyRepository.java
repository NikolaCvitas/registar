package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.nikola.registar.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
