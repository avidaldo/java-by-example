package p01_introductorio.static_field;

final class Logger {
    private static int level = 2; // static field

    public static void setLevel(int level) {
        Logger.level = level;
    }

    public static int getLevel() {
        return level;
    }

    public static void log(int level, String message) {
        if (level <= Logger.level) {
            System.out.println(message);
        }
    }

    private Logger() { }
}
