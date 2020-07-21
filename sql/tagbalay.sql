[setstatetoqualify]
UPDATE tagbalay set state = 'QUALIFIED' WHERE objid = $P{objid}

[setstatetonotqualify]
UPDATE tagbalay set state = 'NOTQUALIFIED' WHERE objid = $P{objid}