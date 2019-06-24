package de.luckydonald.utils.interactions;


/**
 * Class printing boot ascii art.
 */
public class Bootup {
    public static String bootTextColored() {
        String line1 = "  JAVA for  ";
        String line2 = "_Dummies__";
        return bootTextColored(line1, line2, null);
    }

    public static void boot() {
        boot("JAVA", "FOR DUMMIES");
    }
    public static void boot(String line1, String line2) {
        boot(line1, line2, null);
    }
    public static void boot(String line1, String line2, String epilog) {
        System.out.println(bootTextColored(line1, line2, epilog));
    }

    public static String bootTextColored(String line1, String line2, String epilog) {
        line1 = centerText(line1, 12, ' ', true, false);
        line2 = centerText(line2, 10, '_', true, true);
        return "\n" +
                "\u001B[0;35m   _ \u001B[0;34m   _____   \u001B[0;35m      _\n" +
                "\u001B[0;35m   \\`,\u001B[0;34m\"\"   \u001B[0;35m,'\u001B[0;31m7\"r\u001B[0;34m-..__\u001B[0;35m/ \\\n" +
                "\u001B[0;34m  ,'\u001B[0;35m\\ `, \u001B[0;35m,'\u001B[0;31m,','    \u001B[0;34m_\u001B[0;35m/   \u001B[0;35m\\\n" +
                "\u001B[0;34m /   \u001B[0;35m\\  7\u001B[0;31m / /     \u001B[0;34m(   \u001B[0;35m\\ |\n" +
                "\u001B[0;34mJ     \u001B[0;35m\\/\u001B[0;31m j  L\u001B[0;34m______\\  \u001B[0;35m/ |\n" +
                "\u001B[0;34mL   __\u001B[0;35mJF\"\u001B[0;31m\"\"\u001B[0;30m/\u001B[0;30m\"\"\u001B[0;30m\\\u001B[0;30m\"\\_,    \u001B[0;35m/\n" +
                "\u001B[0;34mL,-\"\u001B[0;30m| \u001B[0;39mO\u001B[0;30m|\u001B[0;35m  \u001B[0;30mf \u001B[0;39mO\u001B[0;30m |\u001B[0;30m  L_  \u001B[0;35m_/\n" +
                "\u001B[0;34mF   \u001B[0;30m\\_ /  \\__/  \u001B[0;35m \u001B[0;30m`-\u001B[0;35m  \u001B[0;34mj|\n" +
                "\u001B[0;35m    .-'    \u001B[0;30m`\"\"\"    \u001B[0;34m,' |          \u001B[0;34m_..====.._\n" +
                "\u001B[0;35m    \\__/         \u001B[0;34mr\"_  A        \u001B[0;34m,'\u001B[0;31m_..---.._ \u001B[0;34m`,\n" +
                "\u001B[0;35m    `-.______,,-\u001B[0;34mL// \u001B[0;31m/ \\  \u001B[0;35m___,\u001B[0;34m' \u001B[0;31m,'_..:::.. `, \u001B[0;34m`,\n" +
                "\u001B[0;35m              j   \u001B[0;34m/ \u001B[0;31m/ / \u001B[0;34m7\"    `-<\u001B[0;34m\"\"=:'  \u001B[0;31m'':. \\ \u001B[0;34m\\\n" +
                "\u001B[0;35m             /   \u001B[0;34m<\u001B[0;31m,' /  \u001B[0;34mF  \u001B[0;37m.\u001B[0;35m i \u001B[0;37m, \u001B[0;35m\\   \u001B[0;34m`,    \u001B[0;31m:T W \u001B[0;34mI\n" +
                "\u001B[0;35m             |    \u001B[0;31m\\,'\u001B[0;34m  /    \u001B[0;35m>X<  |     \u001B[0;34m\\   \u001B[0;31m:| | \u001B[0;34m L\n" +
                "\u001B[0;35m             |     \u001B[0;34m`._/    \u001B[0;37m' \u001B[0;35m! \u001B[0;37m` \u001B[0;35m|      \u001B[0;34mI  \u001B[0;31m:| |  \u001B[0;34mG\n" +
                "\u001B[0;35m              \\           \\     /       \u001B[0;34m|  \u001B[0;31m:H T  \u001B[0;34m|\n" +
                "\u001B[0;35m             __>-.__   __,-\\   |        \u001B[0;34m|  \u001B[0;31mS P   \u001B[0;34m|\n" +
                "\u001B[0;35m            /     /|   | \\  \\  \\_       \u001B[0;34m| \u001B[0;31m'A R   \u001B[0;34m|\n" +
                "\u001B[0;35m           /   __/ |   |  L  L   \\      \u001B[0;34mK\u001B[0;31m./ /    \u001B[0;34mL\n" +
                "\u001B[0;35m          /   |    |   4  I  I    |    \u001B[0;34mE\u001B[0;31m./ /   \u001B[0;34m,'\n" +
                "\u001B[0;35m         J    \\    I    L F  I    |    \u001B[0;34m/\u001B[0;31m/ / \u001B[0;34m_,'\n" +
                "\u001B[0;30m_________\u001B[0;35m|     |   F    |J   F    |   \u001B[0;34m/\u001B[0;31m/_/\u001B[0;34m-'\n" +
                "\u001B[0;30m\\   __   \u001B[0;35m|    /   J     |/  J     |  \u001B[0;34m/=\"\n" +
                "\u001B[0;30m\\\\  \\_\\  \u001B[0;35m\\__,'\u001B[0;35m \\  F     |   F     |\n" +
                "\u001B[0;30m\\\\\\_____________\\\u001B[0;35m/      F__/      F\n" +
                "\u001B[0;30m \\\\|" + line1 + "|\u001B[0;35m_____/  (______/\n" +
                "\u001B[0;30m  \\/_"+ line2 + "_/\n" +
                (
                    epilog != null ? (
                        "\n" +
                        "\u001B[0;33m\n" +
                        epilog + "\n"
                    ) : ("")
                ) + "\u001B[0m";
    }

