package com.day3.ParcelTracker;

public class ParcelRoute {
	private StageNode head;
	
	
	 // Create default chain: Packed → Shipped → In Transit → Delivered
    public void createDefaultChain() {
        StageNode n1 = new StageNode("Packed");
        StageNode n2 = new StageNode("Shipped");
        StageNode n3 = new StageNode("In Transit");
        StageNode n4 = new StageNode("Delivered");

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    
    // Display / Track parcel stages (Forward traversal)
    public void trackParcel() {
        if (head == null) {
            System.out.println("No parcel found!");
            return;
        }

        StageNode temp = head;
        System.out.println("Parcel Tracking Path:");

        while (temp != null) {
            System.out.print(temp.stageName);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
    
    public void addAfter(String existingStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equals(existingStage)) {
                StageNode newNode = new StageNode(newStage);

                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Checkpoint '" + newStage + "' added after '" + existingStage + "'");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage '" + existingStage + "' not found!");
    }
    // Check if parcel is delivered or lost
    public void checkStatus() {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equals("Delivered")) {
                System.out.println("Parcel successfully Delivered!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Parcel is Lost / Missing (Delivered not reached)");
    }
    
    // Simulate lost parcel by breaking the chain
    public void breakChainAfter(String stageName) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equals(stageName)) {
                temp.next = null;   // Break the chain
                System.out.println("Chain broken after '" + stageName + "'");
                return;
            }
            temp = temp.next;
        }
    }
}
