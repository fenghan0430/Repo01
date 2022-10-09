public class Bus {
    public static void main(String[] args) {
        int people = 0;
        System.out.println("从起点发车车上有" + people + "人.");
        people += 3;
        System.out.println("到达A站车上有" + people + "人.");
        people += 2;
        people -= 1;
        System.out.println("到达B站车上有" + people + "人.");
        people +=1;
        System.out.println("到达C站车上有" + people + "人.");
        people -=1;
        System.out.println("到达终点站车上还有" + people + "人.");
    }
}
