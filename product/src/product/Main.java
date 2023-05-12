package product;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Deleongi Kahve makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitInStock(3);
		product1.setUnitprice(7500);
		// set
//		product1.name = "Delongi Kahve Makinesi";
//		product1.unitprice = 7500;
//		product1.discount = 7;
//		product1.unitInStock = 3;
//		product1.imageUrl = "bimemne.jpg";

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Sony Kahve makinesi");
		product2.setDiscount(8);
		product2.setImageUrl("bilmemne2.jpg");
		product2.setUnitInStock(2);
		product2.setUnitprice(6500);
		// set
//		product2.name = "Song Kahve Makinesi";
//		product2.unitprice = 6500;
//		product2.discount = 8;
//		product2.unitInStock = 2;
//		product2.imageUrl = "bimemne2.jpg";

		Product product3 = new Product();
		product3.setName("Kitchen Kahve makinesi");
				product3.setDiscount(9);
				product3.setImageUrl("bilmemne3.jpg");
				product3.setUnitInStock(4);
				product3.setUnitprice(4500);
		// set
//		product3.name = "Kitchen Kahve Makinesi";
//		product3.unitprice = 4500;
//		product3.discount = 9;
//		product3.unitInStock = 4;
//		product3.imageUrl = "bimemne3.jpg";

		Product[] products = { product1, product2, product3 };
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			
		
		System.out.println("<li>"+product.getName()+"</li>");
			
		}	
		System.out.println("</ul>");
			
		//System.out.println(product.name);
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05059675999");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstname("Zeliha");
		individualCustomer.setLastname("Çakın");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setPhone("05059654555");
		corporateCustomer.setTaxNumber("111");
		
		Customer[] customers= {individualCustomer, corporateCustomer};
		
	}
}
