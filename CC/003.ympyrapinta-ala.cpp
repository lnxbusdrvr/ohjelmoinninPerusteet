#include <iostream>
//ympyrän pinta-ala

#if defined(WIN32) || defined(LINUX)
using namespace std;
#endif

#define PII 3.14159	//vakion esittely

int main()
{
  double sade, pa;	//double muuttaa sade:n ja pa:n desimaaliluku
  
  cout << "Anna ympyrän säde: ";
  cin >> sade;
  
  pa=PII * sade * sade;
  
  cout << "Ympyrän pinta-ala on " << pa << endl;
  
  return 0;
}
