class Array1{
	public void largestArray(){
		
		int a[] = {4,6,2,9,5,3};
		 int max = a[0];
		 for(int i=1; i<a.length; i++) {
			 if(max < a[i]) {
				 max = a[i];
			 }
		 }
		 System.out.println("Maximum element is : " + max);
	}
}
public class ArrayMax  {
	 public static void main(String[] args) {
		 
		Array1 a = new Array1();
		a.largestArray();
	 }
		      
}
	


