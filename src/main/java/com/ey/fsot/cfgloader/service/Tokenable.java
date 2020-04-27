package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.exception.TokenNotFoundException;
import com.ey.fsot.cfgloader.model.ProductionRuleType;
import com.ey.fsot.cfgloader.model.TokenType;
import java.util.List;
import java.util.Map;

/**
 * Tokenable defines the behavior of the TerminalRules, NonTerminalRule and together comprising forming the start-symbols
 */
public interface Tokenable {

  /**
   * tokenizeCfg is a method that gives a the whole CFG grammar in-memory representation.
   *
   * @return : On tokenization pass: A Map containing the rules Key and a List of corresponding Values
   * @throws : On tokenization fail: List of exceptions thrown along with code & message describing errors
   * @method : tokenizeCfg will load all the CFG definitions into HashMap with the corresponding definitions in a List for
   * the terminal-rules only. Non-Terminal rules are not parsed into list.
   */
  Map<TokenType, List<String>> tokenizeCfg() throws TokenNotFoundException;

  /**
   * @param : ProductionRuleType should be one of the allowed (RULE, RULE_GROUP, ACTION, ACTION_GRAPH, RETE_LHS_PRODUCTION)
   * @param : TokenType The current valid token that the consumer is holding
   * @return : Returns possible token
   * @throws : TokenNotFoundException
   * @method : nextTokens method returns the next possible list of Terminal Rule as list of tokens. nextTokens will load the
   * production rule definition. Takes the current token, find the place in the current string (production rule), then looks
   * up the possible combination values of the immediate next token
   */
  Map<String, List<Token>> possibleNextTokens(
      ProductionRuleType productionRuleType, String workingProductionRule, TokenType currentTerminalToken)
      throws TokenNotFoundException;


  /**
   * Returns if there is any word matching to the prefix of the word.
   *
   * @param : prefix First part of the string
   * @return : Returns true/false based on existence
   * @throws : TokenNotFoundException is thrown when the prefix is not a valid token type
   * @method : startsWith will take the prefix to check if there exists any completion
   * @example: For the token <AGGREGATE_KEYWORD> ::= COUNT | SUM | AVERAGE | MIN | MAX When you type the prefix ex: prefix=M,
   * return List<MIN, MAX> When you type the prefix ex: prefix=C, return List<COUNT> When you type the prefix ex: prefix=S,
   * return List<SUM>
   */
  List<String> startsWith(String prefix) throws TokenNotFoundException;
}

