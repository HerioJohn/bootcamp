public class DemoForLoop {
    public static void main(String[] args) throws Exception {

        int x = 2;

        // counter initialization ; counter's continue condition; counter's movement
        // Step 1: int i = 0
        // step 2: Asking if i < 4
        // step 3: i = 0 -> Yes -> x *=2
        // step 4: sysout: X = 0
        // step 5: i++
        // step 6: Asking if i < 4
        // step 7: i = 1 - > Yes - > x*=2
        // step 8: sysout: X = 1
        // step 9: i++
        // step 10: Asking if i < 4
        // step 11: i = 2 - > Yes - > x*=2
        // step 12: sysout X = 2
        // step 10: i++
        // step 11: Asking if i < 4
        // step 12: i = 3 - > Yes - > x*=2
        // step 13: sysout X = 6
        // step 14: i++
        // step 15: Asking if i < 4
        // step 16: i = 4 - > No - > End Loop

        for (int i = 0; i < 4; i++) { // start looping when i < 4 , otherwise stop; Everytime loop , i will +1
            x *= 2;
        }

        // -----------------------------------------------------------------//

        // 0 - 100
        // i) 0 - 50, odd -> sum1
        // ii) 51 - 100, even -> another sum2
        // total -> sum1 * sum2

        int total = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0 && i < 50) {
                sum1 += i;
            } else if (i % 2 == 0 && i >= 51 && i <= 100) {
                sum2 += i;
            }

        }

        total = sum1 * sum2;
        System.out.println("The sum1 is : " + sum1);
        System.out.println("The sum2 is : " + sum2);
        System.out.println("And the final number is : " + total);

        // -----------------------------------------------------------------//

        // continue
        // sum up all odd number (0-100)

        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                continue; // 強制前往下一個loop，無視接下來的東西
            }
            sum += i;
        }

        System.out.println("The sum is : " + sum);

        // break
        // sum up all odd number (0 - 100)
        // i) sum <= 200
        // The loop should be ended at which number?

        int sum3 = 0;

        for (int i = 0; i < 300; i++) {

            if (i % 2 == 0 && sum3 <= 200) {
                continue;
            } 
            else if (i % 2 != 0 && sum3 <= 200) {
                sum3 += i;
            }       
            else {
                System.out.println("The sum3 will be: " + sum3);
                System.out.println("And the loop will be ended at:" + i);
                break;
            }

        }

// -----------------------------------------------------------------//

        String str = "abc def ghi";
        char target = 'f';
        int n = 0;

        for (n = 0; n < str.length(); n++) {

            if (str.charAt(n) != 'f')
            {
                continue;
            }
            else{
                System.out.println("Got it! I found the letter f! It is at the position " + (n + 1) + " of the whole sentence.");
            }


        }

    }
}
