# 652. Find Duplicate Subtrees

https://leetcode.com/problems/find-duplicate-subtrees/

Given the root of a binary tree, return all duplicate subtrees.

For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with the same node values.

## Example 1

```
Input: root = [1,2,3,4,null,2,4,null,null,4]
Output: [[2,4],[4]]
```

## Example 2

```
Input: root = [2,1,1]
Output: [[1]]
```

## Example 3

```
Input: root = [2,2,2,3,null,3,null]
Output: [[2,3],[3]]
```

## Solution 1

Postorder traverse the tree, serialize each subtree into a string and record them in a map. The next time we see the same key, we've found a duplicate.
