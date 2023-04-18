/* 

22.- Why was it necessary to introduce the local variable change in the giveChange method? That is, why didn’t the method simply end with the statement return payment - purchase;

A. Because after computing the change, the payment and purchase were reset to zero. So doing the computation in the return statement would have returned zero each time.

*/
