import java.util.inputanner;
public class Tollbooth  {

   protected int id;
   protected String name;
   protected double Amount;
   protected int Car;

   public TollBooth(int id,String name,double Amount,int Car)
   {
       this.id=id;
       this.name=name;
       this.Amount=Amount;
       this.Car=Car;
   }
   public void PayingCar()
   {
      this.Car= Car++;
     this.Amount=  Amount+=0.50;
   }+
   public void NonPayingCar()
   {
       this.Car++;
   }
   public void Display()
   {
       int total_cars;
       Scanneranner input=new Scanner(System.in);
       System.out.println("Total number of cars passed without Payment: " );
       int car_non_payment= input.nextInt();     
       System.out.println("Total number of cars passed: " );
       Car= input.nextInt(); 
       System.out.println("Total amount paid is: R" + Car * 0.50);

   }

}