package org.jacoco.core.runtime;

import org.jacoco.core.JaCoCo;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes6.dex */
public class OfflineInstrumentationAccessGenerator implements IExecutionDataAccessorGenerator {
    private final String runtimeClassName;

    public OfflineInstrumentationAccessGenerator() {
        this(JaCoCo.RUNTIMEPACKAGE.replace('.', '/') + "/Offline");
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j10, String str, int i10, MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(Long.valueOf(j10));
        methodVisitor.visitLdcInsn(str);
        InstrSupport.push(methodVisitor, i10);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.runtimeClassName, "getProbes", "(JLjava/lang/String;I)[Z", false);
        return 4;
    }

    public OfflineInstrumentationAccessGenerator(String str) {
        this.runtimeClassName = str;
    }
}
