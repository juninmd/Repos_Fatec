```markdown
# AGENTS.md - Guidelines for AI Coding Agents

These guidelines outline the principles and requirements for the development of AI coding agents within this repository. Adherence to these principles is crucial for maintaining code quality, maintainability, and reliability.

## 1. DRY (Don't Repeat Yourself)

- Every function, class, and module should have a single, well-defined purpose.
- Avoid duplicating code. Refactor existing code to eliminate redundancy.
- When a solution appears to be duplicated, create a reusable component.

## 2. KISS (Keep It Simple, Stupid)

- Strive for clarity and simplicity in code.
- Minimize complexity.
- Avoid over-engineering.
- Prioritize readability over performance where possible.

## 3. SOLID Principles

- **Single Responsibility Principle:** Each class or module should have one, and only one, reason to change.
- **Open/Closed Principle:**  The system should be extensible through interfaces and abstract classes, without modifying the existing code.
- **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the system.
- **Interface Segregation Principle:**  Clients should not be forced to provide unnecessary dependencies.
- **Dependency Inversion Principle:**  High-level modules should be dependent on abstractions, not concrete implementations.

## 4. YAGNI (You Aren't Gonna Need It)

- Only implement functionality that is absolutely necessary.
- Avoid premature optimization.
- Resist the urge to add features that aren't currently required.  Focus on core functionality first.

## 5. Code Structure & Organization

- Files should be logically grouped by functionality.
- Utilize clear naming conventions.
- Comments should be concise and explain *why* the code is written, not *what* it does (unless the implementation is inherently complex).

## 6. Code Length & Size

- Maximum code length: 180 lines.
- Code should be well-formatted and readable.
- Minimize whitespace.

## 7. Test Coverage Requirements

- Achieve at least 80% test coverage for all critical functions and classes.
- Unit tests should cover all logic and edge cases.
- Integration tests should verify interactions between components.

## 8.  Development Workflow & Practices

- Code should be written in a modular and well-structured manner.
- Utilize version control (Git) with proper branching strategy.
- Code reviews are mandatory before merging code into the main branch.
- Documentation should be kept updated and accessible.

## 9.  Data Handling

- Use appropriate data structures and algorithms for the task.
- Avoid unnecessary data transformations.
- Document data structures and their purpose.

## 10.  Specific Considerations for AI Agents

- **Agent States:** Clearly define agent states and transitions.
- **Action Execution:**  Use immutable actions for each agent action.
- **Reward Shaping:**  Ensure reward functions are designed to guide the agent toward desired behavior.

## 11.  Test Case Structure

-  Test cases should cover all paths through the code.
-  Test cases should be designed to detect specific error conditions.
-  Use a consistent testing framework.

## 12.  Error Handling

- Handle exceptions gracefully without crashing the agent.
- Provide informative error messages.

## 13.  Error Logging

- Log important events and errors appropriately.
- Maintain a history of errors for debugging.

## 14.  Data Validation

- Implement data validation to ensure data integrity.
- Handle invalid data gracefully.

## 15.  Resource Management

-  Ensure proper resource management (e.g., memory, network connections).
-  Prevent resource leaks.

## 16.  Documentation Standards

-  Document functions, classes, and modules with clear and concise documentation.
-  Include examples in the documentation.
-  Update documentation as needed.

## 17.  Dependency Management

- Use a dependency management tool (e.g., Poetry, Pipenv) for managing dependencies.
- Ensure dependencies are compatible.

## 18.  Performance Considerations

-  Avoid computationally expensive operations.
-  Optimize for performance where appropriate.

## 19.  Security Considerations

-  Validate user input to prevent security vulnerabilities.
-  Sanitize data appropriately.

## 20.  Future Expansion Considerations

- Consider how this code structure will accommodate future features.
- Design for scalability.

These guidelines are a starting point and may be adapted as the project evolves. Ongoing review and refinement are crucial for maintaining the quality and maintainability of the AGENTS.md file.
```