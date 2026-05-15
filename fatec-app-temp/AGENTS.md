```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code within the AGENTS repository.  Adherence to these principles is crucial for collaborative development and long-term stability.

**1. DRY (Don't Repeat Yourself)**

*   **Core Logic:**  All core logic, algorithms, and data structures should be encapsulated within dedicated, reusable components.
*   **Module Patterns:** Utilize module patterns to promote code reuse and organization.
*   **Single Responsibility Principle:**  Each component should have a single, well-defined responsibility.
*   **Avoid Over-Engineering:**  Refactor existing code to eliminate redundancy without introducing new complexity.

**2. KISS (Keep It Simple, Stupid)**

*   **Code Clarity:** Strive for the simplest possible solution that achieves the desired outcome.
*   **Readability:**  Prioritize code that is easy to understand and maintain, even by someone unfamiliar with the project.
*   **Minimize Complexity:**  Avoid overly complex logic or unnecessary abstractions.
*   **Avoid Unnecessary Features:**  Only include features that directly contribute to the functionality.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/component should have one reason to change.
*   **Open/Closed Principle:**  The system should be open for extension but closed for modification.  (This is particularly relevant for components.)
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients shouldn't be forced to implement interfaces they don't use.
*   **Dependency Inversion Principle:**  High-level modules should be replaced by their low-level dependencies.

**4. YAGNI (You Aren't Gonna Need It)**

*   **Future-Proofing:**  Don’t implement features or code that is unlikely to be used in the future.
*   **Avoid Unnecessary Complexity:**  Only introduce complexity when it is absolutely essential for solving a particular problem.
*   **Prioritize Core Functionality:**  Focus on implementing the essential requirements first.

**5. Code Style & Formatting**

*   **Indentation:** Use 2 spaces for indentation.
*   **Line Length:** Limit lines to 120 characters.
*   **Naming Conventions:** Follow the established naming conventions (see example below).
*   **Comments:**  Provide concise and relevant comments where necessary.  Avoid excessive commenting – the code should largely explain itself.
*   **Example Style:**
    *   `class MyComponent { ... }`
    *   `def process(data): ...`
    *   `def get_data(key): ...`

**6. File Structure & Content (Maximum 180 Lines)**

*   **Root Directory:**  The `AGENTS.md` file must reside in the root directory of the AGENTS repository.
*   **File Organization:**  Organize files logically by functionality or component.
*   **Component Structure:** Each file should represent a single, self-contained component.
*   **Documentation:** Include concise documentation within the code, explaining key data structures or algorithms.  (Limited to 100 words).
*   **Example Component (Simple Task Manager):**
    ```md
    # TaskManager.md
    This component manages a list of tasks.

    It contains functions for adding, removing, and viewing tasks.
    ```

**7. Testing**

*   **Minimum Test Coverage:** Achieve at least 80% test coverage for all critical components.
*   **Unit Tests:**  Each component should have a comprehensive suite of unit tests.
*   **Integration Tests:**  Integrate with other components to verify data flow.
*   **Test Frameworks:**  Utilize a well-established testing framework (e.g., pytest, unittest).
*   **Test Case Design:**  Write clear, focused test cases that cover expected behavior.

**8. Development Process**

*   **Code Reviews:** All code must undergo review by at least one other developer.
*   **Version Control:** Use Git for version control.
*   **Documentation Updates:**  Whenever the codebase changes, update the documentation accordingly.
*   **Refactoring:** Perform periodic refactoring to improve code quality and maintainability.

**9.  Further Considerations (Beyond the Basics)**

*   **Error Handling:**  Implement robust error handling to gracefully handle unexpected situations.
*   **Logging:**  Include logging for debugging and monitoring.
*   **Configuration:**  Consider the possibility of configuration to adapt to different environments.
*   **Data Structures:** Define data structures that are consistent and efficient.


These guidelines are intended as a framework.  Adapt them as needed to suit the specific requirements of the AGENTS repository and project.  Regularly review and update these guidelines to ensure they remain relevant and effective.
```