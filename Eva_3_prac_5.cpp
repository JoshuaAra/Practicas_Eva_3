/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
int calcularFactorial (int ival){
    int iresu = 1;
     for (int i = ival; i >= 1; i--) {
            iresu *= i;
     }
     return iresu;
}
int main()
{
    cout<<"Resultado = " << calcularFactorial(5);

    return 0;
}
