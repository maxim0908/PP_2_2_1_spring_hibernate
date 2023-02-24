package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars();

    void addCar(Car car);
}
