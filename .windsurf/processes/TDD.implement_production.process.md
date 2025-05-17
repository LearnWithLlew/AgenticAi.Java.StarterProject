# TDD Creating Tests Process

STARTER_CHARACTER = 🟢

**ALWAYS** ask the user one question at a time and wait for a response.

**ALWAYS** confirm file names and locations if unsure.

**NEVER** make changes to Test code in this process.

This process is for implementing production code for a new feature or bug fix.

## Steps

1. Ask for the test file name and location.
2. run the tests
3. Pick the first failing test, and implement the production code to make it pass.
4. run the tests
5. Ask the user if they would like to commit at this step.
6. repeat until all tests pass.

## Code Style

Prefer code that is self explanatory and easy to read over comments.
Prefer functional helper methods over long methods.
Prefer `org.lambda.query.Queryable` over java streams.
