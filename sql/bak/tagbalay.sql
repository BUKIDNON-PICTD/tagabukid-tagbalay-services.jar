[getListForVerification]
SELECT objid,tagbalay_address_text as address,tagbalay_pangulo_name as `name`,tagbalay_pangulo_address_text,hin, surveydate,recordlog_datecreated as datecreated,recordlog_createdbyuser as createdby
FROM tagbalay 
WHERE tagbalay_pangulo_name LIKE $P{name}
ORDER BY tagbalay_pangulo_name

[getList]
SELECT *
FROM tagbalay
WHERE 
${filter}
ORDER BY tagbalay_pangulo_name


[findTagbalay]
SELECT * FROM tagbalay
WHERE objid = $P{objid};

[setstatetoqualify]
UPDATE tagbalay set state = 'QUALIFIED' WHERE objid = $P{objid}

[setstatetonotqualify]
UPDATE tagbalay set state = 'NOTQUALIFIED' WHERE objid = $P{objid}