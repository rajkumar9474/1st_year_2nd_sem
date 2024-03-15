#include<stdio.h>

int GCD(int n, int m) {
    if (n == 0)
        return m;
    else
        return GCD(m % n, n);
}

int main() {
    printf("%d\n", GCD(120,140));
    return 0; 
}

