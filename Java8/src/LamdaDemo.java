interface A {
	//void show();
	void showint(int i);
}
public class LamdaDemo {
	
	public static void main(String args[]) {
		
		/*A a = new A() {
			

			@Override
			public void show() {
				System.out.println("Hi");
				
			}

			@Override
			public void showint(int i) {
				System.out.println("Hi" +i);
				
			}
		};*/
		A a,b;
		//a= () ->  System.out.println("Hi");
		b= (int i) ->  System.out.println("Hi"+i);
		b.showint(10);
		
	}

}
