public class CurrencyExchanger
{
	/**
	@param args is the command line argument
	*/


	// Display the exchange rate   	
	static void printCurrencies()
	{
		//Initialize
		// $ sign & _ can be use
		int rupee, dirham, real, chilean_peaso, mexican_peso, _yen;
		int $australian, dollar, Rupee;

		rupee = 63;
		dirham = 3; //UAE
		real = 3; // brazilan

		chilean_peaso = 595;
		mexican_peso = 18;

		_yen = 107;
		$australian = 2;
		Rupee = 63; 

		System.out.println(" Welcome to currency exchange display board ");
		System.out.println(" The following exchange rate are base on 1 USD to the other currency\n");
		System.out.println( " rupee: \t" + rupee + "\n");
		System.out.println(" dirham: \t" + dirham + "\n");
		System.out.println(" real\t" + real + "\n");
		System.out.println(" chilean_peaso\t" + chilean_peaso + "\n");
		System.out.println(" mexican_peso\t" + mexican_peso + "\n");
		System.out.println(" _yen\t" + _yen + "\n");
		System.out.println(" $australian \t" + $australian + "\n");
		System.out.println(" Rupee\t" + Rupee + "\n");
	}

	public static void main(String[] args)
	{
		//Code run here
		CurrencyExchanger cc = new CurrencyExchanger();
		cc.printCurrencies();
	
	}
}