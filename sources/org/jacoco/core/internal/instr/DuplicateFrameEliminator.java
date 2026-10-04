package org.jacoco.core.internal.instr;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes6.dex */
class DuplicateFrameEliminator extends MethodVisitor {
    private boolean instruction;

    public DuplicateFrameEliminator(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
        this.instruction = true;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        this.instruction = true;
        this.mv.visitFieldInsn(i10, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        if (this.instruction) {
            this.instruction = false;
            this.mv.visitFrame(i10, i11, objArr, i12, objArr2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        this.instruction = true;
        this.mv.visitIincInsn(i10, i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i10) {
        this.instruction = true;
        this.mv.visitInsn(i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i10, int i11) {
        this.instruction = true;
        this.mv.visitIntInsn(i10, i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instruction = true;
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i10, Label label) {
        this.instruction = true;
        this.mv.visitJumpInsn(i10, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.instruction = true;
        this.mv.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instruction = true;
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        this.instruction = true;
        this.mv.visitMethodInsn(i10, str, str2, str3, z10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i10) {
        this.instruction = true;
        this.mv.visitMultiANewArrayInsn(str, i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        this.instruction = true;
        this.mv.visitTableSwitchInsn(i10, i11, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i10, String str) {
        this.instruction = true;
        this.mv.visitTypeInsn(i10, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i10, int i11) {
        this.instruction = true;
        this.mv.visitVarInsn(i10, i11);
    }
}
