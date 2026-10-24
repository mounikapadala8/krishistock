package ServiceImpl;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vassarlabs.krishistock.time.MutableClock;

import Service.FamerService;
import model.Depots;
import model.Depotstock;
import model.Farmer;
import model.Product;
import model.Reservation;
import model.Schemes;
import model.Skus;

@Service
public class FarmerServiceImpl implements FamerService{
	
	int reserCount =0;
	MutableClock clock = MutableClock.startingAt(Instant.parse());
	 Instant currentTime = clock.instant();
	 
	@Override
	public void farmerBooking(Farmer booked) {
		
		HashMap<String, Depots> depot= new HashMap();
		depot.put("D001",new Depots("D001","Anantapur","Anantapur Depot 01"));
		depot.put("D002",new Depots("D002","Anantapur","Anantapur Depot 02"));
		depot.put("D003", new Depots("D003","Anantapur","Anantapur Depot 03"));
		depot.put("D002",new Depots("D002","Anantapur","Anantapur Depot 02"));
		depot.put("D011",new Depots("D011","Guntur","Guntur Depot 01"));
		depot.put("D012",new Depots("D012","Guntur","Guntur Depot 02"));
		
		List<Skus> skus = Arrays.asList( new Skus("DAP-50KG",	"DAP","Di-ammonium phosphate",	50));
		skus.add(new Skus("DAP-20KG",	"DAP","Di-ammonium phosphate",	20));
		skus.add(new Skus("DAP-10KG",	"DAP","Di-ammonium phosphate",	10));
		skus.add(new Skus("UREA-45KG",	"UREA",	"Urea",	45));
		skus.add(new Skus("UREA-35KG",	"UREA",	"Urea",	35));
		
		LinkedList<Depotstock> depotStock = new LinkedList<>();
		depotStock.add(new Depotstock("D001",	"DAP-10KG",	"RABI-2025", 75));
		depotStock.add(new Depotstock("D001",	"DAP-20KG",	"KHARIF-2026", 73));
		depotStock.add(new Depotstock("D002",	"DAP-10KG",	"KHARIF-2026",	159));
		
		List<Schemes> schemes = Arrays.asList( new Schemes("KHARIF-2026",	"KHARIF-2026"	,"2026-06-15T00:00:00Z",	"2026-08-31T23:59:59Z"));
		schemes.add(new Schemes("RABI-2025"	,"RABI-2025",	"2025-11-01T00:00:00Z",	"2026-01-31T23:59:59Z"));
		
		List<Product> product = Arrays.asList();
		product.add(new Product("PADDY_SEED",	20));
		product.add(new Product("DAP",	50));
		product.add(new Product("UREA",	90));
		product.add(new Product("MOP",	25));
		
		String scheme_id = "";
		
		for(Schemes i: schemes) {
			if(i.getSeason().equals(booked.getSeason())) {
				//Getting the schema where it is open based on the date and time
				MutableClock clock = MutableClock.startingAt(Instant.parse(i.getOpens_at()));
				
				 Instant currentTime = clock.instant();
				if(currentTime> i.getOpens_at() && i<i.getCloses_at()) {
					scheme_id= i.getScheme_id();
				}
			}
		}
		
		
//		get the depot stock from  from depot_stock table and update the table as calc above
		
		int totalRequiredByFamer =  booked.getLandholding_acres()x product.getKg_per_acre(booked.getProduct());
		
		Reservation bookedResr ;
		//Iterate through depotStock to map and update the total
		for(Depotstock x: depotStock) {
			if(totalRequiredByFamer < (x.getTotal() ){
				//Set the reservation fields and update to the reservation table
				
				for(Skus j: skus) {
					if(j.getProduct().equals(booked.getProduct()))) {
					String sku= j.getSkus();
					}
				}
				String expiresAt = currentTime+ clock.advance(Duration.ofMinutes(10)); // get the 10 min from now to set expireddate
				bookedResr= new Reservation ("R"+reserCount++, genUniqueID, booked.getFarmer_id(), booked.getDepot_id(), sku, schema_id, totalRequiredByFamer, status, currentTime, expiresAt , confirmedAt);
			}
		}
		
		
		
		
		
	}
	
	

}
