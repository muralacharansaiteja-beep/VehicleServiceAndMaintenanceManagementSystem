import java.util.Scanner;

public class VehicleServiceAndMaintenanceManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Vehicle details
        System.out.println("==========================================");
        System.out.println("   VEHICLE SERVICE MANAGEMENT SYSTEM");
        System.out.println("==========================================");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String vehicleModel = sc.nextLine();

        System.out.print("Enter Current Kilometers: ");
        int kilometers = sc.nextInt();

        // Service menu
        System.out.println("\n========== SERVICE MENU ==========");
        System.out.println("1. Full Service");
        System.out.println("2. Partial Service");
        System.out.println("3. Engine Service");
        System.out.println("4. Oil Change");
        System.out.println("5. Brake Service");
        System.out.println("6. Tyre Service");
        System.out.println("7. Wheel Alignment");
        System.out.println("8. Battery Service");
        System.out.println("9. AC Service");
        System.out.println("10. Car Washing");
        System.out.println("11. General Inspection");
        System.out.println("12. Other Repair");

        System.out.print("\nSelect Service: ");
        int choice = sc.nextInt();

        String serviceName = "";
        double serviceCost = 0;

        // Select service and cost
        switch (choice) {

            case 1:
                serviceName = "Full Service";
                serviceCost = 5000;
                break;

            case 2:
                serviceName = "Partial Service";
                serviceCost = 2500;
                break;

            case 3:
                serviceName = "Engine Service";
                serviceCost = 4000;
                break;

            case 4:
                serviceName = "Oil Change";
                serviceCost = 1500;
                break;

            case 5:
                serviceName = "Brake Service";
                serviceCost = 1200;
                break;

            case 6:
                serviceName = "Tyre Service";
                serviceCost = 1000;
                break;

            case 7:
                serviceName = "Wheel Alignment";
                serviceCost = 800;
                break;

            case 8:
                serviceName = "Battery Service";
                serviceCost = 700;
                break;

            case 9:
                serviceName = "AC Service";
                serviceCost = 2000;
                break;

            case 10:
                serviceName = "Car Washing";
                serviceCost = 500;
                break;

            case 11:
                serviceName = "General Inspection";
                serviceCost = 300;
                break;

            case 12:
                serviceName = "Other Repair";
                serviceCost = 1000;
                break;

            default:
                System.out.println("Invalid service choice!");
                sc.close();
                return;
        }

        // Maintenance status
        String maintenanceStatus;

        if (kilometers >= 10000) {
            maintenanceStatus = "Maintenance Recommended";
        } else {
            maintenanceStatus = "Vehicle is in Good Condition";
        }

        // Display service report
        System.out.println("\n==========================================");
        System.out.println("             SERVICE REPORT");
        System.out.println("==========================================");

        System.out.println("Vehicle Number      : " + vehicleNumber);
        System.out.println("Owner Name          : " + ownerName);
        System.out.println("Vehicle Model       : " + vehicleModel);
        System.out.println("Current Kilometers  : " + kilometers + " km");

        System.out.println("------------------------------------------");

        System.out.println("Service Selected    : " + serviceName);
        System.out.println("Service Cost        : Rs. " + serviceCost);

        System.out.println("Maintenance Status  : " + maintenanceStatus);

        System.out.println("------------------------------------------");

        System.out.println("TOTAL BILL          : Rs. " + serviceCost);

        System.out.println("==========================================");
        System.out.println("       Thank you for choosing us!");
        System.out.println("==========================================");

        sc.close();
    }
}