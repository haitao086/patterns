package algorithms;


public class DFSBFS {
    private char[] mVertexs;//Vertex array
    private int[][] mMatrix;//neighbor matrix
    public DFSBFS(char[] vexs, char[][] edges){
        int vlen=vexs.length;
        int elen=edges.length;
        mVertexs =new char[vlen];
        for(int i=0;i<vlen;i++){
            mVertexs[i]=vexs[i];
        }
        mMatrix=new int[vlen][vlen];
        for(int i=0;i<elen;i++){

            int pos1=getPos(edges[i][0]);
            int pos2=getPos(edges[i][1]);
            mMatrix[pos1][pos2]=1;
        }
    }
    private int getPos(char c) {

        for(int i = 0; i< mVertexs.length; i++){
            if(mVertexs[i]==c){
                return i;
            }
        }return -1;
    }

    private int nextVertex(int i, int w) {//back to the neighbors
        for(int j = w+1; j< mVertexs.length; j++){//i:H,j:H
            if(mMatrix[i][j]==1){
                return j;
            }
        }return -1;

    }

    private int firstVertex(int i) {//back to the first vertex

        for(int j = 0; j< mVertexs.length; j++){
            if(mMatrix[i][j]==1){
                return j;
            }
        }return -1;
    }

    public void print(){
        for(int i=0;i<mMatrix.length;i++){
            for(int j=0;j<mMatrix[i].length;j++){
                System.out.print(mMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public void DFS(){
        boolean[] visited=new boolean[mVertexs.length];
        System.out.println("DFS:");
        for(int i = 0; i< mVertexs.length; i++){
            if(visited[i]==false){
                DFS(i,visited);
            }
        }
        System.out.println();
    }

    private void DFS(int i, boolean[] visited) {
        visited[i]=true;
        System.out.print(" "+ mVertexs[i]);
        int w=firstVertex(i);//i:A,w:B
        while(w>=0){
            if(visited[w]==false){
                DFS(w,visited);
            }
            w=nextVertex(i,w);
        }
        i--;//back
    }

    public void BFS(){
        int head=0;
        int rear=0;
        int[] queue=new int[this.mVertexs.length];
        boolean[] visited=new boolean[this.mVertexs.length];
        for (int i = 0; i < mVertexs.length; i++){//initial marks
            visited[i] = false;
        }
        System.out.println("BFS:");
        for(int i = 0; i< mVertexs.length; i++){
            if(visited[i]==false){
                visited[i]=true;
                System.out.print(" "+ mVertexs[i]);
                queue[rear++]=i;
            }
            while(head!=rear){
                int j=queue[head++];
                int k=firstVertex(j);
                while(k>=0){
                    if(visited[k]==false){
                        visited[k]=true;
                        System.out.print(" "+ mVertexs[k]);
                        queue[rear++]=k;
                    }
                    k=nextVertex(j,k);
                }
            }
        }

    }




    public static void main(String[] args) {

        char[] vexs = {'A', 'B', 'C', 'D','E','F','G','H','I'};
        char[][] edges = new char[][]{
                {'A', 'B'},
                {'A', 'F'},
                {'B', 'G'},
                {'B', 'C'},
                {'B', 'I'},
                {'C', 'B'},
                {'C', 'I'},
                {'C', 'D'},
                {'D', 'C'},
                {'D', 'I'},
                {'D', 'G'},
                {'D', 'H'},
                {'D', 'E'},
                {'E', 'H'},
                {'E', 'F'},
                {'F', 'G'},
                {'F', 'A'},
                {'F', 'E'},
                {'G', 'H'},
                {'G', 'D'},
                {'G', 'B'},
                {'H', 'G'},
                {'H', 'D'},
                {'H', 'E'},
                {'I', 'B'},
                {'I', 'C'}

        };
        DFSBFS pG;
        pG = new DFSBFS(vexs, edges);
        pG.print();
        pG.DFS();
        pG.BFS();
    }

}
