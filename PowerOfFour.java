public class PowerOfFour {
    int num;
    public PowerOfFour(int num) {
        this.num = num;
        System.out.println(isPowerOfFour());
    }

    private boolean isPowerOfFour() {
        if (num == 0) return  false;

        while(num % 4 == 0) {
            num /= 4;
        }
        return (num == 1);
    }
}
