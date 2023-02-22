SELECT prod.name, prov.name, prod.price
FROM products prod, providers prov, categories c
WHERE prod.id_providers = prov.id and 
    prod.id_categories = c.id and 
    c.name = 'Super Luxury' and 
    prod.price > 1000