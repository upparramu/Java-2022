class BedTester{
static public void main(String[] getMe){
		System.out.println(" by refrenc=="+Bed.brand);
		System.out.println(" by refrenc=="+Bed.lenght);
		System.out.println(" by refrenc=="+Bed.itemCode);
		System.out.println(" by refrenc=="+Bed.price);

		System.out.println(" from block init=="+Bed.brand);
		String newbrand="kurlon";
		Bed.brand=newbrand;
		System.out.println(" by refrenc=="+Bed.brand); 
		Bed.setBrand();
		newbrand=Bed.brand;
		System.out.println(" by method=="+newbrand);
		Bed.setBrand("puresleep");
		newbrand=Bed.brand;
		System.out.println(" by method parameter passing=="+newbrand);		

}
}