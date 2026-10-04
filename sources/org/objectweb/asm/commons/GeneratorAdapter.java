package org.objectweb.asm.commons;

import android.support.v4.media.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes8.dex */
public class GeneratorAdapter extends LocalVariablesSorter {
    public static final int ADD = 96;
    public static final int AND = 126;
    private static final String CLASS_DESCRIPTOR = "Ljava/lang/Class;";
    public static final int DIV = 108;
    public static final int EQ = 153;
    public static final int GE = 156;
    public static final int GT = 157;
    public static final int LE = 158;
    public static final int LT = 155;
    public static final int MUL = 104;
    public static final int NE = 154;
    public static final int NEG = 116;
    public static final int OR = 128;
    public static final int REM = 112;
    public static final int SHL = 120;
    public static final int SHR = 122;
    public static final int SUB = 100;
    public static final int USHR = 124;
    public static final int XOR = 130;
    private final int access;
    private final Type[] argumentTypes;
    private final List<Type> localTypes;
    private final String name;
    private final Type returnType;
    private static final Type BYTE_TYPE = Type.getObjectType("java/lang/Byte");
    private static final Type BOOLEAN_TYPE = Type.getObjectType("java/lang/Boolean");
    private static final Type SHORT_TYPE = Type.getObjectType("java/lang/Short");
    private static final Type CHARACTER_TYPE = Type.getObjectType("java/lang/Character");
    private static final Type INTEGER_TYPE = Type.getObjectType("java/lang/Integer");
    private static final Type FLOAT_TYPE = Type.getObjectType("java/lang/Float");
    private static final Type LONG_TYPE = Type.getObjectType("java/lang/Long");
    private static final Type DOUBLE_TYPE = Type.getObjectType("java/lang/Double");
    private static final Type NUMBER_TYPE = Type.getObjectType("java/lang/Number");
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    private static final Method BOOLEAN_VALUE = Method.getMethod("boolean booleanValue()");
    private static final Method CHAR_VALUE = Method.getMethod("char charValue()");
    private static final Method INT_VALUE = Method.getMethod("int intValue()");
    private static final Method FLOAT_VALUE = Method.getMethod("float floatValue()");
    private static final Method LONG_VALUE = Method.getMethod("long longValue()");
    private static final Method DOUBLE_VALUE = Method.getMethod("double doubleValue()");

    public GeneratorAdapter(MethodVisitor methodVisitor, int i10, String str, String str2) {
        this(589824, methodVisitor, i10, str, str2);
        if (getClass() != GeneratorAdapter.class) {
            throw new IllegalStateException();
        }
    }

    private void fieldInsn(int i10, Type type, String str, Type type2) {
        this.mv.visitFieldInsn(i10, type.getInternalName(), str, type2.getDescriptor());
    }

    private int getArgIndex(int i10) {
        int size = (this.access & 8) == 0 ? 1 : 0;
        for (int i11 = 0; i11 < i10; i11++) {
            size += this.argumentTypes[i11].getSize();
        }
        return size;
    }

    private static Type getBoxedType(Type type) {
        switch (type.getSort()) {
            case 1:
                return BOOLEAN_TYPE;
            case 2:
                return CHARACTER_TYPE;
            case 3:
                return BYTE_TYPE;
            case 4:
                return SHORT_TYPE;
            case 5:
                return INTEGER_TYPE;
            case 6:
                return FLOAT_TYPE;
            case 7:
                return LONG_TYPE;
            case 8:
                return DOUBLE_TYPE;
            default:
                return type;
        }
    }

