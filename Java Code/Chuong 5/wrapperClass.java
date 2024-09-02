public class wrapperClass {
    public static void main(String[] args) {
        Float objF = new Float("4.67");
        float f = objF.floatValue();
        int i = objF.intValue();
        int j = Integer.parseInt("123");
        double d = Double.valueOf("1.5");
        float ff = Float.parseFloat("2.4f"); //2.4
        Double objF2 = Double.valueOf("-36.12");
        long l = objF2.longValue();
    }
}
