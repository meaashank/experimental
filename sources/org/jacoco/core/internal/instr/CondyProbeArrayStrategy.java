package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes6.dex */
public class CondyProbeArrayStrategy implements IProbeArrayStrategy {
    public static final String B_DESC = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)[Z";
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final boolean isInterface;

    public CondyProbeArrayStrategy(String str, boolean z10, long j10, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.isInterface = z10;
        this.classId = j10;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i10) {
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, B_DESC, null, null);
        int iGenerateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i10, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitInsn(Opcodes.ARETURN);
        methodVisitorVisitMethod.visitMaxs(iGenerateDataAccessor, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z10, int i10) {
        methodVisitor.visitLdcInsn(new ConstantDynamic(InstrSupport.DATAFIELD_NAME, "Ljava/lang/Object;", new Handle(6, this.className, InstrSupport.INITMETHOD_NAME, B_DESC, this.isInterface), new Object[0]));
        methodVisitor.visitTypeInsn(192, InstrSupport.DATAFIELD_DESC);
        methodVisitor.visitVarInsn(58, i10);
        return 1;
    }
}
