package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController   {

	public final CarService serv;

	public CarsController(CarService serv) {
		this.serv = serv;
	}

	@GetMapping(value = "/cars" )
	public String printCountedCars(@RequestParam(required = false) String count,  ModelMap model) {

		if (count==null || Long.parseLong(count) > 5) {
			model.addAttribute("printCars", serv.getCars());
		}
		else {

		Object[] objects = serv.getCars().stream().limit(Long.parseLong(count)).toArray();
		model.addAttribute("printCars", objects);}

		return "cars";
	}
}