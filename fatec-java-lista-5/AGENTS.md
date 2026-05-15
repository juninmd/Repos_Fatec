```markdown
# AGENTS.md - Guidelines for AI Coding Agents

These guidelines outline the principles and expectations for development of AI coding agents within this repository. Adherence to these principles is crucial for maintainability, robustness, and scalability.

## 1. DRY (Don't Repeat Yourself)

*   All functions, classes, and modules should have single, well-defined purposes.
*   Avoid duplicating logic across multiple files.
*   Refactor when necessary to consolidate related functionality.
*   Utilize abstraction to manage shared state and behaviors.

## 2. KISS (Keep It Simple, Stupid)

*   Prioritize clarity and readability over complexity.
*   Minimize code length while maintaining functionality.
*   Break down complex tasks into smaller, manageable steps.
*   Favor straightforward solutions over overly clever ones.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
*   **Open/Closed Principle:** The system should be extensible without modifying existing code.  New features should be added as separate components.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to contain dependencies on implementation details.
*   **Dependency Inversion Principle:** High-level modules should be dependent on abstractions, not concrete classes.

## 4. YAGNI (You Aren't Gonna Need It)

*   Only implement functionality that is absolutely required for the current task.
*   Avoid adding unnecessary features or abstractions.
*   Focus on delivering working solutions without premature optimization.

## 5. Code Length Constraint (180 lines max)

*   Each file must be no more than 180 lines of code.
*   Code should be logically organized and readable.
*   Consider using whitespace and indentation for clarity.

## 6. Test Coverage Requirement (80%+)

*   All code must undergo comprehensive unit tests.
*   Tests should cover all critical functionalities and edge cases.
*   Coverage reports will be generated and reviewed regularly.

## 7.  Development Workflow & Best Practices

*   **Code Reviews:** All code must be reviewed by at least one other developer before merging.
*   **Unit Tests First:** Prioritize writing unit tests before implementing functionality.
*   **Documentation:** Provide clear and concise documentation for functions, classes, and modules, including their purpose, inputs, and outputs.
*   **Error Handling:** Implement robust error handling with informative error messages.
*   **Logging:**  Utilize logging strategically to track events and debugging.
*   **Version Control:** Utilize Git for version control.
*   **Commit Messages:**  Commit messages must explain *why* the changes were made, not just *what* was changed.

## 8.  Specific Considerations for AI Agents

*   All code related to agent behavior, state management, and decision-making should be clearly separated.
*   Implement mechanisms for agent introspection and introspection of other agents.
*   Ensure all agent actions and responses are easily traceable back to the initial input and context.
*   Consider design patterns that promote modularity and reusability for agent components.

## 9.  Data Handling

*   Utilize structured data representation where appropriate.
*   Avoid unnecessary data passing between modules.
*   When data is necessary, use data serialization/deserialization efficiently.

## 10.  Future Considerations (Not Mandatory)

*   Explore the use of asynchronous programming to improve performance.
*   Consider incorporating static analysis tools to identify potential issues early.
*   Implement a logging system for improved debugging and monitoring.

These guidelines are intended to guide development and ensure high-quality AI coding agents within this repository. Regular review and adaptation are encouraged.
```