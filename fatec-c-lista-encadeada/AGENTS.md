```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure the consistent and high-quality development of the AGENTS repository. Adherence to these principles is mandatory for all development efforts.

## 1. DRY (Don't Repeat Yourself)

*   All code should have a single, well-defined purpose.
*   Avoid duplication of logic, data structures, and implementations.
*   Refactor code to eliminate redundant elements whenever possible.
*   When a similar functionality exists in multiple places, consider creating a utility function or module to encapsulate it.

## 2. KISS (Keep It Simple, Stupid)

*   Strive for the simplest solution that meets the requirements.
*   Avoid unnecessary complexity.
*   Prioritize readability and maintainability.
*   Don’t introduce abstractions unless absolutely necessary.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
*   **Open/Closed Principle:**  The system should be extensible without modifying its existing code. Utilize interfaces or abstract classes where appropriate.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to cater to methods they do not use.
*   **Dependency Inversion Principle:** Higher-level modules should not depend on lower-level modules.  Instead, they should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

*   Avoid implementing functionality that is not currently required.
*   Focus solely on what's necessary for the current task.
*   Refactor to remove unnecessary code before implementing.
*   Don’t add features just because they’re possible; only add features that solve a demonstrable problem.

## 5. Code Formatting & Style

*   Use a consistent code style (e.g., black-squared spacing).
*   Follow a standard code formatter (e.g., Prettier or autopep8).
*   Use meaningful variable and function names.
*   Add comments to explain complex logic and non-obvious decisions.
*   Employ consistent indentation (2 spaces).

## 6. File Structure & Organization

*   Each file should focus on a single, logical unit of functionality.
*   Use a clear directory structure.
*   Consider a modular architecture with well-defined components.
*   Maintain a README file explaining the purpose of each file and its dependencies.

## 7. Testing

*   All development must be productive.
*   Mocking and stubbing are EXCLUSIVITY for testing.  Real implementations should be avoided.
*   Unit tests must pass with a minimum coverage of 80%.
*   Test coverage will be measured using [Specify Coverage Tool - e.g., Istanbul].

## 8. Code Length & Complexity

*   Maximum code length: 180 lines.
*   Code complexity score:  Maintain a complexity score (e.g., using the Complexity Pyramid) to guide refactoring.  Higher scores require more attention.
*   Each function/class should have a single responsibility.

## 9.  Agencies Specific Considerations

*   All agents must adhere to the established agent design principles outlined in [Link to Design Document].
*   Data handling procedures must be documented clearly.
*   Error handling mechanisms must be robust and documented.
*   Communication protocols must be clearly defined.

## 10.  Version Control

*   Use a version control system (e.g., Git) with appropriate branching and merging strategies.
*   Establish a clear branching strategy (e.g., Gitflow).
*   Commit messages should be concise and informative.

## 11.  Dependencies

*   All dependencies must be listed in a `requirements.txt` file.
*   Dependencies should be managed using a dependency management tool (e.g., pip, Poetry).

## 12.  Documentation

*   Provide clear and concise documentation for all functions, classes, and modules.
*   Include examples of how to use the code.
*   Update documentation whenever necessary.

## 13.  Code Review

*   All code must be reviewed by at least one other team member.
*   Review should focus on adherence to SOLID principles, DRY, KISS, and YAGNI.

## 14.  Continuous Integration/Continuous Deployment (CI/CD)

*   Implement a CI/CD pipeline for automated testing and build verification.
*   Run tests on every commit.
*   Automate deployments whenever possible.

## 15.  Maintenance

*   Code should be easily understandable and maintainable for future developers.
*   Write comments to explain the reasoning behind difficult parts of the code.
*   Consider creating a "reference" file detailing important design choices.

These guidelines are to be interpreted and enforced. Violations may result in penalties, including but not limited to code review and potential project termination.
```