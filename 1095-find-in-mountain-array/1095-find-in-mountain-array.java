/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

         int peak = findPeak(mountainArr, 0, n - 1);


        int leftResult = binarySearchAscending(mountainArr, 0, peak, target);
        if (leftResult != -1) {
            return leftResult;
        }

        
        return binarySearchDescending(mountainArr, peak + 1, n - 1, target);
    }

    private int findPeak(MountainArray mountainArr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;   
            }
        }
        return low;
    }

    private int binarySearchAscending(MountainArray mountainArr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mountainArr.get(mid);

            if (val == target) {
                return mid;
            } else if (val < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchDescending(MountainArray mountainArr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mountainArr.get(mid);

            if (val == target) {
                return mid;
            } else if (val > target) { 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}