package ArrayProblem;


public class DuplicateArray {
public static void main(String args[]) {
	
	int j=1;
	int n []= {1,0,1,2,3,4,2};
	for(int i=0;i<n.length;i++) {
		if(n[i]!=n[j-1]) {
			n[j]=n[i];
			j++;
			
		}
		System.out.println(n[j]);
		}
	
	}
	
}

