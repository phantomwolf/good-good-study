#include <vector>

using namespace std;

class Solution {
 public:
  bool arrayContains(vector<int>& arr, int num) {
    for (int i = 0; i < arr.size(); i++) {
      if (arr[i] == num) {
        return true;
      }
    }
    return false;
  }

  int longestConsecutive(vector<int>& nums) {
    int longestStreak = 0;
    for (int num : nums) {
      int currentNum = num;
      int currentStreak = 1;
      while (arrayContains(nums, currentNum + 1)) {
        currentNum += 1;
        currentStreak += 1;
      }
      longestStreak = max(longestStreak, currentStreak);
    }
    return longestStreak;
  }
};