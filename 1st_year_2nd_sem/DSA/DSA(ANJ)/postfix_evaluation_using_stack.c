#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
#define LENGTH 50
int arr[LENGTH] = {0};

int top = -1;

bool isFull(){
    if (top==LENGTH-1){
        return true;
    }
    else{
        return false;
    }
}
bool isEmpty(){
    if(top==-1){
        return true;
    }
    else{
        return false;
    }
}
void push(int num){
    if(isFull() == false){
        top++;
        arr[top] = num;
    }
    else{
        printf("overflow!!\n");
    }
}
int pop(){
    if(isEmpty() == false){
        int a = arr[top];
        top--;
        return a;
    }
    else{
        printf("underflow\n");
    }
}
void peek(){
    if(top>-1&&top<LENGTH){
        printf("%d \n",arr[top]);
    }
}
void display(){
    if(top>-1&&top<LENGTH){
        for(int i = 0;i<=top;i++){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");
}

int main(){
    char str[50];
    int sum = 0;
    printf("enter the postfix expression\n");
    scanf("%s", str);
    int len;
    len = strlen(str);
    for (int i = 0; i < len; i++) {
        if (str[i] != '+' && str[i] != '*' && str[i] != '/' && str[i] != '-' && str[i] != '$' && str[i] != '^') {
            push((int)(str[i] - '0')); 
            
        } else {
            int opr2 = pop();
            int opr1 = pop();
            if (str[i] == '+') {
                sum = opr1 + opr2;
                push(sum);
                
            } else if (str[i] == '*') {
                sum = opr1 * opr2;
                push(sum);
                
            }else if (str[i] == '/') {
                sum = opr1 / opr2;
                push(sum);
               
            }else if (str[i] == '-') {
                sum = opr1 - opr2;
                push(sum);
                
            }else if (str[i] == '$' || str[i] == '^') {
                sum = (int)pow(opr1,opr2);
                push(sum);
                
            }
        }
    }
    printf("Result: %d\n", pop()); 
    return 0;
}