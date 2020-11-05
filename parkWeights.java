
public class parkWeights {
	public static void parallelWeight(int num) { 
		int[]preference=new int[num];
		for (int i = 0; i < num; i++) {
			preference[i]=num;
		}
		long count = 0;
		long check = (long)(((num+1)*(num)/2)*Math.sqrt(3)-2*Math.sqrt(3)+2*Math.sqrt(2));
		long stop = 0;
		long end = (long)Math.pow(num,num);
		while (stop<end){
			long weight = 0;
			for(int n = 0;n<num;n++) {
				weight+=(long)(Math.sqrt(preference[n])*(n+1));
			}
			if(weight<check) {count++;}
			preference[num-1]--;
			for(int j = num; j>0; j--) {
				if(preference[j-1]<=0 && j>=2) {preference[j-1] = num;preference[j-2]--;}}
		stop++;}
		System.out.println(count);
	}
	public static void main(String[]args) {
		parallelWeight(3);
	}
}