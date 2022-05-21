package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {
    //����� , ������� ��� ������� /cars ������� ���� ������. ��� ������� /cars?count=2 ������ ������������ ������ �� 2 �����,
    //��� /cars?count=3 - �� 3, � ��. ��� count ? 5 �������� ���� ������ �����.
    public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
