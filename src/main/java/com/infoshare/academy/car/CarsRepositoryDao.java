package com.infoshare.academy.car;

import com.infoshare.academy.menuEnum.BodyTypeEnum;
import com.infoshare.academy.menuEnum.ColorEnum;
import com.infoshare.academy.menuEnum.FuelSourceEnum;
import com.infoshare.academy.menuEnum.TransmissionEnum;
import org.hibernate.Filter;

import java.util.List;
import java.util.stream.Stream;

public interface CarsRepositoryDao {
     Car addCar(Car car);
     Stream<Car> list();
     Car getCar(long id);
     Car updateCar(long id,Integer carType, String make, String model, Integer year, Integer mileage, FuelSourceEnum
             fuelSourceEnum, Integer enginePower, ColorEnum colorEnum, BodyTypeEnum bodyTypeEnum, TransmissionEnum transmissionEnum);
     void deleteCar(long id);
     Stream<Car> searchCar(Filter filter);
}
