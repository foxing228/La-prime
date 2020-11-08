package bankbonussystem.demo.contoller;

import bankbonussystem.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("/cabinet")
@Controller
public class UserPageController {

    @GetMapping()
    public String getCabinet() {
        return "cabinet";
    }

}
