// This is a generated file. Not intended for manual editing.
package io.github.m.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MExpr extends PsiElement {

  @NotNull
  List<MApplyArgs> getApplyArgsList();

  @NotNull
  MAtomicExpr getAtomicExpr();

  @NotNull
  List<MNosspace> getNosspaceList();

}
