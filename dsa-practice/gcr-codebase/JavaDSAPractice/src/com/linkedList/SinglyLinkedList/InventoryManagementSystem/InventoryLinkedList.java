package com.linkedList.SinglyLinkedList.InventoryManagementSystem;

class InventoryLinkedList {

    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    // Update quantity
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by ID
    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Name
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Total inventory value
    public double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    // Sort by price or name (Bubble sort for simplicity)
    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = head; j.next != null; j = j.next) {
                if ((ascending && j.price > j.next.price) ||
                    (!ascending && j.price < j.next.price)) {
                    swap(j, j.next);
                }
            }
        }
    }

    public void sortByName(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = head; j.next != null; j = j.next) {
                if ((ascending && j.itemName.compareToIgnoreCase(j.next.itemName) > 0) ||
                    (!ascending && j.itemName.compareToIgnoreCase(j.next.itemName) < 0)) {
                    swap(j, j.next);
                }
            }
        }
    }

    private void swap(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    // Display inventory
    public void display() {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private void printItem(ItemNode i) {
        System.out.println( "ID: " + i.itemId +", Name: " + i.itemName + ", Qty: " + i.quantity + ", Price: ₹" + i.price);
    }
}