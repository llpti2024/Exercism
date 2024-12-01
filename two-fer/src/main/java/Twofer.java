public class Twofer {
    public String twofer(String name) {
        //I used if for to do a check, with I have a name return "One for " + name + ", one for me.",
        // otherwise I don't have a name return "One for you, one for me."
        if (name == null) {
             return "One for you, one for me.";
         }else{
             return "One for " + name + ", one for me.";
         }
        // This exception doesn't need because I have checked the name is null or not and return the correct string
        // I don't need to throw an exception.
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
