#include <bits/stdc++.h>
using namespace std;
#define N 1001
int x[N], y[N]; // coordinate
int d[N][N]; // distance matrix
int n;
int s[N]; // solution representation
int res;
bool visited[N];
int bestSol[N];
void genData(char* filename, int n, int DX, int DY){
    srand(time(NULL));
    FILE* f = fopen(filename,"w");
    for(int i = 1; i <= n; i++){
        x[i] = rand()%DX;
        y[i] = rand()%DY;
    }
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            int dx = x[i] - x[j];
            int dy = y[i] - y[j];
            d[i][j] = (int)sqrt(dx*dx + dy*dy);
        }
        d[i][i] = 0;
    }
    fprintf(f,"%d\n",n);
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            fprintf(f,"%d ",d[i][j]);
        }
        fprintf(f,"\n");
    }
    fclose(f);

}
void input(){
    cin >> n;
    for(int i = 1; i <= n; i++){
        for(int j =1 ; j <= n; j++){
            cin >> d[i][j];
        }

    }
}
int findNext(int cur){
    int minD = 1e9;
    int sel = -1;
    for(int i = 1; i <= n; i++) if(!visited[i]){
        if(d[cur][i] < minD){
            minD = d[cur][i]; sel = i;
        }
    }
    return sel;
}
int nearestNeighbor(int start){
    for(int i =1 ; i <= n; i++) visited[i] = false;
    s[1] = start;
    int current = start;
    visited[s[1]] = true;
    int f = 0;
    for(int i = 2; i <= n; i++){
        int next = findNext(current);
        s[i] = next;
        visited[next] = true;
        f = f + d[current][next];
        current = next;
    }
    f = f + d[s[n]][s[1]];
    return f;
}
void printSolution(){
    cout << n << endl;
    for(int i = 1 ; i <= n; i++)
        cout << bestSol[i] << " ";
}
void heuristic(){
    res = 1e9;
    for(int start = 1; start <= n; start++){
        int f = nearestNeighbor(start);
        //cout << "nearestNeighbor(" << start << "), f = " << f << endl;
        if(f < res){
            res = f;
            for(int i = 1; i <= n; i++) bestSol[i] = s[i];
            //cout << "update  best " << res << endl;
        }
    }
    printSolution();
    cout << res << endl;
}
int main(){
    //genData("test/2.txt",400,500,500);
    //return 0;
    //freopen("test/2.txt","r",stdin);
    input();
    heuristic();
    return 0;
}
