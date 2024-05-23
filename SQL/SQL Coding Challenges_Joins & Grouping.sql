USE classicmodels;

-- 1. Write a query to display each customer’s name (as “Customer Name”) alongside the name of the employee who is responsible for that customer’s orders. The employee name should be in a single “Sales Rep” column formatted as “lastName, firstName”. The output should be sorted alphabetically by customer name. 
select * from customer;
select * from employees;
SELECT 
    c.customerName AS "Customer Name",
    CONCAT(e.lastName, ', ', e.firstName) AS "Sales Rep"
FROM 
    customers c
JOIN 
    employees e ON c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY 
    c.customerName;

-- 2) Determine which products are most popular with our customers. For each product, list the total quantity ordered along with the total sale generated (total quantity ordered * buyPrice) for that product. The column headers should be “Product Name”, “Total # Ordered” and “Total Sale”. List the products by Total Sale descending.
select * from products;
SELECT 
    p.productName AS "Product Name",
    SUM(od.quantityOrdered) AS "Total # Ordered",
    SUM(od.quantityOrdered * p.buyPrice) AS "Total Sale"
FROM 
    orderdetails od
JOIN 
    products p ON od.productCode = p.productCode
GROUP BY 
    p.productName
ORDER BY 
    "Total Sale" DESC;
    
-- 3) Write a query which lists order status and the # of orders with that status. Column headers should be “Order Status” and “# Orders”. Sort alphabetically by status.
SELECT 
    status AS "Order Status",
    COUNT(*) AS "# Orders"
FROM 
    orders
GROUP BY 
    status
ORDER BY 
    status;
    
-- 4)  Write a query to list, for each product line, the total # of products sold from that product line. The first column should be “Product Line” and the second should be “# Sold”. Order by the second column descending.
SELECT 
    p.productLine AS "Product Line",
    SUM(od.quantityOrdered) AS "# Sold"
FROM 
    orderdetails od
JOIN 
    products p ON od.productCode = p.productCode
GROUP BY 
    p.productLine
ORDER BY 
    "# Sold" DESC;
 