# LeetCode Solutions

This repository collects my LeetCode solutions. Each problem is solved with clarity and efficiency in mind, and the repo is organized so you can browse solutions by problem number. The list below contains problems I have solved and uploaded here.

## Problem List

1. Two Sum
2. Add Two Numbers
3. Longest Substring Without Repeating Characters
7. Reverse Integer
9. Palindrome Number
11. Container With Most Water
14. Longest Common Prefix
20. Valid Parentheses
23. Merge k Sorted Lists
26. Remove Duplicates from Sorted Array
27. Remove Element
33. Search in Rotated Sorted Array
34. Find First and Last Position of Element in Sorted Array
35. Search Insert Position
48. Rotate Image
50. Pow(x, n)
53. Maximum Subarray
54. Spiral Matrix
66. Plus One
67. Add Binary
69. Sqrt(x)
75. Sort Colors
78. Subsets
80. Remove Duplicates from Sorted Array II
83. Remove Duplicates from Sorted List
88. Merge Sorted Array
121. Best Time to Buy and Sell Stock
128. Longest Consecutive Sequence
141. Linked List Cycle
142. Linked List Cycle II
143. Reorder List
144. Binary Tree Preorder Traversal
145. Binary Tree Postorder Traversal
152. Maximum Product Subarray
153. Find Minimum in Rotated Sorted Array
160. Intersection of Two Linked Lists
162. Find Peak Element
167. Two Sum II - Input Array Is Sorted
169. Majority Element
189. Rotate Array
190. Reverse Bits
191. Number of 1 Bits
202. Happy Number
203. Remove Linked List Elements
204. Count Primes
205. Isomorphic Strings
208. Implement Trie (Prefix Tree)
209. Minimum Size Subarray Sum
217. Contains Duplicate
231. Power of Two
234. Palindrome Linked List
237. Delete Node in a Linked List
238. Product of Array Except Self
242. Valid Anagram
258. Add Digits
268. Missing Number
283. Move Zeroes
287. Find the Duplicate Number
300. Longest Increasing Subsequence
326. Power of Three
344. Reverse String
349. Intersection of Two Arrays
367. Valid Perfect Square
374. Guess Number Higher or Lower
387. First Unique Character in a String
412. Fizz Buzz
414. Third Maximum Number
442. Find All Duplicates in an Array
507. Perfect Number
509. Fibonacci Number
560. Subarray Sum Equals K
628. Maximum Product of Three Numbers
643. Maximum Average Subarray I
645. Set Mismatch
704. Binary Search
707. Design Linked List
713. Subarray Product Less Than K
744. Find Smallest Letter Greater Than Target
852. Peak Index in a Mountain Array
867. Transpose Matrix
1200. Minimum Absolute Difference
1351. Count Negative Numbers in a Sorted Matrix
1358. Number of Substrings Containing All Three Characters
1423. Maximum Points You Can Obtain from Cards
2110. Number of Smooth Descent Periods of a Stock
2529. Maximum Count of Positive Integer and Negative Integer
3065. Minimum Operations to Exceed Threshold Value I
3099. Harshad Number
3217. Delete Nodes From Linked List Present in Array
3512. Minimum Operations to Make Array Sum Divisible by K
3658. GCD of Odd and Even Sums
1480. Running Sum of 1d Array

## Repository Documentation

### Overview

This repo is a personal collection of problem solutions from LeetCode. Problems are individually implemented and aim to illustrate clear approaches, typical patterns, and optimized implementations where appropriate. Use the problem list above to find a specific problem and open its corresponding file to inspect the solution.

### Topics & Techniques Covered (detailed)

Below are the major algorithmic topics and key points covered across the problems in this repository. For each topic, I include concise explanations and representative problems from this repo.

- **Arrays & Hashing:**
	- Key ideas: indexing, in-place updates, frequency maps, element-to-index mappings.
	- Use cases: counting, deduplication, lookup in O(1).
	- Representative problems: `Two Sum` (1), `Contains Duplicate` (217), `Intersection of Two Arrays` (349), `Move Zeroes` (283), `Missing Number` (268), `Find All Duplicates in an Array` (442).

- **Two Pointers:**
	- Key ideas: left/right pointers, in-place swaps, shrinking/expanding windows for sorted arrays or paired operations.
	- Representative problems: `Container With Most Water` (11), `Two Sum II` (167), `Remove Duplicates from Sorted Array` (26), `Remove Element` (27), `Sort Colors` (75).

