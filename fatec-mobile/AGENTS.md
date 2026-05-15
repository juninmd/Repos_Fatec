```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure a consistent, efficient, and maintainable codebase for our AI agents. Adherence to these principles will significantly improve the quality and reliability of our agent development.

**1. DRY (Don't Repeat Yourself)**

*   **Avoid duplicating code.**  Every function, class, and module should have a single, well-defined purpose.
*   **Refactor duplicate code** into reusable components.  Unit tests should demonstrate the functionality of refactored code.
*   **Leverage existing libraries and frameworks.**  Don't reinvent the wheel unless absolutely necessary and clearly documented.

**2. KISS (Keep It Simple, Stupid)**

*   **Prioritize clarity over complexity.**  Keep code concise and easy to understand.
*   **Use meaningful names.** Variable, function, and class names should clearly indicate their purpose.
*   **Minimize complexity.** Avoid overly intricate logic or dependencies.
*   **Focus on essential functionality.** Ensure each code element contributes to the overall goal.

**3. SOLID Principles**

*   **Single Responsibility Principle:** Each class/module should have a single, well-defined responsibility.
*   **Open/Closed Principle:**  The system should be extensible without modifying the existing code.  New functionality should be added through new classes/modules, not by modifying existing ones.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without affecting the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to implement interfaces they do not use.
*   **Dependency Inversion Principle:**  High-level modules should not depend on low-level modules.

**4. YAGNI (You Aren't Gonna Need It)**

*   **Avoid premature implementation.**  Only write the code that is absolutely required at the current moment.
*   **Focus on the immediate task.**  Don't add functionality that is not essential for the current iteration.
*   **Refactor as needed.**  If new functionality emerges, refactor the existing code to accommodate it.  Don't introduce unnecessary complexity.

**5. Code Length & Structure**

*   **Maximum Code Length:** 180 lines per file.
*   **File Structure:**  Organize files logically, following a clear directory structure.  Use consistent naming conventions.
*   **Comments:**  Provide concise and helpful comments where necessary to explain complex logic or non-obvious code.  But avoid redundant comments.
*   **Documentation:**  Use docstrings within functions and classes to clearly explain their purpose, parameters, and return values.

**6. Testing & Quality**

*   **All Development Must Be Productive:**  Prioritize the creation of effective unit tests.
*   **Test Coverage:** Aim for at least 80% test coverage.  Tools like `pytest` or `unittest` should be used.
*   **Test-Driven Development:** Write tests before writing code, whenever possible.
*   **Unit Tests:** Create comprehensive unit tests for all functions and classes.
*   **Integration Tests:** Conduct integration tests to ensure different components work correctly together.
*   **Regression Tests:**  Automate regression tests to catch regressions caused by code changes.

**7.  Specific Considerations for AGENTS.md**

*   **Agent Classes:**  Each agent class should have a clear purpose and responsibilities.
*   **Agent Modules:**  Divide the agent into manageable modules for better organization.
*   **State Management:**  Clearly define how agent state is managed.
*   **Communication Protocols:**  Document any communication protocols used by agents (e.g., message queues, APIs).
*   **Error Handling:**  Implement robust error handling and logging.
*   **Configuration:**  Allow for configuration of agents with minimal changes.

**8. Tooling & Infrastructure**

*   **Version Control:** Use Git for version control.
*   **Code Style:**  Enforce a consistent code style using a linter (e.g., `flake8`, `pylint`).
*   **Static Analysis:** Utilize static analysis tools to detect potential issues.
*   **Continuous Integration/Continuous Deployment (CI/CD):** Implement a CI/CD pipeline for automated testing and deployment.

**9.  Documentation**

*   **README.md:** Provide a README file explaining the purpose of the AGENTS.md file, its usage, and key concepts.
*   **API Documentation:** Create API documentation (using tools like Swagger/OpenAPI) for any APIs exposed by the agent system.

```