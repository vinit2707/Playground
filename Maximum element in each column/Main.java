#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int i=0;i<c;i++){
    int max=0;
    for(int j=0;j<r;j++)
      if(max<a[j][i])
        max=a[j][i];
  cout<<max<<"\n";
  }
  
}