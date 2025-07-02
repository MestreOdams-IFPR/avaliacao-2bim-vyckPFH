

public class quest1 {
    public static void main(String[] args) {
        int[] v = {1,4,6,8,2,3};
        metodoRec02(v, 0, v.length-1);
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    //um swap recursivo, mas que troca todos os elementos ao inves de só 2, v[e] e v[d] até e >= d;
    public static void metodoRec02(int v[], int e, int d){ 
        int t;
        if(e >= d){
            return;
        }else{
            t = v[e];
            v[e] = v[d];
            v[d] = t;
            metodoRec02(v, e + 1, d - 1);
        }
    }
}
