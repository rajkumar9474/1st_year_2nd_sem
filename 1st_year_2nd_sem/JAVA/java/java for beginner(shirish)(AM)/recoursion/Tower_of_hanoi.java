import javax.swing.JOptionPane;
public class Tower_of_hanoi {
    public static void main(String[] args) {
        String strNote,strN;
        int intN;
        strNote = "enter the number: 0<n<11";
        strN = JOptionPane.showInputDialog(null, strNote);
        intN = Integer.parseInt(strN);
        move(intN,'L','R','C');
        System.exit(0);
    }
    static void move(int N,char chrFrom,char chrTo,char chrTemp){
        if(N>0){
            move(N-1, chrFrom, chrTemp, chrTo);
            System.out.println("Move disk "+N+" from "+chrFrom+" to "+chrTo);
            move(N-1, chrTemp, chrTo, chrFrom);
        }
        return;
    }
}
