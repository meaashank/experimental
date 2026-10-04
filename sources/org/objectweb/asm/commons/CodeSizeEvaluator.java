package org.objectweb.asm.commons;

import androidx.compose.ui.graphics.J2;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes8.dex */
public class CodeSizeEvaluator extends MethodVisitor implements Opcodes {
    private int maxSize;
    private int minSize;

    public CodeSizeEvaluator(MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getMinSize() {
        return this.minSize;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitFieldInsn(i10, str, str2, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        if (i10 > 255 || i11 > 127 || i11 < -128) {
            this.minSize += 6;
            this.maxSize += 6;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitIincInsn(i10, i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i10) {
        this.minSize++;
        this.maxSize++;
        super.visitInsn(i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i10, int i11) {
        if (i10 == 17) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitIntInsn(i10, i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.minSize += 5;
        this.maxSize += 5;
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i10, Label label) {
        this.minSize += 3;
        if (i10 == 167 || i10 == 168) {
            this.maxSize += 5;
        } else {
            this.maxSize += 8;
        }
        super.visitJumpInsn(i10, label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        if ((obj instanceof Long) || (obj instanceof Double) || ((obj instanceof ConstantDynamic) && ((ConstantDynamic) obj).getSize() == 2)) {
            this.minSize += 3;
            this.maxSize += 3;
        } else {
            this.minSize += 2;
            this.maxSize += 3;
        }
        super.visitLdcInsn(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.minSize = J2.a(iArr.length, 8, 9, this.minSize);
        this.maxSize = J2.a(iArr.length, 8, 12, this.maxSize);
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        if (this.api < 327680 && (i10 & 256) == 0) {
            super.visitMethodInsn(i10, str, str2, str3, z10);
            return;
        }
        if ((i10 & (-257)) == 185) {
            this.minSize += 5;
            this.maxSize += 5;
        } else {
            this.minSize += 3;
            this.maxSize += 3;
        }
        super.visitMethodInsn(i10, str, str2, str3, z10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i10) {
        this.minSize += 4;
        this.maxSize += 4;
        super.visitMultiANewArrayInsn(str, i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        this.minSize = J2.a(labelArr.length, 4, 13, this.minSize);
        this.maxSize = J2.a(labelArr.length, 4, 16, this.maxSize);
        super.visitTableSwitchInsn(i10, i11, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i10, String str) {
        this.minSize += 3;
        this.maxSize += 3;
        super.visitTypeInsn(i10, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i10, int i11) {
        if (i11 < 4 && i10 != 169) {
            this.minSize++;
            this.maxSize++;
        } else if (i11 >= 256) {
            this.minSize += 4;
            this.maxSize += 4;
        } else {
            this.minSize += 2;
            this.maxSize += 2;
        }
        super.visitVarInsn(i10, i11);
    }

    public CodeSizeEvaluator(int i10, MethodVisitor methodVisitor) {
        super(i10, methodVisitor);
    }
}
