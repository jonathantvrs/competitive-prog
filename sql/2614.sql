SELECT c.name, r.rentals_date
FROM customers c, rentals r
WHERE r.id_customers = c.id and 
    EXTRACT(MONTH FROM r.rentals_date) = '9' and 
    EXTRACT(YEAR FROM r.rentals_date) = '2016'