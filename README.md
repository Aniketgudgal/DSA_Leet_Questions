# LeetCode Solutions

This repository collects my LeetCode solutions. Each problem is solved with clarity and efficiency in mind, and the repo is organized so you can browse solutions by problem number. The list below contains problems I have solved and uploaded here.

## Problem List

1. Two Sum
2. Add Two Numbers
3. Longest Substring Without Repeating Characters
4. Reverse Integer
5. Palindrome Number
6. Longest Palindromic Substring
7. Container With Most Water
8. Longest Common Prefix
9. Valid Parentheses
10. Merge k Sorted Lists
11. Remove Duplicates from Sorted Array
12. Remove Element
13. Find the Index of the First Occurrence in a String
14. Search in Rotated Sorted Array
15. Find First and Last Position of Element in Sorted Array
16. Search Insert Position
17. Rotate Image
18. Pow(x, n)
19. Maximum Subarray
20. Spiral Matrix
21. Plus One
22. Add Binary
23. Sqrt(x)
24. Climbing Stairs
25. Sort Colors
26. Subsets
27. Remove Duplicates from Sorted Array II
28. Remove Duplicates from Sorted List
29. Merge Sorted Array
30. Rotate List
31. Best Time to Buy and Sell Stock
32. Longest Consecutive Sequence
33. Linked List Cycle
34. Linked List Cycle II
35. Reorder List
36. Binary Tree Preorder Traversal
37. Binary Tree Postorder Traversal
38. Maximum Product Subarray
39. Find Minimum in Rotated Sorted Array
40. Intersection of Two Linked Lists
41. Find Peak Element
42. Two Sum II - Input Array Is Sorted
43. Majority Element
44. Factorial Trailing Zeroes
45. Rotate Array
46. Reverse Bits
47. Number of 1 Bits
48. Happy Number
49. Remove Linked List Elements
50. Count Primes
51. Isomorphic Strings
52. Group Anagrams
53. Reverse Linked List
54. Implement Trie (Prefix Tree)
55. Minimum Size Subarray Sum
56. Contains Duplicate
57. Power of Two
58. Palindrome Linked List
59. Delete Node in a Linked List
60. Length of Last Word
61. Product of Array Except Self
62. Valid Anagram
63. Add Digits
64. Missing Number
65. Move Zeroes
66. Find the Duplicate Number
67. Word Pattern
68. Longest Increasing Subsequence
69. Power of Three
70. Odd Even Linked List
71. Increasing Triplet Subsequence
72. Reverse String
73. Intersection of Two Arrays
74. Valid Perfect Square
75. Guess Number Higher or Lower
76. First Unique Character in a String
77. Fizz Buzz
78. Third Maximum Number
79. Find All Duplicates in an Array
80. Perfect Number
81. Fibonacci Number
82. Subarray Sum Equals K
83. Can Place Flowers
84. Maximum Product of Three Numbers
85. Maximum Average Subarray I
86. Set Mismatch
87. Robot Return to Origin
88. Valid Palindrome II
89. Binary Search
90. Design Linked List
91. Subarray Product Less Than K
92. Find Pivot Index
93. Find Smallest Letter Greater Than Target
94. Min Cost Climbing Stairs
95. Binary Tree Inorder Traversal
96. Rotate String
97. Peak Index in a Mountain Array
98. Transpose Matrix
99. Walking Robot Simulation
100. Koko Eating Bananas
101. Sort Array By Parity
102. Longest Palindrome
103. Max Consecutive Ones III
104. Minimum Absolute Difference
105. Unique Number of Occurrences
106. Count Negative Numbers in a Sorted Matrix
107. Number of Substrings Containing All Three Characters
108. Maximum Points You Can Obtain from Cards
109. Kids With the Greatest Number of Candies
110. Maximum Number of Vowels in a Substring of Given Length
111. Running Sum of 1d Array
112. Partitioning Into Minimum Number Of Deci-Binary Numbers
113. Check if Array Is Sorted and Rotated
114. Find the Highest Altitude
115. Determine Whether Matrix Can Be Obtained By Rotation
116. Walking Robot Simulation II
117. Delete the Middle Node of a Linked List
118. Number of Smooth Descent Periods of a Stock
119. Find the Difference of Two Arrays
120. Equal Row and Column Pairs
121. Maximum Count of Positive Integer and Negative Integer
122. Left and Right Sum Differences
123. Robot Collisions
124. Check if Strings Can be Made Equal With Operations I
125. Check if Strings Can be Made Equal With Operations II
126. Minimum Operations to Exceed Threshold Value I
127. Harshad Number
128. Delete Nodes From Linked List Present in Array
129. Maximum Amount of Money Robot Can Earn
130. Lexicographically Smallest Generated String
131. Minimum Operations to Make Array Sum Divisible by K
132. XOR After Range Multiplication Queries I
133. GCD of Odd and Even Sums
134. XOR After Range Multiplication Queries II
135. Minimum Distance Between Three Equal Elements I
136. Minimum Distance Between Three Equal Elements II
137. Minimum Distance to Type a Word Using Two Fingers
138. Minimum Distance to the Target Element
139. Shortest Distance to Target String in a Circular Array
140. Mirror Distance of an Integer
141. Two Furthest Houses With Different Colors
142. Minimize Hamming Distance After Swap Operations
143. Sum of Distances
144. Furthest Point From Origin
145. Rotated Digits
146. Merge Two Sorted Lists

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
