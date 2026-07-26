# Todo

# Week 1: Arrays DSA.
1. Linear Search
2. Largest Element
3. Second Largest Element
4. Check if Array is Sorted

# Spring Boot
1. Create a new Spring Boot project for the E-Commerce Backend.
2. Design the database with entities such as User, Product, Category, Cart, and Order before writing any code.


# Things learned while solved array problems
1. Check is array is null or empty.
    a. NullPointerException will be thrown if we don't properly handle array = null
    b. If array is empty, then arr.length == 0 [empty array].
        if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array must not be null or empty.");
        }