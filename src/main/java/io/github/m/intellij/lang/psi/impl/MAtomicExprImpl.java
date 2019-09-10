// This is a generated file. Not intended for manual editing.
package io.github.m.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.m.intellij.lang.lexer.MTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.m.intellij.lang.psi.*;

public class MAtomicExprImpl extends ASTWrapperPsiElement implements MAtomicExpr {

  public MAtomicExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MVisitor visitor) {
    visitor.visitAtomicExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MVisitor) accept((MVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MAtom getAtom() {
    return findChildByClass(MAtom.class);
  }

  @Override
  @Nullable
  public MBraceExpr getBraceExpr() {
    return findChildByClass(MBraceExpr.class);
  }

  @Override
  @Nullable
  public MBracketExpr getBracketExpr() {
    return findChildByClass(MBracketExpr.class);
  }

  @Override
  @Nullable
  public MParenExpr getParenExpr() {
    return findChildByClass(MParenExpr.class);
  }

}
