#include<stdio.h>
int main()
{
  int a,sum,num;
  scanf("%d",&a);
  sum=a%10;
  num=a/10;
  printf("%d",sum+num);
  return 0;
}