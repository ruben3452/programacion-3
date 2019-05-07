% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

entrada('bandeja paisa').
entrada(cosome).
entrada(sancocho).

carne(filete_cerdo).
carne(pescado).
carne('chule de pescado').
carne('chuleta de pollo').

postre('tres leches').
postre('gelatina').
postre('flan').
calorias('bandeja paisa',800).
calorias(consome,200).
calorias(sancocho,500).
calorias('filete de cerdo',300).
calorias(pescado,150).
calorias('chuleta de pescado',300).
calorias('chuleta de pollo',450).
calorias('tres leches',250).
calorias(gelatina,250).
calorias(flan,300).
comida(Entrada,Carne,Postre):-entrada(Entrada),carne(Carne),postre(Postre).
valor_nutricional(Entrada,Carne,Postre,Valor):-calorias(Entrada,X),calorias(Carne,Y),calorias(Postre,Z),sumar(X,Y,Z,Valor).


sumar(X,Y,Z,Respuesta):-Respuesta is X+Y+Z.