    public static String bootTextPlain() {
        String line1 = "  JAVA for  ";
        String line2 = "_Dummies__";
        return bootTextPlain(line1, line2, null);
    }
    public static String bootTextPlain(String line1, String line2, String epilog) {
        line1 = centerText(line1, 12, ' ', true, false);
        line2 = centerText(line2, 10, '_', true, true);
        return "\n" +
                "   _    _____         _\n" +
                "   \\`,\"\"   ,'7\"r-..__/ \\\n" +
                "  ,'\\ `, ,',','    _/   \\\n" +
                " /   \\  7 / /     (   \\ |\n" +
                "J     \\/ j  L______\\  / |\n" +
                "L   __JF\"\"\"/\"\"\\\"\\_,    /\n" +
                "L,-\"| O|  | O |  L_  _/\n" +
                "F   \\_ /  \\__/   `-  j|\n" +
                "    .-'    `\"\"\"    ,' |          _..====.._\n" +
                "    \\__/         r\"_  A        ,' _..---.._`,\n" +
                "     `-.______,,-L// / \\  ___,' ,'_..:::.. `,`,\n" +
                "              j   / / / 7\"    `-<\"\"=:'  '':. \\ \\\n" +
                "             /   <,' /  F  . i , \\   `,    :T W I\n" +
                "             |    \\,'  /    >X<  |     \\   :| | L\n" +
                "             |     `._/    ' ! ` |      I  :| |  G\n" +
                "              \\           \\     /       |  :H T  |\n" +
                "             __>-.__   __,-\\   |        |  S P   |\n" +
                "            /     /|   | \\  \\  \\_       | 'A R   |\n" +
                "           /   __/ |   |  L  L   \\      K./ /    L\n" +
                "          /   |    |   4  I  I    |    E./ /   ,'\n" +
                "         J    \\    I    L F  I    |    // / _,'\n" +
                "_________|     |   F    |J   F    |   //_/-'\n" +
                "\\   __   |    /   J     |/  J     |  /=\"\n" +
                "\\\\  \\_\\  \\__,' \\  F     |   F     |\n" +
                "\\\\\\_____________\\/      F__/      F\n" +
                " \\\\|"+ line1 + "|_____/  (______/\n" +
                "  \\/_" + line2 + "_/\n" + (
                        epilog != null ? (
                        "\n" +
                        "\n" +
                        epilog + "\n"
                    ) : ("")
                );
    }
    public static String centerText(String text, int space) {
        return centerText(text, space, ' ', true);
    }
    public static String centerText(String text, int space, char fill) {
        return centerText(text, space, ' ', true, true);
    }
    public static String centerText(String text, int space, char fill, boolean replaceSpaceWithFill) {
        return centerText(text, space, ' ', replaceSpaceWithFill, true);
    }

    /**
     * Center align text, fill left and right with with `fill`,
     * optionally replace spaces with `fill` as well (default: `true`).
     *
     * If the text isn't center-able as it is one character too long, and if `alignLeft` is `true`,
     * align it to the left, fill one more character of `fill` to the right.
     *
     * If the text is to long for `length`, it will raise an `IllegalArgumentException`.
     *
     * @param text  The text to pad.
     * @param length  The space we want to pad.
     * @param fill  Character to pad with.
     * @param replaceSpaceWithFill  If we should replace the whitespace `' '` with the fill as well.
     * @param alignLeft  If we should align it to the left in case of an uneven amount of `fill` to be added.
     *
     *
     * @throws IllegalArgumentException Your text is longer the set length.
     * @return The padded string.
     */
    public static String centerText(String text, int length, char fill, boolean replaceSpaceWithFill, boolean alignLeft) {
        if (text.length() > length) {
            throw new IllegalArgumentException("Text length > " + length + ".");
        }
        if (replaceSpaceWithFill) {
            text = text.replace(' ', fill);
        }
        if (text.length() == length) {
            return text;
        }
        int fillMe = length - text.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fillMe / 2; i++) {
            sb.append(fill);
        }
        return (!alignLeft && fillMe % 2 == 1 ? fill : "") + sb.toString() + text + sb.toString() + (alignLeft && fillMe % 2 == 1 ? fill : "");
    }

    public static void main(String[] argv) {
        String line0 = "WELL,";
        String line1 = "YOUR MOM";
        String lineZ = "You found this example. Great.";
        if (argv.length >= 2) {
            line0 = argv[0];
            line1 = argv[1];
            lineZ = null;
        }
        if (argv.length >= 3) {
            lineZ = argv[2];
        }
        System.out.println(bootTextPlain(line0, line1, lineZ));
        System.out.println(bootTextColored(line0, line1, lineZ));
    }
}