- **Sliding Window:**
	- Key ideas: variable-size window, maintain running aggregates, optimize subarray problems to O(n).
	- Representative problems: `Minimum Size Subarray Sum` (209), `Subarray Product Less Than K` (713), `Maximum Average Subarray I` (643).

- **Prefix Sum & Hashing:**
	- Key ideas: prefix sums to transform range-sum queries into constant-time checks; use hashmaps to store seen sums/indices.
	- Representative problems: `Subarray Sum Equals K` (560), `Product of Array Except Self` (238) (prefix-like transforms), `Missing Number` (268).

- **Sorting & Partitioning:**
	- Key ideas: sort + two-pointer, partition (Dutch National Flag), selection for k-th largest, use sorting to simplify logic.
	- Representative problems: `Sort Colors` (75), `Maximum Product of Three Numbers` (628), `Merge Sorted Array` (88).

- **Binary Search & Variants:**
	- Key ideas: search on index/answer, handle edge cases (duplicates, rotated arrays), use while-loops with mid computation.
	- Representative problems: `Sqrt(x)` (69), `Find Minimum in Rotated Sorted Array` (153), `Search in Rotated Sorted Array` (33), `Binary Search` (704).

- **Dynamic Programming (DP):**
	- Key ideas: define state, recurrence, optimize space when possible, handle base cases.
	- Representative problems: `Maximum Subarray` (53) (Kadane — 1D DP), `Maximum Product Subarray` (152), `Longest Increasing Subsequence` (300), `Fibonacci Number` (509).

- **Greedy:**
	- Key ideas: local optimal choices lead to global optimum, sorting + greedy selection.
	- Representative problems: `Best Time to Buy and Sell Stock` (121) (single pass greedy), `Maximum Product of Three Numbers` (628).

- **Bit Manipulation & Math:**
	- Key ideas: bit ops for flags/counting bits, arithmetic tricks, modular considerations.
	- Representative problems: `Reverse Bits` (190), `Number of 1 Bits` (191), `Power of Two` (231), `Add Digits` (258), `Pow(x, n)` (50).

- **Linked List Techniques:**
	- Key ideas: slow/fast pointers, cycle detection, two-pointer removal, list merging.
	- Representative problems: `Linked List Cycle` (141), `Linked List Cycle II` (142), `Palindrome Linked List` (234), `Merge k Sorted Lists` (23).

- **Recursion, Tree Traversal & DFS:**
	- Key ideas: recursion for traversal, stack-based iterative alternatives, preorder/inorder/postorder patterns.
	- Representative problems: `Binary Tree Preorder Traversal` (144).

- **Number Theory & Primes:**
	- Key ideas: sieve, primality checks, factorization where relevant.
	- Representative problems: `Count Primes` (204), `Perfect Number` (507), `Valid Perfect Square` (367).

- **Windowed and Monotonic Methods:**
	- Key ideas: monotonic queues/stacks for range maxima/minima and optimized sliding-window variants.
	- Representative problems: `Peak Index in a Mountain Array` (852), `Number of Smooth Descent Periods of a Stock` (2110) (pattern counting).

Each solution typically includes a short explanation in the file header and attempts to show the pattern used so the approach is reusable across similar problems.

### File structure

- Root: problem files (named by problem or number). See the problem list above.
- `README.md`: this documentation.

### How to run / Inspect solutions

- Clone the repo:

```bash
git clone https://github.com/Aniketgudgal/DSA_Leet_Questions.git
cd DSA_Leet_Questions
```
- Open the solution file for a problem (files are organized per problem). Each file contains a solution and usually a small test or example usage in comments.
- Run the file using the language runtime your solution is implemented in (Python, Java, C++, etc.). Example for Python:

```bash
python path/to/problem_solution.py
```

If you want, I can standardize runners or add a small test harness — tell me which language you'd like prioritized.

### Contribution Guidelines

- Add solutions in a clear file-naming format (e.g., `001_two_sum.py` or `1_two_sum.cpp`).
- Include a brief explanation at the top of each solution file describing the approach and complexity.
- Add tests or example usage for your solution where possible.

### Contact

For questions or suggestions, contact: aniketgudgal5867@gmail.com

---

Thank you for exploring these solutions — keep practicing and refining patterns!