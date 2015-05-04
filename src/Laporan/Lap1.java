/**
 * 
 */
package Laporan;

/**
 * @author Sofyan
 *
 */
public class Lap1 {

	/**
	 * @param args
	 */
	static String Praktikum = "Praktikum 1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Praktikum2 = "Praktikum Kedua";
		System.out.println("ini praktikum ");
		System.out.println("ini laporan");
		System.out.println(Praktikum2);
		
		test();
		penjumlahan();
		biodata();
		

	}
	public static void test()
	{
		System.out.println(Praktikum);
	}
	public static void penjumlahan()
	{
		int a = 2+3;
		System.out.println("Penjumlahan" + a);
		
	}
	public static void biodata()
	{
		String nama = "Sofyan Rijaluddin";
		String matkul = "PBO";
		System.out.println("nama " + nama +"\n Mata Kuliah " +matkul );
	}
}

