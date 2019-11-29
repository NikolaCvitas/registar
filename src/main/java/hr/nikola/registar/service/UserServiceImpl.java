package hr.nikola.registar.service;

import java.util.List;
import java.util.Optional;

import hr.nikola.registar.dao.UserRepository;
import hr.nikola.registar.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User findById(int theId) {

		Optional<User> result = userRepository.findById(theId);

		User user = null;

		if (result.isPresent()) {
			user = result.get();
		}
		return user;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteById(int theId) {
		userRepository.deleteById(theId);
		
	}

}
