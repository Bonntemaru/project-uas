package analog;
import java.util.Scanner;
public  class siswa {

	public siswa(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Long nama; 
		int Kelas;
		int umur;
		short gender;
		
		siswa sw1 = new siswa("nama");
		
		
	Scanner keyboard = new Scanner(System.in);
		;
	
	System.out.println("masukan kelas :");
		
		Kelas = keyboard.nextInt(); 
		
		System.out.println("masukan umur :");
		
		umur = keyboard.nextInt();
		
		System.out.println("gender :");
		
		gender = keyboard.nextShort();
		
		String[] nilai = {"Matematika" ,"bahasa indonesia" , "ipa" ,"agama"};
		
		System.out.println("kelas anda adalah" + Kelas);
		System.out.println("umur anda adalah" + umur);
	
	}

}
