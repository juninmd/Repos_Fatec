```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure the quality, maintainability, and efficiency of all AGENTS.md files within this repository. Adherence to these principles is crucial for creating a robust and scalable AI agent system.

## 1. DRY (Don't Repeat Yourself)

*   Each function, class, or module should have a single, well-defined purpose.
*   Avoid duplicating logic.  Implement common patterns and abstractions in reusable components.
*   When creating new components, consider whether a base class or template can be used to reduce code duplication.

## 2. KISS (Keep It Simple, Stupid)

*   Strive for the simplest solution that meets the requirements.
*   Avoid unnecessary complexity.
*   Favor readability over cleverness.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class or module should have one primary responsibility.
*   **Open/Closed Principle:**  The system should be extensible without modification.  New functionality should be added through new classes/modules, not by modifying existing ones.
*   **Liskov Substitution Principle:**  Subclasses must be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Clients shouldn't be forced to depend on methods they don’t use.
*   **Dependency Inversion Principle:** Client code should not depend on a database of dependencies. Instead, the client code should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   Avoid adding functionality that is not currently required.
*   Only implement what is immediately needed.
*   Refactor only when a functional requirement changes.

## 5. Code Style & Conventions

*   **Naming Conventions:** Use snake_case for variable and function names.  Follow a consistent naming scheme (e.g., camelCase for internal components, PascalCase for public APIs).
*   **Line Length:**  Keep lines under 120 characters.
*   **Comments:**  Provide concise, explanatory comments where necessary, but avoid over-commenting.
*   **Indentation:** Use 2 spaces for indentation.
*   **Error Handling:**  Provide informative error messages and logging where appropriate.  Don't mask errors.
*   **Documentation:**  Document all functions and classes thoroughly, explaining their purpose, parameters, and return values.
*   **Code Layout:**  Organize code logically using sections, classes, and functions.

## 6.  File Length & Test Coverage

*   **Maximum Code Length:**  Each file must be less than 180 lines of code.
*   **Test Coverage:**  Ensure at least 80% of the code must be covered by tests. Test cases must be clearly defined and follow established patterns.

## 7.  Specific File Structure (Examples – Adapt to specific AGENTS.md files)

*   **`base_agent.py`:** Defines core agent functionality and provides a common structure.
*   **`agent_core.py`:** Contains the most critical core logic for individual agents.
*   **`agent_util.py`:** Provides utility functions and helper classes.
*   **`data_management.py`:** Handles data retrieval and storage.
*   **`api_client.py`:** Manages communication with external services or APIs.

## 8.  Testing Framework (Assume a basic framework)

*   All tests must be written using the provided testing framework.
*   Tests must cover all critical functionality and edge cases.
*   Testing should be designed to verify behavior, not just detect errors.

## 9.  Data Handling

*   Only use mocks for testing.  Do not simulate real data sources.
*   When using mocks, the mocks must be correctly configured to mimic real data sources.
*   Mock data should be consistent and reliable.

## 10.  Version Control

*   Use a version control system (e.g., Git) to track changes to the code.
*   Commit frequently with meaningful commit messages.

## 11.  Documentation Updates

*   All documentation updates should be saved within the source code.
*   Maintain a clear record of the changes made to documentation.

## 12.  Code Review

*   All code must be reviewed by another developer before being merged.
*   Review should focus on adherence to the guidelines outlined here.

These guidelines are subject to change and will be updated as needed.  Please read and understand these principles to ensure the quality and long-term maintainability of the AGENTS.md repository.
```