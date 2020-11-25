package Array;

import java.util.Arrays;

public class ArratCopyExample { //배열 복사
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//방법 1
	char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	System.out.println(Arrays.toString(arr2));
	
		//방법 2
	char[] arr3 = Arrays.copyOfRange(arr1,1,3);
	System.out.println(Arrays.toString(arr3));
	
		//방법 3
	char[] arr4 = new char[arr1.length];
	System.arraycopy(arr1, 0, arr4, 0, arr1.length);
	for(int i = 0; i<arr4.length; i++) {
		System.out.println("arr4{" + i + "]=" + arr4[i]);
	}
				
		}
	}

