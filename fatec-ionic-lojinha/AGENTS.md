```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure the quality, maintainability, and efficiency of all AGENTS.md files within this repository. Adherence to these principles is mandatory for all development activities.

## 1. DRY (Don't Repeat Yourself)

*   **Single Responsibility Principle:** Each agent module should have a single, well-defined responsibility.  Avoid creating multiple agents with overlapping functionality.
*   **Abstraction:** Define abstract interfaces for agents where possible. This reduces redundancy and improves flexibility.
*   **Leverage Existing Components:** Utilize existing, well-tested components whenever appropriate. Refactor only when necessary, ensuring proper documentation and testing.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimal Code:** Strive for the shortest possible code to achieve the desired functionality.
*   **Readability:** Prioritize clear and concise code. Use meaningful variable names and comments judiciously.
*   **Avoid Complexity:** Resist unnecessary complexity. Favor straightforward solutions over convoluted ones.

## 3. SOLID Principles

*   **Single Responsibility:** (As above)
*   **Open/Closed Principle:**  Agent modules should be extensible through interfaces, not by modifying their source code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without affecting the correctness of the program.
*   **Interface Segregation Principle:** Clients shouldn't be forced to depend on methods they don’t use.
*   **Dependency Inversion Principle:**  High-level modules (like agent interfaces) should be replaced by low-level modules (agent implementations).

## 4. YAGNI (You Aren't Gonna Need It)

*   **Focus on Requirements:** Prioritize development based on the explicitly defined requirements of each agent and its intended functionality.
*   **Avoid Unnecessary Features:** Resist the temptation to add features or functionality that aren’t currently required.
*   **Refactoring for the Future:** Only implement features that are demonstrably required in the future.

## 5. Code Structure & Organization

*   **File Structure:** Each file should contain a single, cohesive purpose.  Use a hierarchical file structure for better organization (e.g., `agents/agent_x.py`, `agents/agent_y.py`).
*   **Naming Conventions:** Follow a consistent naming convention (e.g., snake_case).
*   **Comments:** Provide clear and concise comments explaining complex logic or design decisions.  Use comments to *explain* the code, not just to restate what it does.
*   **Error Handling:** Implement appropriate error handling to prevent crashes and provide informative error messages.
*   **Logging:** Implement basic logging to track events and errors.

## 6.  Code Length Constraint (180 lines max)

*   All code within a file should not exceed 180 lines.
*   Any code exceeding this limit will be rejected.

## 7. Test Coverage Requirements

*   **Minimum Coverage:** 80% of code should be covered by automated tests.
*   **Test Suite:**  All agent modules must have a comprehensive suite of unit tests.
*   **Test Data:** Tests should utilize representative data for effective validation.

## 8.  Documentation

*   **Docstrings:**  Include docstrings for all functions, classes, and modules using the standard docstring format.
*   **API Documentation:** Create brief API documentation for each agent, detailing input parameters and expected outputs.  (This will be separate)

## 9. Production-Ready Considerations

*   **Code Reviews:**  Conduct regular code reviews to ensure quality and adherence to guidelines.
*   **Version Control:**  Utilize a version control system (e.g., Git) for all code.
*   **Deployment:**  Plan for deployment and testing of agent functionalities.

## 10.  Further Considerations (Future Expansion)

*   Introduce code style checks using a tool (e.g., `flake8`).
*   Implement automated unit test discovery.
*   Consider adding dependency management tools.
*   Document design decisions.

These guidelines are essential for maintaining a robust, scalable, and well-documented AGENTS.md repository.  Failure to adhere to these principles may result in challenges during development, maintenance, and future upgrades.
```