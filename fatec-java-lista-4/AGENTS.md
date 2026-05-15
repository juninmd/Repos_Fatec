```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code within the AGENTS repository. Adherence to these principles is crucial for building robust and scalable AI agent systems.

## 1. DRY (Don't Repeat Yourself)

*   All logic and functionality should be encapsulated within reusable components or modules.
*   Avoid duplicating code across multiple files.
*   When a component logically needs to be reused, create a new file and inherit its functionality.

## 2. KISS (Keep It Simple, Stupid)

*   Prioritize clarity and readability over complex or unnecessary features.
*   Use simple, straightforward code constructs.
*   Avoid over-engineering solutions.
*   Strive for minimal code with maximum impact.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each class/component should have one and only one reason to change.
*   **Open/Closed Principle:**  The system should be open for extension but closed for modification.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Client code shouldn’t be forced to depend on methods it doesn’t use.
*   **Dependency Inversion Principle:** High-level modules should be dependent on low-level modules, and vice-versa.

## 4. YAGNI (You Aren't Gonna Need It)

*   Implement only the necessary functionality for the current task or feature.
*   Don't introduce features or code that are not currently required.
*   Refactor only when necessary, not as a consequence of new features.

## 5. Development Process & Structure

*   **Modularization:** Break down the system into well-defined modules with clear responsibilities.
*   **Component-Based Design:**  Design the system around reusable components that can be easily combined.
*   **Abstraction:**  Hide implementation details behind well-defined interfaces.
*   **Documentation:**  Provide clear and concise documentation for each module, component, and function.
*   **Version Control:** Use a robust version control system (e.g., Git).
*   **Code Reviews:**  Mandatory code reviews for all new code.
*   **Testing:** Comprehensive unit and integration tests are required.

## 6. File Size & Content

*   **Maximum Code Length:** 180 lines of code.
*   **File Structure:**
    *   `components/`:  Contains reusable components.
    *   `modules/`: Contains modules with specific functionality.
    *   `data/`:  Stores data used by the system (avoid storing sensitive data directly).
    *   `scripts/`:  Contains scripts for testing and automation.
    *   `README.md`:  Provide a clear overview of the project, including setup instructions and API documentation.
*   **File Naming Conventions:** Use consistent file naming conventions.

## 7.  Testing

*   **Unit Tests:**  Aim for 80% test coverage using unit tests.
*   **Integration Tests:**  Cover key interactions between components.
*   **Test Cases:**  Create detailed test cases that exercise all critical functionalities.
*   **Test Data Management:**  Use a consistent approach to managing test data.
*   **Test Data Variety:** Utilize diverse test data to ensure robustness.

## 8.  Code Standards & Best Practices

*   Use meaningful variable and function names.
*   Write clear and concise comments.
*   Follow established coding style guidelines (e.g., PEP 8 for Python).
*   Implement proper error handling.

## 9.  Specific Considerations (Example - for a hypothetical 'AgentManager' module)

*   **API Design:** Define clear and documented API contracts for interaction.
*   **Data Structures:** Use appropriate data structures for efficiency.
*   **Error Handling:** Implement robust error handling to prevent crashes.

## 10.  Documentation - API Reference**

*   A comprehensive API reference detailing all functions and classes must be maintained.

These guidelines are essential for the success of this AGENTS.md file and the overall development of the AI agent system.  All development must prioritize the principles outlined above.
```