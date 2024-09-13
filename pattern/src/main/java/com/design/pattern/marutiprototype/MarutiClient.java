package com.design.pattern.marutiprototype;

import java.util.ArrayList;
import java.util.List;

public class MarutiClient {
    public static void main(String[] args) {
        Breeza breeza = new Breeza();
        breeza.setModelYear(2021);

        WagonR wagonR = new WagonR();
        wagonR.setModelYear(2021);

        List<Car> carList = new ArrayList<>();
        carList.add(wagonR);
        carList.add(breeza);
        for(Car car: carList){
            System.out.println(car.getClass().getSimpleName()+" "+ car.hashCode()+" "+ car.getEngineCC()
                    +" "+ car.getPrice()+" "+ car.getModelYear());
        }

        List<Car> copyCarList = new ArrayList<>();
        for(Car car: carList){
            copyCarList.add(car.clone());
        }

        for(Car car: copyCarList){
            car.setModelYear(2023);
            System.out.println(car.getClass().getSimpleName()+" "+ car.hashCode()+" "+ car.getEngineCC()
                    +" "+ car.getPrice()+" "+ car.getModelYear());
        }
    }
}
