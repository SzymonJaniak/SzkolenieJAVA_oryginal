public class Script2Optimalization {
    public static void main(String[] args) {
        int a = 11, b = 8, c = 9, d = 13;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // ab
        if (c < a) {
            // cab
            if (d < c) {
                // dcab
                System.out.println("ORDER: " + d + " " + c + " " + a + " " + b);
            } else {
                // cdab lub cadb lub cabd
                if (d < a) {
                    // cdab
                    System.out.println("ORDER: " + c + " " + d + " " + a + " " + b);
                } else {
                    // cadb lub cabd
                    if (d < b) {
                        // cadb
                        System.out.println("ORDER: " + c + " " + a + " " + d + " " + b);
                    } else {
                        // cabd
                        System.out.println("ORDER: " + c + " " + a + " " + b + " " + d);
                    }
                }
            }
        } else {
            // acb lub abc
            if (c < b) {
                // acb
                if (d < a) {
                    // dacb
                    System.out.println("ORDER: " + d + " " + a + " " + c + " " + b);
                } else {
                    // adcb lub acdb lub acbd
                    if (d < c) {
                        // adcb
                        System.out.println("ORDER: " + a + " " + d + " " + c + " " + b);
                    } else {
                        // acdb lub acbd
                        if (d < b) {
                            // acdb
                            System.out.println("ORDER: " + a + " " + c + " " + d + " " + b);
                        } else {
                            // acbd
                            System.out.println("ORDER: " + a + " " + c + " " + b + " " + d);
                        }
                    }
                }
            } else {
                // abc
                if (d < a) {
                    // dabc
                    System.out.println("ORDER: " + d + " " + a + " " + b + " " + c);
                } else {
                    // adbc lub abdc lub abcd
                    if (d < b) {
                        // adbc
                        System.out.println("ORDER: " + a + " " + d + " " + b + " " + c);
                    } else {
                        // abdc lub abcd
                        if (d < c) {
                            // abdc
                            System.out.println("ORDER: " + a + " " + b + " " + d + " " + c);
                        } else {
                            // abcd
                            System.out.println("ORDER: " + a + " " + b + " " + c + " " + d);
                        }
                    }
                }
            }
        }
    }
}