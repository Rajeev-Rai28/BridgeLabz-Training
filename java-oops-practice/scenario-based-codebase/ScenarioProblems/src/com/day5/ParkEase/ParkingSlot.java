package com.day5.ParkEase;

public class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Internal booking record (PRIVATE)
    private String bookingLog;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
        this.bookingLog = "No bookings yet";
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignVehicle(Vehicle vehicle) {
        if (isOccupied) {
            System.out.println("❌ Slot already occupied!");
            return;
        }

        if (!vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {
            System.out.println("❌ This slot does not allow " + vehicle.getClass().getSimpleName());
            return;
        }

        isOccupied = true;
        bookingLog = "Slot booked by " + vehicle.getVehicleNumber();
        System.out.println("✅ Vehicle parked successfully in slot " + slotId);
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot is now free";
        System.out.println("✅ Slot " + slotId + " is now free");
    }

    // Only logs are exposed (not modifiable)
    public String getBookingLog() {
        return bookingLog;
    }

    public int getSlotId() {
        return slotId;
    }
}

