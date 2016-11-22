grammar NetDiction;


commands
  : (command)*
  ;
command
  : type
  | commandMessage
  | disconnect
  | ping
  ;

type
  : TYPE STRING SC
  ;

commandMessage
  : COMMAND STRING SC
  ;

disconnect
  : DISCONNECT SC
  ;

ping
  : PING SC
  ;
   
TYPE: 'TYPE';
COMMAND: 'COMMAND';
DISCONNECT: 'DISCONNECT';
PING: 'PING';

SC: ';';
QUOTE: '"';
fragment DIGIT: '0'..'9';
NUMBER: DIGIT+;
ID
  : ('A'..'Z' | 'a'..'z' | '_') ('A'..'Z'| 'a'..'z'| '_' | DIGIT)*
  ;
STRING: QUOTE .* QUOTE;
WS
  : (' ' 
  | '\t' 
  | '\n'
  | '\r') -> skip
  ;  