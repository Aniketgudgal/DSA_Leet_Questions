# LeetCode Solutions

This repository collects my LeetCode solutions. Each problem is solved with clarity and efficiency in mind, and the repo is organized so you can browse solutions by problem number. The list below contains problems I have solved and uploaded here.

## Problem List

1. Two Sum
2. Add Two Numbers
3. Longest Substring Without Repeating Characters
4. Reverse Integer
5. Palindrome Number
6. Container With Most Water
7. Longest Common Prefix
8. Valid Parentheses
9. Merge k Sorted Lists
10. Remove Duplicates from Sorted Array
11. Remove Element
12. Find the Index of the First Occurrence in a String
13. Search in Rotated Sorted Array
14. Find First and Last Position of Element in Sorted Array
15. Search Insert Position
16. Rotate Image
17. Pow(x, n)
18. Maximum Subarray
19. Spiral Matrix
20. Plus One
21. Add Binary
22. Sqrt(x)
23. Climbing Stairs
24. Sort Colors
25. Subsets
26. Remove Duplicates from Sorted Array II
27. Remove Duplicates from Sorted List
28. Merge Sorted Array
29. Best Time to Buy and Sell Stock
30. Longest Consecutive Sequence
31. Linked List Cycle
32. Linked List Cycle II
33. Reorder List
34. Binary Tree Preorder Traversal
35. Binary Tree Postorder Traversal
36. Maximum Product Subarray
37. Find Minimum in Rotated Sorted Array
38. Intersection of Two Linked Lists
39. Find Peak Element
40. Two Sum II - Input Array Is Sorted
41. Majority Element
42. Factorial Trailing Zeroes
43. Rotate Array
44. Reverse Bits
45. Number of 1 Bits
46. Happy Number
47. Remove Linked List Elements
48. Count Primes
49. Isomorphic Strings
50. Group Anagrams
51. Reverse Linked List
52. Implement Trie (Prefix Tree)
53. Minimum Size Subarray Sum
54. Contains Duplicate
55. Power of Two
56. Palindrome Linked List
57. Delete Node in a Linked List
58. Product of Array Except Self
59. Valid Anagram
60. Add Digits
61. Missing Number
62. Move Zeroes
63. Find the Duplicate Number
64. Word Pattern
65. Longest Increasing Subsequence
66. Power of Three
67. Odd Even Linked List
68. Increasing Triplet Subsequence
69. Reverse String
70. Intersection of Two Arrays
71. Valid Perfect Square
72. Guess Number Higher or Lower
73. First Unique Character in a String
74. Fizz Buzz
75. Third Maximum Number
76. Find All Duplicates in an Array
77. Perfect Number
78. Fibonacci Number
79. Subarray Sum Equals K
80. Can Place Flowers
81. Maximum Product of Three Numbers
82. Maximum Average Subarray I
83. Set Mismatch
84. Robot Return to Origin
85. Valid Palindrome II
86. Binary Search
87. Design Linked List
88. Subarray Product Less Than K
89. Find Pivot Index
90. Find Smallest Letter Greater Than Target
91. Min Cost Climbing Stairs
92. Rotate String
93. Peak Index in a Mountain Array
94. Transpose Matrix
95. Walking Robot Simulation
96. Koko Eating Bananas
97. Sort Array By Parity
98. Max Consecutive Ones III
99. Minimum Absolute Difference
100. Unique Number of Occurrences
101. Count Negative Numbers in a Sorted Matrix
102. Number of Substrings Containing All Three Characters
103. Maximum Points You Can Obtain from Cards
104. Kids With the Greatest Number of Candies
105. Maximum Number of Vowels in a Substring of Given Length
106. Running Sum of 1d Array
107. Partitioning Into Minimum Number Of Deci-Binary Numbers
108. Check if Array Is Sorted and Rotated
109. Find the Highest Altitude
110. Determine Whether Matrix Can Be Obtained By Rotation
111. Walking Robot Simulation II
112. Delete the Middle Node of a Linked List
113. Number of Smooth Descent Periods of a Stock
114. Find the Difference of Two Arrays
115. Equal Row and Column Pairs
116. Maximum Count of Positive Integer and Negative Integer
117. Left and Right Sum Differences
118. Robot Collisions
119. Check if Strings Can be Made Equal With Operations I
120. Check if Strings Can be Made Equal With Operations II
121. Minimum Operations to Exceed Threshold Value I
122. Harshad Number
123. Delete Nodes From Linked List Present in Array
124. Maximum Amount of Money Robot Can Earn
125. Lexicographically Smallest Generated String
126. Minimum Operations to Make Array Sum Divisible by K
127. XOR After Range Multiplication Queries I
128. GCD of Odd and Even Sums
129. XOR After Range Multiplication Queries II
130. Minimum Distance Between Three Equal Elements I
131. Minimum Distance Between Three Equal Elements II
132. Minimum Distance to Type a Word Using Two Fingers
133. Minimum Distance to the Target Element
134. Shortest Distance to Target String in a Circular Array
135. Mirror Distance of an Integer
136. Two Furthest Houses With Different Colors
137. Minimize Hamming Distance After Swap Operations
138. Sum of Distances

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
