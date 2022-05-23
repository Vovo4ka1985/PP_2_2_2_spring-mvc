package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    //����� , ������� ��� ������� /cars ������� ���� ������. ��� ������� /cars?count=2 ������ ������������ ������ �� 2 �����,
    //��� /cars?count=3 - �� 3, � ��. ��� count ? 5 �������� ���� ������ �����.
    private List<Car> cars = Arrays.asList(new Car("Lexus", "Red", "V6"),
        new Car("BMW", "Blue", "V8"),
        new Car("Lada", "Black", "1.6"),
            new Car("Audi", "Pink", "V8"),
            new Car("Toyota", "Yellow", "V6"));

    @Override
    public List<Car> index(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());

    }
}
