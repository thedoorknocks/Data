public class Main{
    public static void main(String[] args){
        System.out.println(Data.MAX);
        Data d = new Data(2,3);
        d.repopulate();
        System.out.println(d);
        System.out.println(d.countIncreasingCols());
    }
}
