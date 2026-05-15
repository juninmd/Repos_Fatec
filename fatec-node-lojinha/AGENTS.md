```markdown
# AGENTS.md Guidelines

These guidelines are designed to ensure the consistent, maintainable, and high-quality development of the AGENTS repository. Adherence to these principles is mandatory for all AI coding agents.

## 1. DRY (Don't Repeat Yourself)

*   All code should be encapsulated within reusable components and functions.
*   Avoid duplicating logic across multiple files.
*   Leverage existing libraries and frameworks whenever possible.
*   Promote modular design; each component should have a well-defined purpose.

## 2. KISS (Keep It Simple, Stupid)

*   Strive for the simplest possible solution that meets the requirements.
*   Avoid unnecessary complexity.
*   Prioritize readability and ease of understanding.
*   Code should be easily understandable by other AI agents or humans.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class or function should have one and only one reason to change.
*   **Open/Closed Principle:**  The system should be open for extension but closed for modification.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Client code should not be forced to depend on implementation details.
*   **Dependency Inversion Principle:** High-level modules should not depend on low-level modules; they should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   Only implement functionality that is explicitly required.
*   Refrain from adding features that are not currently needed.
*   Avoid premature optimization; focus on core functionality first.
*   Prioritize functionality completion over unnecessary complexity.

## 5. Development Workflow & Code Standards

*   **File Structure:** Each file must be named with a clear and descriptive name indicating its purpose. Example: `agent_module.py` for a specific module.
*   **Documentation:**  Provide clear and concise documentation within code comments or separate documentation files using a standard format (e.g., reStructuredText).
*   **Naming Conventions:**  Consistent naming conventions are crucial.  Use snake_case for variables and functions.
*   **Line Length:**  Code lines should be limited to a maximum of 180 characters.
*   **Commenting:**  Comments should be concise and explain *why* the code is doing something, not *what* it's doing.
*   **Error Handling:** Implement robust error handling to gracefully manage potential issues.
*   **Testability:** Prioritize writing unit tests to verify code correctness.

## 6. Testing & Coverage

*   **Unit Tests:** All code must be thoroughly unit tested.
*   **Test Driven Development:**  Tests should be written *before* the code.
*   **Coverage Target:**  Aim for at least 80% test coverage.  Use a coverage tool (e.g., `coverage.py`) to measure coverage and identify gaps.
*   **Test Case Design:** Tests should be designed to specifically validate key functionalities.
*   **Mocking:**  Utilize mocks and stubs during testing to isolate components. **Do not** use fake implementations for real data or interactions.

## 7. Code Quality & Maintainability

*   **Readability:** Code should be easy to read and understand.
*   **Maintainability:**  Code should be easy to modify and extend.
*   **Refactoring:**  Regularly refactor code to improve its structure and design.
*   **Code Reviews:**  Code should be reviewed by other AI agents before deployment.

## 8.  Data Handling (Mocks Only - not part of code)

*   All data interactions should be encapsulated within mocks.
*   Mocks should accurately simulate the behavior of real data sources and systems.
*   Mocks should provide controlled and predictable data input.
*   Data formats and schemas should be clearly defined and documented.

## 9.  Specific Guidelines for AGENTS**

*   The AGENTS repository should primarily focus on agent functionality and data management.
*   All code related to agent discovery, routing, and execution must be prioritized.
*   Data persistence and storage should be handled appropriately with careful consideration of security and integrity.
*   Logging should be implemented effectively to aid in debugging and monitoring.

These guidelines are intended as a starting point.  Updates or modifications may be implemented as the repository evolves.  Continuous monitoring and improvement are essential.
```