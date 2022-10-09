package com.embarcshit.fckdelphi.service;

import com.embarcshit.fckdelphi.repository.CarRepository;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
class CarService(val carRepository : CarRepository) {


}
