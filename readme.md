# CSCI 331
## C Compilation steps
1.) Ensure gcc is installed and referencable by PATH (You could install [MinGW](https://www.mingw-w64.org/))  
2.) Open a terminal in the project directory.  
3.) Build the project as `bin.exe` with one of the following commands.  
Debug build: `gcc *.c -Wall -o bin && start bin`  
Release build: `gcc *.c -static-libgcc -static-libstdc++ -Wall -o bin && start bin`  
## Java Compilation Steps
1.) Ensure version 19 or newer [Java SDK](https://www.oracle.com/java/technologies/downloads/) is installed and referencable by PATH  
2.) Open a terminal in the project directory.  
3.) Build & run the project with the following commands.  
Build: `javac App.java`  
Run: `java App`  
Build & Run: `javac App.java && java App`  