import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logincontroller {
	@RequestMapping(value="/mvc/login")
	public ModelAndView loginForm() {
		return new ModelAndView("Quest8/Login");
	}
	
}
