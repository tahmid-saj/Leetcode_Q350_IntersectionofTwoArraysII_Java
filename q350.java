class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // LinkedList<Integer> list2 = new LinkedList<Integer>();
        // for (int i : nums2) {
        //     list2.add(i);
        // }

        // List<Integer> inter = new ArrayList<Integer>();
        // for (int i : nums1) {
        //     if (list2.contains(i)) {
        //         inter.add(i);
        //         list2.removeFirstOccurrence(i);
        //     }
        // }

        // int[] interArr = new int[inter.size()];
        // for (int i = 0; i < inter.size(); i++) {
        //     interArr[i] = inter.get(i);
        // }

        // return interArr;

        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        
        return Arrays.copyOfRange(nums1,0,k);
    }
}
