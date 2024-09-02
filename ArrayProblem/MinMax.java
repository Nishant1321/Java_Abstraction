package ArrayProblem;



public class MinMax {

		
		public 	static int getmin(int n, int array[]) {
				int ans=array[0];
				for(int i=1;i<n;i++) 
				
				ans=Math.min(array[i], ans);
				return ans;
			}
		public static int getmax(int n,int array[]) {
			
			int ans=array[0];
			for(int i=1;i<n;i++)
				ans=Math.max(ans, array[i]);
			return ans;
		}
		public static void main(String args[]) {
			int array[]= {1,2,3,4,5};
			int n=array.length;
			System.out.println("enter the mininmum: "+MinMax.getmin(n, array));
			System.out.println("enter the maximum: "+MinMax.getmax(n, array));
		}

			
			
		}


