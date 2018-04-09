# Unit7-Sorting

## Table of Contents

* [Good work pledge](#good-work-pledge)
* [Getting started](#getting-started)
* [Project overview](#project-overview)
* [SelectionSort](#selectionsort)
* [Linear Search](#linear-search)
* [Binary Search](#binary-search)
* [Merge Sort](#binary-search)

## Good work pledge

We are here to broaden your exposure to Computer Science. We can only achieve that purpose when you work
hard and honestly. It may be tempting to copy-paste code from a classmate, or let a classmate do all
your work for you don't! You will be cheating yourself from the most valuable thing course has to offer:
overcoming challenges.

We know that hard, and honest work doesn't come easily. If you feel like you are falling behind

  1. Don't copy-paste code, or let someone do your work for you
  2. Ask for help!
  3. Tell the teaching team you need more time

## Getting started

  1. Go to the provided assignment link, and click accept. It should take you to your project page.
     (If it doesn't, click on the link above again, and click on the link to the project page).
  2. On the GitHub project page, click on the green "Clone or Download" button and copy the link.
  3. Open IntelliJ, click on the "Checkout from Version Control" drop down and select "GitHub"
  4. On the next page paste the link you copied into the "Git Repository URL" box.
  5. Click Clone. You may have to enter your GitHub username and password.
  6. If it asks you whether you want to open the project or not, select yes.
  7. You should see your project open. If you need to reopen the project, you should see it under
     "File > Open Recent"
  8. If you click on the drop-down menu of run configurations, you should see "Main", and "Test" as 
     options. You should be able to run all of them. If any of the configurations are missing,
     call an instructor over.

## Project overview

This project is a complement to the lecture. In this project, we're going to be implementing a few sorting-related functions. Those functions are:
  1. Selection Sort
  2. Linear Search
  3. Binary Search
  4. Merge Sort
  
We'll be implementing these functions in parts as we learn the concepts. The algorithms for each function are listed below, for your convenience.

## SelectionSort
  1. Divide your ArrayList into two imaginary parts. The sorted part, which starts out empty, and the unsorted part, which starts off as the entire list.
  2. Go through your unsorted array, and find where the smallest element is located. Swap that element with the first element in the unsorted section. 
  3. Now the first element is considered sorted. Again go through your unsorted array, find the smallest element, and swap it with the first unsorted element.
  4. Go back to step 2 and continue until all elements are sorted.
  
## Linear Search
  1. Iterate through the ArrayList. 
  2. Compare each element with the value you are looking for. If they are equal, return the index of the element. Else, continue on to the next element.
  3. If we get to the end of the array and the element is not found, return -1.
  
## Binary Search
  1. Start with the entire ArrayList as your “range”.
  2. If your range has length 0, return -1, the number wasn’t found.
  3. Check if the middle number in your ArrayList is the number you are looking for (If there are two middle numbers, just pick one and be consistent). If it is, return it.
  4. If the middle number is greater the number you are looking for, update your range so the “upper bound” is the number to the left of the middle number. If it is smaller, update your range so the “lower bound is the number to the right of the middle number.
  5. Go back to step 2 and continue with your new range.

## Merge Sort
There are two main operations in mergeSort: *sort* and *merge*.

*Sort* is defined recursively:
  1. Start with the entire ArrayList as your “range”.
  2. If the size of the range is 1 or 0, it is already sorted. You are done sorting the range. 
  3. Otherwise, divide your range in half, into two smaller ranges. *Sort* each individual range, and then *merge* the ranges together.

*Merge* is defined as follows:
  1. Create a temporary array. We will put elements from the two ranges into the temp array in sorted order.
  2. Start at the first element of each range. For each range, the element that you are at is the "current element".
  3. If either range has no more elements, take the current element from the other range and add it to the temp array. If both ranges have elements left, check which current element is smaller and add that element to your temporary array (if they are the same, you can pick either although the element in the left array is preferred).
  4. Only for the range that had the number you added, move to the next element. 
  5. If there are more elements that need to be added, go back to step 3. Otherwise, move on to step 6.
  6. Copy the temp array back into the location of the ranges we just merged.




