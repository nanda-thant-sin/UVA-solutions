#include<stdio.h>
#include <cmath>
int main()
{
 int testcase;
 scanf("%d",&testcase);
 for(int i=1;i<=testcase;i++){
 	int n,p,q,ans=0;
 	scanf("%d",&n);
 	scanf("%d",&p);
 	scanf("%d",&q);
 	for(int j=0;j<n;j++){
 		int egg;
 		scanf("%d",&egg);
 		if(!(p==0 || q<egg)){
 			ans++;
 			p--;
 			q-=egg;
 		}
 	}
 	printf("Case %d: %d\n",i,ans);
 }
}
