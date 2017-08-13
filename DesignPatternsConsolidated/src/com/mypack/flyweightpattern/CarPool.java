package com.mypack.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class CarPool {
	
	private final Car[] cars = {new BMWS6(), new BMWX5(), new MarituBaleno(), new MarutiSwift()};

	private static CarPool pool = null;
	private static Map<String, Car> carMap = new HashMap<>();
	
	private CarPool(){}
	
	public static CarPool getPool(){
		if(pool == null){
			synchronized (CarPool.class) {
				if(pool == null){
					pool = new CarPool();
				}
			}
		}
		return pool;
	}
	
	public Car getCar(String regNo){
		Car car = null;
		if(regNo != null && carMap.containsKey(regNo)){
			car = carMap.get(regNo);
		}else{
			car = getRandomCar();
			if(car instanceof BMWX5){
				car = (BMWX5)car.createCarObject(regNo);
			}else if(car instanceof BMWS6){
				car = (BMWS6)car.createCarObject(regNo);;
			}else if(car instanceof MarutiSwift){
				car = (MarutiSwift)car.createCarObject(regNo);;
			}else if(car instanceof MarituBaleno){
				car = (MarituBaleno)car.createCarObject(regNo);;
			}
			carMap.put(regNo, car);
		}
		return car;
	}
	
	private Car getRandomCar(){
		return cars[(int)(Math.random()*cars.length)];
	}
}
