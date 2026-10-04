package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes8.dex */
public class LocalVariablesSorter extends MethodVisitor {
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    protected final int firstLocal;
    protected int nextLocal;
    private Object[] remappedLocalTypes;
    private int[] remappedVariableIndices;

    public LocalVariablesSorter(int i10, String str, MethodVisitor methodVisitor) {
        this(589824, i10, str, methodVisitor);
        if (getClass() != LocalVariablesSorter.class) {
            throw new IllegalStateException();
        }
    }

    private int remap(int i10, Type type) {
        if (type.getSize() + i10 <= this.firstLocal) {
            return i10;
        }
        int size = type.getSize() + (i10 * 2);
        int i11 = size - 1;
        int length = this.remappedVariableIndices.length;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(length * 2, size)];
            System.arraycopy(this.remappedVariableIndices, 0, iArr, 0, length);
            this.remappedVariableIndices = iArr;
        }
        int i12 = this.remappedVariableIndices[i11];
        if (i12 != 0) {
            return i12 - 1;
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        this.remappedVariableIndices[i11] = iNewLocalMapping + 1;
        return iNewLocalMapping;
    }

    private void setFrameLocal(int i10, Object obj) {
        int length = this.remappedLocalTypes.length;
        if (i10 >= length) {
            Object[] objArr = new Object[Math.max(length * 2, i10 + 1)];
            System.arraycopy(this.remappedLocalTypes, 0, objArr, 0, length);
            this.remappedLocalTypes = objArr;
        }
        this.remappedLocalTypes[i10] = obj;
    }

    public int newLocal(Type type) {
        Object descriptor;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                descriptor = Opcodes.INTEGER;
                break;
            case 6:
                descriptor = Opcodes.FLOAT;
                break;
            case 7:
                descriptor = Opcodes.LONG;
                break;
            case 8:
                descriptor = Opcodes.DOUBLE;
                break;
            case 9:
                descriptor = type.getDescriptor();
                break;
            case 10:
                descriptor = type.getInternalName();
                break;
            default:
                throw new AssertionError();
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        setFrameLocal(iNewLocalMapping, descriptor);
        return iNewLocalMapping;
    }

    public int newLocalMapping(Type type) {
        int i10 = this.nextLocal;
        this.nextLocal = type.getSize() + i10;
        return i10;
    }

    public void setLocalType(int i10, Type type) {
    }

    public void updateNewLocals(Object[] objArr) {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        Object obj;
        if (i10 != -1) {
            throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        Object[] objArr4 = this.remappedLocalTypes;
        int length = objArr4.length;
        Object[] objArr5 = new Object[length];
        int i13 = 0;
        System.arraycopy(objArr4, 0, objArr5, 0, length);
        updateNewLocals(this.remappedLocalTypes);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 2;
            if (i14 >= i11) {
                break;
            }
            Object obj2 = objArr[i14];
            if (obj2 != Opcodes.TOP) {
                Type objectType = OBJECT_TYPE;
                if (obj2 == Opcodes.INTEGER) {
                    objectType = Type.INT_TYPE;
                } else if (obj2 == Opcodes.FLOAT) {
                    objectType = Type.FLOAT_TYPE;
                } else if (obj2 == Opcodes.LONG) {
                    objectType = Type.LONG_TYPE;
                } else if (obj2 == Opcodes.DOUBLE) {
                    objectType = Type.DOUBLE_TYPE;
                } else if (obj2 instanceof String) {
                    objectType = Type.getObjectType((String) obj2);
                }
                setFrameLocal(remap(i15, objectType), obj2);
            }
            if (obj2 != Opcodes.LONG && obj2 != Opcodes.DOUBLE) {
                i16 = 1;
            }
            i15 += i16;
            i14++;
        }
        int i17 = 0;
        while (true) {
            int i18 = i17;
            while (true) {
                objArr3 = this.remappedLocalTypes;
                if (i13 >= objArr3.length) {
                    super.visitFrame(i10, i18, objArr3, i12, objArr2);
                    this.remappedLocalTypes = objArr5;
                    return;
                }
                obj = objArr3[i13];
                i13 += (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? 2 : 1;
                if (obj == null || obj == Opcodes.TOP) {
                    objArr3[i17] = Opcodes.TOP;
                    i17++;
                }
            }
            objArr3[i17] = obj;
            i17++;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        super.visitIincInsn(remap(i10, Type.INT_TYPE), i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i10) {
        super.visitLocalVariable(str, str2, str3, label, label2, remap(i10, Type.getType(str2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i10, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z10) {
        Type type = Type.getType(str);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = remap(iArr[i11], type);
        }
        return super.visitLocalVariableAnnotation(i10, typePath, labelArr, labelArr2, iArr2, str, z10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i10, int i11) {
        super.visitMaxs(i10, this.nextLocal);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // org.objectweb.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void visitVarInsn(int r2, int r3) {
        /*
            r1 = this;
            r0 = 169(0xa9, float:2.37E-43)
            if (r2 == r0) goto L22
            switch(r2) {
                case 21: goto L1f;
                case 22: goto L1c;
                case 23: goto L19;
                case 24: goto L16;
                case 25: goto L22;
                default: goto L7;
            }
        L7:
            switch(r2) {
                case 54: goto L1f;
                case 55: goto L1c;
                case 56: goto L19;
                case 57: goto L16;
                case 58: goto L22;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid opcode "
            java.lang.String r2 = android.support.v4.media.c.a(r0, r2)
            r3.<init>(r2)
            throw r3
        L16:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            goto L24
        L19:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            goto L24
        L1c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            goto L24
        L1f:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            goto L24
        L22:
            org.objectweb.asm.Type r0 = org.objectweb.asm.commons.LocalVariablesSorter.OBJECT_TYPE
        L24:
            int r3 = r1.remap(r3, r0)
            super.visitVarInsn(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.commons.LocalVariablesSorter.visitVarInsn(int, int):void");
    }

    public LocalVariablesSorter(int i10, int i11, String str, MethodVisitor methodVisitor) {
        super(i10, methodVisitor);
        this.remappedVariableIndices = new int[40];
        this.remappedLocalTypes = new Object[20];
        int i12 = i11 & 8;
        this.nextLocal = i12 == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str)) {
            this.nextLocal = type.getSize() + this.nextLocal;
        }
        this.firstLocal = this.nextLocal;
    }
}
