#include <bits/stdc++.h>
using namespace std;

int main() {
	int p, a, b, c, d, n;
	while (scanf("%d %d %d %d %d", &p, &a, &b, &c, &d) == 5) {
		scanf("%d", &n);
		double max_decline = 0;
		double max = p * (sin((a + b)) + cos((c + d)) + 2);
		for (int k = 2; k <= n; k++) {
			double curr = p * (sin((a * k + b)) + cos((c * k + d)) + 2);
				if (max > curr) {
					if(max_decline< max - curr){
						max_decline=max-curr;
					}
				} else {
					max = curr;
				}
		}
		printf("%.8lf\n", max_decline);
	}
	return 0;
}
