// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         int[] ans = new int[k];

//         for (int i = 0; i < k; i++) {

//             int maxFreq = 0;
//             int maxKey = 0;

//             for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

//                 if (entry.getValue() > maxFreq) {
//                     maxFreq = entry.getValue();
//                     maxKey = entry.getKey();
//                 }
//             }

//             ans[i] = maxKey;
//             map.remove(maxKey);
//         }

//         return ans;
//     }
// }
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency Map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create Buckets
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Step 3: Put numbers into their frequency bucket
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Step 4: Collect Top K Elements
        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    ans[index] = num;
                    index++;

                    if (index == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}