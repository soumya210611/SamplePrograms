package randomPograms;

public class Onseason extends OffSeason{
	public Onseason() {
		System.out.println("constructor 2");
	}
	@Override
public void cloths(float price) {
	double discount= price-(price*0.40);
	System.out.println(discount);
}
	public static void main(String[] args) {
		Onseason onseason=new Onseason();
		onseason.cloths(300);
		OffSeason offSeason=new OffSeason();
		offSeason.cloths(300);
	}

}
