package io.github.atlascommunity.marklet.pages;

import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;

import javax.lang.model.element.ExecutableElement;

import static io.github.atlascommunity.marklet.constants.Labels.OVERRIDE_MARK;

/** Forms readable method signature */
@RequiredArgsConstructor
public class MethodSignatureElement implements ClassPageElement{

  /** Method information */
  final ExecutableElement methodInfo;


  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String generate() {
    MethodSignature signature = new MethodSignature(methodInfo);
    return signature.toString();
  }
}
