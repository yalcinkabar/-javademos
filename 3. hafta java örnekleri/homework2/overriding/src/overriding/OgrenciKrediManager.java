package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
	
	//override edilemez
	/*
	 * public String mesaj() { return ""; }
	 */
}
