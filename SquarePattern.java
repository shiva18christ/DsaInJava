class SquarePattern{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<=n;i++){
            char ch='A';
            for(int j=0;j<=n;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }



    }
}