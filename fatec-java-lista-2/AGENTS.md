```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code for the AGENTS repository. Adherence to these principles will be crucial for successful development and long-term project stability.

## 1. DRY (Don't Repeat Yourself)

*   **Single Responsibility Principle:** Each agent should have a well-defined, focused responsibility. Avoid creating agents that perform multiple unrelated tasks.
*   **Code Reuse:** Leverage existing code where possible. Refactor when necessary but prioritize reducing redundancy.
*   **Abstraction:**  Use abstract classes and interfaces to decouple components and minimize duplicated logic.

## 2. KISS (Keep It Simple, Stupid)

*   **Simplicity:** Strive for the simplest solution that meets the requirements.  Avoid overly complex logic unless absolutely necessary.
*   **Readability:** Write code that is easy to understand. Use meaningful variable and function names.
*   **Minimalism:** Don't introduce unnecessary complexity.  Focus on the core functionality.

## 3. SOLID Principles

*   **Single Responsibility Principle (Continued):** Maintain single responsibility for each class/agent.
*   **Open/Closed Principle:**  Design agents to be extensible through interfaces or abstract classes, not by modifying their source code directly.
*   **Liskov Substitution Principle:** Ensure derived classes can be substituted for their base classes without affecting the correctness of the system.
*   **Interface Segregation Principle:**  Clients shouldn't be forced to implement interfaces they don't use.
*   **Dependency Inversion Principle:**  Higher-level modules should not depend on lower-level modules; they should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   **Avoid premature implementation:** Only implement features that are absolutely required for the current task. Don't build functionality you won't use.
*   **Future-Proofing:** Design for potential future requirements, but avoid over-engineering for anticipated features.

## 5. Code Style & Formatting

*   **Consistent Formatting:** Use a consistent code formatter (e.g., Black, Prettier) to enforce code style.
*   **Indentation:**  Use 2 spaces for indentation.
*   **Line Length:** Keep lines under 120 characters.
*   **Naming Conventions:**  Follow consistent naming conventions (e.g., camelCase for variables/functions).
*   **Comments:**  Write clear and concise comments only when necessary to explain complex logic or non-obvious code.  Prioritize automated documentation generation (e.g., JSDoc).

## 6. File Size Limit

*   **Maximum Code Length:** 180 lines of code per file.

## 7. Test Coverage

*   **Automated Tests:** All code must be thoroughly tested using automated unit tests.
*   **Test Driven Development (TDD):** Ideally, design tests *before* implementing the code.  Coverage targets will be defined in the project's test plan.
*   **Focus on Unit Tests:** Prioritize unit tests for individual agents and functions.

## 8.  Documentation

*   **Inline Documentation:**  Provide comprehensive inline documentation within each file, explaining key logic and design choices.
*   **Docstrings:** Use docstrings to describe the purpose, parameters, and return values of functions and classes.

## 9.  Repository Structure

*   **Clear Directory Structure:** Organize files into logical directories (e.g., by agent type, functionality).
*   **Meaningful Names:**  Use descriptive names for files and directories.

## 10.  Tools & Technologies

*   [Specify language and framework(s) used here - e.g., Python, Flask, SQLAlchemy]
*   [Specify any specific tools or libraries to be used - e.g., pytest, Jest]

## 11.  Collaboration

*   **Code Reviews:** All code changes must undergo rigorous code reviews before being merged.
*   **Regular Integration:**  Establish a process for integrating changes regularly.
*   **Version Control:** Use Git for version control and maintain a well-organized commit history.

## 12.  Testing Procedures**

*   **Test Suite:**  Define a comprehensive test suite covering all agents and key functionalities.
*   **Test Data:** Utilize realistic test data for thorough assessment.
*   **Regression Testing:** Implement regression testing to ensure new changes don't break existing functionality.

## 13.  Future Considerations**

*   [Include areas for potential expansion – e.g., API documentation, error handling, monitoring]

These guidelines are a starting point.  Flexibility and adaptation will be necessary as the project evolves.  Regular review and updates are encouraged.
```