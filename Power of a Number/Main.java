#include <stdio.h>
int main()
{
  	int base,expo,ans=1,i;
    scanf("%d%d",&base,&expo);
    if(expo>=0)
    {
      for(i=1;i<=expo;i++)
      {
        ans=ans*base;
      }
      printf("%d",ans);
    }
  else
  {
    printf("Wrong input");
  }
    return 0;
}