class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        Hset = set()

        for i in nums:
            if i in Hset:
                return True
            else:
                Hset.add(i)

        return False