package com.ey.fsot.cfgloader.model;

public enum TokenType {
  DIGIT,
  ALPHABET,
  UNDERSCORE,
  BLANK,
  NEGATION_SIGN,
  RT_RND_BRACKET,
  LT_RND_BRACKET,
  QUESTION_MARK,
  BETWEEN_WORD,
  AND_WORD,
  BOOLEAN,
  ARITHMETIC_OPERATOR,
  RELATIONAL_OPERATOR,
  LOGICAL_OPERATOR,
  COMPARISION_KEYWORD,
  CONJUNCTIVE_KEYWORD,
  SET_CONJUNCTIVE_KEYWORD,
  SEARCH_KEYWORDS,
  AGGREGATE_KEYWORD,
  CONST,
  ATTR,
  /// The below are non-terminal rules
  WORD,
  VARIABLE,
  RETE_PROD_NAME,
  DOMAIN_OBJECT,
  KEYWORD,
  OPERATOR,
  DATE_RANGE,
  ATTR_EXPR,
  BETWEEN_EXPR,
  VALUE_EXPR,
  RETE_CONDITION;
}
