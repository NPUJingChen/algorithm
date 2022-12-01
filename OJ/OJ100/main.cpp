#include<iostream>
#include<cstdio>
#include<algorithm>
using namespace std;
int q1[20],q2[20];
char hash[5]={0,'*','+','-','/'};
int n[5];int used[5];
int operate(int a,int b,int c)
{
    switch(c)
    {
        case 1:return a*b;
        case 2:return a+b;
        case 3:return a-b;
        case 4:if(a%b==0)return a/b;else return -10;
    }
    return -10;
}
void dfs1(int u,bool o);
void dfs2(int u,bool o);
int main()
{
    for(int i=1;i<=4;i++)scanf("%d",&n[i]);
    sort(n+1,n+5);
    dfs1(1,1);dfs2(1,1);
    return 0;
}
void dfs1(int u,bool o)
{
    if(u==8)
    {
        int ans=operate(q1[1],q1[3],q2[2]);
        if(ans==-10)return ;
        ans=operate(ans,q1[5],q2[4]);
        if(ans==-10)return ;
        ans=operate(ans,q1[7],q2[6]);
        if(ans==24)
        {
            printf("(((%d%c%d)%c%d)%c%d)",q1[1],hash[q2[2]],q1[3],hash[q2[4]],q1[5],hash[q2[6]],q1[7]);
             exit(0);
        }
    }
    else
    if(o)
    {
        for(int i=1;i<=4;i++)
        if(!used[i])
        {
            q1[u]=n[i];
            used[i]=1;
            dfs1(u+1,!o);
            used[i]=0;//!!!1
        }
    }
    else
    {
        for(int i=1;i<=4;i++)
        {
            q2[u]=i;
            dfs1(u+1,!o);
        }
    }
}
void dfs2(int u,bool o)
{
    if(u==8)
    {
        int ans1=operate(q1[1],q1[3],q2[2]);
        if(ans1==-10)return ;
        int ans2=operate(q1[5],q1[7],q2[6]);
        if(ans2==-10)return ;
        int ans=operate(ans1,ans2,q2[4]);
        if(ans==24)
        {
            printf("((%d%c%d)%c(%d%c%d))",q1[1],hash[q2[2]],q1[3],hash[q2[4]],q1[5],hash[q2[6]],q1[7]);
            exit(0);
        }
    }
    else
    if(o)
    {
        for(int i=1;i<=4;i++)
        if(!used[i])
        {
            q1[u]=n[i];
            used[i]=1;
            dfs2(u+1,!o);
            used[i]=0;
        }
    }
    else
    {
        for(int i=1;i<=4;i++)
        {
            q2[u]=i;
            dfs2(u+1,!o);
        }
    }
}
