[findTagbalayAddress]
SELECT * FROM tagbalay_address WHERE tagbalay_objid = $P{tagbalayid}

[deleteAddress]
DELETE FROM tagbalay_address WHERE tagbalay_objid = $P{tagbalayid}