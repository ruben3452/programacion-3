% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.
estudiante(diana,sistemas).
estudiante(juana,mecanica).
docente(ricardo,grupo1,sistema).
docente(pedro,mecanica).
esta(diana,grupo1,sistemas).
docenteutp(X):-docente(X,grupo1,sistemas).

