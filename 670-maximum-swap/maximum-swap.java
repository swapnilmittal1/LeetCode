class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++){
            for(char j = '9'; j > arr[i]; j--) {
                if(map.containsKey(j) && map.get(j) > i ){
                    char temp = arr[map.get(j)];
                    arr[map.get(j)] = arr[i];
                    arr[i] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
            return num;

        }




    }
