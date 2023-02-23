SELECT m.id, m.name
FROM movies m, prices p
WHERE m.id_prices = p.id and p.value < 2