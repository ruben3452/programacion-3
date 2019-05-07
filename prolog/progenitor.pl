% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.


progenitor(ana,leo).
progenitor(luis,leo).
progenitor(luis,liz).
progenitor(leo,luisa).
progenitor(leo,miguel).
progenitor(olga,luisa).
progenitor(miguel,raul).
progenitor(luisa,daniel).
progenitor(liz,dakota).

hermano(luisa,miguel).
hermano(leo,liz).
mujer(ana).
mujer(luisa).
mujer(liz).
mujer(olga).
hombre(luis).
hombre(leo).
hombre(miguel).
hombre(raul).

abuelo(X,Y):-progenitor(X,Z),progenitor(Z,Y).
primo(A,B):-progenitor(C,A),progenitor(D,B),hermano(C,D).
