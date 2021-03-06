package application;

import java.util.Date;
import java.util.List;

import db.Db;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao(Db.getConnection());

		Seller seller = sellerDao.findById(3);

		System.out.println("=== TEST 1: seller findById =====");
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll =====");
		List<Seller> list2 = sellerDao.findAll();

		for (Seller obj : list2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}
}
