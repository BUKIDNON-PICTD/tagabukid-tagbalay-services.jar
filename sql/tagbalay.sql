[getListForVerification]
SELECT objid,tagbalay_address,pangulo_name,pangulo_address_text
FROM tagbalay 
WHERE pangulo_name LIKE $P{name}
ORDER BY pangulo_name
