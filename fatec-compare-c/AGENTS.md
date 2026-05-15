```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines outline the principles and rules for development of AI coding agents within this repository. Adherence to these principles is crucial for maintaining a robust, scalable, and maintainable codebase.

## 1. DRY (Don't Repeat Yourself)

*   All functionality and logic must be encapsulated within reusable components or functions.
*   Avoid duplication of code across different modules and files.
*   When a component needs to perform a task, it should be defined once and reused.
*   Identify and address potential duplicate code patterns promptly.

## 2. KISS (Keep It Simple, Stupid)

*   Code should be as concise and straightforward as possible.
*   Prioritize clarity and readability above all else.
*   Avoid unnecessary complexity.
*   When a simple solution exists, use it.  Don't over-engineer.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class/component should have one, and only one, reason to change.
*   **Open/Closed Principle:** The system should be extensible through mechanisms like APIs and configuration, without modifying the existing code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Clients should not be required to know the implementation details of the interfaces they use.
*   **Dependency Inversion Principle:** High-level modules should not depend on low-level modules.  Interfaces define the required contracts.

## 4. YAGNI (You Aren't Gonna Need It)

*   Implement only what is absolutely necessary for the current task or iteration.
*   Defer implementation details until they are explicitly required.
*   Avoid unnecessary code that doesn't contribute to the current goal.
*   Refactor only when the existing code is demonstrably flawed or unmaintainable.

## 5. Code Structure & File Management

*   Each file shall have a maximum of 180 lines of code.
*   Code should be well-commented, explaining the purpose and logic.
*   Use meaningful variable and function names.
*   Modularize code into logical units with clear separation of concerns.
*   Consider the use of dependency injection for component interactions.
*   File naming conventions:  `[ModuleName]_[Functionality]_[Input]_[Output].md`

## 6. Test Coverage & Productivity

*   All development must be productive.  Do not introduce mock implementations for testing.
*   Unit tests will be written to verify individual functions/components.
*   Aim for at least 80% test coverage for all code.
*   Employ automated testing frameworks where appropriate.
*   Prioritize clear, concise, and easily testable code.

## 7. Specific Requirements (Example - Adapt as Needed)

*   **Agent Initialization Module:**  Defines initial agent state and configurations.
*   **Data Aggregation Module:** Responsible for collecting and preparing data.
*   **Policy Engine Module:** Implements the core logic governing agent behavior.
*   **Logging Module:** Records events and errors for debugging and monitoring.

## 8.  Documentation & API Definition

*   All API endpoints and their intended usage must be clearly documented.
*   Provide detailed documentation for all functions and classes, adhering to established coding standards.
*   Use JSDoc comments where appropriate.

## 9.  Code Quality & Style

*   Follow PEP 8 style guidelines for Python code.
*   Use consistent indentation and spacing.
*   Write clean and readable code.
*   Employ static analysis tools to identify potential issues.

## 10.  Version Control

*   All changes must be committed to Git with a meaningful commit message.
*   Use branches for feature development and bug fixes.
*   Regularly pull and merge changes.

## 11.  Testing Frameworks (Note: No Mocking Required)**

*   Utilize a suitable testing framework (e.g., `unittest` or `pytest`) for all tests.
*   Test cases should be designed to cover critical scenarios.
*   Focus on isolating components and verifying their behavior independently.

## 12.  Error Handling

*   Implement comprehensive error handling.
*   Provide informative error messages.
*   Log errors appropriately.

## 13.  Dependencies

*   Specify all dependencies clearly using `pip install` or equivalent.
*   Document dependencies in the code.

## 14.  Code Review Process

*   All code changes must be reviewed by another developer.
*   Ensure code is consistent with established guidelines.

These guidelines are subject to change as the project evolves. Regular review and updates are encouraged.
```