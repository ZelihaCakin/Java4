package classesWithAttributers;

import java.security.Identity;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(id=1, name="laptop", description="asus laptop", price=3000, stock=3);
		
		Product product=new Product();
		product.setName("laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getDescription());

	}

}
