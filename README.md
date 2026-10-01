Vehicle Service and Maintenance Management System
Overview
The Vehicle Service and Maintenance Management System is a Java console application designed to handle vehicle context input, service selection, cost calculation, kilometer-based maintenance checking, and automated reporting.

Authors & Guidance
Developers: M. Charan Sai Teja (2620030617), G. Jayapal Reddy (2620040120)

Faculty Guide: Gopi Krishna

Technical Stack & Building Blocks
Language: Java

Input Handling: java.util.Scanner for capturing typed user details and service choices.

Data Types: String (Vehicle Number, Owner Name, Vehicle Model), int (Kilometers), double (Service Costs).

Control Structures:

switch-case for mapping 12 distinct service options and pricing.

if-else conditional statements for validation and maintenance threshold evaluation.

Resource Management: Proper closure of input resources using sc.close().

Service Menu & Pricing
The system features 12 transparent service options:

Engine Oil Change: Rs. 1,500

AC Service: Rs. 1,000

Wheel Alignment: Rs. 800

Battery Check: Rs. 500

Brake Service: Rs. 1,200

Transmission Oil Change: Rs. 1,800

Radiator Service: Rs. 1,600

Gear Oil Change: Rs. 1,100

Suspension Check: Rs. 900

Fuel System Cleaning: Rs. 1,300

Exhaust System Check: Rs. 700

Full Service Package: Rs. 5,000

Core Logic & Execution Flow
Input Layer: Collects vehicle context including Vehicle Number, Owner Name, Vehicle Model, and Current Kilometers.

Service Selection: Prompts the user to choose from 12 available services. A switch block maps the choice to its respective name and cost.

Defensive Validation: If an invalid choice (outside 1–12) is entered, the system triggers an immediate error message ("Invalid service choice"), flags validChoice as false, and safely skips report generation and billing.

Maintenance Decision Rule: Evaluates current mileage against a 10,000 km threshold:

If kilometers ≥10,000: Displays "Maintenance Recommended".

If kilometers <10,000: Displays "Vehicle is in Good Condition".

Final Output: Generates a structured summary detailing vehicle information, selected service costs, maintenance status, and the total bill.
