package com.test.testException;

public class Test1 {

	public static void main(String[] args) {
		int temp;
		int[] a={1,2,3,4,5,6,7,8};
		for(int i=0;i<=7;i++){
			for(int j=0;j<=i;j++){
			 if(a[j]<a[i]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+"    ");
		}
	
		test();
	}
	
	
	public static  void test(){
		int temp;
		int[] a={1,2,3,4,5,6,7,8};
		for(int i=0;i<=7;i++){
			for(int j=0;j<=7;j++){
			 if(a[j]<a[i]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+"    ");
		}
	}

}
