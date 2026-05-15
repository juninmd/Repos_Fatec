```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines detail the principles and rules for development of AGENTS.md, ensuring a robust, maintainable, and efficient codebase. Adherence to these principles is mandatory for all development activities.

**1. DRY (Don't Repeat Yourself)**

*   All code within a single file should have a single, well-defined purpose.
*   Avoid creating redundant code blocks.
*   Utilize function libraries and reusable components to minimize repetition.
*   When multiple functions perform similar tasks, consider creating a specialized function.

**2. KISS (Keep It Simple, Stupid)**

*   Prioritize clarity and readability.
*   Avoid unnecessary complexity.
*   Strive for straightforward implementations.
*   Keep functions and modules concise and self-contained.
*   Limit the number of lines of code within a function.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/module/function should have one, and only one, reason to change.
*   **Open/Closed Principle:**  Systems should be extensible without modifying their core implementation.  New features should be added through new classes without altering existing ones.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Client code shouldn't be forced to depend on methods and fields it doesn't use.
*   **Dependency Inversion Principle:** High-level modules should not depend on low-level modules; they should be dependent on abstractions.

**4. YAGNI (You Aren't Gonna Need It)**

*   Implement only the features absolutely required for the current task.
*   Avoid adding functionality that isn’t currently needed, even if it might be beneficial later.
*   Refactor only when the existing code is demonstrably flawed or outdated, not because it isn't currently utilized.

**5. Development Guidelines**

*   **Code Style:** Follow a consistent code style established in the README.md file. (e.g., PEP 8 for Python, etc.)
*   **Naming Conventions:** Use descriptive and meaningful names for variables, functions, and classes.
*   **Comments:** Provide clear and concise comments where necessary to explain complex logic or assumptions. Avoid excessive commenting – comments should explain *why*, not *what*.
*   **Error Handling:** Implement basic error handling and logging to aid in debugging.  Don’t rely solely on exception handling - logging is preferred.
*   **Testing:** All development must be productive. All code must be tested.  Automated testing is crucial.
*   **Dependencies:** Manage dependencies through a `requirements.txt` file. Versioning of dependencies is essential.
*   **Documentation:**  Document code using docstrings. Keep docstrings updated with changes.
*   **Algorithm Complexity:** Prioritize efficient algorithms and data structures.
*   **Data Structures:** Select appropriate data structures for the task.
*   **Error Propagation:**  Proper error propagation is required - exceptions should be handled in a sensible manner.
*   **Testing Framework:** Utilize a testing framework (e.g., `pytest`) for comprehensive testing.
*   **Code Review:** All changes should be reviewed by at least one other developer.

**6. File Size & Coverage**

*   Maximum file size: 180 lines of code.
*   Minimum Test Coverage: 80% (Automated test coverage will be measured via a dedicated test suite).

**7. Specific Considerations (Example - Adapt to your project)**

*   **API Design:** Follow established API design principles.  Consider using a specific API framework if applicable.
*   **Data Structures:** Carefully consider the best data structures for the specific problem being solved.
*   **State Management:** Implement a clear and consistent state management strategy if the system requires it.
*   **Event Handling:**  If the system involves event handling, design it carefully to handle edge cases.

**8.  README.md Integration**

*   The README.md file should include a detailed overview of the AGENTS.md project, its purpose, and how to set up the development environment.
*   Include instructions for building the project, running tests, and deploying the code.

**9.  Reporting**

*   Report any issues or concerns to the designated team lead promptly.

These guidelines are subject to revision as needed.  Regularly review and update them to ensure the codebase remains robust and maintainable.  Any violation of these guidelines will be subject to disciplinary action.
```