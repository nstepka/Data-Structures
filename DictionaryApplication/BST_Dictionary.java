public class BST_Dictionary {
    BinarySearchTree DD;

    public BST_Dictionary() {
        this.DD = new BinarySearchTree();
    }

    public Node Search(int key)
    {
        return DD.Search(key);
    }
    public void Insert(int item)
    {
        DD.Insert(item);
    }

    public boolean Delete(int key)
    {
        return DD.Delete(key);
    }

    public void Display(Node root)
    {
        root = DD.getroot();
        DD.InOrder(DD.getroot());
    }

}
