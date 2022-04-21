
import java.util.*;

public class BinarySearchTree
{
    public Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    public Node getroot()
    {
        return root;
    }

    public Node Search(int KEY)
    {
        Node x = root;
        while (x != null && x.item != KEY)
        {
            if (KEY < x.item)
            {
                x = x.Left;
            }
            else
            {
                x = x.Right;
            }
        }
        return x; // x.item == key or x == null
    }

    public Node SearchRec(Node root, int key)
    {
        if (root == null)
            return null;

        if ( root.item == key )
            return root;

        if (root.item > key)
            return SearchRec(root.Left, key);
        else
            return SearchRec(root.Right, key);
    }

    public  void Insert(int newItem)
    {
        Node parent = null;
        Node newNode = new Node(newItem);
        Node current = root;
        while (current != null)
        {
            parent = current;
            if (newNode.item < current.item)
            {
                current = current.Left;
            }
            else
            {
                current = current.Right;
            }
        }
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            if (newNode.item < parent.item)
            {
                parent.Left = newNode;
            }
            else
            {
                parent.Right = newNode;
            }
        }
    }


    public boolean Delete(int key)
    {
        // pointer to store the parent of the current node
        Node parent = null;

        // start with the root node
        Node curr = root;

        // search key in the BST and set its parent pointer
        while (curr != null && curr.item != key)
        {
            // update the parent to the current node
            parent = curr;

            // if the given key is less than the current node, go to the left subtree;
            // otherwise, go to the right subtree
            if (key < curr.item)
            {
                curr = curr.Left;
            }
            else
            {
                curr = curr.Right;
            }
        }

        // return if the key is not found in the tree
        if (curr == null) {
            return false;
        }

        // Case 1: node to be deleted has no children, i.e., it is a leaf node
        if (curr.Left == null && curr.Right == null)
        {
            // if the node to be deleted is not a root node, then set its
            // parent left/right child to null
            if (curr != root)
            {
                if (parent.Left == curr) {
                    parent.Left = null;
                }
                else {
                    parent.Right = null;
                }
            }
            // if the tree has only a root node, set it to null
            else {
                root = null;
            }
        }

        // Case 2: node to be deleted has two children
        else if (curr.Left != null && curr.Right != null)
        {
            // find its inorder successor node
            Node successor = getSuccessor(curr.Right);

            // store successor value
            int val = successor.item;

            // recursively delete the successor. Note that the successor
            // will have at most one child (right child)
            Delete(successor.item);

            // copy value of the successor to the current node
            curr.item = val;
        }

        // Case 3: node to be deleted has only one child
        else {
            // choose a child node
            Node child = (curr.Left != null)? curr.Left: curr.Right;

            // if the node to be deleted is not a root node, set its parent
            // to its child
            if (curr != root)
            {
                if (curr == parent.Left) {
                    parent.Left = child;
                }
                else {
                    parent.Right = child;
                }
            }

            // if the node to be deleted is a root node, then set the root to the child
            else {
                root = child;
            }
        }

        return true;
    }

    public Node getSuccessor(Node curr)
    {
        while (curr.Left != null) {
            curr = curr.Left;
        }
        return curr;
    }

    public void InOrder(Node theRoot)
    {
        if (!(theRoot == null))
        {
            InOrder(theRoot.Left);
            theRoot.DisplayNode();
            InOrder(theRoot.Right);
        }
    }

}
