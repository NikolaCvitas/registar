package hr.nikola.registar.controller;

import hr.nikola.registar.entity.Role;
import hr.nikola.registar.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RoleController {

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService p_roleService) {
        this.roleService = p_roleService;
    }

    @GetMapping("/role")
    public List<Role> findAll() {
        return roleService.findAll();
    }

    @GetMapping("/role/{id}")
    public Role findById(@PathVariable int id) {

        return roleService.findById(id);
    }

    @PostMapping("/role")
    public void save(@RequestBody Role role) {

        roleService.save(role);
    }

    @DeleteMapping("/role/{id}")
    public void delete(@PathVariable int id) throws Exception {

        Role tempRole = roleService.findById(id);

        if (tempRole == null) {
            throw new Exception("Role id not found - " + id);
        }

        roleService.deleteById(id);

    }
}
