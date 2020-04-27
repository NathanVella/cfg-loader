package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.exception.ParseException;
import java.io.Serializable;
import java.util.List;

public interface Token<T extends String> extends Serializable {

  /**
   * This interface is implemented by Atomic classes that provide access methods.
   *
   * @return : List<T>: Returns a list of tokens
   * @throws : ParseException when there the tokens are unparsable
   * @method getTokens This method is called upon a Builder class to get the tokens for a given Terminal Rule
   */
  public List<T> getTokens() throws ParseException;

  /**
   * This interface is implemented by Atomic classes that provide access methods.
   *
   * @return : Boolean: the token exists in the value of a terminal
   * @throws : ParseException when there the tokens are unparsable
   * @method searchTokens This method is called upon a Builder class to find a specific value in the tokens under the
   * Terminal Rule
   */
  public <T> Boolean searchTokens(T token) throws ParseException;
}

