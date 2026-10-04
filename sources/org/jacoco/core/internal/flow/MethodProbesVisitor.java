package org.jacoco.core.internal.flow;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MethodProbesVisitor extends MethodVisitor {
    public MethodProbesVisitor() {
        this(null);
    }

    public void accept(MethodNode methodNode, MethodVisitor methodVisitor) {
        methodNode.accept(methodVisitor);
    }

    public void visitInsnWithProbe(int i10, int i11) {
    }

    public void visitJumpInsnWithProbe(int i10, Label label, int i11, IFrame iFrame) {
    }

    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
    }

    public void visitProbe(int i10) {
    }

    public void visitTableSwitchInsnWithProbes(int i10, int i11, Label label, Label[] labelArr, IFrame iFrame) {
    }

    public MethodProbesVisitor(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
    }
}
