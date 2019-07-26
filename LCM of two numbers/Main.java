#include<stdio.h>
int main()
{
   int num1,num2,small,i,GCD,lcm;
  scanf("%d%d",&num1,&num2);
  small=num1>num2?num2:num1;
  for(i=small;i>=1;i--)
  {
    if(num1%i==0 && num2%i==0)
    {
      GCD=i;
      break;
    }
  }
  lcm=(num1*num2)/GCD;
  printf("%d",lcm);
  return 0;
}