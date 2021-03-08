#include <stdio.h>
#include <stdlib.h>
#include "Matrix_Operation.h"
int main(int argc, char const *argv[])
{
    int size = 0;
    if (argc >= 2)
    {
        size = atoi(argv[1]);
    }

    int *matrix1 = (int *)calloc(sizeof(int), size * size);
    int *matrix2 = (int *)calloc(sizeof(int), size * size);

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            *GetPoint(matrix1, size, i, j) = i + 1;
            *GetPoint(matrix2, size, i, j) = i + 1;
        }
    }

    int *ans = Multiply(matrix1, matrix2, size);

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("%d,", *GetPoint(ans, size, i, j));
        }
        printf("\n");
    }
    free(matrix1);
    free(matrix2);
    free(ans);

    return 0;
}
