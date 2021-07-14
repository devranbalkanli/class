
public class Siniflar {

	public static void main(String [] args) {
		
		HesapMakinesi makine1=new HesapMakinesi(); // nesne oluşturma...1.nesne
		
		makine1.sayi1=20;
		makine1.sayi2=10;
		
		System.out.println(makine1.sayi1);
		System.out.println(makine1.sayi2);
		
		HesapMakinesi makine2 = new HesapMakinesi();  // bu da 2. nesne
		
		makine2.sayi1=50;
		makine2.sayi2=75;
		
		System.out.println(makine2.sayi1);
		System.out.println(makine2.sayi2);
	}
}
