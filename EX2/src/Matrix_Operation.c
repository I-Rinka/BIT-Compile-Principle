#include<stdlib.h>
int *GetPoint(int *matrix, int size, int x, int y)
{
    return matrix + x * size + y;
}

int *Multiply(int *matrix1, int *matrix2, int size)
{
    int *ans = (int *)calloc(sizeof(int), size * size);
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int temp = 0;
            for (int n = 0; n < size; n++)
            {
                temp += *GetPoint(matrix1, size, i, n) * (*GetPoint(matrix2, size, n, j));
            }
            *GetPoint(ans, size, i, j) = temp;
        }
    }
    return ans;
}