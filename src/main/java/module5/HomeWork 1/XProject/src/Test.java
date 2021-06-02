public class Test {
    public static void main(String[] args) {
        String[][] x = new String[7][7];

        int upCount = 0;
        int downCount = 6;

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                if(j == upCount){
                    x[i][j] = "X";
                    System.out.print(x[i][j]);
                }else if(j == downCount){
                    x[i][j] = "X";
                    System.out.print(x[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            upCount++;
            downCount--;
            System.out.println();
        }
    }
}
