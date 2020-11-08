package bankbonussystem.demo.repository;

import bankbonussystem.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long > {
    User findUserByEmail(String email);
}
