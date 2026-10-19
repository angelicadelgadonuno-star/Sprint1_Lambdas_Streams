# Lambdas and Streams Exercises

This project contains practical exercises to learn and practice **Java 8+ Lambdas and Stream API**.

The project is divided into two levels: Level 1 (basic concepts) and Level 2 (advanced data manipulation). All exercises include tests with JUnit 5.

## 📁 Project Structure

- `src/main/java/level1/` - Basic exercises (Level 1)
- `src/main/java/level2/` - Advanced exercises (Level 2)
- `src/test/java/` - Unit tests

## 🟢 Level 1: Lambdas and Streams

1. **Exercise 1:** Filter a list of strings that contain the letter 'o'.
2. **Exercise 2:** Filter strings that contain 'o' and have more than 5 letters.
3. **Exercise 3:** Print the months of the year using a lambda.
4. **Exercise 4:** Print the months using a method reference.
5. **Exercise 5:** Create a Functional Interface (`PiInterface`) and assign the value 3.1415.
6. **Exercise 6:** Sort a mixed list (strings and numbers) by length (shortest to longest).
7. **Exercise 7:** Sort the same list by length (longest to shortest).
8. **Exercise 8:** Create a Functional Interface (`ReverseInterface`) to reverse a string.

## 🟡 Level 2: Functional Data Manipulation

1. **Exercise 1:** Filter names that start with 'A' and have exactly 3 letters.
2. **Exercise 2:** Format a list of integers into a comma-separated string with "e" (even) or "o" (odd) prefixes. Example: `(3, 55, 44)` -> `"o3, o55, e44"`.
3. **Exercise 3:** Create a Functional Interface (`ArithmeticOperations`) to perform sum, subtraction, multiplication, and division.
4. **Exercise 4:** Apply multiple operations to a mixed list:
    - Sort by first character.
    - Put words with 'e' first.
    - Replace 'a' with '4'.
    - Show only numeric elements.

## 🛠️ Technologies Used

- **Java** (JDK 26)
- **JUnit 5** for unit testing
- **Git** for version control

## 🚀 How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA (or your favorite IDE).
3. Run the `Main` class in `src/main/java/` to see the output of the exercises.
4. Run the tests to verify everything works.

## 🧪 How to Run Tests

In IntelliJ IDEA:
- Right-click on the `src/test/java` folder and select **"Run 'All Tests'"**.
- Or open a specific test class and click the green play button.