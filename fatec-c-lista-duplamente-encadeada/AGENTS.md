```markdown
# AGENTS.md - Guidelines for AI Coding Agents

These guidelines are designed to ensure the development of high-quality, maintainable, and robust AI coding agents. Adherence to these principles will significantly improve the overall quality of our project.

## 1. DRY (Don't Repeat Yourself)

*   **Modular Design:** Each agent should have a single, well-defined responsibility.  Avoid creating duplicated code within a single agent.
*   **Abstraction:**  Where possible, abstract common functionalities into reusable components.
*   **Template-Based Code:** Use templates for common structures (e.g., data structures, response generation) to reduce boilerplate.
*   **Consistency:** Maintain a consistent coding style and naming conventions across all agents.

## 2. KISS (Keep It Simple, Stupid)

*   **Minimal Complexity:** Strive for the simplest solution that meets the requirements. Avoid overly complex logic or intricate data structures unless absolutely necessary.
*   **Clear Logic:** Ensure that each agent’s behavior is clearly and explicitly documented.
*   **Readability:** Prioritize code readability. Use meaningful variable names and comments judiciously.

## 3. SOLID Principles

*   **Single Responsibility Principle:** Each agent should have one primary responsibility.
*   **Open/Closed Principle:** Agents should be extensible through well-defined interfaces, without modifying their existing code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:** Client code should not be required to depend on methods it doesn’t use.
*   **Dependency Inversion Principle:** Client code should not depend on implementation details; they should depend on abstractions.

## 4. YAGNI (You Aren’t Gonna Need It)

*   **Avoid Unnecessary Features:**  Do not introduce features or functionalities that are not currently required by the agent's primary task.
*   **Focus on Core Requirements:**  Prioritize implementing the essential requirements of the agent, rather than exploring potential extensions.
*   **Refactor Only When Necessary:**  Refactor code only when it demonstrably improves maintainability, performance, or design.

## 5. Development Workflow & Code Structure

*   **File Structure:** Each agent file should contain only the necessary code.  A maximum of 180 lines of code is strictly enforced.
*   **Modular File Organization:**  Organize files by logical modules or components, with clear separation of concerns.
*   **Documentation:**  Each agent file should have a brief, concise documentation explaining its purpose, inputs, and outputs.
*   **Unit Tests:** All agents should have a comprehensive suite of unit tests covering all key functionalities.
*   **Test Coverage:**  Achieve at least 80% test coverage for each agent.  Coverage should be verified automatically.
*   **Version Control:** Use a version control system (e.g., Git) for all agent files.  Commit frequently with informative commit messages.

## 6.  Code Standards & Style

*   **Naming Conventions:** Follow consistent naming conventions for variables, functions, and classes. (See specific naming conventions document)
*   **Indentation:** Use 2 spaces for indentation.
*   **Comments:**  Use comments sparingly and only to explain complex logic or non-obvious decisions.
*   **Error Handling:** Implement robust error handling to prevent crashes and provide informative error messages.
*   **Code Formatting:** Use a code formatter (e.g., `black` or `autopep8`) to enforce consistent code style.

## 7.  Specific Considerations for AI Agents

*   **State Management:** Implement a clear and efficient state management system for the agent.
*   **Learning Mechanisms:**  Describe and document any learning mechanisms used within the agent.
*   **Reasoning Engine:**  Clearly define the reasoning engine used by the agent and its limitations.
*   **Output Format:**  Specify the expected format of agent outputs.



These guidelines are intended to serve as a foundational framework for developing high-quality AI coding agents.  Regular review and updates are encouraged to ensure the project remains aligned with evolving best practices.
```