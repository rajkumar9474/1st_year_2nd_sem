#include<stdio.h>
void tower(int n,char src, char dest , char aux){
	if(n == 1){
		printf("%d disk from %c to %c\n",n,src,dest);}
	else{
		tower(n-1,src,aux,dest);
		printf("%d disk from %c to %c\n",n,src,dest);
		tower(n-1,aux,dest,src);
	}
}


int main(){
	tower(3,'a','c','b');
}
