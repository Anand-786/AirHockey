public class AIRHOCKEY {
    static StartMenu menu=new StartMenu();
    public static void over(int id)
    {
        AIRHOCKEY.menu.gameOver((id==1)?1:2);
    }
    public static void main(String[] args) {
        GameFrame frame=new GameFrame();
    }
}