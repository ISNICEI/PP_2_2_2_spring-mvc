package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    public List<Car> carList = List.of(new Car("Cadillac", "Escalade", 2022)
            , new Car("Mazda", "RX-8", 2007)
            , new Car("Ford", "Mustang", 2020)
            , new Car("Porsche", "911", 2008)
            , new Car("Chevrolet", "Impala", 1986));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || (count >= carList.size())) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
