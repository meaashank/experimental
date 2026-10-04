package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes6.dex */
public interface IProbeArrayStrategy {
    void addMembers(ClassVisitor classVisitor, int i10);

    int storeInstance(MethodVisitor methodVisitor, boolean z10, int i10);
}
