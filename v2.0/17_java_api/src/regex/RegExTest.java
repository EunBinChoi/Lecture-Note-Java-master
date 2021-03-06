package regex;

import java.util.regex.*;

public class RegExTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "010-1234-5678";
		String data2 = "02-123-4567";
		String regEx = "\\d{2,3}[-]\\d{3,4}[-]\\d{4}";
//		String s = "\\";
		
		boolean res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		boolean res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
		boolean res3 = Pattern.matches(regEx, "0001-00000000-000");
		System.out.println(res3);
		
		data1 = "qwer@gmail.com";
		data2 = "abc@naver.co.kr";
		regEx = "\\w+[@]\\w+[.]\\w+([.]\\w+)?";
		res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
		res3 = Pattern.matches(regEx, "abc@naver");
		System.out.println(res3);
		
		data1 = "서울특별시 구로구 구로동 1129-1";
		data2 = "경기도 수원시 장안구 장안동 1130-2";
		regEx = "([가-힣]+[도] )?[가-힣]+[시] [가-힣]+[구] [가-힣]+[동] [0-9]+[-][0-9]+";
		res1 = Pattern.matches(regEx, data1);
		System.out.println(res1);
		res2 = Pattern.matches(regEx, data2);
		System.out.println(res2);
	}

}
