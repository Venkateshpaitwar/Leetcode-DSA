//367. Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 1, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

// Another method to solve it 
// class Solution {
//     public boolean isPerfectSquare(int num) {
//         int odd = 1;
//         while (num > 0) {
//             num -= odd;
//             odd += 2;
//         }
//         return num == 0;
//     }
// }
