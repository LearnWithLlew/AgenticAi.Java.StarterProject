# TDD Production Code Implementation Process

STARTER_CHARACTER = 🟣

**ALWAYS** ask the user one question at a time and wait for a response.

**ALWAYS** confirm file names and locations if unsure.

**NEVER** make changes to Test code in this process.

This process is for refactoring production code.


## Steps
1. If needed, confirm the relevant test file and its location.
2. Repeat the following all code is refactored:
   - Run the tests, confirm they pass.
   - Choose a refactoring to perform.
   - Run the tests again, confirm they pass.
   - Commit the code. `


## Code Style
- Prefer code that is self-explanatory and easy to read over comments.
- Use functional helper methods instead of long methods.
- Prefer `org.lambda.query.Queryable` over Java streams.

## Commit Message
- Use the following format: `- r <refactoring title>`
