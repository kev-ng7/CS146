class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def isValidBST(self, root):
    return validateBST(root, None, None)


def validateBST(root, lower, upper):
    if not root:
        return True
    if not (lower != None and root.val <= lower or upper != None and root.val >= upper):
        return False
    
    return validateBST(root.left, lower, root.val) and validateBST(root.right, root.val,)
