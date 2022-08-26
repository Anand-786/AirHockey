import javax.swing.*;

public class StartMenu {
    JFrame frame;
    String player1;
    String player2;
    StartMenu()
    {
        frame=new JFrame();
        Object[] options={"Start","Cancel"};
        int a=JOptionPane.showOptionDialog(frame,"Welcome to Air Hockey\n\n\nPLAY USING 'W','S','UP' and 'DOWN' keys.\nFirst one to score 5 points WINS!!\n\nPress Enter OR click Start to play!","AIR HOCKEY",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        if(a==JOptionPane.YES_OPTION)
        {
            player1=JOptionPane.showInputDialog(frame,"Enter name(Player-1)\n[LEFT PADDLE]");
            player2=JOptionPane.showInputDialog(frame,"Enter name(Player-2)\n[RIGHT PADDLE]");
        }
        else
        {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.exit(1);
        }
    }
    public void gameOver(int id)
    {
        frame=new JFrame();
        Object[] options={"OK","Exit"};
        int a=JOptionPane.showOptionDialog(frame,"Congratulations!!!\n\n"+((id==1)?player1:player2)+" has WON!\nThank you for playing.","GAME OVER",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        System.exit(0);
    }
}
