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
	
	public String getDiff(String str3,String str2) throws Exception {
		if(StringUtils.isEmpty(str3)||StringUtils.isEmpty(str2)){
			throw new Exception("Empty or Null String is not allowed.");
		}
		return StringUtils.difference(str3, str2);
	}
	
	
	
	
	
	

}
