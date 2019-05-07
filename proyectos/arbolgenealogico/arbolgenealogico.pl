% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.


progenitor(andrea,leonardo).
progenitor(alfredo,leonardo).
progenitor(alfredo,liza).
progenitor(andrea,liza).
progenitor(juan,luisa).
progenitor(juan,miguel).
progenitor(daniela,luisa).
progenitor(daniela,miguel).

progenitor(miguel,raul).
progenitor(miguel,camila).
progenitor(paola,raul).
progenitor(paola,camila).
progenitor(luisa,daniel).
progenitor(diego,daniel).
progenitor(liza,dakota).
progenitor(camilo,dakota).

hermano(luisa,miguel).
hermano(leonardo,liza).
hermano(raul,camila).



abuelo(X,Y):-progenitor(X,Z),progenitor(Z,Y).
primo(A,B):-progenitor(C,A),progenitor(D,B),hermano(C,D).







