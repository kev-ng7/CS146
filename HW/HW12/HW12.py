
def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
    parent = [i for i in range(n + 1)]
    rank = [0] * (n+1)

    def find(x):
        if x != parent[x]:
            parent[x]= find(parent[x])
        return parent[x]
    
    def union(x,y):
        rootX = find(x)
        rootY = find(y)

        if rootX == rootY:
            return False
        
        if rank[rootX] > rank[rootY]:
            parent[rootY] = rootX
        elif rank[rootY] > rank[rootX]:
            parent[rootX] = rootY
        else:
            parent[rootX] = rootY
            rank[rootY] += 1
        return True
