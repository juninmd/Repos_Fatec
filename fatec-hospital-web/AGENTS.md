```markdown
# AGENTS.md Guidelines

These guidelines are designed to ensure the quality, maintainability, and efficiency of all AGENTS.md files within this repository. Adherence to these principles is crucial for a robust and scalable codebase.

## 1. DRY (Don't Repeat Yourself)

- Every function, class, and module should have a single, well-defined purpose.
- Avoid duplicate code.  Refactor existing code to eliminate redundancies.
- Utilize inheritance and composition judiciously to break down complex logic into manageable components.

## 2. KISS (Keep It Simple, Stupid)

- Strive for clarity and readability.
- Prioritize simple solutions over overly complex ones.
- Minimize cognitive load for developers.
-  Keep functions short and focused – aim for a maximum of 50-70 lines of code for most functions.

## 3. SOLID Principles

- **Single Responsibility Principle:** Each class/module should have one, and only one, reason to change.
- **Open/Closed Principle:**  The system should be extensible without modifying the core logic.  New functionality should be added via new classes/modules, not modifications to existing ones.
- **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
- **Interface Segregation Principle:** Client code should not be forced to depend on implementation details of obsolete or unnecessary interfaces.
- **Dependency Inversion Principle:** Interfaces should drive implementation details, and concrete classes should depend on abstractions.

## 4. YAGNI (You Aren't Gonna Need It)

- Avoid implementing features that are not currently required.
-  Focus development on core functionality and essential requirements.
-  Refactor code to remove unnecessary implementation details and assumptions.

## 5. Code Style & Formatting

- Consistent indentation (2 spaces).
- Use a code formatter (e.g., Prettier) for automatic code formatting.
- Follow established coding conventions (e.g., Google Style Guide).
- Use descriptive variable and function names.
- Comments should explain *why* not *what*.

## 6. File Size Limits

- Each file shall not exceed 180 lines of code.
-  Files must be logically separated.
-  Avoid large, monolithic files.

## 7. Test Coverage Requirements

- Target 90% of the code should be covered by automated tests.
-  Tests should validate key functionality and expected behavior.
-  Focus testing on critical paths and potential failure scenarios.

## 8. Testing Frameworks

- Utilize a robust testing framework (e.g., Pytest, unittest) within the AGENTS.md repository.
- Ensure all tests are unit-tested and provide clear assertions.
-  Test coverage reports should be readily accessible.

## 9. Dependency Management (Within Repository)

- All dependencies must be clearly documented and managed within the repository.
- Version control should be strictly enforced.
- Dependencies should be listed as prerequisites for any generated code.

## 10.  Code Structure & Organization

- Use clear and consistent directory structures.
- Group related files and modules.
-  Follow a logical hierarchy.

## 11.  Documentation Requirements

-  Each module/class/function should have a brief description of its purpose and inputs/outputs.
-  Include a simple README file describing the purpose of the repository.

## 12.  Traceability

-  The repository should be easily traceable to its components.
-  All related code should be linked.

## 13.  Error Handling

-  All functions should handle potential errors gracefully.
-  Provide informative error messages.

## 14.  Data Structures & Algorithms

- Utilize appropriate data structures for efficient operations.
-  Avoid unnecessary complexity.

## 15.  Algorithm Design & Implementation

-  Where applicable, document the algorithm design and rationale.
-  Keep algorithms simple and well-commented.

## 16.  Maintainability Considerations

-  Design code to be easily adaptable to future changes.
-  Use design patterns where appropriate.

## 17.  Security Considerations (Within Repository)

-  Implement basic input validation to prevent security vulnerabilities.
-  Follow secure coding practices.

## 18.  Version Control (Git)

-  Use appropriate branching strategies (e.g., Gitflow).
-  Commit frequently with meaningful messages.
-  Branch out for new features and bug fixes.

These guidelines are intended as a starting point and may be subject to change as the project evolves.  Regular review and updates are encouraged.
```