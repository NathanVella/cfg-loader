package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.model.ProductionRuleType;
import com.ey.fsot.cfgloader.model.TokenNode;

public interface Parsable {

  /**
   * The getRuleTree method, gives them an unbalanced tree to the XOM Service. XOM Service will use the method to get the
   * Node and access its methods to traverse the tree. The traversal helps XOM Binder service to parse the tree for a given
   * rule from the ENUM list. In effect there are 4 tree's based on start-symbols in CFG. Using Factory method that hides the
   * tree creation.(RULE, RULE_GROUP, ACTION, ACTION_GRAPH) For XOM Service: RULE is the only tree that is needed. For Action
   * Graph Initializer: RULE_GROUP, ACTION, ACTION_GRAPH
   *
   * @param : ProductionRuleType should be one of the allowed (RULE, RULE_GROUP, ACTION, ACTION_GRAPH, RETE_LHS_PRODUCTION)
   * @return : On syntax pass: true is returned. On syntax error, false is returned
   * @throws : On syntax fail: List of exceptions thrown along with code & message describing syntax errors
   * @method : getRuleTree provides an unbalanced tree that returns Node object which in-turn provides traverse to the tree.
   * Also given a child node inside the Root node and then find the node and return that Node for traversal
   */
  TokenNode getRuleTree(ProductionRuleType productionRuleType);


}
