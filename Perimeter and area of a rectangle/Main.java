#include<stdio.h>
int main()
{
  int length=6,breadth=9,perimeter,areaofrectangle;
  perimeter=2*(length+breadth);
  areaofrectangle=length*breadth;
  printf("The perimeter of the rectangle is: %d cm\n",perimeter);
  printf("The area of the rectangle is: %d sq cm",areaofrectangle);
  return 0;
}