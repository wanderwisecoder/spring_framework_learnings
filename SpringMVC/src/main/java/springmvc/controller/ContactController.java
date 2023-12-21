package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Spring Frame-work Example....!!!");
		m.addAttribute("Desc", "Home for Programmer");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {

		return "contact";
	}

//This Controller method is traditional servlet method using HttpServletRequest Interface
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(HttpServletRequest request, Model m) {
		String email = request.getParameter("email");

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(email + name + password);
		return "contact";
	}

	// This Controller method is used using @RequestParam Annotation in Spring
	// Frameworks
	@RequestMapping(path = "/processform1", method = RequestMethod.POST)
	public String handleForm1(@RequestParam("email") String userEmail, @RequestParam("name") String userName,
			@RequestParam("userPassword") String password, Model m) {

		User user = new User(userName, userEmail, password);

		System.out.println(user);
		System.out.println(userEmail + userName + password);

		// process

//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		m.addAttribute("user", user);
		return "success";
	}

	// This Controller method is used using @RequestParam Annotation & Model Class &
	// its attribute method in Spring
	// Frameworks
	@RequestMapping(path = "/processform2", method = RequestMethod.POST)
	public String handleForm1(@ModelAttribute User user, Model m) {

		// m.addAttribute("Header","Spring Framework Example");
		// m.addAttribute("Desc","Home for Programmer");
		System.out.println(user);
		if (user.getEmail() == "" || user.getName() == "" || user.getPassword() == "") {
			return "redirect:/contact";
		}
		else if (user.getEmail().isEmpty() || user.getName().isEmpty() || user.getPassword().isEmpty()) {
			return "redirect:/contact";
		}
		int createdUserId = this.userService.createUser(user);
		m.addAttribute("msg", "User created with id " + createdUserId);
		return "success";
	}

}
