def canFinish(numCourses, prerequisites):
    prereqMap = { i:[] for i in range(numCourses)}
    for course, prereq in prerequisites:
        prereqMap[course].append(prereq)

    visit = set()
    def dfs(course):
        if course in visit:
            return False
        if prereqMap[course] == []:
            return True
        
        visit.add(course)
        for prereq in prereqMap[course]:
            if not dfs(prereq):
                return False
        visit.remove(course)
        prereqMap[course] = []
        return True
    for course in range(numCourses):
        if not dfs(course):
            return False
        return True
        

