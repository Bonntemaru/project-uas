package analog;
import java.util.Scanner;
public class guru {
	public static void main (String[] args) {
		
	}

	Scanner keyboard = new Scanner(system.in);
		String ttl , nama , alamat , kontak , pend ;
		public guru() {
			
		}
		
		
		public guru (String nm, String alm, String knt, String pnd, String tl) {
			setData(nm , alm , knt , pnd , tl);
		}
		private void setData(String nm , String alm , String knt , String pnd , String tl) {
			
			nama = nm;
			nama = keyboard.next();
			alamat = alm;
			alamat = keyboard.next();
			kontak = knt;
			pend = pnd;
			ttl = tl;
			System.out.println("nama dan alamat anda adalah" + nama);
		}
		
		
	guru gr1 = new guru();
	

}
