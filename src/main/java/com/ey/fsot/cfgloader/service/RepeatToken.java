package com.ey.fsot.cfgloader.service;

import com.ey.fsot.cfgloader.exception.ParseException;

public interface RepeatToken<T extends String> extends Token {

  /**
   * This interface is implemented by Atomic classes that provide access methods.
   *
   * @return : Boolean: true=conforms to CFG standard, false
   * @throws : ParseException with a list of possible exceptions and descriptions.
   * @method validateConformity This method is called only for the Terminal Rules that have the Repeat clause DIGIT,
   * ALPHABET, UNDERSCORE. The business user enters the string in the UI, the XOM Binder will capture the data entered and
   * figures out that this is a Repeat Terminal Rule and uses this method to check whether all the characters in the user
   * entered string conforms to the definitions.
   */
  //TODO: Compensation Logic: In case of exceptions, suggestive list of how to correct should be thrown with Exception
  public Boolean validateConformity(String value) throws ParseException;
}

