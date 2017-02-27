[getListForVerification]
SELECT objid,household_address,pangulo_name,pangulo_address_text
FROM household 
WHERE pangulo_name LIKE $P{name}
ORDER BY pangulo_name
