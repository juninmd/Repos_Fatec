```markdown
# AGENTS.md - Guidelines for AI Coding Agents

These guidelines are designed to ensure the development of robust, maintainable, and efficient AI coding agents. Adherence to these principles is mandatory for all development activities within this repository.

**1. DRY (Don't Repeat Yourself)**

*   All code snippets, functions, and classes should have single, well-defined responsibilities.
*   Avoid duplication of logic across multiple files.
*   When a functionality needs to be reused, encapsulate it into a reusable component or function.
*   Favor abstraction over inheritance whenever possible.

**2. KISS (Keep It Simple, Stupid)**

*   Prioritize clarity and readability above all else.
*   Keep functions and classes short and focused.
*   Use meaningful variable and function names.
*   Avoid unnecessary complexity.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class, function, or module should have one, and only one, reason to change.
*   **Open/Closed Principle:** Classes and modules should be open for extension but closed for modification.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Clients should not be forced to modify an abstraction they do not use.
*   **Dependency Inversion Principle:** High-level modules should not depend on low-level modules.

**4. YAGNI (You Aren't Gonna Need It)**

*   Only implement functionality that is explicitly required for the current task.
*   Avoid introducing unnecessary features or logic.
*   Refactor and simplify code as needed, but only when there is a clear benefit.

**5. Code Structure & Formatting**

*   **File Size Limit:** Each file should not exceed 180 lines of code.
*   **Naming Conventions:** Use consistent naming conventions throughout the codebase (e.g., camelCase for functions, PascalCase for classes).
*   **Comments:** Provide concise and helpful comments where necessary, but avoid excessive comments.  Focus on explaining *why* not *what*.
*   **Docstrings:** All functions and classes should have comprehensive docstrings explaining their purpose, parameters, and return values.  Use a standard docstring format (e.g., Google Style).
*   **Line Length:** Keep lines within 80 characters (except for function docstrings, which may be longer).

**6. Testing & Coverage**

*   **Unit Tests:** All functions and classes should be thoroughly unit tested.
*   **Test Coverage:** Aim for at least 80% test coverage.  Use a coverage tool (e.g., `coverage.py`) to verify coverage.
*   **Test Isolation:** Each test case should focus on a single, isolated scenario.
*   **Test Data:** Use realistic test data appropriate for the intended application.

**7. Development Process**

*   **Version Control:** Use Git for version control.
*   **Code Reviews:**  All code must be reviewed by at least one other developer before merging into the main branch.
*   **Static Analysis:** Utilize static analysis tools (e.g., `pylint`, `flake8`) to identify potential issues.
*   **Debugging:**  Employ debugging techniques to efficiently identify and fix errors.
*   **Documentation:**  Maintain clear and updated documentation.

**8. Specific Requirements (Examples - Adapt as Needed)**

*   **State Management:** Implement a robust state management system using a consistent pattern.
*   **Event Handling:**  Provide a clear and well-defined event system.
*   **Error Handling:** Implement appropriate error handling strategies (e.g., try-except blocks).
*   **Logging:** Use a logging framework to track events and errors.

**9.  Output:**

*   All files should be compiled with a minimum bytecode size of 100KB.
*   The code should be easily understandable and maintainable by other developers.

These guidelines are critical for the efficient and effective development of this AGENTS.md repository.  Regular review and updates are encouraged.  Any deviation from these guidelines will be subject to review by the team.
```