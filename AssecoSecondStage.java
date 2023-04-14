import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssecoSecondStage {
//    A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
//
//    For example, in array A such that:
//
//    A[0] = 9  A[1] = 3  A[2] = 9
//    A[3] = 3  A[4] = 9  A[5] = 7
//    A[6] = 9
//    the elements at indexes 0 and 2 have value 9,
//    the elements at indexes 1 and 3 have value 3,
//    the elements at indexes 4 and 6 have value 9,
//    the element at index 5 has value 7 and is unpaired.
//
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//    For example, given array A such that:
//
//    A[0] = 9  A[1] = 3  A[2] = 9
//    A[3] = 3  A[4] = 9  A[5] = 7
//    A[6] = 9(
//    the function should return 7, as explained in the example above.
//
//    Write an efficient algorithm for the following assumptions:
//    N is an odd integer within the range [1..1,000,000];
//    each element of array A is an integer within the range [1..1,000,000,000];
//    all but TODO  one
//     of the values in A occur an even number of times.



    public static int solutionOne(int[] a){
          int count =0;

        for (int k : a) {
            for (int i : a) {
                if (k == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return k;


            }
            count = 0;
        }


     return 0;
    }


//    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//
//    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
//
//    Write a function:
//
//    class Solution { public int solution(int N); }
//
//    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//
//    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
//
//    Write an efficient algorithm for the following assumptions:
//    N is an integer within the range [1..2,147,483,647].

    public static int solutionTwo(int N){
        String binaryValue = Integer.toBinaryString(N);
        int startGap =0;
        int maxLength =0;
        for(int i = 0; i<binaryValue.length(); i++){
            if(binaryValue.charAt(i)=='1'){
                int gapLength = i - startGap;
                if(maxLength< gapLength) {
                    maxLength = gapLength;
                }
                startGap = i;
            }
        }
        return maxLength ==0 ? 0 : maxLength -1;
    }


//    3.
//    A non-empty array A consisting of N integers is given, write a function that returns the prime numbers in the array.
//    For example, given [3, 67, 12, 7, 11, 9], returns [3, 67, 7, 11]


    public static int[] solutionThree(int[] a){
        List<Integer> resultlist = new ArrayList<>();

        return Arrays.stream(a).filter(AssecoSecondStage::checkPrime).toArray();
    }

    private static boolean checkPrime(int a){
        if (a <2) return false;
        if (a == 2 ) return true;
        for(int i =2 ; i< a/2; i++ ){
            if(a%i ==0) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        int[] a = {9,3,9,3,9,7,9};
        int[] b = {3, 67, 12, 7, 11, 9};


        System.out.println( solutionOne(a));
        System.out.println(solutionTwo(1000
        ));
        System.out.println(Arrays.toString(solutionThree(b)));
    }


}
