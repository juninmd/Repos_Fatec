```markdown
# AGENTS.md - Guidelines for AI Coding Agents

These guidelines outline the principles and expectations for all development of AGENTS.md, a repository for AI coding agents. Adherence to these principles ensures code quality, maintainability, and testability.

**1. DRY (Don't Repeat Yourself)**

*   Each function, class, and module should have a single, well-defined purpose.
*   Avoid creating redundant code. Refactor whenever possible to eliminate duplication.
*   Utilize shared components and data structures to minimize code rewriting.

**2. KISS (Keep It Simple, Stupid)**

*   Prioritize clarity and readability above all else.
*   Keep code concise and easy to understand.
*   Avoid overly complex logic or convoluted structures.
*   Use appropriate data structures for efficient operations.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
*   **Open/Closed Principle:**  Interfaces and abstractions should be open for extension but closed for modification.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to implement interfaces they do not use.
*   **Dependency Inversion Principle:** Higher-level modules should not depend on lower-level modules.

**4. YAGNI (You Aren't Gonna Need It)**

*   Only implement functionality that is currently required.
*   Defer implementation details until they are explicitly needed.
*   Avoid adding features that are unlikely to be used in the future.

**5. Testability & Mocking**

*   All development must be productive, and testing should be a primary focus.
*   Mocks are exclusively used for unit testing.
*   Do not include any live implementations of agents.  All data should be simulated via mocks.
*   Test cases must be comprehensive, covering all expected inputs and outputs.
*   Test coverage must be maintained at 80% or higher.  Automated test suites should be available.

**6. Code Length Constraint:**

*   Each file should be no more than 180 lines of code.
*   Lines should be proportional to the functionality.

**7. File Structure & Organization**

*   **Files:**  Each file represents a distinct component or module of the agent.
*   **Naming Conventions:**  Use clear and consistent naming conventions.
    *   Functions: `[function_name]`
    *   Classes: `[class_name]`
    *   Modules: `[module_name]`
*   **Comments:**  Provide concise and helpful comments to explain complex logic, algorithm steps, and intended functionality.
*   **Documentation:**  Document class/function purpose, inputs/outputs, and potential edge cases.
*   **Dependency Management:**  Use a dependency management system (e.g., pip, Maven, etc.) to manage external libraries and dependencies.  Clearly specify dependencies within the code.

**8.  Data Representation & Handling**

*   Data should be represented using appropriate structures (e.g., dictionaries, lists, custom classes).
*   Handle edge cases and error conditions gracefully.
*   Avoid using overly complex data structures.

**9.  Error Handling:**

*   Implement robust error handling mechanisms to prevent crashes and provide informative error messages.
*   Log errors appropriately.

**10.  Modularity & Reusability**

*   Design components to be reusable across multiple agents or projects.
*   Create well-defined interfaces for easy integration.

**11.  Testing Frameworks:**

*   Utilize a testing framework (e.g., pytest, unittest) for automated testing.
*   Write unit tests that cover all critical functionalities.

**12.  Version Control:**

*   Use a version control system (e.g., Git) to track changes to the code.
*   Employ clear commit messages explaining the changes made.

**13.  Code Quality:**

*   Follow established coding style guidelines (e.g., PEP 8).
*   Use linters and code formatters to enforce code standards.

**14.  Data Integrity**

*   Ensure data is validated and transformed correctly.
*   Implement mechanisms to prevent data corruption or inconsistencies.

**15.  Continuous Integration/Continuous Deployment (CI/CD)**

*   Implement CI/CD pipelines to automate testing and deployment.

These guidelines serve as a foundational framework for the AGENTS.md repository.  All code must adhere to these principles. Any deviation from these guidelines will be subject to review and potential rejection.
```