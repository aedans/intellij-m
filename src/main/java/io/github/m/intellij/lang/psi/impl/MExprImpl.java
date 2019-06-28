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

public class MExprImpl extends ASTWrapperPsiElement implements MExpr {

  public MExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MVisitor visitor) {
    visitor.visitExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MVisitor) accept((MVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MApplyBraceList getApplyBraceList() {
    return findChildByClass(MApplyBraceList.class);
  }

  @Override
  @Nullable
  public MApplyBracketList getApplyBracketList() {
    return findChildByClass(MApplyBracketList.class);
  }

  @Override
  @Nullable
  public MApplyParenList getApplyParenList() {
    return findChildByClass(MApplyParenList.class);
  }

  @Override
  @Nullable
  public MAtom getAtom() {
    return findChildByClass(MAtom.class);
  }

  @Override
  @Nullable
  public MBraceList getBraceList() {
    return findChildByClass(MBraceList.class);
  }

  @Override
  @Nullable
  public MBracketList getBracketList() {
    return findChildByClass(MBracketList.class);
  }

  @Override
  @Nullable
  public MParenList getParenList() {
    return findChildByClass(MParenList.class);
  }

}
