package org.objectweb.asm;

import B0.C0922f;
import androidx.compose.ui.graphics.vector.f;

/* JADX INFO: loaded from: classes8.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 4194304;
    private static final int DIM_MASK = -67108864;
    private static final int DIM_SHIFT = 26;
    private static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    private static final int ELEMENT_OF = -67108864;
    private static final int FLAGS_SHIFT = 20;
    private static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    private static final int KIND_MASK = 62914560;
    private static final int KIND_SHIFT = 22;
    private static final int KIND_SIZE = 4;
    private static final int LOCAL_KIND = 16777216;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    private static final int REFERENCE_KIND = 8388608;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    private static final int STACK_KIND = 20971520;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    private static final int VALUE_MASK = 1048575;
    private static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    public Frame(Label label) {
        this.owner = label;
    }

    private void addInitializedType(int i10) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i11 = this.initializationCount;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i12 = this.initializationCount;
        this.initializationCount = i12 + 1;
        iArr2[i12] = i10;
    }

    public static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() | 4194304 : obj instanceof String ? getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0) : symbolTable.addUninitializedType("", ((Label) obj).bytecodeOffset) | UNINITIALIZED_KIND;
    }

    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i10) {
        int iAddType;
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return FLOAT;
        }
        if (cCharAt == 'L') {
            return symbolTable.addType(C0922f.a(str, 1, i10 + 1)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return LONG;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i11 = i10 + 1;
                        while (str.charAt(i11) == '[') {
                            i11++;
                        }
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 == 'F') {
                            iAddType = FLOAT;
                        } else if (cCharAt2 == 'L') {
                            iAddType = symbolTable.addType(C0922f.a(str, 1, i11 + 1)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iAddType = SHORT;
                        } else if (cCharAt2 == 'Z') {
                            iAddType = BOOLEAN;
                        } else if (cCharAt2 == 'I') {
                            iAddType = INTEGER;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iAddType = BYTE;
                                    break;
                                case 'C':
                                    iAddType = CHAR;
                                    break;
                                case 'D':
                                    iAddType = DOUBLE;
                                    break;
                                default:
                                    throw new IllegalArgumentException();
                            }
                        } else {
                            iAddType = LONG;
                        }
                        return ((i11 - i10) << 26) | iAddType;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return DOUBLE;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return INTEGER;
    }

    public static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | 8388608;
    }

    private int getConcreteOutputType(int i10, int i11) {
        int i12 = (-67108864) & i10;
        int i13 = KIND_MASK & i10;
        if (i13 == 16777216) {
            int i14 = i12 + this.inputLocals[i10 & 1048575];
            if ((i10 & 1048576) == 0 || !(i14 == LONG || i14 == DOUBLE)) {
                return i14;
            }
            return 4194304;
        }
        if (i13 != STACK_KIND) {
            return i10;
        }
        int i15 = i12 + this.inputStack[i11 - (i10 & 1048575)];
        if ((i10 & 1048576) == 0 || !(i15 == LONG || i15 == DOUBLE)) {
            return i15;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getInitializedType(org.objectweb.asm.SymbolTable r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.initializationCount
            if (r1 >= r2) goto L54
            int[] r2 = r8.initializations
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.inputLocals
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.inputStack
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.getClassName()
            int r9 = r9.addType(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            org.objectweb.asm.Symbol r10 = r9.getType(r10)
            java.lang.String r10 = r10.value
            int r9 = r9.addType(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.getInitializedType(org.objectweb.asm.SymbolTable, int):int");
    }

    private int getLocal(int i10) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i10 >= iArr.length) {
            return i10 | 16777216;
        }
        int i11 = iArr[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = 16777216 | i10;
        iArr[i10] = i12;
        return i12;
    }

    private int pop() {
        short s10 = this.outputStackTop;
        if (s10 <= 0) {
            short s11 = (short) (this.outputStackStart - 1);
            this.outputStackStart = s11;
            return (-s11) | STACK_KIND;
        }
        int[] iArr = this.outputStack;
        short s12 = (short) (s10 - 1);
        this.outputStackTop = s12;
        return iArr[s12];
    }

    private void push(int i10) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s10 = this.outputStackTop;
        if (s10 >= length) {
            int[] iArr = new int[Math.max(s10 + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s11 = this.outputStackTop;
        short s12 = (short) (s11 + 1);
        this.outputStackTop = s12;
        iArr2[s11] = i10;
        short s13 = (short) (this.outputStackStart + s12);
        Label label = this.owner;
        if (s13 > label.outputStackMax) {
            label.outputStackMax = s13;
        }
    }

    public static void putAbstractType(SymbolTable symbolTable, int i10, ByteVector byteVector) {
        int i11 = ((-67108864) & i10) >> 26;
        if (i11 == 0) {
            int i12 = i10 & 1048575;
            int i13 = i10 & KIND_MASK;
            if (i13 == 4194304) {
                byteVector.putByte(i12);
                return;
            } else if (i13 == 8388608) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i12).value).index);
                return;
            } else {
                if (i13 != UNINITIALIZED_KIND) {
                    throw new AssertionError();
                }
                byteVector.putByte(8).putShort((int) symbolTable.getType(i12).data);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            sb2.append('[');
            i11 = i14;
        }
        if ((i10 & KIND_MASK) == 8388608) {
            sb2.append(f.f101674f);
            sb2.append(symbolTable.getType(i10 & 1048575).value);
            sb2.append(';');
        } else {
            int i15 = i10 & 1048575;
            if (i15 == 1) {
                sb2.append('I');
            } else if (i15 == 2) {
                sb2.append('F');
            } else if (i15 == 3) {
                sb2.append('D');
            } else if (i15 != 4) {
                switch (i15) {
                    case 9:
                        sb2.append(f.f101670b);
                        break;
                    case 10:
                        sb2.append('B');
                        break;
                    case 11:
                        sb2.append(f.f101680l);
                        break;
                    case 12:
                        sb2.append(f.f101682n);
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb2.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb2.toString()).index);
    }

    private void setLocal(int i10, int i11) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i10] = i11;
    }

    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i11 >= iArr.length) {
                break;
            }
            int i15 = iArr[i11];
            if (i15 != LONG && i15 != DOUBLE) {
                i14 = 1;
            }
            i11 += i14;
            if (i15 == 4194304) {
                i13++;
            } else {
                i12 += i13 + 1;
                i13 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i16 = 0;
        int i17 = 0;
        while (i16 < iArr2.length) {
            int i18 = iArr2[i16];
            i16 += (i18 == LONG || i18 == DOUBLE) ? 2 : 1;
            i17++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i12, i17);
        int i19 = 0;
        while (true) {
            int i20 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            int i21 = iArr[i19];
            i19 += (i21 == LONG || i21 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i21);
            i12 = i20;
            iVisitFrameStart++;
        }
        while (true) {
            int i22 = i17 - 1;
            if (i17 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i23 = iArr2[i10];
            i10 += (i23 == LONG || i23 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i23);
            iVisitFrameStart++;
            i17 = i22;
        }
    }

    public final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(int r19, int r20, org.objectweb.asm.Symbol r21, org.objectweb.asm.SymbolTable r22) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.execute(int, int, org.objectweb.asm.Symbol, org.objectweb.asm.SymbolTable):void");
    }

    public final int getInputStackSize() {
        return this.inputStack.length;
    }

    public final boolean merge(SymbolTable symbolTable, Frame frame, int i10) {
        boolean zMerge;
        int i11;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge2 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            zMerge = true;
        } else {
            zMerge = false;
        }
        int i12 = 0;
        while (i12 < length) {
            int[] iArr = this.outputLocals;
            int initializedType = (iArr == null || i12 >= iArr.length || (i11 = iArr[i12]) == 0) ? this.inputLocals[i12] : getConcreteOutputType(i11, length2);
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge |= merge(symbolTable, initializedType, frame.inputLocals, i12);
            i12++;
        }
        if (i10 > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                zMerge |= merge(symbolTable, this.inputLocals[i13], frame.inputLocals, i13);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                zMerge2 = zMerge;
            }
            return merge(symbolTable, i10, frame.inputStack, 0) | zMerge2;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge2 = zMerge;
        }
        for (int i14 = 0; i14 < length3; i14++) {
            int initializedType2 = this.inputStack[i14];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge2 |= merge(symbolTable, initializedType2, frame.inputStack, i14);
        }
        for (int i15 = 0; i15 < this.outputStackTop; i15++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i15], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            zMerge2 |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i15);
        }
        return zMerge2;
    }

    public final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i10, Object[] objArr, int i11, Object[] objArr2) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + 1;
            this.inputLocals[i12] = getAbstractTypeFromApiFormat(symbolTable, objArr[i13]);
            Object obj = objArr[i13];
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                i12 += 2;
                this.inputLocals[i14] = 4194304;
            } else {
                i12 = i14;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = 4194304;
            i12++;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            Object obj2 = objArr2[i16];
            if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                i15++;
            }
        }
        this.inputStack = new int[i15 + i11];
        int i17 = 0;
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i17 + 1;
            this.inputStack[i17] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i18]);
            Object obj3 = objArr2[i18];
            if (obj3 == Opcodes.LONG || obj3 == Opcodes.DOUBLE) {
                i17 += 2;
                this.inputStack[i19] = 4194304;
            } else {
                i17 = i19;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i10, String str, int i11) {
        int i12;
        int[] iArr = new int[i11];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i10 & 8) == 0) {
            i12 = 1;
            if ((i10 & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | 8388608;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i12 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i13 = i12 + 1;
            iArr2[i12] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i12 += 2;
                iArr2[i13] = 4194304;
            } else {
                i12 = i13;
            }
        }
        while (i12 < i11) {
            this.inputLocals[i12] = 4194304;
            i12++;
        }
    }

    private void pop(int i10) {
        short s10 = this.outputStackTop;
        if (s10 >= i10) {
            this.outputStackTop = (short) (s10 - i10);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i10 - s10));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt != 'J' && cCharAt != 'D') {
            pop(1);
        } else {
            pop(2);
        }
    }

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? Type.getReturnTypeOffset(str) : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(4194304);
            }
        }
    }

    private static boolean merge(SymbolTable symbolTable, int i10, int[] iArr, int i11) {
        int iMin;
        int iAddType;
        int i12 = iArr[i11];
        if (i12 == i10) {
            return false;
        }
        if ((67108863 & i10) == NULL) {
            if (i12 == NULL) {
                return false;
            }
            i10 = NULL;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            return true;
        }
        int i13 = i12 & (-67108864);
        int iAddMergedType = 4194304;
        if (i13 != 0 || (i12 & KIND_MASK) == 8388608) {
            if (i10 == NULL) {
                return false;
            }
            if ((i10 & (-4194304)) != ((-4194304) & i12)) {
                int i14 = i10 & (-67108864);
                if (i14 != 0 || (i10 & KIND_MASK) == 8388608) {
                    if (i14 != 0 && (i10 & KIND_MASK) != 8388608) {
                        i14 -= 67108864;
                    }
                    if (i13 != 0 && (i12 & KIND_MASK) != 8388608) {
                        i13 -= 67108864;
                    }
                    iMin = Math.min(i14, i13) | 8388608;
                    iAddType = symbolTable.addType("java/lang/Object");
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i12 & KIND_MASK) == 8388608) {
                iAddMergedType = (i10 & (-67108864)) | 8388608 | symbolTable.addMergedType(i10 & 1048575, 1048575 & i12);
            } else {
                iMin = ((i10 & (-67108864)) - 67108864) | 8388608;
                iAddType = symbolTable.addType("java/lang/Object");
                iAddMergedType = iMin | iAddType;
            }
        } else if (i12 == NULL) {
            if ((i10 & (-67108864)) == 0 && (i10 & KIND_MASK) != 8388608) {
                i10 = 4194304;
            }
            iAddMergedType = i10;
        }
        if (iAddMergedType == i12) {
            return false;
        }
        iArr[i11] = iAddMergedType;
        return true;
    }
}
