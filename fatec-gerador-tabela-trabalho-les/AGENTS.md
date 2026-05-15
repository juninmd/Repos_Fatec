```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines are designed to ensure high-quality, maintainable, and robust AI coding agent development.  Strict adherence to these principles will be critical for a successful project.

## 1. DRY (Don't Repeat Yourself)

*   **Module-Based Structure:**  All logic, data structures, and utility functions should be encapsulated within individual modules.  Avoid duplicating code across multiple files.
*   **Generic Components:**  Create reusable components (e.g., data transformers, network interface classes) that can be used in multiple agent instances or variants.
*   **Abstraction:**  Define abstract interfaces for agent functionality.  This allows for easy swapping of implementations without modifying the core logic.
*   **Standardized Function Definitions:**  Use a consistent naming convention for functions and methods, utilizing descriptive names that clearly indicate their purpose.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimalism:**  Strive for the simplest solution that meets the requirements. Avoid unnecessary complexity.
*   **Readability:**  Code should be easily understood by other developers (including future you!).  Use clear variable names, comments, and indentation.
*   **Simplicity of Logic:**  Each logical step should have a single, well-defined purpose.  Break down complex tasks into smaller, manageable sub-tasks.

## 3. SOLID Principles

*   **Single Responsibility Principle:**  Each class or module should have a single, well-defined responsibility.
*   **Open/Closed Principle:**  The system should be extensible through the addition of new features without modifying existing code. (This is addressed through modular design.)
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.  (This principle doesn't directly apply to agent code, but good design minimizes dependencies.)
*   **Interface Segregation Principle:**  Clients shouldn’t be forced to establish dependencies on other clients.

## 4. YAGNI (You Aren't Gonna Need It)

*   **Avoid Over-Implementation:** Do not implement functionalities or features that are not currently required. Focus on the necessary requirements for the current task.
*   **Reactive Design:** Architect the agent to respond to changes in the environment, rather than attempting to predict all possible changes beforehand.
*   **Focus on Core Logic:** Prioritize the essential actions and data required to achieve the agent's purpose.

## 5. Development Guidelines

*   **Code Reviews:** All code must undergo thorough peer reviews before merging into the main branch.
*   **Unit Testing:**  All new code should be thoroughly tested through unit tests.  Tests must cover all critical functionalities.
*   **Documentation:**  Document code clearly with comments and documentation explaining the purpose and functionality of each component.
*   **Error Handling:** Implement robust error handling to gracefully manage unexpected situations.  Avoid exposing detailed error messages.
*   **Logging:**  Use logging strategically to monitor agent behavior and debug issues.

## 6. Code Constraints

*   **Maximum Code Lines:**  Each file must not exceed 180 lines of code.
*   **Line Length:**  Maximum line length per file: 120 characters (including spaces).
*   **Variable Declaration:**  Variables should be declared before use. Avoid implicit type declarations.

## 7. Testing

*   **Unit Testing:**  All code should be thoroughly tested with unit tests.
*   **Integration Tests:** Integration tests should cover all interactions between modules.
*   **Regression Tests:**  Run regression tests after any code changes to ensure that existing functionality remains intact.
*   **Coverage Reports:**  Generate coverage reports (using tools like `coverage.py`) to verify code coverage.
*   **Test-Driven Development (TDD):**  Consider a TDD approach, writing tests before implementation.

## 8.  Specific Considerations for AGENTS.md

*   **Agent Configuration:** The `agents.yml` file should contain a detailed configuration for each agent instance.
*   **State Management:**  Define a clear strategy for managing agent states (e.g., using a state machine or a persistent store).
*   **Communication Protocols:** Document the communication protocols used by agents (e.g., message queues, APIs).
*   **Data Serialization/Deserialization:** Use standardized serialization formats like JSON or Protocol Buffers.

## 9.  Future Considerations

*   **Dependency Injection:** Design the agent to rely on external dependencies through dependency injection.
*   **Configuration Management:** Implement a robust mechanism for managing agent configurations.
*   **Monitoring:** Integrate monitoring tools to track agent performance and identify potential issues.

```markdown