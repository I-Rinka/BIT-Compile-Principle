#include <stdio.h>
#include <stdlib.h>

int size = 0;

int *GetPoint(int *matrix, int x, int y)
{
    return matrix + x * size + y;
}

int *Multiply(int *matrix1, int *matrix2)
{
    int *ans = (int *)calloc(sizeof(int), size * size);
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int temp = 0;
            for (int n = 0; n < size; n++)
            {
                temp += *GetPoint(matrix1, i, n) * (*GetPoint(matrix2, n, j));
            }
            *GetPoint(ans, i, j) = temp;
        }
    }
    return ans;
}
int main()
{
    size = 1500;
    int *matrix1 = (int *)calloc(sizeof(int), size * size);
    int *matrix2 = (int *)calloc(sizeof(int), size * size);

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            *GetPoint(matrix1, i, j) = i + 1;
            *GetPoint(matrix2, i, j) = i + 1;
        }
    }

    int *ans = Multiply(matrix1, matrix2);

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("%d,", *GetPoint(ans, i, j));
        }
        printf("\n");
    }
    free(matrix1);
    free(matrix2);
    free(ans);

    return 0;
}