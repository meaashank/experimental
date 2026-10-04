package org.jacoco.core.internal.instr;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes6.dex */
class ProbeInserter extends MethodVisitor implements IProbeInserter {
    private int accessorStackSize;
    private final IProbeArrayStrategy arrayStrategy;
    private final Label beginLabel;
    private final boolean clinit;
    private final int variable;

    public ProbeInserter(int i10, String str, String str2, MethodVisitor methodVisitor, IProbeArrayStrategy iProbeArrayStrategy) {
        super(589824, methodVisitor);
        this.clinit = "<clinit>".equals(str);
        this.arrayStrategy = iProbeArrayStrategy;
        int size = (i10 & 8) == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str2)) {
            size += type.getSize();
        }
        this.variable = size;
        this.beginLabel = new Label();
    }

    private int map(int i10) {
        return i10 < this.variable ? i10 : i10 + 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeInserter
    public void insertProbe(int i10) {
        this.mv.visitVarInsn(25, this.variable);
        InstrSupport.push(this.mv, i10);
        this.mv.visitInsn(4);
        this.mv.visitInsn(84);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        this.mv.visitLabel(this.beginLabel);
        this.accessorStackSize = this.arrayStrategy.storeInstance(this.mv, this.clinit, this.variable);
        this.mv.visitCode();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        int i13;
        if (i10 != -1) {
            throw new IllegalArgumentException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        Object[] objArr3 = new Object[Math.max(i11, this.variable) + 1];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i14 >= i11 && i15 > this.variable) {
                this.mv.visitFrame(i10, i16, objArr3, i12, objArr2);
                return;
            }
            int i17 = i10;
            int i18 = i12;
            Object[] objArr4 = objArr2;
            if (i15 == this.variable) {
                i13 = i16 + 1;
                objArr3[i16] = InstrSupport.DATAFIELD_DESC;
            } else if (i14 < i11) {
                int i19 = i14 + 1;
                Object obj = objArr[i14];
                int i20 = i16 + 1;
                objArr3[i16] = obj;
                i15 = (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? i15 + 2 : i15 + 1;
                i14 = i19;
                i16 = i20;
                i10 = i17;
                i12 = i18;
                objArr2 = objArr4;
            } else {
                i13 = i16 + 1;
                objArr3[i16] = Opcodes.TOP;
            }
            i15++;
            i16 = i13;
            i10 = i17;
            i12 = i18;
            objArr2 = objArr4;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitIincInsn(int i10, int i11) {
        this.mv.visitIincInsn(map(i10), i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i10) {
        if (i10 < this.variable) {
            this.mv.visitLocalVariable(str, str2, str3, this.beginLabel, label2, i10);
        } else {
            this.mv.visitLocalVariable(str, str2, str3, label, label2, map(i10));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i10, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z10) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = map(iArr[i11]);
        }
        return this.mv.visitLocalVariableAnnotation(i10, typePath, labelArr, labelArr2, iArr2, str, z10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i10, int i11) {
        this.mv.visitMaxs(Math.max(i10 + 3, this.accessorStackSize), i11 + 1);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public final void visitVarInsn(int i10, int i11) {
        this.mv.visitVarInsn(i10, map(i11));
    }
}
