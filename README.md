# Java-Operators
Java Operators

1. Assignment Operator

In Java, assignment operators allow us to modify variables efficiently by combining arithmetic operations with assignment. Instead of writing x = x + 10, we can simply use x += 10.
🔹 Breakdown of Output

 ✅ num += 80 → 320 + 80 = 400
 ✅ num -= 100 → 400 - 100 = 300
 ✅ num *= 100 → 300 * 100 = 30000
 ✅ num /= 10 → 30000 / 10 = 3000
 ✅ num %= 3 → 3000 % 3 = 0
 
📌 Key Takeaways:
 ✔ Assignment operators simplify arithmetic operations.
 ✔ They improve readability and reduce redundancy in code.
 ✔ Common operators include +=, -=, *=, /=, and %=.

 2. Arithmetic operator

Arithmetic operators are the foundation of mathematical calculations in Java. They help perform operations like addition, subtraction, multiplication, division, and modulus. Whether you’re working on data processing, financial applications, or scientific computations, these operators are essential!

📌 Explanation of Operators
✅ + Addition: Adds two numbers
✅ - Subtraction: Subtracts one number from another
✅ * Multiplication: Multiplies two numbers
✅ / Division: Returns the quotient of division
✅ % Modulus: Returns the remainder of division

💡 Why Are Arithmetic Operators Important?
✔ Used in almost every program – From basic calculations to complex algorithms
✔ Enhances logic building – Forms the base for loops, conditions, and data processing
✔ Easy to understand & implement – Simple syntax with powerful applications.

3. Bitwise Operators

Bitwise operators in Java allow us to perform operations directly on binary representations of numbers. They are powerful for performance optimization, encryption, and low-level programming!

Here's a simple Java program that demonstrates Bitwise AND, OR, XOR, NOT, Left Shift, and Right Shift operations.

🔹 Key Takeaways:
 ✔ & (AND) – Sets bits to 1 only if both are 1.
 ✔ | (OR) – Sets bits to 1 if at least one is 1.
 ✔ ^ (XOR) – Sets bits to 1 if they differ.
 ✔ ~ (NOT) – Inverts bits (applies Two’s Complement).
 ✔ >> (Right Shift) – Divides by 2ⁿ (loses precision).
 ✔ << (Left Shift) – Multiplies by 2ⁿ (efficient power of 2 multiplication).

🔹 Why use Bitwise Operators?
 ✅ Faster than arithmetic operations for shifts and masking.
 ✅ Used in cryptography, networking, and embedded systems.
 ✅ Helps in memory-efficient programming.

 4. Logical Operators

 ogical operators play a vital role in decision-making and conditional checks in Java. Here's a simple example demonstrating AND (&&), OR (||), and NOT (!) operators in action!

🔹 Breakdown of the Code:

 ✔️ && (Logical AND) → Returns true only if both conditions are true.
 ✔️ || (Logical OR) → Returns true if at least one condition is true.
 ✔️ ! (Logical NOT) → Flips the boolean value (true ↔ false).

🔥 Key Takeaways:

 ✅ Logical operators help in decision-making (if-else, loops).
 ✅ Boolean expressions are crucial for flow control in programs.
 ✅ Use parentheses wisely to avoid unexpected results.

 5. Relational operators

Relational operators are essential in Java for comparing values and making logical decisions in conditions like if-else and loops.

✅ Operators Used:

 ✔ == → Checks if two values are equal.
 ✔ != → Checks if two values are not equal.
 ✔ > → Checks if one value is greater than another.
 ✔ < → Checks if one value is smaller than another.
 ✔ >= → Checks if one value is greater than or equal to another.
 ✔ <= → Checks if one value is less than or equal to another.

🎯 Key Takeaways:

 🔹 Relational operators return boolean values (true or false).
 🔹 Used in conditional statements like if, while, and for loops.
 🔹 >= and <= include equality in their comparison.

 6. UnaryOperator

Unary operators in Java are used to perform operations on a single operand. They are commonly used for incrementing, decrementing, negating, and representing positive values.

📌 Explanation of Unary Operators

 ✅ +a → Unary plus (No effect, just returns the same value)
 ✅ -a → Unary minus (Negates the value of a)
 ✅ ++a → Prefix increment (Increments a first, then returns the new value)
 ✅ a++ → Postfix increment (Returns a first, then increments)
 ✅ --a → Prefix decrement (Decrements a first, then returns the new value)
 ✅ a-- → Postfix decrement (Returns a first, then decrements)

💡 Why Are Unary Operators Important?

 ✔ Optimizes code execution – Used in loops, conditions, and mathematical expressions
 ✔ Improves readability – Makes increment/decrement operations clear and concise
 ✔ Common in real-world applications – Used in counters, loops, and algorithms.

 7. Ternary Operator.

The ternary operator (? :) in Java is a shorthand for if-else conditions, making the code more concise and readable. It is widely used to simplify decision-making logic.

A) Finding the Maximum of Two Numbers!

📌 Explanation of Ternary Operator

 ✅ Syntax: condition ? value_if_true : value_if_false
 ✅ (a > b) ? a : b; → If a is greater, return a; otherwise, return b.

B) Finding the Maximum of Three Numbers!

 📌 Explanation of Ternary Operator

 ✅ Syntax: condition ? value_if_true : value_if_false
 ✅ Logic Used:
(a > b) ? (a > c ? a : c) : (b > c ? b : c);
Step 1: If a > b, check if a > c → If true, a is the max, else c.
Step 2: If b > a, check if b > c → If true, b is the max, else c.

💡 Why Use the Ternary Operator?

 ✔ Concise & Readable – Eliminates lengthy if-else blocks
 ✔ Faster Execution – Works efficiently in simple conditions
 ✔ Common in Competitive Programming – Saves lines of code
 


