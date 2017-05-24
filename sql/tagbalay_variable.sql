[getList]
SELECT *
FROM tagbalay_variable
WHERE name LIKE $P{searchtext}
ORDER BY system DESC, sortorder ASC, objid ASC

[approve]
UPDATE tagbalay_variable 
SET state = 'APPROVED'
WHERE objid = $P{objid}

[findInfo]
SELECT name, caption, datatype, arrayvalues, sortorder, category, handler
FROM tagbalay_variable WHERE objid=$P{objid} 

[getLookup]
SELECT *
FROM tagbalay_variable
WHERE name LIKE $P{searchtext}
ORDER BY system DESC, sortorder ASC, objid ASC

[getLookupByType]
SELECT *
FROM tagbalay_variable
WHERE name LIKE $P{searchtext}
AND datatype = $P{datatype}
ORDER BY system DESC, sortorder ASC, objid ASC
