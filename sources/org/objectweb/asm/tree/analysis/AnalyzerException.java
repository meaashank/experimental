package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes8.dex */
public class AnalyzerException extends Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient AbstractInsnNode node;

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Object obj, Value value) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str == null ? "Expected " : str.concat(": expected "));
        sb2.append(obj);
        sb2.append(", but found ");
        sb2.append(value);
        super(sb2.toString());
        this.node = abstractInsnNode;
    }
}
