public class Testers {
    public static void checkIsEmpty(Tree t) throws Exception {
        if (t instanceof EmptyBST && !t.isEmpty())
            throw new Exception("Error: the tree is an EmptyBST and it's not empty");
        else if (t instanceof NonEmptyBST && t.isEmpty())
            throw new Exception("Error: the tree is an NonEmptyBST and it is empty");
    }
}
