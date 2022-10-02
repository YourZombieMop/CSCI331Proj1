# CSCI 331
## Compilation steps
1.) Ensure gcc is installed and referencable by PATH [You could install [MinGW](https://www.mingw-w64.org/)]  
2.) Open a terminal in the project directory.  
3.) Build the project as `bin.exe` with one of the following commands.
Debug build: `gcc *.c -Wall -o bin && start bin`
Release build: `gcc *.c -static-libgcc -static-libstdc++ -Wall -o bin && start bin`