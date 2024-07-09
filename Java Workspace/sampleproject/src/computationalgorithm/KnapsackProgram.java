package computationalgorithm;

public class KnapsackProgram {
	
	static int KnapSack(int m, int[] w, int[] p, int n) {
		// TODO Auto-generated method stub
		int[][] c= new int[n+1][m+1];
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=m; j++) {
				if(w[i -1] > j) {
					c[i][j]=c[i-1][j];
				}else {
					c[i][j]=Math.max(
							p[i-1] + c[i -1][j-w[i-1]],
							c[i-1][j]);
				}
			}
		}
		return c[n][m];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p= {60,100,120};
		int[] w={10,20,30};
		int M=50;
		int n=p.length;
		System.out.println("The maximum profit: " + KnapSack(M, w, p, n));

}
}