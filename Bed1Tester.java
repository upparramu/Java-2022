class Bed1Tester
{
public static void main(String[] shirt)
{
	    System.out.println(" by refrenc=="+Bed1.brand);
		System.out.println(" by refrenc=="+Bed1.price);
		System.out.println(" by refrenc=="+Bed1.color);
		System.out.println(" from block init=="+Bed1.size);
		
		int newPrice=3000;
		Bed1.price=newPrice;
		System.out.println(" by refrenc=="+Shirt.price); 
		
		Bed1.setPrice();
		newPrice=Bed1.price;
		System.out.println(" by method=="+newPrice);
		
		Bed1.setPrice(12500);
		newPrice=Bed1.price;
		System.out.println(" by method parameter passing=="+newPrice);

}
}