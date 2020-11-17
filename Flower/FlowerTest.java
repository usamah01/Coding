
public class FlowerTest {

	public static void main(String[] args) {
	

				Flower flower1;
				
				flower1 = new Flower("Rose", 2);
		
				flower1.getFlowerName();
				flower1.getPetalCount();
				System.out.println("Your Flower is" + flower1.getFlowerName() + "and has" + '\t'+ flower1.getPetalCount()+ "petals");
		

			Flower flower2 ;
			flower2 =new Flower("Daffodil", 3);
			
			flower2.getFlowerName();
			flower2.getPetalCount();
			System.out.println("Your Flower is" + flower2.getFlowerName() + '\t'+ "and has" + flower2.getPetalCount() + "petals");


			Flower flower3;
			flower3 = new Flower("Dandilion", 4);
			
			flower3.getFlowerName();
			flower3.getPetalCount();
			System.out.println("Your Flower is" + '\t' + flower3.getFlowerName() + "and has" + flower3.getPetalCount() + "petals");
			Flower flower4;
			flower4= new Flower("Violet", 5);
			
			flower4.getFlowerName();
			flower4.getPetalCount();
			System.out.println("Your Flower is" + '\t' + flower4.getFlowerName() + '\t'+ "and has " + flower4.getPetalCount() + "petals");

	}

}
