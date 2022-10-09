package com.embarcshit.fckdelphi.repository;

import com.embarcshit.fckdelphi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends JpaRepository<Car, Integer> {



}
