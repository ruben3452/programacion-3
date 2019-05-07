% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.


primero([X|_],X).
cola([_|Y],Y).
cons(X,L,[X|L]).
concatenar([],L,L).
concatenar([X|M],L,[X|Z]):-concatenar(M,L,Z).
