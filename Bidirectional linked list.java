class LinkedList {
    /**
     * 在头部插入元素
     *
     * @param
     */
    class Operation {
        Node head = new Node();

        public void insert(Node node) {
            if (head.Right == null) {
                head.Right = node;
                node.Left = head;
                node.Right = null;
            } else {
                node.Right = head.Right;
                head.Right.Left = node;
                head.Left = node;
                node.Right = head;
            }
        }

        /**
         * 删除一个结点
         *
         * @param node
         */
        public void delete(Node node) {
            if (head.Right == null) return;
            Node temp = head;
            try {
                while (temp.Right != node) temp = temp.Right;
            } catch (Exception e) {
                System.out.println("你要删除的对象不存在!");
                throw new RuntimeException(e);
            }
            Node temp1 = temp.Right.Right;
            if (temp1 == null) temp.Right = null;
            else temp.Right = temp1;
            temp1.Left = temp;
        }

        /**
         * 查询值为val的对象是否存在
         *
         * @param val
         * @return
         */
        public boolean selectByVal(int val) {
            if (head.Right == null) return false;
            Node temp = head.Right;
            while (temp != null) {
                if (temp.val == val) return true;
                temp = temp.Right;
            }
            return false;
        }

        /**
         * 遍历链表
         */
        public void show(Node head) {
            if (head.Right == null) System.out.println("双向链表中没有元素");
            Node temp = head.Right;
            while (temp != null) {
                System.out.printf("%d ", temp.val);
                temp = temp.Right;
            }
        }


        /**
         * 反转链表
         */
        public Node reverse() {
            Node temp = head.Right;
            if (temp == null) return head;
            while (temp.Right != null) {
                temp = temp.Right;
            }
            Node newHead = new Node();
            temp.Right = newHead;
            newHead.Left = temp;
            return newHead;
        }
    }

    class Node {
        Integer val;
        Node Left;
        Node Right;

        public Node() {

        }
    }
}