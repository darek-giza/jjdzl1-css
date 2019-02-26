package com.infoshare.academy.car;

import com.infoshare.academy.menuEnum.BodyTypeEnum;
import com.infoshare.academy.menuEnum.ColorEnum;
import com.infoshare.academy.menuEnum.FuelSourceEnum;
import com.infoshare.academy.menuEnum.TransmissionEnum;
import org.hibernate.Filter;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface CarsRepositoryDao {
     Car addCar(Car car);
     Stream<Car> list();
     Car getCar(Integer id);
     Car updateCar(Car car,Integer id);
     void deleteCar(long id);
     Stream<Car> searchCar(Filter filter);
}
