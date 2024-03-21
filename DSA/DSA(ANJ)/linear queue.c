#include<stdio.h>
#define LEN 10
int qarr[LEN] = {0};
int front = 0;
int rear = -1;

void show(){
    for(int i = 0;i<LEN;i++){
        printf("%d ",qarr[i]);
    }
    printf("\n");
}

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
    else if(front>rear)
        return 1;
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
    show();
}
void dequeue(){
    if(Isempty() == 1){
        printf("underflow\n");
    }
    else{
        qarr[front] = 0;
        front++;
        if(Isempty() == 1){
            rear = -1;front = 0;
        }
    }
    show();
}


int main(){
    int ch,n;
    printf("1 - enqueue , 2 - dequeue , 3 - exit\n");
    while(1){
        scanf("%d",&ch);
        switch (ch)
        {
        case 1:
            scanf("%d",&n);
            enqueue(n);
            break;
        case 2:
            dequeue();
            break;
        default:
            return 0;
            break;
        }
    }
}