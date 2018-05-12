public class compareVersions {

    private static int getN(String s1){
        return Integer.parseInt(s1.substring(0,s1.indexOf('.'))); }

    private static String compare(String s1, String s2){

        if(s1.contains(".") && s2.contains(".")){
            int n1 = getN(s1);
            int n2 = getN(s2);

            if (n1 > n2) return s1;
            else if (n2 > n1) return s2;
            else {
                s1= s1.substring(s1.indexOf('.')+1);
                s2= s2.substring(s2.indexOf('.')+1);
                return compare(s1, s2);
            }
        }

        else if(s1.contains(".")) return s1;
        else return s2;
    }

    public static void main(String[] args){
        String s1 = "1.1.0.1";
        String s2 = "1.1.0.2";
        if(s1.contains(compare(s1,s2))) System.out.println(s1);
        else System.out.println(s2);
    }
}
