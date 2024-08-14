import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double plus_counter =0;
    double negative_counter =0;
    double zero_counter =0;
    
    for (int i =0; i<3; i++){
        for (int j=0; i<arr.size(); i++){
            if(i == 0){
                if(arr.get(j) > 0){
                    plus_counter ++;
                }
            }else if(i==1){
                if(arr.get(j) < 0){
                    negative_counter ++;
                }
            }else if(i==2){
                if(arr.get(j)  == 0){
                    zero_counter ++;
                }
            }
        }
        
     
    }
        System.out.println(plus_counter/arr.size());
        System.out.println(zero_counter/arr.size());
        System.out.println(negative_counter/arr.size());
       

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
