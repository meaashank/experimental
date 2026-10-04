package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes6.dex */
class ClassFieldProbeArrayStrategy implements IProbeArrayStrategy {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final boolean withFrames;
    private static final Object[] FRAME_STACK_ARRZ = {InstrSupport.DATAFIELD_DESC};
    private static final Object[] FRAME_LOCALS_EMPTY = new Object[0];

    public ClassFieldProbeArrayStrategy(String str, long j10, boolean z10, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j10;
        this.withFrames = z10;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    private void createDataField(ClassVisitor classVisitor) {
        classVisitor.visitField(InstrSupport.DATAFIELD_ACC, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(ClassVisitor classVisitor, int i10) {
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitFieldInsn(178, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        methodVisitorVisitMethod.visitInsn(89);
        Label label = new Label();
        methodVisitorVisitMethod.visitJumpInsn(199, label);
        methodVisitorVisitMethod.visitInsn(87);
        int iGenInitializeDataField = genInitializeDataField(methodVisitorVisitMethod, i10);
        if (this.withFrames) {
            methodVisitorVisitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        }
        methodVisitorVisitMethod.visitLabel(label);
        methodVisitorVisitMethod.visitInsn(Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(Math.max(iGenInitializeDataField, 2), 0);
        methodVisitorVisitMethod.visitEnd();
    }

    private int genInitializeDataField(MethodVisitor methodVisitor, int i10) {
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i10, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        return Math.max(iGenerateDataAccessor, 2);
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i10) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i10);
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z10, int i10) {
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.className, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, false);
        methodVisitor.visitVarInsn(58, i10);
        return 1;
    }
}
