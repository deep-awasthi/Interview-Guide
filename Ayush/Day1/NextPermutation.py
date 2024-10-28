class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        last = -1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                last=i
                break
        if last == -1:
            nums[:] = nums[::-1]
        else:
            for i in range(len(nums)-1, -1, -1):
                if(nums[i]>nums[last]):
                    first = i
                    break
            nums[first],nums[last] = nums[last],nums[first]
            if last<len(nums)-1:
                nums[:] = nums[:last+1]+nums[last+1:][::-1]
        print(nums)
