SELECT c.name, cast(
    ((s.math*2) + 
    (s.specific*3) + 
    (s.project_plan*5)) / 10 as NUMERIC(10,2)) as avg
FROM candidate c, score s
WHERE s.candidate_id = c.id
ORDER BY avg DESC