package numeros;

public class AppMain {

	public static void main(String[] args) {
		
		Long long1 = Long.valueOf(123);
		Long long2 = Long.valueOf("123");
		
		System.out.println(long1 == long2);
		//true
		
		Long long3 = Long.valueOf(223);
		Long long4 = Long.valueOf(223);
		
		System.out.println(long3 == long4);
		//false
		
		
	}
}
