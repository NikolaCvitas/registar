package hr.nikola.registar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.nikola.registar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsernameAndStatus(String username, String status);

}
