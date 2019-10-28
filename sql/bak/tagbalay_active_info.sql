[getActieInfos]
SELECT di.*, 
d.caption  AS attribute_caption, 
d.datatype AS attribute_datatype, 
d.sortorder AS attribute_sortorder,
d.category AS attribute_category,
d.handler AS attribute_handler
FROM tagbalay_active_info di 
INNER JOIN tagbalay_variable d ON d.objid=di.attribute_objid
WHERE di.tagbalay_objid=$P{tagbalayid} AND di.type = 'activeinfo'
ORDER BY d.category, d.sortorder 

[removeActiveInfos]
DELETE FROM tagbalay_active_info WHERE tagbalay_objid=$P{tagbalayid} 
AND type = 'activeinfo'

[deleteInfo]
DELETE FROM tagbalay_active_info WHERE tagbalay_objid = $P{tagbalayid} AND type = 'activeinfo'