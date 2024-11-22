class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1 = new int[m];

        for(int i = 0; i < m; i++){
            arr1[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(arr1[i] <= nums2[j]) {
                nums1[k] = arr1[i];
                i++;
                k++;
            } else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m) {
            nums1[k] = arr1[i];
            i++;
            k++;

        }
        

        while(j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }



    }
}