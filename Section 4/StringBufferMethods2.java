// This method replaces a part of a string with another given the start and end positions
class SBreplace {
    static void replacing(StringBuffer r) {
        String s4 = "aH";
        r.replace(2, 4, s4);
    }
}

// This method reverses a string
class SBreverse {
    static void reversing(StringBuffer r) {
        r.reverse();
    }
}

// This method returns the length of a string {this works with a string too}
class SBlength {
    static void providingLength(StringBuffer l) {
        System.out.println(l.length());
    }
}

// This method converts a StringBuffer class to a String Class
class SBtoString {
    static void toingStringing(StringBuffer ts) {
        String getDataType = ts.toString();
        System.out.println(getDataType);
    }
}

// This method finds the index of a sub-string
class SBindexOf {
    static int findingIndexOf(String fi) {
        return fi.indexOf("e");
    }
}

// This method finds the last index of a sub-sting
class SBlastIndexOf {
    static int findingLastIndexOf(String fi) {
        return fi.lastIndexOf("e");
    }
}

// main Method
class StringBufferMethods2 {
    public static void main(String... avi) {
        StringBuffer sb = new StringBuffer(" hehe ");
        System.out.println("Original String:" + sb);
        // Calling all methods
        SBreplace.replacing(sb);
        System.out.println(sb);

        SBreverse.reversing(sb);
        System.out.println(sb);

        SBlength.providingLength(sb);

        String sb_string = sb.toString();
        System.out.println(sb_string);
        int index_ = SBindexOf.findingIndexOf(sb_string);
        System.out.println(index_);

        int last_index_ = SBlastIndexOf.findingLastIndexOf(sb_string);
        System.out.println(last_index_);

    }
}