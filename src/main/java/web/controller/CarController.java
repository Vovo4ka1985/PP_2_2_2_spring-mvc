package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/cars")
    public class CarController {

    private CarService carService;
@Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
        public String printCar(@RequestParam (value = "count", defaultValue = "5") int number, Model model) {
            model.addAttribute("car", carService.index(number));
            return "cars";
        }

    }
