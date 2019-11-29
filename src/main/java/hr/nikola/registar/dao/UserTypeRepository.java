package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.nikola.registar.entity.UserType;

public interface UserTypeRepository  extends JpaRepository<UserType, Integer> {

}
