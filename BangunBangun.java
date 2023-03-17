// Gaharu Winanggya B / 123210155

package mainkuy;
public class BangunBangun {
    private double panjang, lebar , tinggi;

	public BangunBangun(double panjang) {
		this.panjang = panjang;
	}

	public BangunBangun(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
        
        public BangunBangun(double panjang, double lebar , double tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
              this.tinggi = tinggi;
	}
        
	public double luasPersegiPanjang() {
		return panjang*lebar;
	}

	public double kelilingPersegiPanjang() {
		return 2*(panjang+lebar);
	}
        
        public double LPBalok() {
		return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
	}
        
        public double VolumeBalok() {
		return panjang*lebar*tinggi;
	}
        
}
