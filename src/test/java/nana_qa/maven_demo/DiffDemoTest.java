/**
 * 
 */
package nana_qa.maven_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author nana
 *
 */
public class DiffDemoTest {
	private DiffDemo diffDemo;
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		diffDemo = new DiffDemo();
	}
	
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void test() {
		String str1 ="abc";
		String str2 ="abD";
		String expected = "XY";
		try {
			String deffResult = this.diffDemo.getDiff(str1, str2);
			assertEquals(expected, deffResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGetDiffD() {
		String str1 ="abc";
		String str2 ="abD";
		String expected = "XY";
		try {
			String deffResult = this.diffDemo.getDiff(str1, str2);
			assertEquals(expected, deffResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

