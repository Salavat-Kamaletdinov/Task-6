package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {


    private List<Car> cars;

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberCars(int number) {
        return cars.stream().limit(number).toList();
    }

    public List<Car> createCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("BMW","Blue", 2000));
        listCars.add(new Car("Audi","Red", 3000));
        listCars.add(new Car("Ford","Green", 4000));
        listCars.add(new Car("Mercedes","Yellow", 5000));
        listCars.add(new Car("Volvo","Black", 6000));
        return listCars;
    }

    public CarDAOImp() {
        this.cars = createCars();
    }
}
