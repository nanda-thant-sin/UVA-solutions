#include<stdio.h>
int main()
{
 while(1){
 	int n;
 	scanf("%d",&n);
 	if(n==0)
 	break;
 	int x_forward[10001],x_backward[10001],xmin=10001,xmax=0,x,y;
 	for(int i=0;i<n;i++){
		scanf("%d",&x);
		scanf("%d",&y);
		if(x+y<10001){
			x_backward[x+y]++;
			if(x+y<xmin)
				xmin=x+y;
		}
		if(x-y>=0){
			x_forward[x-y]++;
			if(x-y>xmax)
				xmax=x-y;
		}
 	}
 	int max=0,count=0;
 	for(int i=xmin+1;i<=xmax;i++){
 		count+=x_forward[i];
 	}
 	count=n-count;
 	max=count;
 	for(int i=xmin+1;i<=xmax;i++){
 		count+=x_forward[i]-x_backward[i-1];
 		if(max<count)
 			max=count;
 	}
 	printf("%d\n",max);
 }
}
