#!/usr/bin/env bash
set -euo pipefail

TMP_OUTPUT=$(mktemp)
if mvn -B verify --file pom.xml > "$TMP_OUTPUT" 2>&1; then
  echo "✅ Build and tests passed."
  rm "$TMP_OUTPUT"
else
  echo "❌ Build or tests failed. Output:"
  cat "$TMP_OUTPUT"
  rm "$TMP_OUTPUT"
  exit 1
fi