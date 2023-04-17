/* 

••• E6.8 Translate the following pseudocode for randomly permuting the characters in a
string into a Java program.
Read a word.
Repeat word.length() times
Pick a random position i in the word, but not the last position.
Pick a random position j > i in the word.
Swap the letters at positions j and i.
Print the word.
To swap the letters, construct substrings as follows:
first i j middle last
© Anthony Rosenberg/iStockphoto.
© Anthony Rosenberg/iStockphoto.296 Chapter 6 Loops
Then replace the string with
first + word.charAt(j) + middle + word.charAt(i) + last

*/