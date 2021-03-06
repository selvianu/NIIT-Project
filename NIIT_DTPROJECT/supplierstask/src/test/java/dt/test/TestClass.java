package dt.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dt.dao.SupplierDao;
import dt.model.Supplier;

public class TestClass {

	static SupplierDao supplierdao;
	private static Supplier supplier;

	@BeforeClass
	public static void setup() {
		AnnotationConfigApplicationContext configApplnContext = new AnnotationConfigApplicationContext();
		configApplnContext.scan("dt");
		configApplnContext.refresh();
		supplierdao = (SupplierDao) configApplnContext.getBean("supplierDao");
		supplier = new Supplier();
	}

	/*
	 * @Test public void addSupplierTest() { supplier.setSid(100);
	 * supplier.setSupplierName("xyz"); }
	 */
	/*
	 * @Test public void deleteSupplierTest() { supplier.setSid(37);
	 * System.out.println("data"); assertTrue("deleted",
	 * supplierdao.deleteSupplier(supplier));
	 * 
	 * }
	 */

/*	@Test
	public void updateSupplierTest() {
		supplier.setSid(35);
		supplier.setSupplierName("My first Alphabets");
		assertTrue("updated", supplierdao.updateSupplier(supplier));
	}*/
}
