import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test --> 0){
            int n = sc.nextInt() ;
            int ans = 0 ; 
            while(n > 2){
                ans += n / 3 ;
                if(n % 3 != 0)n = (n / 3 ) + ( n % 3);  
                else n = n / 3 ; 
                
            }
            System.out.println(ans) ; 
        }
    }
}
