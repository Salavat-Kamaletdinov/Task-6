package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {
    @Autowired
    private List<Car> cars;

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberCars(int number) {
        return cars.stream().limit(number).toList();
    }

}
