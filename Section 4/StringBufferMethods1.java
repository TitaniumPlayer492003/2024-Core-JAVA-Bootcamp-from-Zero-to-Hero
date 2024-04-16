// This method will append a string to the StringBuffer object
class SBappend {
    static void appending(StringBuffer a) {
        String s1 = "What a joke!";
        a.append(s1);
    }
}

// This method will insert a string at the specified position
class SBinsert {
    static void inserting(StringBuffer i) {
        String s2 = "{new string}";
        i.insert(3, s2);
    }
}

// This method will delete a string from a specified position to a specified position
class SBdelete{
    static void deleting(StringBuffer d){
        d.delete(3,15);
    }
}

// main method
class StringBufferMethods1 {
    public static void main(String... avi) {
        StringBuffer sb = new StringBuffer(" hehe ");
        System.out.println("Original String:"+sb);
        // Calling all methods:
        SBappend.appending(sb);
        System.out.println(sb);
        SBinsert.inserting(sb);
        System.out.println(sb);
        SBdelete.deleting(sb);
        System.out.println(sb);
    }
}