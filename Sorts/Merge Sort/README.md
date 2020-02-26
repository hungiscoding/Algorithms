# Merge Sort:
+ Divide a list into two halves
+ Sort each half
+ Merge the two half

Key ideas: 
+ Smallest list has one item and is already sorted
+ Recursion

Practical implementations: 
+ If #items < CUTOFF -> Use Insertion sort
+ If the last element of the first half is smaller than the first element of the second half -> sorted (no need to merge)
+ Remove auxiliary array (save time not space)
