import java.util.*;
class master
{ static void conversiontable()
{
        System.out.println("     "+"1"+"        "+"10"+"        "+"20"+"        "+"50"+"      "+"100");
        System.out.println("JPY  "+"0.67"+"    "+"6.7"+"      "+"13.4"+"      "+"33.5"+"     "+"67.0");
        System.out.println("EUR  "+"85.37"+"   "+"853.7"+"    "+"1707.4"+"    "+"4268.5"+"   "+"8537.0");
        System.out.println("GBP  "+"94.5"+"    "+"945.0"+"    "+"1890.0"+"    "+"4725.0"+"   "+"9450.0");
        System.out.println("USD  "+"74.3"+"    "+"743.0"+"    "+"1486.0"+"    "+"3715.0"+"   "+"7430.0");
        System.out.println("AED  "+"20.25"+"   "+"202.5"+"    "+"405.0"+"     "+"1012.5"+"   "+"2025.0");
}
       static double JPY= (double) 0.67;
       static double USD= (double) 74.43;
       static double GBP= (double) 94.5;
       static double EUR= (double) 85.3;
       static double AED= (double) 20.25;
static double conamn,Sourcecurrency=0,Targetcurrency=0;
static double currencyconversion(int source,int target,double conversionamount)
{
 switch(source)
        {
            case 1: Sourcecurrency=JPY;
            		break;

            case 2: Sourcecurrency=USD;
                 	 break;

            case 3: Sourcecurrency=GBP;
                     break;

            case 4: Sourcecurrency=EUR;
           	     break;

            case 5: Sourcecurrency=AED;
                   break;
              }


       
  switch (target)
        {
            case 1: Targetcurrency=JPY;
          	  break;

            case 2: Targetcurrency=USD;
                    break;

            case 3: Targetcurrency= GBP;
           	     break;

            case 4: Targetcurrency=EUR;
                    break;

            case 5: Targetcurrency= AED;
             break;
            
        }

    conamn=(Sourcecurrency*conversionamount)/Targetcurrency;
    return conamn;
}





	public static void main(String arg[])
{
	int source=0;
	int target=0;
	double conversionamount=0;
        double conamn=0;
	Scanner inp=new Scanner(System.in);

	System.out.println("Do you wish to check conversion rates for  today : (y/n) ");
	char choice = inp.next().charAt(0);
	if (choice== 'y')
	{
	conversiontable();
	}

	System.out.println("Do you wish to check currency available for conversion today : (y/n) ");

 
         choice = inp.next().charAt(0);
          if (choice == 'y') 

          {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
                                                                                  // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = inp.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
                                                                                   // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = inp.nextInt();
            System.out.println("Enter the amount to be converted : ");
             conversionamount=inp.nextDouble();                                            //Accept the amount to be converted
                           
           
              conamn=currencyconversion(source,target,conversionamount);

             
            System.out.println("The converted exchange rate is "+conamn);
                                                                                           // Display the amount converted
            
            System.out.println("Thanks for checking into currency convertor");
              } 



}
}