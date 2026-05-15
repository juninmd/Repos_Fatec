```markdown
# AGENTS.md - AI Coding Agent Guidelines

These guidelines detail the standards for development of AI coding agents within this repository. Adherence to these principles is crucial for maintainability, reliability, and efficient development.

## 1. DRY (Don't Repeat Yourself)

*   **Single Responsibility Principle:** Each agent should have a single, well-defined purpose. Avoid creating multiple agents with similar functionality.
*   **Component Reusability:** Design agents to be modular and reusable across different projects or contexts.
*   **Code Patterns:** Utilize established code patterns and design principles consistently across the codebase.
*   **Abstraction:** Define abstract interfaces for agent components, allowing for easy substitution and modification.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimal Code:** Strive for concise and readable code. Avoid unnecessary complexity.
*   **Clear Logic:** Ensure the agent's logic is easily understood and debuggable.
*   **Simple Structures:** Use straightforward data structures and algorithms.
*   **Avoid Over-Engineering:** Resist the urge to create overly complex solutions for simple tasks.

## 3. SOLID Principles

*   **Single Responsibility:** Agents should be primarily focused on a single task (e.g., data processing, logic execution, output generation).
*   **Open/Closed Principle:**  Agent components should be easily extensible through well-defined interfaces.  New functionality should be added without modifying existing components.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients shouldn't be forced to implement interfaces they don't use.
*   **Dependency Inversion Principle:** High-level modules (agents) should not depend on low-level modules.

## 4. YAGNI (You Aren't Gonna Need It)

*   **Future-Proofing:**  Avoid implementing features or functionalities that are likely to be obsolete or superseded in the future.
*   **Focus on Current Tasks:**  Maintain the core functionality of an agent without introducing new requirements that are not currently needed.
*   **Refactoring:** Refactor code only when it demonstrably improves usability, performance, or maintainability - not for the sake of adding new features.

## 5. Code Structure & Organization

*   **Modular Design:**  Each agent should be encapsulated within a logical module.
*   **Clear Comments:** Provide clear and concise comments explaining the purpose of code blocks and complex logic.
*   **Documentation:**  Document APIs, data structures, and algorithms used by agents.
*   **Error Handling:** Implement robust error handling to prevent crashes and provide informative error messages.
*   **Input Validation:** Validate all input data to ensure correctness and prevent unexpected behavior.
*   **Testability:** Design agents with testability in mind, using clear separation of concerns and well-defined interfaces.

## 6. Code Length Constraint (180 lines max)

*   **Maximum Code per File:**  Each file must not exceed 180 lines of code.  Code must be thoroughly commented and logically organized to meet this requirement.

## 7. Test Coverage Requirements (80%+)

*   **Comprehensive Testing:** All agent components must be thoroughly tested with unit tests, integration tests, and end-to-end tests.
*   **Test Case Design:**  Test cases should cover a wide range of input values and scenarios.
*   **Test Data Management:**  Use realistic and representative test data.
*   **Automated Testing:**  Implement automated testing for all critical agent functionalities.

## 8. File Structure & Conventions

*   **Root Directory:**  All files must reside in the `AGENTS.md` root directory.
*   **Naming Conventions:**  Follow consistent naming conventions (e.g., camelCase for variables and functions, snake_case for classes).
*   **File Types:**  Use `.md` as the file type for all documentation.
*   **Version Control:**  Utilize Git for version control.

## 9.  Specific Guidelines for Agent Design

*   **Data Abstraction:** Agents should rely heavily on data abstraction to minimize coupling and improve maintainability.
*   **Event-Driven Architecture:**  Consider an event-driven architecture for agent communication and event handling.
*   **Configuration:**  Design agents to be easily configurable through configuration files.
*   **Logging:** Implement comprehensive logging to aid in debugging and monitoring.

## 10.  Future Considerations

*   **Code Style Guide:**  Establish and adhere to a consistent code style guide.
*   **Tooling:** Utilize appropriate tooling for code analysis and linting.
*   **Documentation Generator:** Integrate with a documentation generator (e.g., Sphinx) to automatically produce API documentation.

These guidelines are intended as a foundation for developing high-quality AI coding agent software.  They are subject to revision as the project evolves.
```