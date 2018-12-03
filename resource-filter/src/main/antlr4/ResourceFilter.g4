grammar ResourceFilter;

@header {
package net.unit8.apistandard.resourcefilter;
}

fields : negation fields_expression | fields_expression;
fields_expression : '(' field_set ')';
negation : '!';
field_set : qualified_field | qualified_field ',' field_set;
qualified_field : field | field fields_expression;
field : (DASH_LETTER_DIGIT | DASH_LETTER_DIGIT)+;
DASH_LETTER_DIGIT: DASH | LETTER | DIGIT;
DASH : '-' | '_';
LETTER : ('a'..'z'|'A'..'Z');
DIGIT : '0'..'9';

WS : (' ' | '\t')+ -> channel(HIDDEN);