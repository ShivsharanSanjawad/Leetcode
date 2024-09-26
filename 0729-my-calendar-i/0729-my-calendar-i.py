from sortedcontainers import SortedList
class MyCalendar:

    def __init__(self):
        self.s1 = SortedList() 

    def book(self, start: int, end: int) -> bool:
        if(len(self.s1)==0):
            self.s1.add([start,end]) 
            return True 
        for x in self.s1 : 
            if(x[1]>start and x[0]<end):
                return False 
        self.s1.add([start,end])
        return True 


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)