
public class susobhan {
	public static void main(String args[]) {
		
		String s= "susobhan";
		String result="";
		int n  = s.length();
		for(int i =0;i<n;i++) {
			String finalodd="";
			String finaleven="";
			
			
			if(i%2==0) {
				String even= String.valueOf(s.charAt(i)).toUpperCase();
				finaleven+=even;
			}
			else if(i%2!=0) {
				String odd= String.valueOf(s.charAt(i)).toLowerCase();
				
				finalodd = finalodd+odd;
			}
			result=finaleven+finalodd;
			
		}
		
		System.out.print(result);
		
	}

}
