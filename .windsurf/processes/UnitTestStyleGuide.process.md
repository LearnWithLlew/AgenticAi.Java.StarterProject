# Unit Test Style Guide

STARTER_CHARACTER = ✅


## Refactoring

**NEVER** add new test cases while refactoring existing tests.

**ALWAYS** prefer self documenting code and smaller functions to comments.


## ApprovalTests vs Asserts

* Preferable ApprovalTests over multiple asserts.
* Use toStrings and Printers. If the toString on an object is good, use it. If not, create a printing function either in the test or in production code and use that.

### Dates, GUIDS and other non-deterministic values

If you are printing dates, guids, or any other non-deterministic values to an `.approved.` file. 
Reread [Scrubbers.process.md](Scrubbers.process.md) and follow the instructions there.
