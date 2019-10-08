package picpuzzle;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Timer extends Thread{
    @Override
    public void run(){
        Calendar cal = new GregorianCalendar();
        int start_s = cal.get(Calendar.SECOND);
        int start_ms = cal.get(Calendar.MILLISECOND);
        int last = start_s;
        PicPuzzle.diff = 0;
        PicPuzzle.myFlag = false;
        
        while(true){
            cal = new GregorianCalendar();
            int ss = cal.get(Calendar.SECOND);
            int ms = cal.get(Calendar.MILLISECOND);
            if(PicPuzzle.mode || PicPuzzle.myFlag){
                continue;
            }
            if(ss != start_s && ss != last && ms == start_ms){
                PicPuzzle.diff++;
                int h = PicPuzzle.diff / 3600;
                PicPuzzle.diff %= 3600;
                int m = PicPuzzle.diff / 60;
                int s = PicPuzzle.diff % 60;
                last = ss;
                
                String time = format(h,m,s);
                if(time.length() != 8){
                    continue;
                }
                
                switch (GameMenu.difficulty) {
                    case 3:
                        GameFrame3.counterField.setText(time);
                        break;
                    case 4:
                        GameFrame4.counterField.setText(time);
                        break;
                    case 5:
                        GameFrame5.counterField.setText(time);
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    String format(int h, int m, int s)
    {
        String hh = Integer.toString(h);
        if(hh.length()==1){
            hh = "0" + hh;
        }
        String mm = Integer.toString(m);
        if(mm.length()==1){
            mm = "0" + mm;
        }
        String ss = Integer.toString(s);
        if(ss.length()==1){
            ss = "0" + ss;
        }
        String time = hh + ":" + mm + ":" + ss;
        return time;
    }
}
