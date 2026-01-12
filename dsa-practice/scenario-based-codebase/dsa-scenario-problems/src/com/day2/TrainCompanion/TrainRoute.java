package com.day2.TrainCompanion;

public class TrainRoute {

    private Compartment head;   // first compartment
    private Compartment tail;   // last compartment

    // Add compartment at end
    public void addCompartment(String name) {
        Compartment newComp = new Compartment(name);

        if (head == null) {
            head = tail = newComp;
            return;
        }

        tail.next = newComp;
        newComp.prev = tail;
        tail = newComp;
    }

    // Insert compartment after a given compartment
    public void insertAfter(String existingName, String newName) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(existingName)) {
                Compartment newComp = new Compartment(newName);

                newComp.next = temp.next;
                newComp.prev = temp;

                if (temp.next != null) {
                    temp.next.prev = newComp;
                } else {
                    tail = newComp; // if inserting after last
                }

                temp.next = newComp;

                System.out.println("Inserted " + newName + " after " + existingName);
                return;
            }
            temp = temp.next;
        }

        System.out.println(existingName + " not found!");
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        if (head == null) {
            System.out.println("No compartments to remove!");
            return;
        }

        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                // If removing head
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; // list became empty
                    }
                }
                // If removing tail
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // Removing from middle
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Removed compartment: " + name);
                return;
            }
            temp = temp.next;
        }

        System.out.println(name + " not found!");
    }

    // Traverse forward
    public void traverseForward() {
        if (head == null) {
            System.out.println("No compartments!");
            return;
        }

        System.out.println(" Train (Front to Back):");
        Compartment temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Traverse backward
    public void traverseBackward() {
        if (tail == null) {
            System.out.println("No compartments!");
            return;
        }

        System.out.println("Train (Back to Front):");
        Compartment temp = tail;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.prev != null) System.out.print(" -> ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("\n You are at: " + temp.name);

                if (temp.prev != null) {
                    System.out.println(" Previous: " + temp.prev.name);
                } else {
                    System.out.println(" Previous: None (First compartment)");
                }

                if (temp.next != null) {
                    System.out.println(" Next: " + temp.next.name);
                } else {
                    System.out.println(" Next: None (Last compartment)");
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println(name + " not found!");
    }

    // Search for a service like Pantry or WiFi coach
    public void searchCompartment(String name) {
        Compartment temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(" " + name + " found at position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println(" " + name + " not found in train!");
    }
}
