# 870. Advantage Shuffle

You are given two integer arrays nums1 and nums2 both of the same length. The advantage of nums1 with respect to nums2 is the number of indices i for which nums1[i] > nums2[i].

Return any permutation of nums1 that maximizes its advantage with respect to nums2.

## Example 1

```
Input: nums1 = [2,7,11,15], nums2 = [1,10,4,11]
Output: [2,11,7,15]
```

## Example 2

```
Input: nums1 = [12,17,8,32], nums2 = [18,25,32,11]
Output: [32,8,17,12]
```

## Constraints:

* 1 <= nums1.length <= 105
* nums2.length == nums1.length
* 0 <= nums1[i], nums2[i] <= 109

# Solution

˼·����nums1���ҳ��ܴ��nums2��Ԫ�ص����֣������ߴ���Map�����nums1��ĳԪ�ز��ܴ���κ�nums2�е�Ԫ�أ��ͽ�����Ϊ���ӣ�������ԡ�

�Ե�2������Ϊ����׼��һ��Map�����nums1��nums2��mapping����һ��Queue(ListҲ��)������޷��������������ӡ�

��nums1��nums2������i��j�ֱ��ʾ���ߵ��±꣬�Ƚ�nums1[i]��nums2[j]:

```
i = 0, j = 0
nums1: [ 8, 12, 17, 32]
nums2: [11, 18, 25, 32]
```

��֪nums1[0] < nums2[0]����Ϊnums2����������ģ����nums1[0]�����ܴ���nums2�е��κ�Ԫ�أ�nums1[0]ֻ��һö���ӡ����ǽ�nums1[0]����һ��Queue������iǰ��:

```
i = 1, j = 0
nums1: [ 8, 12, 17, 32]
nums2: [11, 18, 25, 32]
```

��֪nums1[1] > nums2[0]����������ԣ�����Map�У��������Ϊnums1[1]�����������nums2[0]����i��jͬʱǰ��һλ��

```
i = 2, j = 1
nums1: [ 8, 12, 17, 32]
nums2: [11, 18, 25, 32]
```

��֪nums1[2] < nums2[1]������nums1��nums2�����򣬿�֪nums1[2]�Ѿ������ܴ���nums2�е��κ�ʣ��Ԫ���ˣ�nums2[0]�Ѿ�����һ���õ��ˣ������nums1[2]�����ӣ�������С�

��iǰ��һλ���õ�nums1[3] > nums2[1]������Map���������ǵõ�12 > 11��32 > 18������ϣ���������nums[i] > nums[j]��nums1�е�����Ԫ�ض������ӣ�����������������nums2�е�ÿ��Ԫ�أ����Ƕ���Map��Ѱ�Ҷ�Ӧ���ܴ������Ԫ�ء�����Ҳ������ʹ�Queue��ȡ��һö���ӣ����Ԫ����ԡ�
