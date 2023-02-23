SELECT prod.name, prov.name, c.name
FROM products prod, providers prov, categories c
WHERE prod.id_providers = prov.id and prod.id_categories = c.id and c.name = 'Imported' and prov.name = 'Sansul SA'