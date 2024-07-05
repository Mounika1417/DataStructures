package computationalgorithm;

public class TowerOfHanoi {

	public static void solveTowerOfHanoi(int n, char sourceRod, 
			char targetRod, char auxiliaryRod) {
		if(n==1) {
			  System.out.println("Move disk 1 from rod" + sourceRod +
					  "to rod" + targetRod);
			  return;
			  
	}
		  solveTowerOfHanoi(n-1, sourceRod, auxiliaryRod, targetRod);
		  
		  System.out.println("Move disk " + n + " from rod " + sourceRod + " to rod" + targetRod);
	      solveTowerOfHanoi(n-1,auxiliaryRod, targetRod, sourceRod);
	}
	public static void main(String[] args) {
		int numberOfDisks=3;
	// TODO Auto-generated method stub
       solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');
	}

}