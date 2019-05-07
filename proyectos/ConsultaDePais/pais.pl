% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

es_un_pais('Morocco').
es_un_pais('Algeria').
es_un_pais('Libya').
es_un_pais('Egypto').
es_un_pais('Sudan').
es_un_pais('Chad').
es_un_pais('Ninguer').
es_un_pais('Mali').
es_un_pais('Nigeria').
es_un_pais('Cameroun').
es_un_pais('Eritrea').
es_un_pais('South Sudan').
es_un_pais('Congo').
es_un_pais('Gabon').
es_un_pais('ubanda').
es_un_pais('kenya').
es_un_pais('Soomaalya').
es_un_pais('Tazania').
es_un_pais('Angola').
es_un_pais('Namibia').
es_un_pais('South Africa').
es_un_pais('Zinbabwe').
es_un_pais('Mocanbique').
es_un_pais('Mauritania').
es_un_pais('Niger').
es_un_pais('Tunisia').


limita_con_('Algeria','Libya').
limita_con_('Algeria','Ninguer').
limita_con_('Algeria','Mali').
limita_con_('Algeria','Morocco').
limita_con_('Morocco','Mauritania').
limita_con_('Mauritania','Mali').
limita_con_('Mali','Niger').
limita_con_('Niger','Libya').
limita_con_('Niger','Nigeria').
limita_con_('Niger','chad').
limita_con_('Tunisia','Nigeria').
limita_con_('Tunisia','Libya').
limita_con_('Libya','Egypto').
limita_con_('Libya','Sudan').
limita_con_('Libya','Shad').
limita_con_('Susan','Egypto').
limita_con_('Susan','South Sudan').
limita_con_('Cameroun','chad').
limita_con_('Nigeria','Cameroun').

limitrofes(X,Y):- limita_con_(X,Y); limita_con_(Y,X).









