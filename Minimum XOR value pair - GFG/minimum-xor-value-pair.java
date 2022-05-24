// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            

            Solution ob = new Solution();
            
            System.out.println(ob.minxorpair(N,arr));
            
            
        }
    }
}
// } Driver Code Ends


class Solution{

    static int minxorpair(int N, int A[]){
        // code here
         int minXOR = 1234567890;
    Arrays.sort(A);
    for (int i=1; i < N; i++)
        minXOR = Math.min(A[i-1] ^ A[i] , minXOR);
    return minXOR;
    }
}