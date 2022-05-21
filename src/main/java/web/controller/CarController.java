package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
    public class CarController {
        @GetMapping(value = "/cars")
        public String printCar(@RequestParam (value = "count", defaultValue = "5") int allCars, Model model) {
            List<Car>list = new ArrayList<>();
            list.add(new Car("Lexus", "Red", "V6"));
            list.add(new Car("BMW", "Blue", "V8"));
            list.add(new Car("Lada", "Black", "1.6"));
            list.add(new Car("Audi", "Pink", "V8"));
            list.add(new Car("Toyota", "Yellow", "V6"));
            list = CarServiceImpl.carsCount(list, allCars);
            model.addAttribute("list", list);
            return "cars";
        }

    }
