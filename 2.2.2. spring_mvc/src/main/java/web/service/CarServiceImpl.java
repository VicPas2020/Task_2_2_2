package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class CarServiceImpl implements CarService {


    private ArrayList<Car> list =
            new ArrayList<>(Arrays.asList(
                    new Car("bmv", 100, true),
                    new Car("LADA", 200, true),
                    new Car("kia", 300, false),
                    new Car("VAZ", 400, false),
                    new Car("NIVA", 500, true))
            );

    @Override
    public ArrayList<Car> getCars() {
       return list;
    }
}
