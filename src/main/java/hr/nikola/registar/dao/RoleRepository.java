package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.nikola.registar.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer> {

}
