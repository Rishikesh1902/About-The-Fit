package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class product_controller
{
	@RequestMapping(value = { "/" , "/home" , "/index" })	//Request Mapping
	public ModelAndView Index()
	{
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}