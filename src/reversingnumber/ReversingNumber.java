package reversingnumber;
public class ReversingNumber {
    public static void main(String[] args) {
     System.out.print(reverse(987654321));
    }//end of main
    public static int reverse(int n){
         int answer = 0;
        while (n > 0){
            answer *= 10;
            answer += n % 10;
            n = n / 10;
            
        }
        return answer;   
    }//end of reverse
}
