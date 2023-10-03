package com.example.rentacar.business.concretes;

import com.example.rentacar.business.abstracts.CarService;
import com.example.rentacar.business.requests.CreateCarRequest;
import com.example.rentacar.business.requests.UpdateCarRequest;
import com.example.rentacar.business.responses.GetAllCarResponse;
import com.example.rentacar.business.responses.GetByIdCarResponse;
import com.example.rentacar.core.utilities.mappers.ModelMapperService;
import com.example.rentacar.dataAccess.abstracts.CarRepository;
import com.example.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private ModelMapperService modelMapperService;
    private CarRepository carRepository;

    @Override
    public void add(CreateCarRequest createCarRequest) {
        Car car = this.modelMapperService.forRequest().map(createCarRequest, Car.class);
        this.carRepository.save(car);
    }

    @Override
    public List<GetAllCarResponse> getAll() {
        List<Car> cars = this.carRepository.findAll();
        List<GetAllCarResponse> carResponses = cars.stream().map(car ->
                this.modelMapperService.forResponse().map(car, GetAllCarResponse.class)).collect(Collectors.toList());
        return carResponses;
    }

    @Override
    public void delete(int id) {
        this.carRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car car = this.modelMapperService.forRequest().map(updateCarRequest,Car.class);
        this.carRepository.save(car);
    }

    @Override
    public GetByIdCarResponse getById(int id) {
        Car car= this.carRepository.findById(id).orElseThrow();
        GetByIdCarResponse getByIdCarResponse=this.modelMapperService.forResponse().map(car,GetByIdCarResponse.class);
        return getByIdCarResponse;
    }
}
