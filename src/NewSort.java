
public class NewSort {

	static void newsort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++){
			for(int j =1;j<(n-i);j++){
				if(arr[j-i] > arr[j]){
					temp = arr[j-1];
					arr[j-i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
	public static void main(String[] args){
		int arr[] = {8,5,23,2,4,3,2,3,2};
		
		System.out.println("Array Before the sort: ");
	    for(int i = 0;i<arr.length;i++){
	    	System.out.println(arr[i]+" ");
	    }
	    System.out.println();
	    
	    newsort(arr);
	    
	    System.out.println("Array after teh sort:");
	    for(int i = 0; i< arr.length; i++){
	    	System.out.println(arr[i]+" ");
	    }
	}

}
