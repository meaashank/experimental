package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes6.dex */
class NoneProbeArrayStrategy implements IProbeArrayStrategy {
    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i10) {
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z10, int i10) {
        throw new UnsupportedOperationException();
    }
}
