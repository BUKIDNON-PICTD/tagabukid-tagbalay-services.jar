[getList]
SELECT *
FROM household_variable
WHERE name LIKE $P{searchtext}
ORDER BY system DESC, sortorder ASC, objid ASC

[approve]
UPDATE household_variable 
SET state = 'APPROVED'
WHERE objid = $P{objid}

[findInfo]
SELECT name, caption, datatype, arrayvalues, sortorder, category, handler
FROM household_variable WHERE objid=$P{objid} 

[getLookup]
SELECT *
FROM household_variable
WHERE name LIKE $P{searchtext}
ORDER BY system DESC, sortorder ASC, objid ASC

[getLookupByType]
SELECT *
FROM household_variable
WHERE name LIKE $P{searchtext}
AND datatype = $P{datatype}
ORDER BY system DESC, sortorder ASC, objid ASC
