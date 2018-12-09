/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
void Incremento (int iVal){
    iVal++;
}
int main()
{
    int iValor=5;
    Incremento(iValor);
    cout <<"El valor es "<< iValor;
    return 0;
}
