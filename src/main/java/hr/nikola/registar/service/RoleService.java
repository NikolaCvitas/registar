package hr.nikola.registar.service;

import hr.nikola.registar.entity.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll();

    public Role findById(int theId);

    public void save(Role user);

    public void deleteById(int theId);
}
