#!/bin/bash -euo pipefail


# Check if a commit message was provided
if [ -z "$1" ]; then
  echo "Error: Commit message is required."
  echo "Usage: $0 \"<commit message>\""
  exit 1
fi

COMMIT_MESSAGE="$1"

# For testing
echo "Committing: $COMMIT_MESSAGE"
exit 0

git add .
git commit -m "$COMMIT_MESSAGE"
echo "Commited"
exit 0