class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        final = [0, 0]
        map = {}

        for i in range(len(nums)):
            if (target - nums[i]) in map.keys():
                final[0] = i
                final[1] = map.get(target - nums[i])

            else:
                map[nums[i]] = i

        return final