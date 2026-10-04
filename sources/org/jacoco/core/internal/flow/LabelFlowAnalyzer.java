package org.jacoco.core.internal.flow;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes6.dex */
public final class LabelFlowAnalyzer extends MethodVisitor {
    boolean first;
    Label lineStart;
    boolean successor;

    public LabelFlowAnalyzer() {
        super(589824);
        this.successor = false;
        this.first = true;
        this.lineStart = null;
    }

    public static void markLabels(MethodNode methodNode) {
        LabelFlowAnalyzer labelFlowAnalyzer = new LabelFlowAnalyzer();
        int size = methodNode.tryCatchBlocks.size();
        while (true) {
            size--;
            if (size < 0) {
                methodNode.instructions.accept(labelFlowAnalyzer);
                return;
            }
            methodNode.tryCatchBlocks.get(size).accept(labelFlowAnalyzer);
        }
    }

    private void markMethodInvocationLine() {
        Label label = this.lineStart;
        if (label != null) {
            LabelInfo.setMethodInvocationLine(label);
        }
    }

    private static void setTargetIfNotDone(Label label) {
        if (LabelInfo.isDone(label)) {
            return;
        }
        LabelInfo.setTarget(label);
        LabelInfo.setDone(label);
    }

    private void visitSwitchInsn(Label label, Label[] labelArr) {
        LabelInfo.resetDone(label);
        LabelInfo.resetDone(labelArr);
        setTargetIfNotDone(label);
        for (Label label2 : labelArr) {
            setTargetIfNotDone(label2);
        }
        this.successor = false;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        this.successor = true;
        this.first = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // org.objectweb.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void visitInsn(int r3) {
        /*
            r2 = this;
            r0 = 169(0xa9, float:2.37E-43)
            if (r3 == r0) goto L15
            r0 = 191(0xbf, float:2.68E-43)
            r1 = 0
            if (r3 == r0) goto L10
            switch(r3) {
                case 172: goto L10;
                case 173: goto L10;
                case 174: goto L10;
                case 175: goto L10;
                case 176: goto L10;
                case 177: goto L10;
                default: goto Lc;
            }
        Lc:
            r3 = 1
            r2.successor = r3
            goto L12
        L10:
            r2.successor = r1
        L12:
            r2.first = r1
            return
        L15:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "Subroutines not supported."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.flow.LabelFlowAnalyzer.visitInsn(int):void");
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i10, int i11) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i10, Label label) {
        LabelInfo.setTarget(label);
        if (i10 == 168) {
            throw new AssertionError("Subroutines not supported.");
        }
        this.successor = i10 != 167;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        if (this.first) {
            LabelInfo.setTarget(label);
        }
        if (this.successor) {
            LabelInfo.setSuccessor(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i10, Label label) {
        this.lineStart = label;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        this.successor = true;
        this.first = false;
        markMethodInvocationLine();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i10) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        visitSwitchInsn(label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        LabelInfo.setTarget(label);
        LabelInfo.setTarget(label3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i10, String str) {
        this.successor = true;
        this.first = false;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i10, int i11) {
        this.successor = true;
        this.first = false;
    }
}
