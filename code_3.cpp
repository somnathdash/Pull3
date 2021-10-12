#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;


int main() 
{
	
	    ll n,m;
	    cin>>n>>m;
	    vector<pair<ll,ll>>v;
	    for(ll i=0;i<n;i++)
	    {
	        ll x,y;
	        cin>>x>>y;
	        v.push_back(make_pair(x,y));
	    }
	    


	    vector<pair<ll,ll>>v1;
	    vector<pair<ll,ll>>v2;
	    
	    for(ll i=0;i<m;i++)
	    {
	        ll x1,y1,x2,y2;
	        cin>>x1>>y1>>x2>>y2;
	        v1.push_back(make_pair(x1,y1));
	        v2.push_back(make_pair(x2,y2));
	    }
	    ll xx = 1000000;
	    for(ll i=0;i<m;i++)
	    {
	        if(v1[i].first>v2[i].first)
	        {
	            pair<ll,ll> temp = v1[i];
	            v1[i] = v2[i];
	            v2[i] = temp;
	        }
	        if(i&1)
	        cout<<(xx+1)-v1[i].first<<" "<<(xx-v1[i].second)<<endl;
	        else
	        cout<<(-1)*v1[i].first<<" "<<((-1)*(v1[i].second)-1)<<endl;
	        
	        
	    
	    
	}
	return 0;
}
