```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure the quality, maintainability, and productivity of all AGENTS.md files within this repository. Adherence to these principles is crucial for a robust and efficient development process.

## 1. DRY (Don't Repeat Yourself)

*   All code should have a single, well-defined purpose.
*   Avoid duplicating logic or implementations.
*   Refactor repetitive code into reusable components or functions.
*   Favor generic solutions over hardcoded implementations where possible.

## 2. KISS (Keep It Simple, Stupid)

*   Strive for simplicity in design and implementation.
*   Minimize complexity.
*   Avoid unnecessary abstractions.
*   Prioritize readability and understandability.
*   Focus on the core functionality.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class or function should have one, and only one, reason to change.
*   **Open/Closed Principle:**  A class or module should be open for extension but closed for modification.  New features should be added without altering existing code.
*   **Liskov Substitution Principle:**  Replacing a substituted object with its base class should not affect the correctness of the program.
*   **Interface Segregation Principle:** Clients shouldn't be forced to implement interfaces they don't use.
*   **Dependency Inversion Principle:**  High-level modules should be dependent on low-level modules, and modules should be dependent on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   Implement only the features that are currently required.
*   Avoid adding functionality that is not explicitly needed.
*   Refactor code to remove unnecessary complexity and assumptions.
*   Prioritize clarity and maintainability over premature optimization.

## 5. Code Length & Structure

*   **Maximum Code Length:** 180 lines per file.
*   **File Structure:** Organize files into logical groups based on functionality or component.
*   **Naming Conventions:** Consistent naming conventions (e.g., CamelCase for functions/classes, snake_case for variables).
*   **Comments:** Use comments sparingly and only to explain non-obvious logic or assumptions.  Focus on *why* not *what*.
*   **Docstrings:** Comprehensive docstrings explaining function and class purposes, parameters, and return values.

## 6. Test Coverage & Automation

*   **All Development Must Be Productive:**  Focus on creating functional code that meets requirements.  Don't spend time on non-functional tasks.
*   **Mocking/Stubbing:**  Use mocks and stubs *exclusively* for unit testing.  Implement complete, self-contained tests.
*   **Test Coverage Target:** Aim for at least 80% test coverage.  Use tools like `pytest` or `unittest` for automated testing.
*   **Unit Tests:**  Each class/function should have a suite of unit tests verifying its behavior with various inputs.
*   **Integration Tests:**  Consider integration tests to verify interactions between components.

## 7. File Specific Rules

*   **Data Structures:**  Follow established data structure conventions (e.g., dictionaries for key-value pairs, lists for ordered collections).
*   **Algorithms:** Use appropriate and efficient algorithms.
*   **Error Handling:** Implement robust error handling with appropriate exceptions and logging.
*   **Logging:**  Use a consistent logging format and level.
*   **Versioning:** Utilize Git for version control.

## 8.  General Best Practices

*   **Readability:** Prioritize clear and understandable code.
*   **Error Prevention:** Design code to minimize potential errors.
*   **Maintainability:** Write code that is easy to understand, modify, and extend.
*   **Collaboration:** Foster a collaborative environment.
*   **Documentation:** Maintain up-to-date documentation.

## 9.  Tooling

*   Utilize a code editor with linting and formatting capabilities (e.g., VS Code, Sublime Text).
*   Use a testing framework (e.g., `pytest`).
*   Employ a version control system (e.g., Git).


These guidelines are a starting point; adapt them as needed to best suit the specific context of the AGENTS.md repository. Remember, the primary goal is to produce high-quality, maintainable code.
```