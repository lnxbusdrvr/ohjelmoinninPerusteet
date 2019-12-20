package harjoituksia;

public class ABBauto
{

	public static void main(String[] args)
	{
		Autot omaAuto=new Autot("KKI-445", "Volvo", "C30", "Valkoinen", 2016, 40000, 0);
		
		System.out.println("Rekisterinumero\tMerkki\tMalli\tVäri\t\tVuosiluku\tOstohinta\tTankki");
		System.out.println(omaAuto);
		
		omaAuto.kaynnista();
		omaAuto.sammuta();
		omaAuto.tankkaa(45);
		omaAuto.ajo();
		
		System.out.println("Tankissa on nyt: "+omaAuto.getTankki() +" litraa.");

	}

}
