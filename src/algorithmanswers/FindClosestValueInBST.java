package algorithmanswers;

// Yusuf Beştaş
public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {


        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.left = new BST(5);
        tree.left.left = new BST(2);
        tree.left.left.left = new BST(1);
        tree.left.right = new BST(5);
        tree.right = new BST(15);
        tree.right.left = new BST(13);
        tree.right.left.left = new BST(12);
        tree.right.left.right = new BST(14);
        tree.right.right = new BST(22);
        System.out.println(findClosestValueInBst(tree, 12));


    }
}