    private static String[] getInternalNames(Type[] typeArr) {
        int length = typeArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = typeArr[i10].getInternalName();
        }
        return strArr;
    }

    private void invokeInsn(int i10, Type type, Method method, boolean z10) {
        this.mv.visitMethodInsn(i10, type.getSort() == 9 ? type.getDescriptor() : type.getInternalName(), method.getName(), method.getDescriptor(), z10);
    }

    private void loadInsn(Type type, int i10) {
        this.mv.visitVarInsn(type.getOpcode(21), i10);
    }

    private void storeInsn(Type type, int i10) {
        this.mv.visitVarInsn(type.getOpcode(54), i10);
    }

    private void typeInsn(int i10, Type type) {
        this.mv.visitTypeInsn(i10, type.getInternalName());
    }

    public void arrayLength() {
        this.mv.visitInsn(190);
    }

    public void arrayLoad(Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void arrayStore(Type type) {
        this.mv.visitInsn(type.getOpcode(79));
    }

    public void box(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        Type type2 = Type.VOID_TYPE;
        if (type == type2) {
            push((String) null);
            return;
        }
        Type boxedType = getBoxedType(type);
        newInstance(boxedType);
        if (type.getSize() == 2) {
            dupX2();
            dupX2();
            pop();
        } else {
            dupX1();
            swap();
        }
        invokeConstructor(boxedType, new Method("<init>", type2, new Type[]{type}));
    }

    public void cast(Type type, Type type2) {
        if (type != type2) {
            if (type.getSort() >= 1 && type.getSort() <= 8 && type2.getSort() >= 1 && type2.getSort() <= 8) {
                InstructionAdapter.cast(this.mv, type, type2);
                return;
            }
            throw new IllegalArgumentException("Cannot cast from " + type + " to " + type2);
        }
    }

    public void catchException(Label label, Label label2, Type type) {
        Label label3 = new Label();
        if (type == null) {
            this.mv.visitTryCatchBlock(label, label2, label3, null);
        } else {
            this.mv.visitTryCatchBlock(label, label2, label3, type.getInternalName());
        }
        mark(label3);
    }

    public void checkCast(Type type) {
        if (type.equals(OBJECT_TYPE)) {
            return;
        }
        typeInsn(192, type);
    }

    public void dup() {
        this.mv.visitInsn(89);
    }

    public void dup2() {
        this.mv.visitInsn(92);
    }

    public void dup2X1() {
        this.mv.visitInsn(93);
    }

    public void dup2X2() {
        this.mv.visitInsn(94);
    }

    public void dupX1() {
        this.mv.visitInsn(90);
    }

    public void dupX2() {
        this.mv.visitInsn(91);
    }

    public void endMethod() {
        if ((this.access & 1024) == 0) {
            this.mv.visitMaxs(0, 0);
        }
        this.mv.visitEnd();
    }

    public int getAccess() {
        return this.access;
    }

    public Type[] getArgumentTypes() {
        return (Type[]) this.argumentTypes.clone();
    }

    public void getField(Type type, String str, Type type2) {
        fieldInsn(Opcodes.GETFIELD, type, str, type2);
    }

    public Type getLocalType(int i10) {
        return this.localTypes.get(i10 - this.firstLocal);
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public void getStatic(Type type, String str, Type type2) {
        fieldInsn(178, type, str, type2);
    }

    public void goTo(Label label) {
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    public void ifCmp(Type type, int i10, Label label) {
        int i11;
        switch (type.getSort()) {
            case 6:
                this.mv.visitInsn((i10 == 156 || i10 == 157) ? Opcodes.FCMPL : 150);
                break;
            case 7:
                this.mv.visitInsn(Opcodes.LCMP);
                break;
            case 8:
                this.mv.visitInsn((i10 == 156 || i10 == 157) ? Opcodes.DCMPL : Opcodes.DCMPG);
                break;
            case 9:
            case 10:
                if (i10 == 153) {
                    this.mv.visitJumpInsn(165, label);
                    return;
                } else if (i10 == 154) {
                    this.mv.visitJumpInsn(Opcodes.IF_ACMPNE, label);
                    return;
                } else {
                    throw new IllegalArgumentException("Bad comparison for type " + type);
                }
            default:
                switch (i10) {
                    case 153:
                        i11 = Opcodes.IF_ICMPEQ;
                        break;
                    case 154:
                        i11 = 160;
                        break;
                    case 155:
                        i11 = Opcodes.IF_ICMPLT;
                        break;
                    case 156:
                        i11 = Opcodes.IF_ICMPGE;
                        break;
                    case 157:
                        i11 = Opcodes.IF_ICMPGT;
                        break;
                    case 158:
                        i11 = Opcodes.IF_ICMPLE;
                        break;
                    default:
                        throw new IllegalArgumentException(c.a("Bad comparison mode ", i10));
                }
                this.mv.visitJumpInsn(i11, label);
                return;
        }
        this.mv.visitJumpInsn(i10, label);
    }

    public void ifICmp(int i10, Label label) {
        ifCmp(Type.INT_TYPE, i10, label);
    }

    public void ifNonNull(Label label) {
        this.mv.visitJumpInsn(199, label);
    }

    public void ifNull(Label label) {
        this.mv.visitJumpInsn(198, label);
    }

    public void ifZCmp(int i10, Label label) {
        this.mv.visitJumpInsn(i10, label);
    }

    public void iinc(int i10, int i11) {
        this.mv.visitIincInsn(i10, i11);
    }

    public void instanceOf(Type type) {
        typeInsn(193, type);
    }

    public void invokeConstructor(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESPECIAL, type, method, false);
    }

    public void invokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void invokeInterface(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEINTERFACE, type, method, true);
    }

    public void invokeStatic(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESTATIC, type, method, false);
    }

    public void invokeVirtual(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEVIRTUAL, type, method, false);
    }

    public void loadArg(int i10) {
        loadInsn(this.argumentTypes[i10], getArgIndex(i10));
    }

    public void loadArgArray() {
        push(this.argumentTypes.length);
        newArray(OBJECT_TYPE);
        for (int i10 = 0; i10 < this.argumentTypes.length; i10++) {
            dup();
            push(i10);
            loadArg(i10);
            box(this.argumentTypes[i10]);
            arrayStore(OBJECT_TYPE);
        }
    }

    public void loadArgs(int i10, int i11) {
        int argIndex = getArgIndex(i10);
        for (int i12 = 0; i12 < i11; i12++) {
            Type type = this.argumentTypes[i10 + i12];
            loadInsn(type, argIndex);
            argIndex += type.getSize();
        }
    }

    public void loadLocal(int i10) {
        loadInsn(getLocalType(i10), i10);
    }

    public void loadThis() {
        if ((this.access & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.mv.visitVarInsn(25, 0);
    }

    public void mark(Label label) {
        this.mv.visitLabel(label);
    }

    public void math(int i10, Type type) {
        this.mv.visitInsn(type.getOpcode(i10));
    }

    public void monitorEnter() {
        this.mv.visitInsn(194);
    }

    public void monitorExit() {
        this.mv.visitInsn(195);
    }

    public void newArray(Type type) {
        InstructionAdapter.newarray(this.mv, type);
    }

    public void newInstance(Type type) {
        typeInsn(Opcodes.NEW, type);
    }

    public Label newLabel() {
        return new Label();
    }

    public void not() {
        this.mv.visitInsn(4);
        this.mv.visitInsn(130);
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void push(boolean z10) {
        push(z10 ? 1 : 0);
    }

    public void putField(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTFIELD, type, str, type2);
    }

    public void putStatic(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTSTATIC, type, str, type2);
    }

    public void ret(int i10) {
        this.mv.visitVarInsn(Opcodes.RET, i10);
    }

    public void returnValue() {
        this.mv.visitInsn(this.returnType.getOpcode(Opcodes.IRETURN));
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter
    public void setLocalType(int i10, Type type) {
        int i11 = i10 - this.firstLocal;
        while (this.localTypes.size() < i11 + 1) {
            this.localTypes.add(null);
        }
        this.localTypes.set(i11, type);
    }

    public void storeArg(int i10) {
        storeInsn(this.argumentTypes[i10], getArgIndex(i10));
    }

    public void storeLocal(int i10) {
        storeInsn(getLocalType(i10), i10);
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator) {
        tableSwitch(iArr, tableSwitchGenerator, (iArr.length == 0 ? 0.0f : ((float) iArr.length) / ((float) ((iArr[iArr.length - 1] - iArr[0]) + 1))) >= 0.5f);
    }

    public void throwException() {
        this.mv.visitInsn(Opcodes.ATHROW);
    }

    public void unbox(Type type) {
        Method method;
        Type type2 = NUMBER_TYPE;
        switch (type.getSort()) {
            case 0:
                return;
            case 1:
                type2 = BOOLEAN_TYPE;
                method = BOOLEAN_VALUE;
                break;
            case 2:
                type2 = CHARACTER_TYPE;
                method = CHAR_VALUE;
                break;
            case 3:
            case 4:
            case 5:
                method = INT_VALUE;
                break;
            case 6:
                method = FLOAT_VALUE;
                break;
            case 7:
                method = LONG_VALUE;
                break;
            case 8:
                method = DOUBLE_VALUE;
                break;
            default:
                method = null;
                break;
        }
        if (method == null) {
            checkCast(type);
        } else {
            checkCast(type2);
            invokeVirtual(type2, method);
        }
    }

    public void valueOf(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
        } else {
            Type boxedType = getBoxedType(type);
            invokeStatic(boxedType, new Method("valueOf", boxedType, new Type[]{type}));
        }
    }

    public void loadLocal(int i10, Type type) {
        setLocalType(i10, type);
        loadInsn(type, i10);
    }

    public Label mark() {
        Label label = new Label();
        this.mv.visitLabel(label);
        return label;
    }

    public void push(int i10) {
        if (i10 >= -1 && i10 <= 5) {
            this.mv.visitInsn(i10 + 3);
            return;
        }
        if (i10 >= -128 && i10 <= 127) {
            this.mv.visitIntInsn(16, i10);
        } else if (i10 < -32768 || i10 > 32767) {
            this.mv.visitLdcInsn(Integer.valueOf(i10));
        } else {
            this.mv.visitIntInsn(17, i10);
        }
    }

    public void storeLocal(int i10, Type type) {
        setLocalType(i10, type);
        storeInsn(type, i10);
    }

    public void swap(Type type, Type type2) {
        if (type2.getSize() == 1) {
            if (type.getSize() == 1) {
                swap();
                return;
            } else {
                dupX2();
                pop();
                return;
            }
        }
        if (type.getSize() == 1) {
            dup2X1();
            pop2();
        } else {
            dup2X2();
            pop2();
        }
    }

    public void throwException(Type type, String str) {
        newInstance(type);
        dup();
        push(str);
        invokeConstructor(type, Method.getMethod("void <init> (String)"));
        throwException();
    }

    public GeneratorAdapter(int i10, MethodVisitor methodVisitor, int i11, String str, String str2) {
        super(i10, i11, str2, methodVisitor);
        this.localTypes = new ArrayList();
        this.access = i11;
        this.name = str;
        this.returnType = Type.getReturnType(str2);
        this.argumentTypes = Type.getArgumentTypes(str2);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator, boolean z10) {
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10] < iArr[i10 - 1]) {
                throw new IllegalArgumentException("keys must be sorted in ascending order");
            }
        }
        Label labelNewLabel = newLabel();
        Label labelNewLabel2 = newLabel();
        if (iArr.length > 0) {
            int length = iArr.length;
            int i11 = 0;
            if (z10) {
                int i12 = iArr[0];
                int i13 = iArr[length - 1];
                int i14 = (i13 - i12) + 1;
                Label[] labelArr = new Label[i14];
                Arrays.fill(labelArr, labelNewLabel);
                for (int i15 : iArr) {
                    labelArr[i15 - i12] = newLabel();
                }
                this.mv.visitTableSwitchInsn(i12, i13, labelNewLabel, labelArr);
                while (i11 < i14) {
                    Label label = labelArr[i11];
                    if (label != labelNewLabel) {
                        mark(label);
                        tableSwitchGenerator.generateCase(i11 + i12, labelNewLabel2);
                    }
                    i11++;
                }
            } else {
                Label[] labelArr2 = new Label[length];
                for (int i16 = 0; i16 < length; i16++) {
                    labelArr2[i16] = newLabel();
                }
                this.mv.visitLookupSwitchInsn(labelNewLabel, iArr, labelArr2);
                while (i11 < length) {
                    mark(labelArr2[i11]);
                    tableSwitchGenerator.generateCase(iArr[i11], labelNewLabel2);
                    i11++;
                }
            }
        }
        mark(labelNewLabel);
        tableSwitchGenerator.generateDefault();
        mark(labelNewLabel2);
    }

    public void loadArgs() {
        loadArgs(0, this.argumentTypes.length);
    }

    public void push(long j10) {
        if (j10 != 0 && j10 != 1) {
            this.mv.visitLdcInsn(Long.valueOf(j10));
        } else {
            this.mv.visitInsn(((int) j10) + 9);
        }
    }

    public void push(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        if (iFloatToIntBits != 0 && iFloatToIntBits != 1065353216 && iFloatToIntBits != 1073741824) {
            this.mv.visitLdcInsn(Float.valueOf(f10));
        } else {
            this.mv.visitInsn(((int) f10) + 11);
        }
    }

    public GeneratorAdapter(int i10, Method method, MethodVisitor methodVisitor) {
        this(methodVisitor, i10, method.getName(), method.getDescriptor());
    }

    public GeneratorAdapter(int i10, Method method, String str, Type[] typeArr, ClassVisitor classVisitor) {
        this(i10, method, classVisitor.visitMethod(i10, method.getName(), method.getDescriptor(), str, typeArr == null ? null : getInternalNames(typeArr)));
    }

    public void push(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        if (jDoubleToLongBits != 0 && jDoubleToLongBits != 4607182418800017408L) {
            this.mv.visitLdcInsn(Double.valueOf(d10));
        } else {
            this.mv.visitInsn(((int) d10) + 14);
        }
    }

    public void push(String str) {
        if (str == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(str);
        }
    }

    public void push(Type type) {
        if (type == null) {
            this.mv.visitInsn(1);
        }
        switch (type.getSort()) {
            case 1:
                this.mv.visitFieldInsn(178, "java/lang/Boolean", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 2:
                this.mv.visitFieldInsn(178, "java/lang/Character", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 3:
                this.mv.visitFieldInsn(178, "java/lang/Byte", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 4:
                this.mv.visitFieldInsn(178, "java/lang/Short", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 5:
                this.mv.visitFieldInsn(178, "java/lang/Integer", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 6:
                this.mv.visitFieldInsn(178, "java/lang/Float", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 7:
                this.mv.visitFieldInsn(178, "java/lang/Long", "TYPE", CLASS_DESCRIPTOR);
                break;
            case 8:
                this.mv.visitFieldInsn(178, "java/lang/Double", "TYPE", CLASS_DESCRIPTOR);
                break;
            default:
                this.mv.visitLdcInsn(type);
                break;
        }
    }

    public void push(Handle handle) {
        if (handle == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(handle);
        }
    }

    public void push(ConstantDynamic constantDynamic) {
        if (constantDynamic == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(constantDynamic);
        }
    }
}
