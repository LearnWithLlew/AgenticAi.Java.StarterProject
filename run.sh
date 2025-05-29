#!/usr/bin/env bash
set -euo pipefail

mvn compile
mvn exec:java -Dexec.mainClass="org.samples.MainApp"
