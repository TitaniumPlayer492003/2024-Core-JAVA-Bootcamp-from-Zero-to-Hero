// String Class in immutable
// String Buffer class is mutable
// StringBuffer sb =new StringBuffer(); () -> inside this bracket there will be a default space of 15 characters
// StringBuffer sb =new StringBuffer(50); here we are allocating a space of 50 characters 
// Here we are making an object of a string buffer class
class Example{
    public static void main(String... avi) {
        StringBuffer sb =new StringBuffer("Hello"); // sb -> is an object
        System.out.println(sb);
    }
}
