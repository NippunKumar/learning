package powerpack;

public class UseOfSplit {
	
	 public static void main(String args[]) {
	      String Str = "Welcome to Tutorialspoint.com";
	      String result = "";
	      System.out.println("Return Value :" ); 
	      String st[]  = Str.split(" ");
	      System.out.println(st.length);
	      for (int i =st.length-1; i>=0 ;i--) {  
	    	  result = result + st[i]+" ";
	         
	      }
	      System.out.println(result+" ");
	   }

}
