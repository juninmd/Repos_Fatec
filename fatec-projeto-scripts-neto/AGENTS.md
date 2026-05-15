```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines outline the principles and rules for development of AGENTS.md, a repository for AI coding agents. Strict adherence to these principles is crucial for maintaining code quality, testability, and maintainability.

**I. Core Principles & Philosophy**

*   **DRY (Don't Repeat Yourself):**  Avoid duplication of code and logic across multiple files and modules.  Each module should have a single, well-defined purpose.
*   **KISS (Keep It Simple, Stupid):**  Prioritize clarity and simplicity.  Avoid unnecessary complexity.  Strive for the simplest solution that meets the requirements.
*   **SOLID Principles:**  All code must adhere to SOLID principles – Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, and Dependency Inversion.  This ensures modularity, testability, and extensibility.
*   **YAGNI (You Aren't Gonna Need It):**  Only implement functionality that is currently required. Avoid adding unnecessary features or code that might be obsolete in the future.  Refactor as needed to remove unused code.
*   **Productivity Focus:**  All development must be driven by the immediate need to achieve a functional, testable solution.  Do not spend time on non-productive tasks.

**II. File Structure & Content**

*   **File Size Limit:** Each file must not exceed 180 lines of code.
*   **File Structure:** Organize files logically. Key areas:
    *   `modules/`: Contains core modules and components.  Each module has a clear, single responsibility.
    *   `data/`: Stores data used by the agents (simulated, of course – mocks will be used for testing). Consider data schemas to ensure consistency.
    *   `interfaces/`:  Defines interfaces for communication and data exchange between modules.
    *   `tests/`: Contains unit tests for individual modules and functions.
    *   `examples/`: Provides sample usage and illustrative code.
    *   `docs/`:  Detailed documentation for the agents and their components.
    *   `config/`: Configuration files for agents (if applicable).
*   **Modular Design:** Each module should be self-contained and capable of being reused in other projects (or within future iterations).
*   **Data Handling:** All data is represented using simulated data structures. Mocking will be extensively utilized for testing.

**III. Code Standards & Best Practices**

*   **Naming Conventions:**  Follow consistent naming conventions (e.g., camelCase, snake\_case) throughout the codebase.
*   **Comments:**  Provide clear, concise comments to explain the purpose of complex logic or non-obvious decisions.  Don't over-comment.
*   **Error Handling:**  Implement robust error handling to gracefully manage unexpected situations and prevent crashes.  Logging should be used appropriately.
*   **Testing:**  Every function and module must have unit tests. Tests should cover all critical scenarios.  Consider adding boundary conditions and edge cases.
*   **Code Readability:** Utilize whitespace, indentation, and meaningful variable names to enhance readability.
*   **Avoid Magic Numbers:**  Use named constants instead of hardcoded values to improve maintainability.

**IV.  Specific Rules & Restrictions**

*   **Mocking:**  All tests MUST be implemented using mocks.  No real implementations are allowed.
*   **No Re-writing Existing Code:**  Existing code remains unchanged.  Any modification should be clearly documented and tested.
*   **Consistent Data Types:**  Use consistent data types throughout the codebase to enhance readability and maintainability.
*   **Dependency Injection:**  Favor dependency injection over global state to improve testability and flexibility.
*   **Version Control:**  Use Git for version control and follow established branching strategies.

**V.  Test Coverage Requirements**

*   **80% Test Coverage:**  Achieve 80% test coverage across all code.  This includes unit tests, integration tests, and edge case tests.
*   **Test Driven Development:**  Emphasize test-driven development – writing tests *before* implementing the code.
*   **Automated Tests:**  All tests should be automated and run regularly.

**VI.  Further Considerations**

*   **Data Validation:** Implement validation logic to ensure data integrity.
*   **Security:** Consider basic security measures (e.g., input sanitization).
*   **Logging:** Implement logging for debugging and monitoring.

These guidelines are intended as a reference and may be adapted based on the evolving needs of the AGENTS.md project.  All development must be productive and prioritize maintainability.
```