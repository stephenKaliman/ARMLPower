import java.util.ArrayList;
import java.util.List;
public class park {
	public static void parallel(int num) {
		int[]preference=new int[num];
		int[] Xs = new int [num-1];
		for (int i = 0; i < num; i++) {
			preference[i]=num;
		}
		long stop = 0;
		long end = (long)Math.pow(num,num);
		while (stop<end){
			List<Integer> A = new ArrayList<Integer>(2*num);
			for (int j=0;j<2*num;j++) {
				A.add(j,0);
			}
			for (int j = 0;j<num;j++) {
				int n = preference[j]-1;
				if(A.get(n)==1) {
					if(n>0) {
						n=n-1;
					}
					else {}
					while(A.get(n)==1) {n++;}
						A.set(n,1);
					}
				 else {
					A.set(n,1);
				}
				}
			for(int k = A.size()-1; k>num-1;k--) {
				if(A.get(k)==0) {A.remove(k);}
			}
			int X = A.size()-num;
			Xs[X]++;if(X>=1) {
			for(int p = 0;p<num;p++) {System.out.print(preference[p]);}System.out.print("\n");}
			preference[num-1]--;
			for(int j = num; j>0; j--) {
				if(preference[j-1]<=0 && j>=2) {preference[j-1] = num;preference[j-2]--;}}
		stop++;}
	for(int i = 0;i<num-1;i++) {
		System.out.println(Xs[i]);
	}
  }
	public static void main(String[]args) {parallel(4);}
}
