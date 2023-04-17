/* 

19.- Modify the pseudocode for the program in How To 4.1 so that the program gives change in quarters, dimes, and nickels. You can assume that the price is a multiple of	5 cents. To develop your pseudocode, first work with a couple of specific values.

A.

from:
http://nob.cs.ucdavis.edu/classes/ecs010-2014-02/handouts/change-write.html

A = input("Amount of change: ")
IA = int(A)
# how many quarters
NQ = IA // 25
# how many dimes in what's left over
IA = IA % 25
ND = IA // 10
# how many nickels in what's left over
IA = IA % 10
NN = IA // 5
# how many pennies in what's left over
IA = IA % 5
print(A, "cents is", NQ, "quarters,", ND, "dimes,", NN, "nickels, and", IA, "pennies")


*/

