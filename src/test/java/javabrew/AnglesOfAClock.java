//LC 1344. Angle Between Hands of a Clock
package javabrew;

public class AnglesOfAClock {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(findAngles(3, 30));
        System.out.println(findAngles(12, 30));
    }

    private static int findAngles(int hour,int minute) throws IllegalAccessException {
        if(hour<0 || hour>12 || minute<0 || minute>59){
            throw new IllegalAccessException("Invalid Input.");
        }

        double hourAngle = (hour % 12) * 30 + (minute / 60.0) * 30;
        double minuteAngle = minute*6;
        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle>180){
            angle = 360 - angle;
        }

        return (int) angle;
    }

}
