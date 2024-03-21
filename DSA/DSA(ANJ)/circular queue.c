#include<stdio.h>
#define LEN 10

int cqarr[LEN] = {0};
int rear = -1;
int front = 0;



int enqueue(int num){
    rear = (rear+1)%LEN;
    if(cqarr[rear] == 0){
        cqarr[rear] = num;
        for(int i = 0;i<LEN;i++){
            printf("%d ",cqarr[i]);
        }
        printf("\n");
    }
    else{
        rear = (rear-1)%LEN;
        printf("overflow\n");
    }

    
}
void dequeue(){
    if(cqarr[front]!=0){
        cqarr[front] = 0;
        front = (front+1)%LEN;
        for(int i = 0;i<LEN;i++){
            printf("%d ",cqarr[i]);
        }
        printf("\n");
    }
    else{
        printf("underflow");
    }
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