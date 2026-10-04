package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

/* JADX INFO: loaded from: classes8.dex */
public class BasicInterpreter extends Interpreter<BasicValue> implements Opcodes {
    public static final Type NULL_TYPE = Type.getObjectType("null");

    public BasicInterpreter() {
        super(589824);
        if (getClass() != BasicInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        return basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends BasicValue>) list);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, org.objectweb.asm.tree.analysis.BasicValue r2, org.objectweb.asm.tree.analysis.BasicValue r3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r0 = this;
            int r1 = r1.getOpcode()
            r2 = 181(0xb5, float:2.54E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 46: goto L2c;
                case 47: goto L29;
                case 48: goto L26;
                case 49: goto L23;
                case 50: goto L20;
                case 51: goto L2c;
                case 52: goto L2c;
                case 53: goto L2c;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 96: goto L2c;
                case 97: goto L29;
                case 98: goto L26;
                case 99: goto L23;
                case 100: goto L2c;
                case 101: goto L29;
                case 102: goto L26;
                case 103: goto L23;
                case 104: goto L2c;
                case 105: goto L29;
                case 106: goto L26;
                case 107: goto L23;
                case 108: goto L2c;
                case 109: goto L29;
                case 110: goto L26;
                case 111: goto L23;
                case 112: goto L2c;
                case 113: goto L29;
                case 114: goto L26;
                case 115: goto L23;
                default: goto Le;
            }
        Le:
            switch(r1) {
                case 120: goto L2c;
                case 121: goto L29;
                case 122: goto L2c;
                case 123: goto L29;
                case 124: goto L2c;
                case 125: goto L29;
                case 126: goto L2c;
                case 127: goto L29;
                case 128: goto L2c;
                case 129: goto L29;
                case 130: goto L2c;
                case 131: goto L29;
                default: goto L11;
            }
        L11:
            switch(r1) {
                case 148: goto L1d;
                case 149: goto L1d;
                case 150: goto L1d;
                case 151: goto L1d;
                case 152: goto L1d;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 159: goto L2f;
                case 160: goto L2f;
                case 161: goto L2f;
                case 162: goto L2f;
                case 163: goto L2f;
                case 164: goto L2f;
                case 165: goto L2f;
                case 166: goto L2f;
                default: goto L17;
            }
        L17:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1d:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r1
        L20:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            return r1
        L23:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r1
        L26:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r1
        L29:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r1
        L2c:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r1
        L2f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicInterpreter.binaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? BasicValue.UNINITIALIZED_VALUE : basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        return opcode == 197 ? newValue(Type.getType(((MultiANewArrayInsnNode) abstractInsnNode).desc)) : opcode == 186 ? newValue(Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc)) : newValue(Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc));
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 168) {
            return BasicValue.RETURNADDRESS_VALUE;
        }
        if (opcode == 178) {
            return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        }
        if (opcode == 187) {
            return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
        }
        switch (opcode) {
            case 1:
                return newValue(NULL_TYPE);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return BasicValue.INT_VALUE;
            case 9:
            case 10:
                return BasicValue.LONG_VALUE;
            case 11:
            case 12:
            case 13:
                return BasicValue.FLOAT_VALUE;
            case 14:
            case 15:
                return BasicValue.DOUBLE_VALUE;
            case 16:
            case 17:
                return BasicValue.INT_VALUE;
            case 18:
                Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                if (obj instanceof Integer) {
                    return BasicValue.INT_VALUE;
                }
                if (obj instanceof Float) {
                    return BasicValue.FLOAT_VALUE;
                }
                if (obj instanceof Long) {
                    return BasicValue.LONG_VALUE;
                }
                if (obj instanceof Double) {
                    return BasicValue.DOUBLE_VALUE;
                }
                if (obj instanceof String) {
                    return newValue(Type.getObjectType("java/lang/String"));
                }
                if (!(obj instanceof Type)) {
                    if (obj instanceof Handle) {
                        return newValue(Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    if (obj instanceof ConstantDynamic) {
                        return newValue(Type.getType(((ConstantDynamic) obj).getDescriptor()));
                    }
                    throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                }
                int sort = ((Type) obj).getSort();
                if (sort == 10 || sort == 9) {
                    return newValue(Type.getObjectType("java/lang/Class"));
                }
                if (sort == 11) {
                    return newValue(Type.getObjectType("java/lang/invoke/MethodType"));
                }
                throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
            default:
                throw new AssertionError();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BasicValue.INT_VALUE;
            case 6:
                return BasicValue.FLOAT_VALUE;
            case 7:
                return BasicValue.LONG_VALUE;
            case 8:
                return BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return BasicValue.REFERENCE_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r3, org.objectweb.asm.tree.analysis.BasicValue r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicInterpreter.unaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    public BasicInterpreter(int i10) {
        super(i10);
    }
}
