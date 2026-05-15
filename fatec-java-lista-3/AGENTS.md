```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines are designed to ensure the creation and maintenance of high-quality AI coding agents within this repository. Adherence to these principles is crucial for maintaining a robust, scalable, and maintainable codebase.

## 1. DRY (Don't Repeat Yourself)

*   All functions, classes, and modules should have single, well-defined purposes.
*   Avoid duplication of logic and data structures across different components.
*   Implement reusable components and abstractions.
*   When a component needs to perform multiple tasks, consider creating a specialized component.

## 2. KISS (Keep It Simple, Stupid)

*   Prioritize clarity and readability above all else.
*   Design code that is easy to understand and debug.
*   Minimize complexity.
*   Avoid unnecessary lines of code.
*   Strive for maximum self-documenting code.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
*   **Open/Closed Principle:**  The system should be open for extension but closed for modification.  New functionality should be added without altering existing code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Client code should not be forced to depend on abstraction methods that it does not use.
*   **Dependency Inversion Principle:** High-level modules should not depend on low-level modules.  They should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   Only implement features that are explicitly required and have a clear purpose.
*   Avoid adding functionality simply because it *might* be useful in the future.
*   Focus on delivering working code first, then consider future enhancements.

## 5. Code Structure & Organization

*   **File Size:** Each file should ideally be under 180 lines of code.  Any code exceeding this limit will be rejected.
*   **Naming Conventions:** Use consistent and descriptive naming conventions for files, functions, and variables.  Example: `agent_module.py`, `process_data.py`, `user_model.py`.
*   **Comments:**  Provide clear and concise comments where necessary to explain complex logic or reasoning.  Avoid unnecessary comments.  Focus on *why* the code is doing something, not *what* it's doing.
*   **Modularization:** Break down large, complex modules into smaller, more manageable components.
*   **Data Structures:** Carefully consider the choice of data structures to ensure efficient and predictable use.
*   **Error Handling:** Implement robust error handling to prevent unexpected crashes and provide informative error messages.

## 6. Testing

*   All development must be productive.  Tests are generated automatically.
*   Tests are focused on verifying core functionality and critical path requirements.
*   Test coverage should be monitored and maintained.
*   Tests should be fast and reliable.

## 7.  AI Agent Specific Guidelines

*   **State Management:** Design state management strategy clearly and consistently.  State should be immutable and accessible.
*   **Memory Management:**  Implement memory management strategies (e.g., automatic garbage collection) within the agent's framework.
*   **Agent Lifecycle:** Define a lifecycle for agents, including initialization, initialization, and shutdown procedures.
*   **Input/Output:**  Clearly define expected input and output formats, and provide mechanisms for validation.
*   **Logging:**  Implement comprehensive logging to track agent behavior and debug issues.

## 8.  Code Quality

*   **Readability:** Prioritize code clarity and readability, making it easy for other AI agents to understand.
*   **Maintainability:**  Write code that is easy to modify and extend in the future.
*   **Documentation:** Provide clear and concise documentation for all functions, classes, and modules.

## 9.  Automation & Version Control

*   Automated linting and formatting will be implemented to enforce coding style.
*   Commit changes frequently.
*   Utilize a robust version control system (e.g., Git).

## 10.  Further Considerations

*   **Data Validation:** Incorporate data validation steps where applicable to ensure data integrity.
*   **Security:**  Implement basic security measures to mitigate potential risks (e.g., input sanitization).
*   **Scalability:**  Consider scalability requirements when designing the codebase.

These guidelines are designed to serve as a starting point and will be refined as the project evolves.  Continuous review and adaptation are key to maintaining the quality and maintainability of the AGENTS.md repository.
```