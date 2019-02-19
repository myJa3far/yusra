package swftwer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import swftwer.addp;
import swftwer.myshc;

public class mTest {
	myshc obj;
	@Before
	public void setUp() throws Exception {
		obj=new myshc();
	}

	@Test
	public void test1() {
		assertTrue(obj.getcount1()==0);
	}
	@Test
	public void test2() {
		int prodexp=1;
		int priceexp=127;
		 myshc obj=new myshc();
		addp pr=new addp("java",1,127);
		obj.add(pr);
		assertEquals(prodexp,obj.getcount1());
		assertEquals(priceexp,obj.gettotalprice());
}
	@Test
	public void test3() {
		int prodexp1=2;
		int priceexp1=227;
		 myshc obj=new myshc();
		 addp pr=new addp("java",1,127);
		addp p=new addp("web",2,100);
		obj.add(pr);
		obj.add(p);
		assertEquals(prodexp1,obj.getcount1());
		assertEquals(priceexp1,obj.gettotalprice());
		
	
	}
}