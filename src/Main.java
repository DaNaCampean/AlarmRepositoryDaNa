public class Main {
    public static void main(String[] args) {
        System.out.println("test stringaaaa");
        String percentage = null;
        String styleAttr = "transform: translateX(78%);";

        int start = ("transform: translateX(").length();
        System.out.println("index of = " + start);
        int end = styleAttr.indexOf("%", start);
        int endd = styleAttr.indexOf("%");
        System.out.println("endd = "+ endd);
        System.out.println("end="+end);
        percentage = styleAttr.substring(start, end);
        System.out.println("calcule = " + percentage);
    }
}
