package programs;

import java.util.Arrays;

public class AssendingorderArrayBySorting {

	public static void main(String[] args) {
		 int[] a= {11,20,330,44,50,32,200,1};
         int n=a.length;
         Arrays.sort(a);
         System.out.print(Arrays.toString(a));;
//         int temp=0;
//        for(int i=0;i<n-1;i++){
//           for(int j=0;j<n-i-1;j++){
//             if(a[i]>a[j+1]){
//                 temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//                 System.out.print(temp);
//        }
//               
//           } 
//           
//        }
	}

}
