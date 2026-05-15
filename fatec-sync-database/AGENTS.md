```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines outline the principles and rules for development of AI coding agents within this repository. Adherence to these principles is crucial for maintaining a sustainable, maintainable, and high-quality codebase.

## 1. DRY (Don't Repeat Yourself)

- All code should be encapsulated within reusable components.
- Modules and functions should have well-defined responsibilities.
- Avoid duplication of logic.  If functionality needs to be repeated, create a separate, specialized component.
- Use abstractions and interfaces to define shared behavior.

## 2. KISS (Keep It Simple, Stupid)

- Code should be as concise and understandable as possible.
- Prioritize clarity and readability over unnecessary complexity.
- Avoid over-engineering solutions.
- Focus on the essential requirements.

## 3. SOLID Principles

- **Single Responsibility Principle:** Each class or module should have a single, well-defined purpose.
- **Open/Closed Principle:** The system should be extensible without modifying the existing code.  Add new functionality through API.
- **Liskov Substitution Principle:**  Subclasses should be able to replace their base classes without affecting the correctness of the program.
- **Interface Segregation Principle:** Clients shouldn't be forced to depend on methods they don't use.
- **Dependency Inversion Principle:**  High-level modules should not depend on low-level modules; they should be dependent on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

- Only implement features that are currently required.
- Avoid adding functionality that is not essential at this time.  Delay implementation until absolutely necessary.
-  Refactor code to remove unnecessary complexity.

## 5. Code Style & Formatting

- Consistent code formatting using a defined style (e.g., black-squared).
- Proper indentation and spacing.
- Use a code formatter (e.g., `black` or `autopep8`) consistently.
- Variable and function names should be descriptive.

## 6. File Size & Structure

- Each file should have a maximum of 180 lines of code.
- File names should be descriptive and follow a consistent naming convention.
- Group related code into logical files.
- Utilize comments to explain complex logic or non-obvious operations.

## 7. Test Coverage

- Aim for at least 80% test coverage for all critical functions and modules.
- Utilize unit tests to verify core logic.
-  Implement integration tests to validate interactions between components.
-  Focus on testing edge cases and boundary conditions.

## 8.  Development Workflow

-  Code should be reviewed and tested before integration.
-  Automated testing should be performed throughout the development lifecycle.
-  Small, incremental changes should be introduced.
-   Utilize version control (Git) with proper branching strategies.

## 9. Specific Considerations for AI Agents

-  All data manipulation and processing must be performed within the agent's environment.
-  Memory management should be carefully considered to avoid memory leaks.
-  Error handling should be robust and informative.
-  Consider potential latency impacts on agent decisions.
-  Utilize appropriate data structures for representing agent states and actions.

## 10. Testing Practices

-  Utilize a testing framework that supports unit testing and integration testing.
-  Implement tests to verify expected behavior under various conditions.
-  Cover all critical scenarios and edge cases.
-  Ensure tests are fast and reliable.
-  Use test data effectively and realistically.

## 11.  Documentation

- Provide clear and concise documentation for all functions, classes, and modules.
-  Document API usage and expected input/output.
-  Maintain a README file explaining the project's purpose, architecture, and usage.

## 12.  Code Structure & Organization

-  Use a consistent module structure.
-  Employ clear separation of concerns.
-  Consider using static analysis tools to identify potential issues.

## 13.  Code Quality Tools (Future Consideration)

-  Utilize code linters and formatters.
-  Employ static analysis tools.
-  Consider code refactoring tools.

```