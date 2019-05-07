% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

% hechos.
especialistas(otorrino).
especialistas(endocrinologo).
especialistas(nutricionista).
especialistas('medico general').
medicamentos(acetominofen).
medicamentos(jarabe).
medicamentos(vitamina).
medicamentos(vacuna).
medicamentos(pastillas).
enfermedades(anemia).
enfermedades(gripe).
enfermedades(rubeola).
enfermedades(malaria).
enfermedades(hepatitis).
enfermedades(tuberculosis).
sintomas(secrecion).
sintomas(tos).
sintomas('dolor de cabeza').
sintomas(nauseas).
sintomas(malestar).
sintomas(ictericia).
sintomas(fiebre).
sintomas(apatia).
sintomas(diarrea).
sintomas(cansancio).
sintomas(escalofrios).

%relaciones.
sintomas_de(tos,gripe).
sintomas_de('dolor de cabeza',gripe).
sintomas_de(malestar,gripe).
sintomas_de(nauseas,anemia).
sintomas_de(apatia,anemia).
sintomas_de(cansancio,anemia).
sintomas_de(secrecio,rubeola).
sintomas_de('dolor de cabeza',rubeola).
sintomas_de(fiebre,rubeola).
sintomas_de(escalofrio,rubeola).
sintomas_de(fiebre,malaria).
sintomas_de(diarrea,malaria).
sintomas_de(escalofrios,malaria).
sintomas_de(nauseas,hepatitis).
sintomas_de(ictericia,hapatitis).
sintomas_de(diarrea,hepatitis).
sintomas_de(tos,tuberculosis).
sintomas_de(fiebre,tuberculosis).
sintomas_de(cansancio,tuberculosis).
sintomas_de(escalosfrios,tuberculosis).
especialidad(otorrino,gripe).
especialidad('medico general',rubeola).
especialidad('medico general',malaria).
especialidad(endocrinologo,hepatitis).
especialidad(nutricionista,tuberculosis).
cura(acetominofen,gripe).
cura(jarabe,gripr).
cura(vitamina,anemia).
cura(vacuna,rubeola).
cura(pastillas,rubeola).
cura(vacuna,malaria).
cura(vacuna,hepatitis).
cura(pastillas,hepatitis).
cura(pastillas,tuberculosis).









