package bankbonussystem.demo.service;

import bankbonussystem.demo.domain.User;

public interface UserService {

    void save(User user);

    User findByEmail(String email);
}
