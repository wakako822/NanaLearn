/**
 * 
 */
package nana_qa.maven_demo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author nana
 *
 */
public class DiffDemo {

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public String getDiff(String str3,String str4) throws Exception {
		if(StringUtils.isEmpty(str3)||StringUtils.isEmpty(str4)){
			throw new Exception("Empty or Null String is not allowed.");
		}
		System.out.println("hihi");
		return StringUtils.difference(str3, str4);
	}
	
	
	
	
	
	

}
