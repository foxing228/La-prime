package bankbonussystem.demo.contoller;

import bankbonussystem.demo.domain.User;
import bankbonussystem.demo.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("/registration")
@Controller
public class RegistrationController {

    @Autowired
    UserRepository userRepo;

    @PostMapping
    public User add(@RequestParam String first_name, @RequestParam String last_name, @RequestParam String email, @RequestParam String password) {
        User user = new User(first_name, last_name, email, password);

        userRepo.save(user);
        return user;
    }
    @GetMapping()
    public String methon() {
        return "reg";
    }
}
