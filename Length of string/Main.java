#include<stdio.h>
int main()
{
  char a[100];
  int i,length;
  scanf("%[^\n]",a);
  for(i=0;a[i] !='\0';i++)
  {
    length++;
  }
  
  printf("%d",length);
}