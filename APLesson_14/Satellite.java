import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

       double[] home = {0, 0};
	   
	   TheCar car = (TheCar)l;

       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

		for (Location l : locate)
		{
		   printout += "\nLocation for " + l.getID() + ": (" + getLocation(car.getLoc()) + ")";
		}
		

		printout += "\n\n" + "=========================="
					+"\nDistance from home... ";
		
		for (Location l : locate)
		{
		   printout += "\nDistance for " + l.getID() + ": (" + getDistance(((TheCar)l).getLoc(), home)+ ")";
		}
		
		
		
		for (Location l : locate)
		{
		   double one =(Math.random()*100)+1;
		   double two =(Math.random()*100)+1;
		   car.move(one, two);
		   printout += "\nAfter " + l.getID() + " Moved : (" + one + ", " + two + ")" 
						+ "\nNew Location: (" + getLocation(car.getLoc()) +")";

		   printout += "\n\n" + "==========================" +
					   "\nDistance from home... "
					   +"\nDistance for " + l.getID() + ": (" + getDistance(car.getLoc(), home)+ ")";

       }
       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}