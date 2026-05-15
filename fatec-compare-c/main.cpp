#include <iostream>
 
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int troca(char a[4], char b[4]){
		
	int igual = 1;
	
	int i = 0;
	int j = 3;
	for(i= 0 ; i <= 3;i++){
		if(a[i] != b[j]){
			igual = 0;
		}
		j--;
	}
	return igual;
}

int main(int argc, char** argv) {
		
	char a[4] = {};
	char b[4] = {};
	cout<< "Digite o valor de A\n";
	cin>>a;
	cout<< "Digite o valor de B\n";
	cin>>b;

	int igual = troca(a,b);
	
	if(igual == 0){
		 cout << "Sao diferentes\n" ;
	}
	else{
		 cout << "Sao iguais\n" ;
	}
 
  system("pause");
return igual;
}

