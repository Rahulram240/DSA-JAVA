# HashMap Data Structures & Algorithms

This folder contains Java implementations of classic HashMap-based problems and algorithms from Data Structures and Algorithms (DSA).

## 📂 Contents

### 1. **ContainsDuplicate.java**
Detects whether an array contains duplicate elements using a HashSet.

**Problem:** Given an array of integers, determine if there are any duplicate values.

**Approach:**
- Uses a `HashSet` to track seen elements
- Iterates through the array once
- Returns `true` if a duplicate is found, `false` otherwise

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Key Concepts:**
- HashSet for O(1) lookup
- Early termination on finding duplicates

---

### 2. **twoSum.java**
Finds two numbers in an array that add up to a target sum.

**Problem:** Given an array of integers and a target sum, find the indices of two numbers that add up to the target.

**Approach:**
- Uses a `HashMap` to store elements and their indices
- For each element, calculates the complement (target - current element)
- Checks if the complement exists in the map
- Returns indices of the pair if found

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Key Concepts:**
- HashMap for efficient lookup
- Two-pointer logic using complements
- Single pass solution

---

## 🚀 How to Run

Compile and run each Java file:

```bash
# For ContainsDuplicate
javac ContainsDuplicate.java
java ContainsDuplicate

# For twoSum
javac twoSum.java
java twoSum
```

Both programs generate random test cases, so output will vary with each run.

---

## 📊 Sample Output

**ContainsDuplicate:**
```
The N is => 5
The Array is => 3 7 2 3 5 
The Result => true
```

**twoSum:**
```
Target: 6
Array: 
4 2 9 1 5
Result: 0 1
```

---

## 💡 Learning Objectives

- Understand HashMap/HashSet data structures
- Learn hash-based problem-solving techniques
- Practice efficient algorithm design with O(n) solutions
- Develop skills for common coding interview problems

---

## 📝 Notes

- Both implementations use randomized test data
- Focus on time efficiency over space
- Great examples of practical HashMap usage in real-world problems

---

**Created:** March 17, 2026  
**Repository:** [Rahulram240/DSA-JAVA](https://github.com/Rahulram240/DSA-JAVA)
