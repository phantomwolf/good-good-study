# 82. Remove Duplicates from Sorted List II
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:

![example1](linkedlist1.jpg)

Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:

![example1](linkedlist2.jpg)

Input: head = [1,1,1,2,3]
Output: [2,3]

Constraints:

    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.

## Solution
Write 2 nested loops. If a duplicate is detected, in the inner loop, keep removing nodes that have the same value.