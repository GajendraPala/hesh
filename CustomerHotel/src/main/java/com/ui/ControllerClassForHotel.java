package com.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bluechip")
public class ControllerClassForHotel {
	
	@RequestMapping(value = "/hotelpage", method = RequestMethod.GET)
	 public String  pagedata()  {
		return "hotelpage";
	 }

	@RequestMapping(value = "/buttonpage", method = RequestMethod.GET)
		 public String  buttons()  {
			return "buttons";
		 }
	
	@RequestMapping(value = "/border", method = RequestMethod.GET)
	 public String  border()  {
		return "border";
	 }

	@RequestMapping(value = "/cards", method = RequestMethod.GET)
		 public String  card()  {
			return "cards";
		 }
	@RequestMapping(value = "/accordion", method = RequestMethod.GET)
	 public String  accordion()  {
		return "accordion";
	 }

	@RequestMapping(value = "/tabs", method = RequestMethod.GET)
		 public String  tabs()  {
			return "tabs";
		 }
	
	@RequestMapping(value = "/grid", method = RequestMethod.GET)
	 public String  grid()  {
		return "grid";
	 }
	@RequestMapping(value = "/bus", method = RequestMethod.GET)
	 public String  bus()  {
		return "busapp";
	 }

	
	
	
	
	
	
	
	
	
}
