package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("age", 54);
		System.out.println("This is home controller/url.!");
		model.addAttribute("name", "Roshan");

		model.addAttribute("id", 1234);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller/url.!");
		return "about";
	}

	
	//services
	//help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller/url.!");
		
		//creating ModelAndView object
		ModelAndView modelAndView =  new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Uttam");
		modelAndView.addObject("rollNumber",11222);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//List Object
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(87);
		list.add(92);
		list.add(67);
		list.add(45);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}

}
