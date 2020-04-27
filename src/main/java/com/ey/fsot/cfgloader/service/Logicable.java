package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.exception.IllogicalRuleException;
import com.ey.fsot.cfgloader.model.StartSymbol;

public interface Logicable {

  /**
   * @param : StartSymbol format as defined in the CFG
   * @return : On syntax pass: true is returned. On syntax error, false is returned
   * @throws : On syntax fail: List of exceptions thrown along with code & message describing Logical/Intelligence errors
   * @method : logicallyPossible verifies whether the production rule in logically correct and makes an intelligent rule.
   * validates whether the given ProductionRule or a RuleGroup makes a logically viable relation to a selected Action. The
   * internal working is abstract for the MVP. The possible solutions are leveraging A.I natural language text processing and
   * machine learning libraries that enhance the Rule completeness
   */
  Boolean logicallyPossible(StartSymbol startSymbol) throws IllogicalRuleException;
}

