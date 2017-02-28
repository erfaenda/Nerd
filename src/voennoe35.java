/**
 * Created by alex on 24.02.2017.
 */
public class  voennoe35 {
    private int hour;
    private int minute;
    private  int second;

    public void setTime(int h, int m, int s) {
        hour = ((h>0 && h<24) ? h:0); //простое стравнение, если часы больше 0 и меньше 24 то выводим, если нет, то сбрасываем на 0
        minute = ((m>0 && m<60) ? m:0);
        second = ((s>0 && s<60) ? s:0);


    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second); //переводим время в форматированный вид
    }
    public String toNormal(){
        return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12)?12:hour%12), minute, second, (hour<12?"AM":"PM"));
    }

}
