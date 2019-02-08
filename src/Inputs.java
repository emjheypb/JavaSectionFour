import java.util.Scanner;

public class Inputs {

    private Scanner scan  = new Scanner(System.in);

    public int getInt() {
        return scan.nextInt();
    }

    public String getString() {
        return scan.nextLine();
    }

    public boolean getBool() {
        return scan.nextBoolean();
    }

    public byte getByte() {
        return scan.nextByte();
    }

    public double getDouble() {
        return scan.nextDouble();
    }

    public float getFloat() {
        return scan.nextFloat();
    }

    public long getLong() {
        return scan.nextLong();
    }

    public short getShort() {
        return scan.nextShort();
    }


}
