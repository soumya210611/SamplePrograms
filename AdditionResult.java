package randomPograms;

public class AdditionResult extends Addition{
	public void result() {
		System.out.println("the result of parent should divisible by 10");
	}

	public static void main(String[] args) {
		Addition addition=new Addition();
		int res= addition.add(25, 5);
		int r=res/10;
		if(res%10==0) {
			System.out.println(+r);
			System.out.println("it is divisible");
		}
			else 
			
				System.out.println("not divisible by 10");
		}

	}



