import queue

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
    result = []
    if (root == None):
        return result
    
    q = queue.Queue()
    q.put(root)

    while not q.empty():
        currentLevel = []
        currentLevelSize = q.qsize()
        for i in range (currentLevelSize):
            node = q.get()
            currentLevel.append(node.val)
            if (node.left != None):
                q.put(node.left)
            if (node.right != None):
                q.put(node.right)
        result.append(currentLevel)
    return result
