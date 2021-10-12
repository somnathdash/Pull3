import java.io.*;
import java.math.*;
import java.util.*;
class fourth {
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc=new FastReader();
		int t,n,i,l,e,s,j,m,eggs,choco,p_om,p_mil,p_cak,k,tm,p=0,sum=0,a,b,x,y,fg=0,var,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,avg;
//		String str;
		BigInteger f=BigInteger.valueOf(1);
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[n][2];
		int brr[][]=new int[m][4];
		for(i=0;i<n;i++)
		{
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<4;j++)
				brr[i][j]=sc.nextInt();
		}
		int temp;
		for(i=0;i<m;i++)
		{
			if(brr[i][0]>brr[i][2])
			{
				temp=brr[i][0];
				brr[i][0]=brr[i][2];
				brr[i][2]=temp;
				temp=brr[i][1];
				brr[i][1]=brr[i][3];
				brr[i][3]=temp;
			}
			if(i%2==0)
				System.out.println((-1*brr[i][0]-1)+" "+(-1*brr[i][1]));
			else
				System.out.println((1000000+1-brr[i][0])+" "+(1000000-brr[i][1]));
		}
	}
}
