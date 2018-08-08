package nana_qa.maven_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {

	private Assessment myAssessment = null;

	@Before
	public void setUp() throws Exception {
		myAssessment = new Assessment();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGrade() {
		String expectedGrade = "Failed";
		String actualGrade = myAssessment.getGrade(120);
		Assert.assertEquals(expectedGrade, actualGrade);
	}

}
