import heapq

class KthLargest:
    def __init__(self, k: int, nums: List[int]):
        # Initialize instance variables
        self.minHeap, self.k = nums, k
        
        # Convert the list into a min-heap
        heapq.heapify(self.minHeap)
        
        # Trim the heap to contain only the k largest elements
        while len(self.minHeap) > k:
            heapq.heappop(self.minHeap)
    
    def add(self, val: int) -> int:
        # Add the new value to the min-heap
        heapq.heappush(self.minHeap, val)
        
        # If heap size exceeds k, remove the smallest element
        if len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)
        
        # Return the current kth largest element
        return self.minHeap[0]

        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)