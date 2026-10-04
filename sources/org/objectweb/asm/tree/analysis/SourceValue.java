package org.objectweb.asm.tree.analysis;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes8.dex */
public class SourceValue implements Value {
    public final Set<AbstractInsnNode> insns;
    public final int size;

    public SourceValue(int i10) {
        this(i10, new SmallSet());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourceValue)) {
            return false;
        }
        SourceValue sourceValue = (SourceValue) obj;
        return this.size == sourceValue.size && this.insns.equals(sourceValue.insns);
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.insns.hashCode();
    }

    public SourceValue(int i10, AbstractInsnNode abstractInsnNode) {
        this.size = i10;
        this.insns = new SmallSet(abstractInsnNode);
    }

    public SourceValue(int i10, Set<AbstractInsnNode> set) {
        this.size = i10;
        this.insns = set;
    }
}
