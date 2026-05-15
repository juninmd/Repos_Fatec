```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code within the AGENTS repository. Adherence to these principles is crucial for the long-term health and success of the project.

**1. DRY (Don't Repeat Yourself)**

*   **Module Design:** Each module should have a single, well-defined purpose.
*   **Code Reuse:**  Identify and reuse common logic and data structures across multiple files.
*   **Abstraction:**  Create abstract classes or interfaces to decouple components.
*   **Template Code:**  Utilize templates (e.g., for data structures, utility functions) to avoid duplication.

**2. KISS (Keep It Simple, Stupid)**

*   **Readability:** Code should be easy to understand by others (and your future self).
*   **Minimalism:**  Avoid unnecessary complexity.
*   **Simplicity:** Favor straightforward solutions over convoluted ones.
*   **Conciseness:**  Write code that expresses the simplest possible solution.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
*   **Open/Closed Principle:**  The system should be extensible through public interfaces without modifying the internal code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to know about methods they don't use.
*   **Dependency Inversion Principle:**  High-level modules should not depend on low-level modules.

**4. YAGNI (You Aren't Gonna Need It)**

*   **Future-Proofing:**  Avoid adding features or code that is not currently required.
*   **Avoid Over-Engineering:**  Don't create solutions that are overly complex for the task at hand.
*   **Focus on Requirements:** Ensure all code implementation directly supports the documented requirements.

**5. Code Standards & Practices**

*   **Naming Conventions:** Use a consistent naming convention (e.g., snake_case, camelCase).
*   **Commenting:** Provide clear, concise comments explaining complex logic, non-obvious choices, and potential edge cases.  Comments should *support* code, not merely restate it.
*   **Error Handling:** Implement robust error handling and logging.  Avoid raising exceptions unless absolutely necessary.
*   **Data Structures:** Choose appropriate data structures (lists, dictionaries, sets, etc.) for each purpose.
*   **Code Formatting:** Use a code formatter (e.g., Prettier) to ensure consistent code style.
*   **Code Review:** Each file must undergo a mandatory code review before merging.

**6.  File Size & Test Coverage (180 lines max)**

*   **Maximum File Size:**  Each file should be no more than 180 lines of code.
*   **Test Coverage:**  Achieve a minimum of 80% test coverage for all files.  Automation tests are required for testing.

**7.  Development Process**

*   **Iteration:** Break down large tasks into smaller, manageable iterations.
*   **Version Control:** Use Git for version control.
*   **Pull Requests:** All changes must be submitted via pull requests for review.
*   **Documentation:** Provide clear documentation for new code and features.  Inline documentation is preferred.

**8.  Specific Considerations (AGENTS.md)**

*   **Data Models:** Clearly define and document data models.
*   **API Design:**  If the AGENTS.md acts as a gateway, a dedicated section for API design and documentation is required.
*   **Configuration Management:**  Implement a mechanism for managing configuration data effectively.
*   **Logging:**  Include basic logging practices to aid in debugging.

**9.  Testing Frameworks**

*   **Automated Testing:**  Utilize a testing framework (e.g., pytest, unittest) for all tests.
*   **Unit Tests:** Focus primarily on unit tests.

**10.  Project Goals**

*   **Maintainability:** Prioritize code that is easy to understand, modify, and extend.
*   **Scalability:** Design the system to handle future growth and evolving requirements.
*   **Reliability:** Ensure the system is stable and reliable.

These guidelines are a starting point.  The team will refine and adapt them as the project evolves.  Any code found violating these guidelines will be flagged for review and potential remediation.
```