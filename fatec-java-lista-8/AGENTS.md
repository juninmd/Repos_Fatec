```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code within the AGENTS repository. Adherence to these principles is mandatory for all development activities.

## 1. DRY (Don't Repeat Yourself)

*   **Module Decomposition:** Each module should have a single, well-defined responsibility.
*   **Function/Method Abstraction:**  Abstract common logic into reusable functions and methods.  Avoid duplication.
*   **Template Creation:** Utilize templates where applicable to standardize code and reduce repetition.
*   **Single Responsibility Principle:** Each component should have one, and only one, primary purpose.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimal Code:** Strive for the shortest code that effectively achieves the desired outcome.
*   **Readability:** Prioritize clear and understandable code. Use meaningful variable and function names.
*   **Avoid Complexity:** Resist unnecessary abstractions or complex logic.
*   **Simplicity in Design:**  Design complex systems with simple, logical components.

## 3. SOLID Principles

*   **Single Responsibility:**  Each class/module/function should have a single, well-defined responsibility.
*   **Open/Closed Principle:**  The system should be extensible without modification. New features should be added through new code, not by modifying existing code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to depend on methods they do not use.
*   **Dependency Inversion Principle:**  Higher-level modules should not depend on implementation details; they should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   **Future-Proofing:** Only implement features that are currently required.  Do not introduce unnecessary complexity or features that might be obsolete.
*   **Progressive Refinement:**  Build incrementally, adding features as the system evolves.
*   **Avoid Feature Creep:** Resist the temptation to add features that are not currently needed.

## 5. Code Style & Formatting

*   **Indentation:** Use 2 spaces for indentation.
*   **Line Length:** Keep lines under 120 characters.
*   **Naming Conventions:** Follow established naming conventions (e.g., `snake_case` for variables and functions).
*   **Commenting:**  Provide clear and concise comments explaining complex logic or non-obvious code.
*   **Docstrings:**  Write comprehensive docstrings for all functions and classes, explaining their purpose, parameters, and return values.

## 6. Testing

*   **Unit Tests:** All code must be thoroughly unit tested.
*   **Test Coverage:** Aim for 80% test coverage.  Automated testing is required.
*   **Test Data:** Utilize mocks and simulated data for testing purposes.  Do not use real-world data.
*   **Test-Driven Development:**  Write tests before writing the code.

## 7. File Size Constraints

*   **Maximum File Size:** Each file shall not exceed 180 lines of code.

## 8. Development Workflow

*   **Version Control:**  Use Git for version control.
*   **Code Reviews:**  All code changes must be reviewed by at least one other developer.
*   **Continuous Integration (CI):**  Automate testing and code analysis with a CI pipeline.
*   **Static Analysis:** Utilize static analysis tools to detect potential issues.


## 9.  Documentation

*   **README:**  A comprehensive README file describing the project's purpose, setup instructions, and usage.
*   **API Documentation:**  Clearly document all APIs and functions.


## 10.  Agencies Specific Rules (Example – Adjust as needed):

*   **Broker Rules:** Define clear rules for broker behavior and management.
*   **Data Access Rules:** Document all data access strategies and security considerations.
*   **Communication Protocols:** Outline the protocols used for agent communication.

```