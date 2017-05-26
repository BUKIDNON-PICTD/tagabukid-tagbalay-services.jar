[getListForVerification]
SELECT objid,tagbalay_address_text,tagbalay_pangulo_name,tagbalay_pangulo_address_text
FROM tagbalay 
WHERE tagbalay_pangulo_name LIKE $P{name}
ORDER BY tagbalay_pangulo_name
