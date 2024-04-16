import java.util.*;

public class Lab6 {

    Map<Integer, List<Integer>> prereqMap = new HashMap<>();
    Set<Integer> visit = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            prereqMap.put(i, new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            prereqMap.get(course).add(prereq);
        }
        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int course) {
        if (visit.contains(course)) {
            return false;
        }
        if (prereqMap.get(course).isEmpty()) {
            return true;
        }

        visit.add(course);
        for (int prereq : prereqMap.get(course)) {
            if (!dfs(prereq)) {
                return false;
            }
        }
        visit.remove(course);
        prereqMap.get(course).clear();
        return true;
    }
}

