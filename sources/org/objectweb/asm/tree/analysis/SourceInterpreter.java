package org.objectweb.asm.tree.analysis;

import java.util.List;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* JADX INFO: loaded from: classes8.dex */
public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes {
    public SourceInterpreter() {
        super(589824);
        if (getClass() != SourceInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    private static <E> boolean containsAll(Set<E> set, Set<E> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends SourceValue>) list);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue binaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
        int i10;
        switch (abstractInsnNode.getOpcode()) {
            case 47:
            case 49:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
                i10 = 2;
                break;
            default:
                i10 = 1;
                break;
        }
        return new SourceValue(i10, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue copyOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        return new SourceValue(sourceValue.getSize(), abstractInsnNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.SourceValue merge(org.objectweb.asm.tree.analysis.SourceValue r4, org.objectweb.asm.tree.analysis.SourceValue r5) {
        /*
            r3 = this;
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r4.insns
            boolean r1 = r0 instanceof org.objectweb.asm.tree.analysis.SmallSet
            if (r1 == 0) goto L2d
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r5.insns
            boolean r2 = r1 instanceof org.objectweb.asm.tree.analysis.SmallSet
            if (r2 == 0) goto L2d
            org.objectweb.asm.tree.analysis.SmallSet r0 = (org.objectweb.asm.tree.analysis.SmallSet) r0
            org.objectweb.asm.tree.analysis.SmallSet r1 = (org.objectweb.asm.tree.analysis.SmallSet) r1
            java.util.Set r0 = r0.union(r1)
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r4.insns
            if (r0 != r1) goto L1f
            int r1 = r4.size
            int r2 = r5.size
            if (r1 != r2) goto L1f
            goto L3c
        L1f:
            org.objectweb.asm.tree.analysis.SourceValue r1 = new org.objectweb.asm.tree.analysis.SourceValue
            int r4 = r4.size
            int r5 = r5.size
            int r4 = java.lang.Math.min(r4, r5)
            r1.<init>(r4, r0)
            return r1
        L2d:
            int r1 = r4.size
            int r2 = r5.size
            if (r1 != r2) goto L3d
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r5.insns
            boolean r0 = containsAll(r0, r1)
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r4.insns
            r0.addAll(r1)
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r5.insns
            r0.addAll(r1)
            org.objectweb.asm.tree.analysis.SourceValue r1 = new org.objectweb.asm.tree.analysis.SourceValue
            int r4 = r4.size
            int r5 = r5.size
            int r4 = java.lang.Math.min(r4, r5)
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.SourceInterpreter.merge(org.objectweb.asm.tree.analysis.SourceValue, org.objectweb.asm.tree.analysis.SourceValue):org.objectweb.asm.tree.analysis.SourceValue");
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends SourceValue> list) {
        int opcode = abstractInsnNode.getOpcode();
        return new SourceValue(opcode == 197 ? 1 : opcode == 186 ? Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc).getSize() : Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc).getSize(), abstractInsnNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.SourceValue newOperation(org.objectweb.asm.tree.AbstractInsnNode r5) {
        /*
            r4 = this;
            int r0 = r5.getOpcode()
            r1 = 9
            r2 = 2
            if (r0 == r1) goto L3b
            r1 = 10
            if (r0 == r1) goto L3b
            r1 = 14
            if (r0 == r1) goto L3b
            r1 = 15
            if (r0 == r1) goto L3b
            r1 = 18
            r3 = 1
            if (r0 == r1) goto L2e
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L20
        L1e:
            r2 = r3
            goto L3b
        L20:
            r0 = r5
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            int r2 = r0.getSize()
            goto L3b
        L2e:
            r0 = r5
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 != 0) goto L3b
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L1e
        L3b:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r0.<init>(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.SourceInterpreter.newOperation(org.objectweb.asm.tree.AbstractInsnNode):org.objectweb.asm.tree.analysis.SourceValue");
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue newValue(Type type) {
        if (type == Type.VOID_TYPE) {
            return null;
        }
        return new SourceValue(type == null ? 1 : type.getSize());
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue ternaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2, SourceValue sourceValue3) {
        return new SourceValue(1, abstractInsnNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.SourceValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r2, org.objectweb.asm.tree.analysis.SourceValue r3) {
        /*
            r1 = this;
            int r3 = r2.getOpcode()
            r0 = 117(0x75, float:1.64E-43)
            if (r3 == r0) goto L38
            r0 = 119(0x77, float:1.67E-43)
            if (r3 == r0) goto L38
            r0 = 133(0x85, float:1.86E-43)
            if (r3 == r0) goto L38
            r0 = 135(0x87, float:1.89E-43)
            if (r3 == r0) goto L38
            r0 = 138(0x8a, float:1.93E-43)
            if (r3 == r0) goto L38
            r0 = 143(0x8f, float:2.0E-43)
            if (r3 == r0) goto L38
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L2a
            r0 = 140(0x8c, float:1.96E-43)
            if (r3 == r0) goto L38
            r0 = 141(0x8d, float:1.98E-43)
            if (r3 == r0) goto L38
            r3 = 1
            goto L39
        L2a:
            r3 = r2
            org.objectweb.asm.tree.FieldInsnNode r3 = (org.objectweb.asm.tree.FieldInsnNode) r3
            java.lang.String r3 = r3.desc
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            int r3 = r3.getSize()
            goto L39
        L38:
            r3 = 2
        L39:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.SourceInterpreter.unaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.SourceValue):org.objectweb.asm.tree.analysis.SourceValue");
    }

    public SourceInterpreter(int i10) {
        super(i10);
    }
}
