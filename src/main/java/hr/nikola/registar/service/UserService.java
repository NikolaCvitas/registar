package hr.nikola.registar.service;

import java.util.List;

import hr.nikola.registar.entity.User;

public interface UserService {
	
    public List<User> findAll();

    public User findById(int theId);

    public void save(User user);

    public void deleteById(int theId);

}
