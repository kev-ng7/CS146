from typing import List

def minMeetingRooms(self, intervals: List[List[int]]) -> int:
    start = [interval[0] for interval in intervals]
    end = [interval[1] for interval in intervals]

    start.sort()
    end.sort()

    minNumofServers = 0
    count = 0
    i = 0
    j = 0

    while i < len(intervals):
        if start[i] < end[j]:
            count += 1
            i += 1
        else:
            count -= 1
            j += 1
        minNumofServers = max(minNumofServers, count)

    return minNumofServers
 