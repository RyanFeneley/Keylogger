﻿# Keylogger
## Overview
This project is a simple keylogger built in Java for **educational and ethical hacking purposes only**. It captures and logs keystrokes to a file to demonstrate how a basic keylogger operates. 

**Important:** This tool is strictly for educational use, and it is illegal to use it without explicit permission from the system owner.

## Features
- Logs keypresses to a text file with timestamps.
- Displays an ethical disclaimer before running to remind users of legal and ethical considerations.
- Simple implementation with Java's KeyListener interface to capture keystrokes.

## Requirements
- Java Development Kit (JDK) 8 or higher.

## Usage
1. Clone the repository or download the code.
2. Compile the Java program using the following command:
   \\\ash
   javac Keylogger.java
   \\\
3. Run the program:
   \\\ash
   java Keylogger
   \\\

4. The program will display a window with an educational disclaimer. After you acknowledge the disclaimer, the keylogger will start capturing keystrokes.
5. The keystrokes will be saved in a text file called \keylog.txt\ in the same directory as the program.

### Example Usage
- Start the keylogger program by running the following commands:
   \\\ash
   javac Keylogger.java
   java Keylogger
   \\\

- Begin typing in the keylogger window. The keystrokes you type will be logged into the \keylog.txt\ file.

## How it Works
- The keylogger uses Java's **KeyListener** interface to capture keystrokes in the window.
- Every key typed is written to a file named \keylog.txt\, along with a timestamp of when the key was pressed.
- This basic implementation captures keystrokes only within the active keylogger window.

**Disclaimer: Unauthorized usage of this software is illegal. Use it only for educational purposes on systems where you have explicit permission.**
