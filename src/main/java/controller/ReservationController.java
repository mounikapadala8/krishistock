package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Service.FamerService;
import model.Farmer;

@RestController
public class ReservationController {
	
	@Autowired
	FamerService farmerService;
	
	@PostMapping
	public void farmerBooking(@RequestParam Farmer farmer) {
			farmerService.farmerBooking(farmer);
	}

}
