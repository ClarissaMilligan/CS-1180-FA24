# CS-1180-FA24
Class materials for CS-1180 in Fall 2024

Below are instructions to help you get Java and your IDE installed, provided by Professor Kayleigh Duncan.

## Environment Setup

These instruction apply generically to any OS.  

1. Install Adopt Open JDK 17 (select the default options)
   - Download from [ninite.com](https://ninite.com/)
     - Link to all versions: https://adoptium.net/temurin/releases/?version=17
     - Mac users, see [Mac Notes](#mac-notes)
   - JDK = Java Development Kit
   - Includes a java code compiler and virtual environment where your compiled code runs
   - NOTE: JRE = Java Runtime Environment. Runs compiled Java code.  You cannot compile Java source code if you only have a JRE installed.
2. Install Visual Studio Code
   - Download from [ninite.com](https://ninite.com/)
     - Link to all versions: https://visualstudio.microsoft.com/downloads/
   - Code is a text editor at the start - extensions give it support for languages you want to work with
3. In VSCode, go to Extensions, search for the WSU CSE extension
   - This extension includes extensions for other languages you’ll find in future courses
   - Link to extension: https://marketplace.visualstudio.com/items?itemName=WrightStateUniversity-ComputerScience.wsu-cse
4. Restart VSCode in order for extensions to take effect

For more help with using Java in VSCode, look [here](https://code.visualstudio.com/docs/java/java-tutorial).

### Alternative JDK installation via VSCode

This is recommended for Mac Users

1. Install Visual Studio Code
2. Install the WSU CSE Extension pack - this includes the "Language Support for Java(TM) by Red Hat".  
3. Once this extension is installed, you'll be prompted to "Install JDK" - click in and make sure JDK 17 is selected.

### Mac Notes

There are now two Mac chips - Intel / AMD (x64) and ARM64 (aarch64).  You do need to know which you have to install the correct software.

These [instructions from Adoptium](https://adoptium.net/installation/macOS/) are to install from the `.pkg` file once you select the correct one for your hardware.

## Special Notes on VSCode

- Create a Java Project in VSCode with Command Palette

  - Ctrl + Shift + P = Command Palette
  - Type “Java”, then select “Java: Create Java Project”
  - Project names don’t matter (for class, keep an eye on assignment instructions)

- Turning off Parameter Names

  - Parameter names are the variable names used by methods we call. One of the extensions has these display by default. They are not part of your code, they are just reminders.
  - Ctrl + Shift + P (to open VSCode Command Palette) -> Search for “Settings”, select “Preferences: Open User Settings (JSON)”
  - Add this line: `"editor.inlayHints.enabled": "off"`
  - You can choose to not do this, but it annoys me, so I’m turning it off.

- Change Color Theme

  - File -> Preferences -> Color Theme

- Colorblind Themes

  - [Install "Slack" Color Theme package](https://marketplace.visualstudio.com/items?itemName=felipe-mendes.slack-theme)
  - Can now select Slack Color Themes for "Protanopia & Deuteranopia" and "Tritanopia"

## Troubleshooting VSCode + Java Extension

- Restart VSCode in order for extensions to take effect
- https://stackoverflow.com/questions/57148090/java-project-in-vs-code-no-delegatecommandhandler-for-vscode-java-validatelaun
- https://github.com/Microsoft/vscode-java-debug/blob/main/Troubleshooting.md

## Multiple JDK Versions

Problem: you've been asked to install a new version of the JDK, but how do you check?  
In a terminal (Powershell or Powershell in VSCode), type: `java --version`  
If you see the accurate version you just installed, skip the rest, get to coding.  
Else:
1. Find where your JDK is installed:
    - Powershell / CMD: `where java`
    - Mac / Linux: `which java`
    - Example path to java executable within JDK: `C:\Program Files\Eclipse Adoptium\jdk-17.0.8.7-hotspot\bin\java.exe`
2. Add the location to JDK binaries to your PATH environment variable:
    - Example path to JDK: `C:\Program Files\Eclipse Adoptium\jdk-17.0.8.7-hotspot\bin`
    - Windows: Go to System Properties -> Edit System Environment variables -> look for **Path**, select **Edit**, select **New**, enter path to JDK, move to top of list.  Removing the "old" JDK path is optional as long as the "new" one is listed before the old one.
3. Restart all terminals (or your PC).  Verify changes took effect using `java --version`
