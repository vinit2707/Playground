#include <iostream>  
using namespace std;  
int main()  
{  
int a,b;
scanf("%d %d", &a, &b);
cout<<"Before swapping a= "<<a<<" and "<<"b="<<b<<endl;      
a=a+b; //a=15 (5+10)    
b=a-b; //b=5 (15-10)    
a=a-b; //a=10 (15-5)    
cout<<"After swapping a= "<<a<<" and "<<"b="<<b<<endl;      
return 0;  
}  