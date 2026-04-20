class stringTest{
    public static void main(String args[]) {
        String s="Hello";
        s.concat("World");
        System.out.println("String="+s);

        StringBuilder sbd=new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println("StringBuilder="+sbd);

        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer="+sb);
    }

}