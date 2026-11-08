#include<stdio.h>
#include<stdlib.h>

void Pattern(int iRow,int iCol)
{
    int i = 0,j = 0,iSum1 = 0,iSum2 = 0;

    for(i = 1;i <= iRow ; i++)
    {
        for(j = 1; j <= iCol ; j++)
        {
            if(iSum1 >= 9)
            {
                iSum2 = iSum2 + 1;
                {
                   printf("%d\t",iSum2);
                } 
            }
            else
            {  
                iSum1 = iSum1 + 1;
                printf("%d\t",iSum1);
            }
        }
        printf("\n\n");
        
    }
        
}
int main()
{
    int iValue1 = 0,iValue2 = 0;

    printf("Enter number of rows and column:\n");
    scanf("%d %d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);

    return EXIT_SUCCESS;
}