# Scrubbers

### Dates, GUIDS and other non-deterministic values

If you are printing dates, guids, or any other non-deterministic values to an `.approved.` file. 
Always use the scrubbers and options provided by ApprovalTests.

Either use Scrubbers or DateScrubber.
#### Scrubbers Example:

```java
Approvals.verifyAll("guids", guids, new Options(Scrubbers::scrubGuid));
```
 or 
```java
Approvals.verify("created at 03:14:15", new Options().withScrubber(DateScrubber.getScrubberFor("00:00:00")));
```
