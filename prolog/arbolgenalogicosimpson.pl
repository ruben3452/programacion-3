% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

padre('sven j simpson','lambert simpson').
padre('sven j simpson','rupert j simpson').
padre('rupert j simpson','beatrix trixine simpson').
padre('rupert j simpson','prudence simpson').
padre('rupert j simpson','galstom simpson').
padre('rupert j simpson','ivy simpson').
padre('rupert j simpson','garwood j simpson').
padre('garwood j simpson','zeke simpson').
padre('garwood j simpson','howland j simpson').
padre('garwood j simpson','pippa simpson').
padre('garwood j simpson','floyd simpson').
padre('howland j simpson','oswald simpson').
padre('howland j simpson','gaston simpson').
padre('howland j simpson','hugh simpson').
padre('howland j simpson','ducine simpson').
padre('howland j simpson','louis simpson').
padre('oswald simpson','twitta simpson').
padre('oswald simpson','elrita simpson').
padre('oswald simpson','bonita simpson').
padre('oswald simpson','orville j simpson').
padre('orville j simpson','abraham jebediah simpson').
padre('orville j simpson','cyrus simpson').
padre('orville j simpson','chet simpson').
padre('abraham jebediah simpson','homer jay simpson').
padre('homer jay simpson','bart simpson').
padre('homer jay simpson','lisa simpson').
padre('homer jay simpson','maggie simpson').

madre('claretta ethridge','lambert simpson').
madre('claretta ethridge','rupert j simpson').
madre('winifred running goat','beatrix trixine simpson').
madre('winifred running goat','prudence simpson').
madre('winifred running goat','galstom simpson').
madre('winifred running goat','ivy simpson').
madre('winifred running goat','garwood j simpson').
madre('clowta stillman','zeke simpson').
madre('clowta stillman','howland j simpson').
madre('clowta stillman','pippa simpson').
madre('clowta stillman','floyd simpson').
madre('gabby crouse','oswald simpson').
madre('gabby crouse','gaston simpson').
madre('gabby crouse','hugh simpson').
madre('gabby crouse','ducine simpson').
madre('gabby crouse','louis simpson').
madre('dinsdale','twitta simpson').
madre('dinsdale','elrita simpson').
madre('dinsdale','bonita simpson').
madre('dinsdale','orville j simpson').
madre('yuma hickman','abraham jebediah simpson').
madre('yuma hickman','cyrus simpson').
madre('yuma hickman','chet simpson').
madre('mona simpson','homer jay simpson').
madre('marjorie bouvier','bart simpson').
madre('marjorie bouvier','lisa simpson').
madre('marjorie bouvier','maggie simpson').

hermanos('lambert simpson','rupert j simpson').
hermanos('beatrix trixine simpson','prudence simpson','galstom simpson','ivy simpson','garwood j simpson').
hermanos('zeke simpson','howland j simpson','pippa simpson','floyd simpson').
hermanos('oswald simpson','gaston simpson','hugh simpson','ducine simpson','louis simpson').
hermanos('twitta simpson','elrita simpson','bonita simpson','orville j simpson').
hermanos('abraham jebediah simpson','cyrus simpson','chet simpson').
hermanos('bart simpson','lisa simpson','maggie simpson').

abuelo(X,Y):-padre(X,Z),padre(Z,Y).
abuela(X,Y):-madre(X,Z),madre(Z,Y).























