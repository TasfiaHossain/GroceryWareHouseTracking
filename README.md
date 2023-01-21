# GroceryWareHouseTracking Project Description

#### Disclaimer: 
This was a class project for our Software Engineering Class. 
The following are contributers to this project - Tasfia, Samuel, Ivan, Matthew, Alex, and Kevin.

#### Brief Project Description:
Our goal is to develop software that will allow grocery warehouses to keep track of product inventory as well as track incoming orders and item fulfillment requests from Whole Foods, track when an order from inventory will be shipped to the grocery store, and the overall invoices from each order.

We decided to build this project using various types of Java Design Patterns as to practice our skills and showcase our project requirements. 

------

# Project Requirements Document

These requiremenrs outline the functionality and requirements for the Grocery
Inventory & Order Management System (GIOMS). The software will be licensed to
Whole Foods Market Inc. (WFMI) for use in their grocery warehouses and will be used
to keep track of product inventory as well as keep track of incoming orders and item
fulfillment requests. Fulfillment requests are updated during processing and after
completion. 

## Purpose:

GIOMS will provide WFMI with a much faster and more accurate inventory and order
management system. WFMI’s current inventory and order management software was
internally audited and demonstrated discrepancies such as not providing Whole Food
stores with accurate delivery times, warehouse inventory quantities not reflecting
true-to-life inventory, and order quantity errors which would result in stores receiving
more or less products than they ordered. GIOMS aims to reduce these discrepancies by
allowing faster read/write access than other competitive software allowing WFMI
warehouses to quickly address any issues that may arise and have more data
consistency than is present with their current software.

**GIOMS software is intended for logistical use by the grocery industry. Software can be
modified to function in any business industry.**

## Architecture:

#### Process Flowchart:

![image](https://user-images.githubusercontent.com/66657441/213894579-15448055-d969-4077-822d-2708af53399b.png)

#### Journey Flowchart:

![image](https://user-images.githubusercontent.com/66657441/213894543-9bbf927f-568f-4c70-b7c4-1db194e42f95.png)

## Business Model:

GIOMS aims to earn a name for itself by decreasing financial losses for companies that
deal with logistical issues by increasing accuracy and consistency. Costs as result of
logistical issues are projected to decrease by 16% during the first year of WFMI warehouses adopting GIOMS and 25% each subsequent year. The cost decrease will be less during the first year because of the costs and training associated with adopting new software. 

It is this kind of success that will allow GIOMS to gain more market share through use in other large companies in the grocery industry which will lead to increased adoption throughout other retail industries. These increased revenue streams will provide funding for potential future projects to address other logistical and stagnation issues in different industries.

## Project Scope:

GIOMS will provide software scalable for up to 5 locations (preliminary). The software will allow editing of inventory levels, order contents and order status. The end-user can assign permissions as necessary to additional users to extend equal or restricted read/write level access to aforementioned functions. GIOMS does not offer a mobile form of the software or retail-level order fulfillment. This is specifically intended for back-of-house purposes.

## Project Use-Case Scenario:

#### The main success scenario:

A store submits an order request. Every item is available in the requested quantities and the warehouse manager marks the order as ‘Accepted’. The warehouse fulfills the request and warehouse staff prepares the items for shipping. The order is updated as complete. Come shipment day, the order is loaded for shipping and the order request is marked as shipped. The order is received and is accurate to the order and is marked as ‘Received – no errors’.

#### Alternative Paths:

A store logistics manager submits an order. The warehouse manager reviews the order and notes on the order that inventory levels are insufficient to fulfill order. Warehouse manager creates a counterorder visible to the ordering store indicating that warehouse inventory is insufficient to fulfill original order. The store logistics manager can accept the counterorder that is then marked as a submitted request. Warehouse manager notes this update and updates the status to processing. The counterorder is processed the same manner an order would be. Original order marked as ‘CO’ (counterorder) and the reason for the counterorder is specified. Optionally, the inquiring store can also reject the counterorder. This ends the order process, and the process is marked as ‘Canceled’.

#### Post conditions:

If an order or counterorder is processed and fulfilled, the inquiring store receives and processes the order. The store inventory levels are updated to reflect new quantities. The order is marked as completed.

























