
public class stringproblems {
	 public void reverese(String s) {
		 for(int i=s.length()-1;i>0;i--) {
	        	System.out.print(s.charAt(i)); 
	          }
	 }
	 public void upperlower(String s) {
		int cap=0,small=0,number=0,symbols=0;
		 for(int i=0;i<s.length();i++) {
			 	if(s.charAt(i)>'A' && s.charAt(i)<'Z') {
			 		cap++;
			 		System.out.print(s.charAt(i)+"  ");
			 	}
			 	else if(s.charAt(i)>'a' && s.charAt(i)<'z'){
			 		small++;
			 		System.out.print(s.charAt(i)+" ");
                 }
			 	else if(s.charAt(i)>'a' && s.charAt(i)<'z'){
			 		number++;
			 		System.out.print(s.charAt(i)+" ");
                 }
			 	else {
			 		symbols ++;
			 		System.out.print(s.charAt(i)+" ");
			 	} 	
		 }
		    
	 }
	 

	public static void main(String[] args) {
		String  s=new String("Hello Good Morning Mahe");
         /* for(int i=0;i<s.length();i++) {
        	System.out.print(s.charAt(i)); 
          }*/
          stringproblems s1=new stringproblems();
          s1.upperlower(s);
	}

}
