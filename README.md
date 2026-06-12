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
58. Length of Last Word
59. Product of Array Except Self
60. Valid Anagram
61. Add Digits
62. Missing Number
63. Move Zeroes
64. Find the Duplicate Number
65. Word Pattern
66. Longest Increasing Subsequence
67. Power of Three
68. Odd Even Linked List
69. Increasing Triplet Subsequence
70. Reverse String
71. Intersection of Two Arrays
72. Valid Perfect Square
73. Guess Number Higher or Lower
74. First Unique Character in a String
75. Fizz Buzz
76. Third Maximum Number
77. Find All Duplicates in an Array
78. Perfect Number
79. Fibonacci Number
80. Subarray Sum Equals K
81. Can Place Flowers
82. Maximum Product of Three Numbers
83. Maximum Average Subarray I
84. Set Mismatch
85. Robot Return to Origin
86. Valid Palindrome II
87. Binary Search
88. Design Linked List
89. Subarray Product Less Than K
90. Find Pivot Index
91. Find Smallest Letter Greater Than Target
92. Min Cost Climbing Stairs
93. Binary Tree Inorder Traversal
94. Rotate String
95. Peak Index in a Mountain Array
96. Transpose Matrix
97. Walking Robot Simulation
98. Koko Eating Bananas
99. Sort Array By Parity
100. Max Consecutive Ones III
101. Minimum Absolute Difference
102. Unique Number of Occurrences
103. Count Negative Numbers in a Sorted Matrix
104. Number of Substrings Containing All Three Characters
105. Maximum Points You Can Obtain from Cards
106. Kids With the Greatest Number of Candies
107. Maximum Number of Vowels in a Substring of Given Length
108. Running Sum of 1d Array
109. Partitioning Into Minimum Number Of Deci-Binary Numbers
110. Check if Array Is Sorted and Rotated
111. Find the Highest Altitude
112. Determine Whether Matrix Can Be Obtained By Rotation
113. Walking Robot Simulation II
114. Delete the Middle Node of a Linked List
115. Number of Smooth Descent Periods of a Stock
116. Find the Difference of Two Arrays
117. Equal Row and Column Pairs
118. Maximum Count of Positive Integer and Negative Integer
119. Left and Right Sum Differences
120. Robot Collisions
121. Check if Strings Can be Made Equal With Operations I
122. Check if Strings Can be Made Equal With Operations II
123. Minimum Operations to Exceed Threshold Value I
124. Harshad Number
125. Delete Nodes From Linked List Present in Array
126. Maximum Amount of Money Robot Can Earn
127. Lexicographically Smallest Generated String
128. Minimum Operations to Make Array Sum Divisible by K
129. XOR After Range Multiplication Queries I
130. GCD of Odd and Even Sums
131. XOR After Range Multiplication Queries II
132. Minimum Distance Between Three Equal Elements I
133. Minimum Distance Between Three Equal Elements II
134. Minimum Distance to Type a Word Using Two Fingers
135. Minimum Distance to the Target Element
136. Shortest Distance to Target String in a Circular Array
137. Mirror Distance of an Integer
138. Two Furthest Houses With Different Colors
139. Minimize Hamming Distance After Swap Operations
140. Sum of Distances
141. Furthest Point From Origin
142. Rotated Digits
143. Merge Two Sorted Lists

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
