public class StringClass {
    public static void main(String[] args) {
        String Yourname="Praveen";
        String myName="Praveen";
        System.out.println("It is to convert Yourname.toLowerCase()"+Yourname.toLowerCase());
       System.out.println("It is to covert Yourname.toUpperCase()"+Yourname.toUpperCase());
        System.out.println(Yourname.contains("r"));
        System.out.println(Yourname.charAt(3));
        System.out.println(Yourname.equals(myName));
        System.out.println(Yourname.indexOf('v'));
        System.out.println(Yourname==myName);

        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(char i=65;i<=90;i++){
            System.out.print((i)+" ");
        }
        System.out.println();
        for(char i=97;i<=122;i++){
            System.out.print((i)+" ");
        }

    }
}