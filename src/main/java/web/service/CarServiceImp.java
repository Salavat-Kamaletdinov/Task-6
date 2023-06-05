package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
@Autowired
    private CarDAO carDAO;

    public List<Car> getNumberCars(int number) {
        if (number < 0){
            return null;
        }else {
            return carDAO.getNumberCars(number);
        }
    }
    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }
}
