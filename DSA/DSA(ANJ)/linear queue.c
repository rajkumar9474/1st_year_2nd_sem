#include<stdio.h>
#define LEN 10
int qarr[LEN] = {0};
int front = 0;
int rear = -1;

int Isfull(){
    if(rear == LEN-1) 
        return 1;
    else
        return 0;
}
int Isempty(){
    if(front == 0 && rear == -1){
        return 1;
    }
    else
        return 0;
}
void enqueue(int num){
    if (Isfull() == 1){
        printf("overflow\n");
    }
    else{
        rear++;
        qarr[rear] = num;
    }
}
void dequeue(){
    if(Isempty() == 1){
        printf("underflow\n");
    }
    else{
        qarr[front] = 0;
        front++;
    }
}
void show(){
    for(int i = 0;i<LEN;i++){
        printf("%d ",qarr[i]);
    }
    printf("\n");
}

int main(){
    show();
    dequeue();
    show();
    enqueue(7);
    enqueue(6);
    enqueue(67);
    show();
    dequeue();
    show();
    enqueue(98);
    enqueue(39);
    enqueue(78);
    show();
    dequeue();
    dequeue();
    show();
    enqueue(27);
    enqueue(83);
    show();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    show();
    enqueue(30);
    enqueue(51);
    enqueue(72);
    show();
}