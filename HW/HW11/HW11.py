def floodFill(self, image, sr, sc, color):
    if (image[sr][sc] == color):
        return image
    
    self.filler(image, sr, sc, image[sr][sc], color)
    return image

def filler(self, image, m, n, oldColor, color):
    if (m >= len(image) or n >= len(image[0]) or m < 0 or n < 0 or n > 50 or image[m][n] != color):
        return
    
    image[m][n] = color
    self.filler(image, m - 1, n, oldColor, color)
    self.filler(image, m + 1, n, oldColor, color)
    self.filler(image, m, n - 1, oldColor, color)
    self.filler(image, m, n + 1, oldColor, color)
    
    