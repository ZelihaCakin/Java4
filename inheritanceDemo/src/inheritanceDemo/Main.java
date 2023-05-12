package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		
		
		//TarımKrediManager tarımKrediManager=new TarımKrediManager();
		//ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		

	}

}
