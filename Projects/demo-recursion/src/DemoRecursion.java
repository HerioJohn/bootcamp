public class DemoRecursion {
    public static void main(String[] args) throws Exception {

        int sum = 0;

        for (int i = i; i <= 5; i++) {
            sum +=i;
        }
        
        System.out.println(sum(5)); // 15

        // recursion: Given int n, return n + (n - 1) + (n - 2) + 1
        // if n is odd, return n * (n - 2) * (n - 4) *... * 2;
        // if n is even, return n * (n - 2) * (n - 4) *... * 1 
        
    }
 
    public static int sum(int n) {
        // base criteria
        if (n == 1) {
            return 1;
        }


        return n + sum(n-1);
        // Step1: return 5 + sum(4);
        // Step2: return 4 + sum(3);
        // Step3: return 3 + sum(2);
        // Step4: return 2 + sum(1);
        // Step5: return 1 + sum(0);
    }

    public static int multiple(int x) {

        int j = 0;


        if (x == 1) {
            return 1;
        }

        return 


        if (x % 2 != 0) {
            
        }
    }
}
