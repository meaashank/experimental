package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.analysis.Value;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Interpreter<V extends Value> {
    protected final int api;

    public Interpreter(int i10) {
        this.api = i10;
    }

    public abstract V binaryOperation(AbstractInsnNode abstractInsnNode, V v10, V v11) throws AnalyzerException;

    public abstract V copyOperation(AbstractInsnNode abstractInsnNode, V v10) throws AnalyzerException;

    public abstract V merge(V v10, V v11);

    public abstract V naryOperation(AbstractInsnNode abstractInsnNode, List<? extends V> list) throws AnalyzerException;

    public V newEmptyValue(int i10) {
        return (V) newValue(null);
    }

    public V newExceptionValue(TryCatchBlockNode tryCatchBlockNode, Frame<V> frame, Type type) {
        return (V) newValue(type);
    }

    public abstract V newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException;

    public V newParameterValue(boolean z10, int i10, Type type) {
        return (V) newValue(type);
    }

    public V newReturnTypeValue(Type type) {
        return (V) newValue(type);
    }

    public abstract V newValue(Type type);

    public abstract void returnOperation(AbstractInsnNode abstractInsnNode, V v10, V v11) throws AnalyzerException;

    public abstract V ternaryOperation(AbstractInsnNode abstractInsnNode, V v10, V v11, V v12) throws AnalyzerException;

    public abstract V unaryOperation(AbstractInsnNode abstractInsnNode, V v10) throws AnalyzerException;
}
