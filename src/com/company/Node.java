package com.company;


public class Node {
    private Node left;
    private Node right;
    private int value;
    private boolean balance;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public int defBalance() {
        int l = 0, r = 0, A = 0;

        if(this.left != null) {
            l++;
            l += this.left.defBalance();
        }
        if(this.right != null) {
            r++;
            r += this.right.defBalance();
        }

        A = l - r;


        if(A == 1 || A == 0 || A == -1) {
            this.setBalance(true);
            if(A == -1) {
                A = A*(-1);
            }
            return A;
        } else {
            this.setBalance(false);
            if(A < 0) {
                A = A*(-1);
            }
            return A;
        }
    }

    public boolean checkBalance() {

        if(this.left == null || this.right == null) {
            return this.balance;
        } else {
            if(this.left.balance && this.right.balance) {
                return true;
            } else {
                this.setBalance(false);
                return false;
            }
        }
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }
}