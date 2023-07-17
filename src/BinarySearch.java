import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i, count = 0, s = scan.nextInt();

        int[] a = new int[s];

        for(i = 0; i<s; i++){
            a[i] = scan.nextInt();
        }

        int x = scan.nextInt();
        
        for(i=0; i<s; i++){
            Arrays.sort(a);
            int beg = i, end = s-1, mid = (beg+end)/2;
            while(beg<=end)
            {
                if(a[mid] > x){
                    end = mid - 1;
                    mid = (beg+end)/2;
                }
                else{
                    beg = mid + 1;
                    mid = (beg+end)/2;
                }

                if(a[mid] == x){
                    count++;
                }
            }
        }

        if(count>0){
            System.out.println("Value Matched\n");
        }
        else{
            System.out.println("Value Not Found\n");
        }
    }
}