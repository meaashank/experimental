package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesVisitor;
import org.jacoco.core.internal.flow.MethodProbesVisitor;

/* JADX INFO: loaded from: classes6.dex */
class ProbeCounter extends ClassProbesVisitor {
    private int count = 0;
    private boolean methods = false;

    public int getCount() {
        return this.count;
    }

    public boolean hasMethods() {
        return this.methods;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i10) {
        this.count = i10;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public MethodProbesVisitor visitMethod(int i10, String str, String str2, String str3, String[] strArr) {
        if ("<clinit>".equals(str) || (i10 & 1024) != 0) {
            return null;
        }
        this.methods = true;
        return null;
    }
}
