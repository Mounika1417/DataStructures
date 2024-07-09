package computationalgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionalKnapsackProblem {

	static class Item{
		int profit, weight;

		public Item(int profit, int weight) {
			super();
			this.profit = profit;
			this.weight = weight;
		}
		
	}
	
	private static double getMaxValue(Item[] arr, int capacity){
		double totalValue =0d;
		Arrays.sort(arr, new Comparator<Item>() {
		
			
			
			
	@Override
	public int  compare(Item item1, Item item2) {
		
		// TODO Auto-generated method stub
		
		double cpr1= new Double((double) item1.profit) / (double) item1.weight;
		double cpr2= new Double((double) item1.profit) / (double) item2.weight;
		if(cpr1 <cpr2 )
			return 1;
		else {
			return -1;
		}
	}	
	});
	
	for(Item i:arr) {
		int curWt =(int)i.weight;
		int curVal = (int)i.profit;
		if(capacity-curWt >=0) {
			capacity=capacity-curWt;
			totalValue +=curVal;
		} else {
			double fraction =(double) capacity/(double)curWt;
			totalValue += (curVal * fraction);
			capacity =(int)(capacity-(curWt * fraction));
			break;
		}
	}
	
	return totalValue;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] items= {
				new Item(60, 10),
				new Item(100, 20),
				new Item(120, 30)
		
				};
		
		int capacity = 50;
		double maxValue = getMaxValue(items, capacity);
		System.out.println("Maximum value we can obtain= "+ maxValue);
		
	}

}