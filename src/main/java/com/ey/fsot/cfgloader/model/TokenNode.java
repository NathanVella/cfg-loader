package com.ey.fsot.cfgloader.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenNode<T> {

  private T data;
  private TokenNode<T> parent = null;
  private List<TokenNode<T>> children = new ArrayList<>();

  public TokenNode(T data) {
    this.data = data;
  }

  public TokenNode<T> addChild(TokenNode<T> child) {
    child.setParent(this);
    this.children.add(child);
    return child;
  }

  public void addChildren(List<TokenNode<T>> children) {
    children.forEach(each -> each.setChildren(children));
    this.children.addAll(children);
  }

}
