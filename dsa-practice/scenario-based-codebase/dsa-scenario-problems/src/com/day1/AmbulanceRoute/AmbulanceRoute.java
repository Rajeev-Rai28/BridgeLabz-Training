package com.day1.AmbulanceRoute;

public class AmbulanceRoute {

    private Unit head = null;

    // Add new unit to circular list
    public void addUnit(String name, boolean available) {
        Unit newUnit = new Unit(name, available);

        // If first unit
        if (head == null) {
            head = newUnit;
            newUnit.next = head; // circular link
            return;
        }

        // Find last unit
        Unit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Show all units
    public void showUnits() {
        if (head == null) {
            System.out.println("No units in hospital!");
            return;
        }

        Unit temp = head;
        System.out.println("🏥 Hospital Units:");
        do {
            System.out.println(" - " + temp.name + " (Available: " + temp.available + ")");
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit (rotate circularly)
    public void findNearestAvailableUnit() {
        if (head == null) {
            System.out.println("No units available!");
            return;
        }

        Unit temp = head;

        do {
            System.out.println("🚑 Checking: " + temp.name);

            if (temp.available) {
                System.out.println("✅ Redirect patient to: " + temp.name);
                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println("❌ No unit is currently available!");
    }

    // Remove a unit (maintenance)
    public void removeUnit(String unitName) {
        if (head == null) {
            System.out.println("No units to remove!");
            return;
        }

        Unit curr = head;
        Unit prev = null;

        // Case 1: Only one unit
        if (head.next == head && head.name.equals(unitName)) {
            head = null;
            System.out.println(unitName + " removed (only unit).");
            return;
        }

        do {
            if (curr.name.equals(unitName)) {

                // If removing head
                if (curr == head) {
                    // Find last node
                    Unit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed (under maintenance).");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println(unitName + " not found!");
    }

    // Change availability of a unit
    public void setAvailability(String unitName, boolean status) {
        if (head == null) return;

        Unit temp = head;
        do {
            if (temp.name.equals(unitName)) {
                temp.available = status;
                System.out.println(unitName + " availability set to: " + status);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println(unitName + " not found!");
    }
}

