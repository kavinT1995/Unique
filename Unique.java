# Unique
public class Unique {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,2,1,3};
		String s[]=new String[a.length];
		for(int i=0;i<a.length;i++){
			s[i]=""+a[i];
			
		}
		String b;int count=0;int count1=0;String s2 = null;
		for(int i=0;i<s.length;i++){
			
			b=s[i];
			
			for(int j=i+1;j<s.length;j++){
				
			if(s[j].contains(b)){
				count++;
			}
			else{
				count=0;
				s2=s[j];
			}
				
			}
			
			
		}if(count==0){
			System.out.println(s2);
		}
	}

}
