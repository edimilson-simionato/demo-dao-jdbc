package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dpt = new Department(1, "Contabilidade");
		
		Seller seller = new Seller(1, "Peter Frampton", "p_frampton@babaquice.com", new Date(), 3500.0, dpt);
		
		System.out.println(seller);
	}

}
