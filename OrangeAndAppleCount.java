/*
  Problem: https://www.hackerrank.com/challenges/apple-and-orange
  Coded in Java
  Thoughts :
  1. Let house start and end positions be hs and he resrpectively.
  2. Let apple and orange tree positions be ta and to respectively.
  3. Let there be m apples and n oranges which fall from respective trees.
  4. Let the count of apples and oranges falling on the house be ca and co respectively. Set ca and co to 0.
  5. Start iterating the falling positions of m apples in a loop:
     5.1 Let the falling position of current apple be fa.
     5.2 Let effective falling position of current apple on x-axis be ea. Set ea = ta + fa.
     5.3 if ea is lying between hs and he (both inclusive) then increment ca by 1.
     5.4 Repeat steps 5.1 through 5.3 untill all apples have been iterated.
  6. Start iterating the falling positions of n oranges in a loop:
     6.1 Let the falling position of current orange be fo.
     6.2 Let effective falling position of current orange on x-axis be eo. Set eo = to + fo.
     6.3 if eo is lying between hs and he (both inclusive) then increment co by 1.
     6.4 Repeat steps 6.1 through 6.3 untill all oranges have been iterated.
  7. Print ca on new line.
  8. Print co on new line.
  Time Complexity:  O(m+n) //there are two separate loops which run m and n times. Since the values of m and n are independent
                     of each other so time complexity becomes order O(m+n)
  Space Complexity: O(n) //In C# you have to read in the entire console line at a time(size n), because it does not have a way to iteratively read in space delimited input
 */

static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if((a + apples[i]) >= s && (a + apples[i]) <= t) {
                appleCount++;
            }
        }
        
        int orangeCount = 0;
        for (int i = 0; i < oranges.length; i++) {
            if((b + oranges[i]) >= s && (b + oranges[i]) <= t) {
                orangeCount++;
            }
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
