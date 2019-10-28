[getSurveyInfos]
SELECT di.*, 
d.caption  AS attribute_caption, 
d.datatype AS attribute_datatype, 
d.sortorder AS attribute_sortorder,
d.category AS attribute_category,
d.handler AS attribute_handler
FROM tagbalay_survey_info di 
INNER JOIN tagbalay_variable d ON d.objid=di.attribute_objid
WHERE di.tagbalay_objid=$P{tagbalayid} AND di.tagbalay_survey_objid=$P{surveyid} 
AND di.type = 'surveyinfo'
ORDER BY d.category, d.sortorder 

[removeSurveyInfos]
DELETE FROM tagbalay_survey_info WHERE tagbalay_objid=$P{tagbalayid} 
AND type = 'surveyinfo'

[deleteInfo]
DELETE FROM tagbalay_survey_info WHERE tagbalay_survey_objid = $P{surveyid} AND type = 'surveyinfo'
