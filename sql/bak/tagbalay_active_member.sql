[getTagbalayMember]
SELECT * FROM tagbalay_active_member WHERE tagbalayid = $P{objid}

[deleteMember]
DELETE FROM tagbalay_active_member WHERE tagbalayid = $P{tagbalayid}