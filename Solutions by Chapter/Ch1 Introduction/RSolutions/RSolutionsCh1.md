


1. Explain the difference between using a computer program and programming a computer.
	* These days to use a computer you don't need any programming skills, however you are limited to the functionality of the installed software. By programming a computer you can create your own software, giving you direct control over the machine to do the specific task that you desire.
2. Which parts of a computer can store program code? Which can store user data?
	* The distinction between program code and user data is not clear, both can be stored on the primary and secondary memory of the computer. However, generally speaking, user data (documents, photos, videos, source code) is stored in the Hard Drive (secondary - permanent) while program code (being executed) is stored in the RAM (primary - temporary).
3. Which parts of a computer serve to give information to the user? Which parts take user input?
	* The mouse, keyboard, microphone, scanner and camera are input devices, meaning they take information from the user. The monitor, speakers and printer are output devices, meaning they give information to the user. Note that a touch screen is both an input and an output device.
4. A toaster is a single-function device, but a computer can be programmed to carry out different tasks. Is your cell phone a single-function device, or is it a programmable computer? (Your answer will depend on your cell phone model.)
	* Programmable computer. Single-function-cellphones like the [JohnsPhones](http://www.johnsphones.com/store/johns-phone-business/item45) or [TheLightPhone](https://www.thelightphone.com/) are an oddity.
5. Explain two benefits of using Java over machine code.
	* Portability (Being able to use the same code base on many computers) and Abstraction (High level languages are generally easier to code and maintain).
6. On your own computer or on a lab computer, find the exact location (folder or directory name) of:
	1. The sample file HelloPrinter.java, which you wrote with the editor.
	2. The Java program launcher java.exe or java.
	3. The library file rt.jar that contains the run-time library.

```
//On Windows
"C:\Users\%USERNAME%\workspace\"
"C:\Program Files\Java\jre1.8.0_xxx\bin\"
"C:\Program Files\Java\jdk1.8.0_xxx\jre\lib"

//On Mac
"/Users/YourUserName/Documents/workspace/"
"/Library/Java/Home/bin/"
"/Library/Java/Home/jre/lib/"
```

11. How do you discover syntax errors? How do you discover logic errors?
	* Compilers have a lexical parser that tends to identify all syntax errors. Logical errors are harder to find, usually you have to trace and test your program to know if it gives the expected results.
12. The cafeteria offers a discount card for sale that entitles you, during a certain period, to a free meal whenever you have bought a given number of meals at the regular price. The exact details of the offer change from time to time. Describe an algorithm that lets you determine whether a particular offer is a good buy. What other inputs do you need?
	* Suppose we frequently buy our meals in this cafeteria, we should be able to estimate the approximate time interval between each meal we buy there. This is the last input we need in our algorithm (Assuming that we can afford the regular price of every meal).

```
Get the approximate time interval between each meal we buy in the cafeteria.
Get the number of meals necesary to get the free meal.
Get the interval of time the offer will be valid.
Define the time interval needed as the interval of time the offer 
	will be valid divided by the number of meals necesary to get the free meal.
If the time interval between each meal we buy is less than the time interval needed
	Then the offer is a good buy.
```

16. In How To 1.1, you made assumptions about the price of gas and annual usage to compare cars. Ideally, you would like to know which car is the better deal without making these assumptions. Why can’t a computer program solve that problem?
	* Because, following the algorithm principles, a computer program needs unambiguous data in order to get the only *correct* answer. 
	* Real life computer programs can use approximate data as input, in order to generate useful approximate results. We may also be able to find external trustworthy sources of information.
17. Suppose you put your younger brother in charge of backing up your work. Write a set of detailed instructions for carrying out his task. Explain how often he should do it, and what files he needs to copy from which folder to which location. Explain how he should verify that the backup was carried out correctly.

```
1. Timmy, go to the store and buy an External Hard Drive.
2. Plug it to the computer.
3. Drop all the important files in the HD Folder.
4. If need be, setup a free Dropbox, Google Drive, Mega, One Drive or Box account.
5. Drop all the important files into the Cloud.
6. Done
```
18. Write pseudocode for an algorithm that describes how to prepare Sunday breakfast in your household.

```
1. Pick up cereal.
2. Open Cereal.
3. Fill half a bowl with cereal.
4. Pick up milk.
5. Open milk
6. Fill half a bowl with milk.
7. Put spoon on cereal bowl.
8. Eat bowl contents with spoon.
```

