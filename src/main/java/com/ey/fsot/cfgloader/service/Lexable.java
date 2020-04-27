package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.exception.MalformedSyntaxException;
import com.ey.fsot.cfgloader.model.ProductionRuleType;

public interface Lexable {

  /**
   * This convenience method is used to support the MVP where there is no UI to build the Business Rule. In all practical
   * purposes, the CFG Production is the one driving the Business Rules.
   *
   * @param : ProductionRuleType should be one of the allowed (RULE, RULE_GROUP, ACTION, ACTION_GRAPH, RETE_LHS_PRODUCTION)
   * @param : The business rule as created by the user
   * @return : On syntax pass: if validated CFG Production is returned. On error, exception thrown.
   * @throws : On syntax fail: List of exceptions thrown along with code & message describing syntax errors
   * @method : checkSyntax verifies whether the production rule for follows the CFG library syntax in its entirety
   */
  //TODO: Return the compensation for a syntax error that occurred based on what went wrong!
  String checkSyntax(ProductionRuleType productionRuleType, String businessRule)
      throws MalformedSyntaxException;

  /**
   * This convenience method is used to support the MVP where there is no UI to build the Business Rule. In all practical
   * purposes, the CFG Production is the one driving the Business Rules.
   *
   * @param : ProductionRuleType should be one of the allowed (RULE, RULE_GROUP, ACTION, ACTION_GRAPH, RETE_LHS_PRODUCTION)
   * @param : businessRule should be a valid Rule Instance (already validated by CFG Production)
   * @return : On syntax pass: true is returned. On syntax error, false is returned
   * @throws : On syntax fail: List of exceptions thrown along with code & message describing syntax errors
   * @method : generateReteProduction generates the rete production rule for a given BR that conforms to the CFG Production
   */
  String generateReteProduction(ProductionRuleType productionRuleType, String businessRule)
      throws MalformedSyntaxException;
}

