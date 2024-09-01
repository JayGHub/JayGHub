#include <iostream>
#include <string>

using namespace std;

int main(int argc, char *arg)
{
    string userName;
    cout << "Hello there, what is your first name? ";
    cin >> userName;
    cout << endl << userName << " is a nice name\nHow old are you? ";
    int userAge;
    cin >> userAge;
    cout << endl << "So you are " << userAge << " years old\nWould you like to know how old you will be in 10 years? ";
    string userAnswer;
    cin >> userAnswer; 

    return 0;
}