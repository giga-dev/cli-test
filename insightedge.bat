@echo off
rem java -jar target\cli-test-1.0-SNAPSHOT.jar org.niv.Program %*
java -cp target\classes;deps\*; org.niv.Program %*