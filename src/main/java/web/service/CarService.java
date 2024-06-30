package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("Toyota", "Black", 2020));
        carList.add(new Car("BMW", "White", 2019));
        carList.add(new Car("Audi", "Red", 2021));
        carList.add(new Car("Mercedes", "Silver", 2018));
        carList.add(new Car("Ford", "Blue", 2022));
    }

    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}