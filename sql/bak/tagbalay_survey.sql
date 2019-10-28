[findCurrentSurvey]
SELECT * FROM tagbalay_survey WHERE tagbalay_objid = $P{tagbalayid}

[deleteSurvey]
DELETE FROM tagbalay_survey WHERE objid = $P{surveyid}