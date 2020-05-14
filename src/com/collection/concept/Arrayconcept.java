package com.collection.concept;

public class Arrayconcept {

	public static void main(String[] args) {
		int [] arr= {1, 2, 3, 5, 8,9, 12};
		int sum=0;
		
		for(int i=0;i<(arr.length)/2;i++)
		{
			if(i==0)
			{
				sum=arr[i]+arr[i+1];
				System.out.println(sum);
			}
			
			else
			{
				sum=arr[i*2]+arr[(i*2)+1];
				System.out.println(sum);
			}
		}

		
	}

}
