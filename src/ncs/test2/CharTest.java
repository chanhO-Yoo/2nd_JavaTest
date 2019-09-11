package ncs.test2;

public class CharTest {
	public static void main(String[] args) {
		//출력할 문자열 저장 변수
		String printStr="";
		//파리미터의 길이만큼 문자열 배열 생성
		char[] inputStr = new char[args[0].length()];
		//입락받은 파라미터를 toCharArray메서드를 이용하여 문자열 배열에 저장
		inputStr = args[0].toCharArray();
		//위의 두줄을 한번에!
//		char[] inputStr = args[0].toCharArray();
		
		for(int i=0;i<inputStr.length;i++) {
			if(inputStr[inputStr.length-1-i] >= 97) {
				printStr += (char)(inputStr[inputStr.length-1-i]-32);
			}
			else {
				printStr += inputStr[inputStr.length-1-i];
			}
		}
		System.out.println(printStr);
	}
}
