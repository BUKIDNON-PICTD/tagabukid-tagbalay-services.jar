[getTagbalayList]
SELECT tb.controlno, 
tb.tagbalay_name, 
tb.tagbalay_birthdate, 
tb.tagbalay_gender, 
tb.tagbalay_civilstatus,
tba.barangay_name,
tba.municipality,
tb.state
FROM
tagbalay tb
INNER JOIN tagbalay_active_address tba ON tba.parentid = tb.objid
WHERE tba.municipality  LIKE $P{lgu} 
AND tba.barangay_name LIKE $P{barangay}
AND tb.state = $P{state}
