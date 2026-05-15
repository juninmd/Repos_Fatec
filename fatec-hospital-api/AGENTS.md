```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality development for the AGENTS repository. Adherence to these principles is crucial for collaborative project success.

## 1. DRY (Don't Repeat Yourself)

*   All functions, classes, and modules should have a single, well-defined purpose.
*   Avoid duplicating code.  Refactor duplicate functionality into reusable components.
*   When new functionality is required, build it from existing code rather than rewriting it.

## 2. KISS (Keep It Simple, Stupid)

*   Prioritize clarity and readability.
*   Code should be easy to understand and maintain.
*   Avoid unnecessary complexity.
*   Strive for solutions that are straightforward to implement.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class or module should have one, and only one, reason to change.
*   **Open/Closed Principle:**  Code should be open for extension but closed for modification.  (New features shouldn't require modifying existing code).
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Each interface should have only the methods that are needed.
*   **Dependency Inversion Principle:** Client code should not depend on implementation details.

## 4. YAGNI (You Aren't Gonna Need It)

*   Only implement features that are absolutely necessary and have a tangible benefit.
*   Avoid adding functionality that is explicitly not required.
*   Refactor code to eliminate unnecessary complexity and unused features.

## 5. Code Structure & Organization

*   **Modular Design:** Break down the AGENTS repository into logical modules with clear boundaries.
*   **Consistent Naming Conventions:** Use descriptive and consistent naming for variables, functions, and classes.
*   **Comments:**  Provide clear and concise comments to explain complex logic or decisions.  Comments should *supplement* the code, not *repeat* it.
*   **Error Handling:** Implement robust error handling with appropriate logging and informative error messages.
*   **Data Structures:** Use appropriate data structures for each purpose to optimize performance and readability.

## 6. File Length & Content

*   **Maximum Code Length:**  Each file must be no more than 180 lines of code.  (This is a hard limit – file size is not considered).
*   **Code Clarity:**  Prioritize readability.  Use whitespace and formatting to enhance understanding.
*   **Documentation:** Include a brief overview of the function's purpose and any relevant considerations in the initial header or comment.

## 7. Testing

*   **Unit Tests:**  All functions and classes are subject to comprehensive unit tests.
*   **Test Coverage:** Aim for 80% test coverage.  Use a testing framework appropriate for the project's needs.
*   **Test Driven Development:** The unit tests should be written before the code.
*   **Mocking:**  Only use mocks and stubs for testing purposes.  Do not use real implementations.

## 8.  Specific File Structure (Example - Adapt to your project needs)

*   **`src/core/`:** Contains core algorithms, data structures, and utility functions.
*   **`src/services/`:** Contains business logic and application-specific functionality.
*   **`src/utils/`:** Contains helper functions and utility code.
*   **`src/config/`:** Contains configuration files for the AGENTS system.
*   **`src/data/`:** Contains data-related modules and persistence logic.
*   **`src/tests/`:** Contains all test cases.

## 9.  Code Style (PEP 8 Compliance)**

*   Follow PEP 8 style guidelines for Python code. This ensures consistency and readability.  (Detailed PEP 8 reference available [link]).

## 10.  Maintainability & Review

*   Code should be easily understandable and adaptable to future changes.
*   Regular code reviews are mandatory.
*   Any new features or changes should undergo a formal review process.

## 11.  Version Control

*   Use Git for version control.
*   Commit frequently with meaningful commit messages.
*   Establish a clear branching strategy.

## 12.  Documentation (Within Files)**

*   Include a README.md file in each file explaining the purpose, usage, and dependencies.
*   Document complex algorithms and data structures using comments.

These guidelines are intended to serve as a foundational framework for the AGENTS repository.  Ongoing refinement and adaptation are welcomed.  Any significant changes should be discussed and approved by the team.
```