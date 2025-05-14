class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)

        while (left <= right):
            mid = (left + right) // 2

            totalHrs = 0
            for pile in piles:
                totalHrs += (pile + mid - 1) // mid
    
            if totalHrs > h:
                left = mid + 1
            else:
                right = mid -1

        return left