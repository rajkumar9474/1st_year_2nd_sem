#include<stdio.h>
long int power(int x,int y){
	if(y == 0)
		return 1;
	else{
		return (x*power(x,y-1));}
}
int main(){
	long int a;
	a = power(12,2);
	printf("%ld\n",a);

}
