package java8features;

class spiralorder { 
    static void  spiralorderPrint(int m, int n, int a[][]) 
    { 
        int i, k = 0, l = 0; 
        
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int R = 4; 
        int C =4; 
        int a[][] = { {2,3,4,5},{4,5,9,6},{3,1,3,7},{2,1,9,8} }; 
        spiralorderPrint(R, C, a); 
    } 
} 