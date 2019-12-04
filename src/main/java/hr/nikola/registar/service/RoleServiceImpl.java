package hr.nikola.registar.service;

import hr.nikola.registar.dao.RoleRepository;
import hr.nikola.registar.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository p_roleRepository) {
        this.roleRepository = p_roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(int theId) {

        Optional<Role> result = roleRepository.findById(theId);
        Role role = null;

        if(result.isPresent()){
            role = result.get();
        }

        return role;
    }

    @Override
    public void save(Role user) {

        roleRepository.save(user);
    }

    @Override
    public void deleteById(int theId) {

        roleRepository.deleteById(theId);
    }
}
