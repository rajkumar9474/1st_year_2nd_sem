#include <stdio.h>

int findLCM(int a, int b, int max) {
    if (max % a == 0 && max % b == 0) {
        return max;
    } else {
        return findLCM(a, b, max + 1);
    }
}

int LCM(int a, int b) {
    int max = (a > b) ? a : b;
    return findLCM(a, b, max);
}

int main() {
    int a = 24, b = 18;
    int lcm = LCM(a, b);
    printf("LCM of %d and %d is %d\n", a, b, lcm);
    return 0;
}

