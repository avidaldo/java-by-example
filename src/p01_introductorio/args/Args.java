package p01_introductorio.args;


public class Args {
    public static void main(String[] args) {
        System.out.println("Argument count: " + args.length);

        for(int i = 0; i < args.length; ++i) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

    }
}
