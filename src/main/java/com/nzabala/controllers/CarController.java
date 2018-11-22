package com.nzabala.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzabala.listas.CarType;
import com.nzabala.listas.CombustionType;
import com.nzabala.listas.TransmissionType;
import com.nzabala.model.Car;
import com.nzabala.model.CarResponse;

@RestController
public class CarController extends CarResponse{
	
	private static Logger LOG = Logger.getLogger("log");
	
	@SuppressWarnings("serial")
	private final static List<Car> CARS = new ArrayList<Car>(
			Arrays.asList(
				new Car(1,"Golf","VW", "Golf 1.4 TSI 125cv BMT" ,CarType.COMPACTO, CombustionType.GASOLINA, 3, TransmissionType.MANUAL, 0, 25, 300, 350, true),
				new Car(2,"Polo","VW", "Polo 1.2 TSI 110cv BMT" ,CarType.URBANO, CombustionType.GASOLINA, 3, TransmissionType.MANUAL, 0, 15, 200, 250, true),
				new Car(3,"Leon","Seat", "Leon 1.4 TSI 150cv BMT" ,CarType.COMPACTO, CombustionType.GASOLINA, 3, TransmissionType.MANUAL, 0, 15, 250, 300, true))
			){{
	}};
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@CrossOrigin()
	@Produces(MediaType.APPLICATION_JSON)
    public List<Car> getAllCars() {
		LOG.info("GET /cars");
		return CARS;	
    }
	
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	@CrossOrigin()
	@Consumes(MediaType.APPLICATION_JSON)
    public void addCar(@RequestBody Car car) {
		LOG.info("POST /car " + car);
		CARS.add(car);
    }
	
	@RequestMapping(value = "/car/{id}", method = RequestMethod.DELETE)
	@CrossOrigin()
    public Response deleteCar(@PathVariable("id") int id) {	
		LOG.info("DELETE /car " + id);
		String res = "";
		for(Car c : CARS){
			if(c.getId().equals(id)){
				CARS.remove(CARS.indexOf(c));
				res = c.getModel() + " ha sido eliminado con éxito";
				break;
			}
		}
		if(res.equals("")){
			res = "No se ha podido eliminar el coche "+id;
		}
		return buildResponse(res.toString());
    }
}
