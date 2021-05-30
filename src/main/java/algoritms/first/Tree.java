package algoritms.first;

public class Tree {
    public static void main(String[] args) {
        BeTree root = new BeTree(20,
                new BeTree(7,
                        new BeTree(4, null, new BeTree(6)),
                        new BeTree(9)),
                new BeTree(35,
                        new BeTree(31, new BeTree(28), null),
                        new BeTree(40, new BeTree(38), new BeTree(52))));

        System.out.println("Sum of root: " + root.sum());
    }

    static class BeTree {
        int value;
        BeTree left;
        BeTree right;

        public BeTree(int value, BeTree left, BeTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BeTree(int value) {
            this.value = value;
        }

        public int sum() {
            int sum = value;

            if (left !=null) {
                sum += left.sum();
            }

            if (right !=null) {
                sum += right.sum();
            }

            return sum;
        }
    }
}
