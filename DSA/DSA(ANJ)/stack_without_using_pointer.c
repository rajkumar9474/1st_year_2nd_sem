#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#define LENGTH 10
int arr[LENGTH] = {0};
// be careful that , this array is capable ot store integer values
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
    int choice,num;
    bool em,fl;
    do{
        printf("enter your choice: \n 1-> push .2-> pop\n 3-> peek \n 4-> display stack \n 5-> isEmpty. 6-> isFull \n 7-> exit :\n");
        scanf("%d",&choice);
        switch (choice){
            case 1:
                printf("enter element: \n");
                scanf("%d",&num);
                push(num);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                em = isEmpty();
                printf("%d\n",em);
                break;
            case 6:
                fl = isFull();
                printf("%d\n",fl);
                break;
            case 7:
                exit(1);
            default:
                printf("wrong input!!\n");
        }
    }while(choice!=7);   
}