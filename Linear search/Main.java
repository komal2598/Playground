#include<stdio.h>
int main()
{
 int array[100],n,c,s,flag,k;
  flag=0;
  scanf("%d",&n);
  for(c=0;c<=n-1;c++)
  {
    scanf("%d",&array[c]);
  }
  scanf("%d",&s);
  for(c=0;c<=n-1;c++)
  {
    if(array[c]==s)
    {
      k=c+1;
      printf("%d",k);
      flag=1;
    }
  }
  if(flag==0)
  {
    printf("%d isn't present in the array.",s);
  }
  return 0;
}
  