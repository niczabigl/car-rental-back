package com.nzabala.model;

import com.nzabala.listas.CarType;
import com.nzabala.listas.CombustionType;
import com.nzabala.listas.TransmissionType;

public class Car {
	
	private Integer id;
	private String name;
	private String maker;
	private String model;
	private CarType type;
	private CombustionType energyType;
	private Integer doors;
	private TransmissionType transmission;
	private Integer kms;
	private Integer pricePerDay;
	private Integer maxKmsPerDay;
	private Integer depositFee;
	private boolean isAvailable;
	private String observations;
	
	
	public Car (){
		
	}
	
	public Car (Integer id, String name, String maker, String model, 
			CarType type, CombustionType energyType, Integer doors, 
			TransmissionType transmission, Integer kms, 
			Integer pricePerDay, Integer maxKmsPerDay, Integer depositFee,
			boolean isAvailable){
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.model = model;
		this.type = type;
		this.energyType = energyType;
		this.doors = doors;
		this.transmission = transmission;
		this.pricePerDay = pricePerDay;
		this.depositFee = depositFee;
		this.isAvailable = true;
		this.observations = type + ", " + doors + ", " + transmission + ", " + name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CombustionType getEnergyType() {
		return energyType;
	}

	public void setEnergyType(CombustionType energyType) {
		this.energyType = energyType;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public CombustionType getCombustion() {
		return energyType;
	}

	public void setCombustion(CombustionType energyType) {
		this.energyType = energyType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getKms() {
		return kms;
	}

	public void setKms(Integer kms) {
		this.kms = kms;
	}

	public Integer getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Integer pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Integer getMaxKmsPerDay() {
		return maxKmsPerDay;
	}

	public void setMaxKmsPerDay(Integer maxKmsPerDay) {
		this.maxKmsPerDay = maxKmsPerDay;
	}

	public Integer getDepositFee() {
		return depositFee;
	}

	public void setDepositFee(Integer depositFee) {
		this.depositFee = depositFee;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Integer getDoors() {
		return doors;
	}

	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	public TransmissionType getTransmission() {
		return transmission;
	}

	public void setTransmission(TransmissionType transmission) {
		this.transmission = transmission;
	}
	
	
	
}
