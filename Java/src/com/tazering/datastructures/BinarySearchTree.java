package com.tazering.datastructures;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
    }

    public BinarySearchTree() {
        this.root = new Node();
    }

    public String findData(String data) {

        if(isEmpty()) {
            return null;
        }

        return root.find(data);

    }

    public int size() {
        if(root.data == null) {
            return 0;
        } else {
            return root.size();
        }
    }

    public boolean isEmpty() {

        if(root.data == null) {
            return true;
        }

        return false;
    }

    public int height() {
        if(root.data == null) {
            return 0;
        }

        return root.height();
    }

    public boolean insert(String data) {
        if(data == null) {
            return false;
        }

        return root.insert(data);
    }

    public String inOrder() {
        if(isEmpty()) {
            return "";
        }

        return root.inOrder();
    }


    class Node {

        String data;
        Node left;
        Node right;

        public Node() {
            data = null;
            this.left = null;
            this.right = null;
        }

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


        public int size() {
            int size = 0;

            if(this == null) {
                return 0;
            }

            if(this.left != null) {
                size += left.size();
            }

            if(this.right != null) {
                size += right.size();
            }

            size++;
            return size;
        }

        public int height() {
            if(this == null) {
                return 0;
            } else {
                int lHeight = 0;
                int rHeight = 0;

                if(this.left != null) {
                    lHeight = this.left.height();
                }

                if(this.right != null) {
                    rHeight = this.right.height();
                }

                if(lHeight > rHeight) {
                    return lHeight + 1;
                } else {
                    return rHeight + 1;
                }
            }
        }

        public boolean insert(String data) {
            Node nextNode;

            if(this.data == null) {
                this.data = data;
                return true;
            }

            if(data.equals(this.data)) {
                return false;
            } else if(data.compareTo(this.data) < 0) {
                if(this.left == null) {
                    this.left = new Node(data);
                    return true;
                }

                nextNode = this.left;
            } else {
                if(this.right == null) {
                    this.right = new Node(data);
                    return true;
                }

                nextNode = this.right;
            }

            if(nextNode == null) {
                return false;
            }

            return nextNode.insert(data);
        }

        public String find(String data) {

            if(data == null) {
                return null;
            }

            if(this.data.compareTo(data) == 0) {
                return this.data;
            } else if(data.compareTo(this.data) < 0) {
                if(this.left == null) {
                    return null;
                }

                return this.left.find(data);
            } else if(data.compareTo(this.data) > 0) {

                if(this.right == null){
                    return null;
                }

                return this.right.find(data);
            }

            return null;

        }

        public String inOrder() {
            StringBuilder stringBuilder = new StringBuilder();

            if(this.left != null) {
                stringBuilder.append(this.left.inOrder());
            }

            stringBuilder.append(this.data + "\n");

            if(this.right != null) {
                stringBuilder.append(this.right.inOrder());
            }

            return stringBuilder.toString();
        }

    }

}
