```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure high-quality, maintainable, and efficient development for the AGENTS repository. Adherence to these principles will significantly improve the project’s overall stability and usability.

**1. DRY (Don't Repeat Yourself)**

*   All code should have a single, well-defined purpose.
*   If a functionality is duplicated, refactor it into a reusable component.
*   Avoid unnecessary code blocks or functions with similar logic.

**2. KISS (Keep It Simple, Stupid)**

*   Prioritize code readability and clarity.
*   Strive for minimal code complexity.
*   Avoid overly clever or obscure solutions.
*   Keep functions and classes short and focused.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/function should have one, and only one, reason to change.
*   **Open/Closed Principle:**  The system should be extensible without modifying the existing code.  New features should be added through new classes or functions, not by modifying the core logic.
*   **Liskov Substitution Principle:**  Subclasses must be substitutable for their base classes without changing the correctness of the program.
*   **Interface Segregation Principle:** Clients should not be forced to implement interfaces they don't need.
*   **Dependency Inversion Principle:** High-level modules (classes) should not depend on low-level modules (classes), but rather be dependent on abstractions.

**4. YAGNI (You Aren't Gonna Need It)**

*   Implement only what is absolutely required for the current task.
*   Don't introduce features or functionality that aren’t currently needed.
*   Avoid premature optimization – focus on completing the current task first.

**5. Code Length & Formatting**

*   **Maximum Code Length:** 180 lines of code per file.
*   **Consistent Formatting:** Use a consistent code style (e.g., indentation, spacing). A YAML frontmatter can be used to enforce this.
*   **Comments:**  Briefly explain complex logic or non-obvious decisions.
*   **Naming Conventions:** Adhere to established naming conventions (e.g., camelCase, snake_case).

**6. Testing & Coverage**

*   **All Development Must Be Productive:**  Prioritize completing functional tests, even if they aren't perfect.
*   **Unit Tests:** Write unit tests for all new functions and components.
*   **Test Coverage:** Aim for at least 80% test coverage.  Use a coverage tool (e.g., Coverage.py, Coveralls) to measure and track.
*   **Test Isolation:** Tests should be isolated and repeatable.
*   **Test-Driven Development:** Implement tests *before* writing the code.

**7. File Structure & Organization**

*   **Modular Design:** Divide the codebase into logical modules and components.
*   **Clear Separation of Concerns:**  Each module should have a well-defined purpose.
*   **Documentation:** Add comments explaining the purpose and behavior of each component and function.
*   **Version Control:**  Use Git for version control.
*   **File Organization:**  Organize files into sensible directories based on functionality (e.g., `src/`, `tests/`, `docs/`).

**8.  Specific Considerations for AGENTS.md**

*   **Configuration Management:** Clearly document how configurations are handled (e.g., using environment variables, config files).
*   **Error Handling:** Implement robust error handling.
*   **Logging:**  Provide informative logging for debugging and monitoring.

**9.  Tools & Technologies**

*   [Specify relevant language/framework/library documentation and best practices here.]
*   [Mention testing framework details.]

**10.  Review Process**

*   All changes must be reviewed by at least one other team member before being merged.
*   Code reviews are mandatory.
*   Address feedback promptly.

These guidelines are a starting point and may be adjusted as the project evolves.  Continuous improvement and adaptation are key to maintaining a high-quality codebase.
```