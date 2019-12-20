package harjoituksia;

public class AAXelaeimet
{
	public static void main(String[] args)
	{
		Elaein koira=new Elaein("Suomen PKorva", "punainen", 10, 6, "Kassu");
		Elaein kissa=new Elaein("Bengali", "Gebardi", 12, 4, "Pisama");
		Elaein kissa2=new Elaein("Maatiainen", "Musta    ", 8, 6, "Viivi");
		Elaein kissa3=new Elaein("Maatiainen", "MV       ", 1, 2, "Wilbertti");
		
		System.out.println("Rotu\t\t\tVäri\t\tIkä\tPaino\tNimi\n");
		System.out.println(koira);
		System.out.println(kissa);
		System.out.println(kissa2);
		System.out.println(kissa3);
		
		koira.kasvataIkaa();
		
		System.out.println("Kassun ikä on nyt" +koira.getIka());
		

	}

}
