class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start = mid = 0
        last = len(nums)-1
        while mid<=last:
            if nums[mid] == 0:
                nums[mid],nums[start] = nums[start],nums[mid]
                mid+=1
                start+=1
            elif nums[mid] == 2:
                nums[mid],nums[last] = nums[last],nums[mid]
                last-=1
            elif nums[mid] == 1:
                mid+=1
        return nums
