# AGENTS.md Guidelines

These guidelines are designed to ensure consistent, maintainable, and effective development for all AI coding agents within this repository. Adherence to these principles is mandatory.

## 1. DRY (Don't Repeat Yourself)

*   **Single Responsibility Principle:** Each agent should have a single, clearly defined purpose.  Avoid creating agents with overly broad responsibilities.
*   **Module Reuse:** Design agents to be modular, allowing for reuse of components and functionalities across different projects.
*   **Abstraction:**  Clearly define abstract interfaces for agents, hiding implementation details.
*   **Standardized Components:** Utilize a library of common components and utilities and ensure their consistent implementation.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimal Code:** Strive for the shortest possible code that achieves the desired functionality.
*   **Readability:** Code should be easily understandable by other developers (including your future self).
*   **Simple Logic:** Favor straightforward algorithms and avoid complex, convoluted code.
*   **Avoid Unnecessary Complexity:** Resist adding features unless they demonstrably improve functionality.

## 3. SOLID Principles

*   **Single Responsibility:** Each class and agent should have a single reason to change.
*   **Open/Closed Principle:**  Agents should be extensible through APIs, not by modifying their core code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be required to know about methods they don't use.
*   **Dependency Inversion Principle:**  High-level modules (agents) should be dependent on abstractions (interfaces), not concrete implementations.

## 4. YAGNI (You Aren't Gonna Need It)

*   **Avoid Future-Proofing:**  Do not implement features or functionalities that are unlikely to be needed in the future.  Focus on the current requirements.
*   **Future-Proofing is a Cost:** Implementing future features should not be prioritized at the expense of maintaining current functionality.

## 5. Code Quality & Style

*   **Naming Conventions:** Use consistent naming conventions for variables, functions, and classes. (e.g., snake_case for variables, PascalCase for classes).
*   **Code Formatting:** Adhere to a consistent code formatting style (e.g., using a linter).
*   **Comments:** Provide concise and informative comments where necessary, but avoid excessive commenting. Comments should explain *why*, not *what*.
*   **Error Handling:** Implement basic error handling for critical operations.
*   **Logging:**  Use logging for debugging and monitoring purposes.

## 6. Development Workflow & Best Practices

*   **Version Control:** Utilize Git for version control and branch management.
*   **Code Reviews:** Conduct thorough code reviews to identify potential issues and ensure adherence to best practices.
*   **Unit Testing:**  All agents must have comprehensive unit tests covering all core functionalities.  A minimum of 80% code coverage should be achieved.
*   **Static Analysis:** Employ static analysis tools to detect potential errors and code quality issues.
*   **Documentation:**  Document agent APIs and interactions, when necessary.

## 7. Length & Complexity Limits

*   **Maximum Code Length:** 180 lines of code per file.
*   **File Size Limit:**  Maximum 1500 words (including comments).

## 8.  Testing

*   **Test Coverage:**  The codebase must achieve at least 80% test coverage.  This includes unit tests, integration tests, and potentially end-to-end tests if applicable.
*   **Test-Driven Development (TDD):**  Prioritize writing tests *before* writing the code.

## 9. Specific Considerations

*   **Agent Interaction:**  Clearly define how agents will interact with each other and external systems.
*   **Data Handling:**  Specify how data will be handled and stored.
*   **Error Handling Strategies:** Design clear error handling strategies for each agent.


These guidelines are subject to change, but are intended to guide the development process and ensure the overall quality of this repository.