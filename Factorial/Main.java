#include<stdio.h>
int main()
{
	long int fact=1,i,n;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
  return 0;
}