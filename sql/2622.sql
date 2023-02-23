SELECT c.name
FROM customers c, legal_person lp
WHERE lp.id_customers = c.id