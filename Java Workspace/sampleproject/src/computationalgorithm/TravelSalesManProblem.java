package computationalgorithm;

public class TravelSalesManProblem {
	static int n=4;
	static int MAX=10000;
	
	static int[][] dist= {
			{0,0,0,0,0},
			{0,0,10,15,20},
			{0,10,0,35,25},
			{0,15,25,0,30},
			{0,20,25,30,0}
	};
	
	static int[][] memo=new int[n+1][1<<(n+1)];
	static int find(int i,int mask){
		int res=MAX;
		if(mask==((1<<i)|3)) {
			return dist[1][i];
		}
		if(memo[i][mask]!=0) {
			return memo[i][mask];
		}
		
		for(int j=1;j<=n;j++) {
			if((mask & (i<<j))!=0 && j!=i&&j!=1) {
				res=Math.min(res,find(j,mask&(~(1<<i))) +  dist[j][i]);
			}
		}
		return memo[i][mask]=res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=MAX;
		for(int i=1;i<=n;i++) {
			res=Math.min(res, find(i,(1<<(n+1))-1)+dist[i][1]);
		}
		System.out.println("The cost of the most efficient tour: "+res);
	}

}