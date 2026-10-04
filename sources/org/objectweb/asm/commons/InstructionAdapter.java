package org.objectweb.asm.commons;

import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes8.dex */
public class InstructionAdapter extends MethodVisitor {
    public static final Type OBJECT_TYPE = Type.getType("Ljava/lang/Object;");

    public InstructionAdapter(MethodVisitor methodVisitor) {
        this(589824, methodVisitor);
        if (getClass() != InstructionAdapter.class) {
            throw new IllegalStateException();
        }
    }

    public void aconst(Object obj) {
        if (obj == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(obj);
        }
    }

    public void add(Type type) {
        this.mv.visitInsn(type.getOpcode(96));
    }

    public void aload(Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void and(Type type) {
        this.mv.visitInsn(type.getOpcode(126));
    }

    public void anew(Type type) {
        this.mv.visitTypeInsn(Opcodes.NEW, type.getInternalName());
    }

    public void areturn(Type type) {
        this.mv.visitInsn(type.getOpcode(Opcodes.IRETURN));
    }

    public void arraylength() {
        this.mv.visitInsn(190);
    }

    public void astore(Type type) {
        this.mv.visitInsn(type.getOpcode(79));
    }

    public void athrow() {
        this.mv.visitInsn(Opcodes.ATHROW);
    }

    public void cast(Type type, Type type2) {
        cast(this.mv, type, type2);
    }

    public void cconst(ConstantDynamic constantDynamic) {
        this.mv.visitLdcInsn(constantDynamic);
    }

    public void checkcast(Type type) {
        this.mv.visitTypeInsn(192, type.getInternalName());
    }

    public void cmpg(Type type) {
        this.mv.visitInsn(type == Type.FLOAT_TYPE ? 150 : Opcodes.DCMPG);
    }

    public void cmpl(Type type) {
        this.mv.visitInsn(type == Type.FLOAT_TYPE ? Opcodes.FCMPL : Opcodes.DCMPL);
    }

    public void dconst(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        if (jDoubleToLongBits == 0 || jDoubleToLongBits == 4607182418800017408L) {
            this.mv.visitInsn(((int) d10) + 14);
        } else {
            this.mv.visitLdcInsn(Double.valueOf(d10));
        }
    }

    public void div(Type type) {
        this.mv.visitInsn(type.getOpcode(108));
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

    public void fconst(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10);
        if (iFloatToIntBits == 0 || iFloatToIntBits == 1065353216 || iFloatToIntBits == 1073741824) {
            this.mv.visitInsn(((int) f10) + 11);
        } else {
            this.mv.visitLdcInsn(Float.valueOf(f10));
        }
    }

    public void getfield(String str, String str2, String str3) {
        this.mv.visitFieldInsn(Opcodes.GETFIELD, str, str2, str3);
    }

    public void getstatic(String str, String str2, String str3) {
        this.mv.visitFieldInsn(178, str, str2, str3);
    }

    public void goTo(Label label) {
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    public void hconst(Handle handle) {
        this.mv.visitLdcInsn(handle);
    }

    public void iconst(int i10) {
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

    public void ifacmpeq(Label label) {
        this.mv.visitJumpInsn(165, label);
    }

    public void ifacmpne(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ACMPNE, label);
    }

    public void ifeq(Label label) {
        this.mv.visitJumpInsn(153, label);
    }

    public void ifge(Label label) {
        this.mv.visitJumpInsn(156, label);
    }

    public void ifgt(Label label) {
        this.mv.visitJumpInsn(157, label);
    }

    public void ificmpeq(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPEQ, label);
    }

    public void ificmpge(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPGE, label);
    }

    public void ificmpgt(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPGT, label);
    }

    public void ificmple(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPLE, label);
    }

    public void ificmplt(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPLT, label);
    }

    public void ificmpne(Label label) {
        this.mv.visitJumpInsn(160, label);
    }

    public void ifle(Label label) {
        this.mv.visitJumpInsn(158, label);
    }

    public void iflt(Label label) {
        this.mv.visitJumpInsn(155, label);
    }

    public void ifne(Label label) {
        this.mv.visitJumpInsn(154, label);
    }

    public void ifnonnull(Label label) {
        this.mv.visitJumpInsn(199, label);
    }

    public void ifnull(Label label) {
        this.mv.visitJumpInsn(198, label);
    }

    public void iinc(int i10, int i11) {
        this.mv.visitIincInsn(i10, i11);
    }

    public void instanceOf(Type type) {
        this.mv.visitTypeInsn(193, type.getInternalName());
    }

    public void invokedynamic(String str, String str2, Handle handle, Object[] objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    public void invokeinterface(String str, String str2, String str3) {
        this.mv.visitMethodInsn(Opcodes.INVOKEINTERFACE, str, str2, str3, true);
    }

    @Deprecated
    public void invokespecial(String str, String str2, String str3) {
        if (this.api >= 327680) {
            invokespecial(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, str, str2, str3, false);
        }
    }

    @Deprecated
    public void invokestatic(String str, String str2, String str3) {
        if (this.api >= 327680) {
            invokestatic(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKESTATIC, str, str2, str3, false);
        }
    }

    @Deprecated
    public void invokevirtual(String str, String str2, String str3) {
        if (this.api >= 327680) {
            invokevirtual(str, str2, str3, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, str2, str3);
        }
    }

    public void jsr(Label label) {
        this.mv.visitJumpInsn(Opcodes.JSR, label);
    }

    public void lcmp() {
        this.mv.visitInsn(Opcodes.LCMP);
    }

    public void lconst(long j10) {
        if (j10 == 0 || j10 == 1) {
            this.mv.visitInsn(((int) j10) + 9);
        } else {
            this.mv.visitLdcInsn(Long.valueOf(j10));
        }
    }

    public void load(int i10, Type type) {
        this.mv.visitVarInsn(type.getOpcode(21), i10);
    }

    public void lookupswitch(Label label, int[] iArr, Label[] labelArr) {
        this.mv.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    public void mark(Label label) {
        this.mv.visitLabel(label);
    }

    public void monitorenter() {
        this.mv.visitInsn(194);
    }

    public void monitorexit() {
        this.mv.visitInsn(195);
    }

    public void mul(Type type) {
        this.mv.visitInsn(type.getOpcode(104));
    }

    public void multianewarray(String str, int i10) {
        this.mv.visitMultiANewArrayInsn(str, i10);
    }

    public void neg(Type type) {
        this.mv.visitInsn(type.getOpcode(116));
    }

    public void newarray(Type type) {
        newarray(this.mv, type);
    }

    public void nop() {
        this.mv.visitInsn(0);
    }

    public void or(Type type) {
        this.mv.visitInsn(type.getOpcode(128));
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void putfield(String str, String str2, String str3) {
        this.mv.visitFieldInsn(Opcodes.PUTFIELD, str, str2, str3);
    }

    public void putstatic(String str, String str2, String str3) {
        this.mv.visitFieldInsn(Opcodes.PUTSTATIC, str, str2, str3);
    }

    public void rem(Type type) {
        this.mv.visitInsn(type.getOpcode(112));
    }

    public void ret(int i10) {
        this.mv.visitVarInsn(Opcodes.RET, i10);
    }

    public void shl(Type type) {
        this.mv.visitInsn(type.getOpcode(120));
    }

    public void shr(Type type) {
        this.mv.visitInsn(type.getOpcode(122));
    }

    public void store(int i10, Type type) {
        this.mv.visitVarInsn(type.getOpcode(54), i10);
    }

    public void sub(Type type) {
        this.mv.visitInsn(type.getOpcode(100));
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void tableswitch(int i10, int i11, Label label, Label... labelArr) {
        this.mv.visitTableSwitchInsn(i10, i11, label, labelArr);
    }

    public void tconst(Type type) {
        this.mv.visitLdcInsn(type);
    }

    public void ushr(Type type) {
        this.mv.visitInsn(type.getOpcode(124));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        switch (i10) {
            case 178:
                getstatic(str, str2, str3);
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                putstatic(str, str2, str3);
                return;
            case Opcodes.GETFIELD /* 180 */:
                getfield(str, str2, str3);
                return;
            case Opcodes.PUTFIELD /* 181 */:
                putfield(str, str2, str3);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i10, int i11) {
        iinc(i10, i11);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i10) {
        if (i10 == 190) {
            arraylength();
            return;
        }
        if (i10 == 191) {
            athrow();
            return;
        }
        if (i10 == 194) {
            monitorenter();
            return;
        }
        if (i10 == 195) {
            monitorexit();
            return;
        }
        switch (i10) {
            case 0:
                nop();
                return;
            case 1:
                aconst(null);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                iconst(i10 - 3);
                return;
            case 9:
            case 10:
                lconst(i10 - 9);
                return;
            case 11:
            case 12:
            case 13:
                fconst(i10 - 11);
                return;
            case 14:
            case 15:
                dconst(i10 - 14);
                return;
            default:
                switch (i10) {
                    case 46:
                        aload(Type.INT_TYPE);
                        return;
                    case 47:
                        aload(Type.LONG_TYPE);
                        return;
                    case 48:
                        aload(Type.FLOAT_TYPE);
                        return;
                    case 49:
                        aload(Type.DOUBLE_TYPE);
                        return;
                    case 50:
                        aload(OBJECT_TYPE);
                        return;
                    case 51:
                        aload(Type.BYTE_TYPE);
                        return;
                    case 52:
                        aload(Type.CHAR_TYPE);
                        return;
                    case 53:
                        aload(Type.SHORT_TYPE);
                        return;
                    default:
                        switch (i10) {
                            case 79:
                                astore(Type.INT_TYPE);
                                return;
                            case 80:
                                astore(Type.LONG_TYPE);
                                return;
                            case 81:
                                astore(Type.FLOAT_TYPE);
                                return;
                            case 82:
                                astore(Type.DOUBLE_TYPE);
                                return;
                            case 83:
                                astore(OBJECT_TYPE);
                                return;
                            case 84:
                                astore(Type.BYTE_TYPE);
                                return;
                            case 85:
                                astore(Type.CHAR_TYPE);
                                return;
                            case 86:
                                astore(Type.SHORT_TYPE);
                                return;
                            case 87:
                                pop();
                                return;
                            case 88:
                                pop2();
                                return;
                            case 89:
                                dup();
                                return;
                            case 90:
                                dupX1();
                                return;
                            case 91:
                                dupX2();
                                return;
                            case 92:
                                dup2();
                                return;
                            case 93:
                                dup2X1();
                                return;
                            case 94:
                                dup2X2();
                                return;
                            case 95:
                                swap();
                                return;
                            case 96:
                                add(Type.INT_TYPE);
                                return;
                            case 97:
                                add(Type.LONG_TYPE);
                                return;
                            case 98:
                                add(Type.FLOAT_TYPE);
                                return;
                            case 99:
                                add(Type.DOUBLE_TYPE);
                                return;
                            case 100:
                                sub(Type.INT_TYPE);
                                return;
                            case 101:
                                sub(Type.LONG_TYPE);
                                return;
                            case 102:
                                sub(Type.FLOAT_TYPE);
                                return;
                            case 103:
                                sub(Type.DOUBLE_TYPE);
                                return;
                            case 104:
                                mul(Type.INT_TYPE);
                                return;
                            case 105:
                                mul(Type.LONG_TYPE);
                                return;
                            case 106:
                                mul(Type.FLOAT_TYPE);
                                return;
                            case 107:
                                mul(Type.DOUBLE_TYPE);
                                return;
                            case 108:
                                div(Type.INT_TYPE);
                                return;
                            case 109:
                                div(Type.LONG_TYPE);
                                return;
                            case 110:
                                div(Type.FLOAT_TYPE);
                                return;
                            case 111:
                                div(Type.DOUBLE_TYPE);
                                return;
                            case 112:
                                rem(Type.INT_TYPE);
                                return;
                            case 113:
                                rem(Type.LONG_TYPE);
                                return;
                            case 114:
                                rem(Type.FLOAT_TYPE);
                                return;
                            case 115:
                                rem(Type.DOUBLE_TYPE);
                                return;
                            case 116:
                                neg(Type.INT_TYPE);
                                return;
                            case 117:
                                neg(Type.LONG_TYPE);
                                return;
                            case 118:
                                neg(Type.FLOAT_TYPE);
                                return;
                            case 119:
                                neg(Type.DOUBLE_TYPE);
                                return;
                            case 120:
                                shl(Type.INT_TYPE);
                                return;
                            case 121:
                                shl(Type.LONG_TYPE);
                                return;
                            case 122:
                                shr(Type.INT_TYPE);
                                return;
                            case 123:
                                shr(Type.LONG_TYPE);
                                return;
                            case 124:
                                ushr(Type.INT_TYPE);
                                return;
                            case 125:
                                ushr(Type.LONG_TYPE);
                                return;
                            case 126:
                                and(Type.INT_TYPE);
                                return;
                            case 127:
                                and(Type.LONG_TYPE);
                                return;
                            case 128:
                                or(Type.INT_TYPE);
                                return;
                            case 129:
                                or(Type.LONG_TYPE);
                                return;
                            case 130:
                                xor(Type.INT_TYPE);
                                return;
                            case 131:
                                xor(Type.LONG_TYPE);
                                return;
                            default:
                                switch (i10) {
                                    case Opcodes.I2L /* 133 */:
                                        cast(Type.INT_TYPE, Type.LONG_TYPE);
                                        return;
                                    case 134:
                                        cast(Type.INT_TYPE, Type.FLOAT_TYPE);
                                        return;
                                    case 135:
                                        cast(Type.INT_TYPE, Type.DOUBLE_TYPE);
                                        return;
                                    case Opcodes.L2I /* 136 */:
                                        cast(Type.LONG_TYPE, Type.INT_TYPE);
                                        return;
                                    case Opcodes.L2F /* 137 */:
                                        cast(Type.LONG_TYPE, Type.FLOAT_TYPE);
                                        return;
                                    case 138:
                                        cast(Type.LONG_TYPE, Type.DOUBLE_TYPE);
                                        return;
                                    case Opcodes.F2I /* 139 */:
                                        cast(Type.FLOAT_TYPE, Type.INT_TYPE);
                                        return;
                                    case Opcodes.F2L /* 140 */:
                                        cast(Type.FLOAT_TYPE, Type.LONG_TYPE);
                                        return;
                                    case Opcodes.F2D /* 141 */:
                                        cast(Type.FLOAT_TYPE, Type.DOUBLE_TYPE);
                                        return;
                                    case Opcodes.D2I /* 142 */:
                                        cast(Type.DOUBLE_TYPE, Type.INT_TYPE);
                                        return;
                                    case Opcodes.D2L /* 143 */:
                                        cast(Type.DOUBLE_TYPE, Type.LONG_TYPE);
                                        return;
                                    case Opcodes.D2F /* 144 */:
                                        cast(Type.DOUBLE_TYPE, Type.FLOAT_TYPE);
                                        return;
                                    case Opcodes.I2B /* 145 */:
                                        cast(Type.INT_TYPE, Type.BYTE_TYPE);
                                        return;
                                    case Opcodes.I2C /* 146 */:
                                        cast(Type.INT_TYPE, Type.CHAR_TYPE);
                                        return;
                                    case Opcodes.I2S /* 147 */:
                                        cast(Type.INT_TYPE, Type.SHORT_TYPE);
                                        return;
                                    case Opcodes.LCMP /* 148 */:
                                        lcmp();
                                        return;
                                    case Opcodes.FCMPL /* 149 */:
                                        cmpl(Type.FLOAT_TYPE);
                                        return;
                                    case 150:
                                        cmpg(Type.FLOAT_TYPE);
                                        return;
                                    case Opcodes.DCMPL /* 151 */:
                                        cmpl(Type.DOUBLE_TYPE);
                                        return;
                                    case Opcodes.DCMPG /* 152 */:
                                        cmpg(Type.DOUBLE_TYPE);
                                        return;
                                    default:
                                        switch (i10) {
                                            case Opcodes.IRETURN /* 172 */:
                                                areturn(Type.INT_TYPE);
                                                return;
                                            case Opcodes.LRETURN /* 173 */:
                                                areturn(Type.LONG_TYPE);
                                                return;
                                            case Opcodes.FRETURN /* 174 */:
                                                areturn(Type.FLOAT_TYPE);
                                                return;
                                            case Opcodes.DRETURN /* 175 */:
                                                areturn(Type.DOUBLE_TYPE);
                                                return;
                                            case Opcodes.ARETURN /* 176 */:
                                                areturn(OBJECT_TYPE);
                                                return;
                                            case Opcodes.RETURN /* 177 */:
                                                areturn(Type.VOID_TYPE);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                        }
                }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i10, int i11) {
        if (i10 == 16) {
            iconst(i11);
            return;
        }
        if (i10 == 17) {
            iconst(i11);
            return;
        }
        if (i10 != 188) {
            throw new IllegalArgumentException();
        }
        switch (i11) {
            case 4:
                newarray(Type.BOOLEAN_TYPE);
                return;
            case 5:
                newarray(Type.CHAR_TYPE);
                return;
            case 6:
                newarray(Type.FLOAT_TYPE);
                return;
            case 7:
                newarray(Type.DOUBLE_TYPE);
                return;
            case 8:
                newarray(Type.BYTE_TYPE);
                return;
            case 9:
                newarray(Type.SHORT_TYPE);
                return;
            case 10:
                newarray(Type.INT_TYPE);
                return;
            case 11:
                newarray(Type.LONG_TYPE);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        invokedynamic(str, str2, handle, objArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i10, Label label) {
        if (i10 == 198) {
            ifnull(label);
            return;
        }
        if (i10 == 199) {
            ifnonnull(label);
            return;
        }
        switch (i10) {
            case 153:
                ifeq(label);
                return;
            case 154:
                ifne(label);
                return;
            case 155:
                iflt(label);
                return;
            case 156:
                ifge(label);
                return;
            case 157:
                ifgt(label);
                return;
            case 158:
                ifle(label);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                ificmpeq(label);
                return;
            case 160:
                ificmpne(label);
                return;
            case Opcodes.IF_ICMPLT /* 161 */:
                ificmplt(label);
                return;
            case Opcodes.IF_ICMPGE /* 162 */:
                ificmpge(label);
                return;
            case Opcodes.IF_ICMPGT /* 163 */:
                ificmpgt(label);
                return;
            case Opcodes.IF_ICMPLE /* 164 */:
                ificmple(label);
                return;
            case 165:
                ifacmpeq(label);
                return;
            case Opcodes.IF_ACMPNE /* 166 */:
                ifacmpne(label);
                return;
            case Opcodes.GOTO /* 167 */:
                goTo(label);
                return;
            case Opcodes.JSR /* 168 */:
                jsr(label);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        mark(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        if (this.api < 327680 && ((obj instanceof Handle) || ((obj instanceof Type) && ((Type) obj).getSort() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.api < 458752 && (obj instanceof ConstantDynamic)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        if (obj instanceof Integer) {
            iconst(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Byte) {
            iconst(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof Character) {
            iconst(((Character) obj).charValue());
            return;
        }
        if (obj instanceof Short) {
            iconst(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            iconst(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof Float) {
            fconst(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            lconst(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            dconst(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            aconst(obj);
            return;
        }
        if (obj instanceof Type) {
            tconst((Type) obj);
        } else if (obj instanceof Handle) {
            hconst((Handle) obj);
        } else {
            if (!(obj instanceof ConstantDynamic)) {
                throw new IllegalArgumentException();
            }
            cconst((ConstantDynamic) obj);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        lookupswitch(label, iArr, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        if (this.api < 327680 && (i10 & 256) == 0) {
            super.visitMethodInsn(i10, str, str2, str3, z10);
            return;
        }
        switch (i10 & (-257)) {
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                invokevirtual(str, str2, str3, z10);
                return;
            case Opcodes.INVOKESPECIAL /* 183 */:
                invokespecial(str, str2, str3, z10);
                return;
            case Opcodes.INVOKESTATIC /* 184 */:
                invokestatic(str, str2, str3, z10);
                return;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                invokeinterface(str, str2, str3);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i10) {
        multianewarray(str, i10);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        tableswitch(i10, i11, label, labelArr);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i10, String str) {
        Type objectType = Type.getObjectType(str);
        if (i10 == 187) {
            anew(objectType);
            return;
        }
        if (i10 == 189) {
            newarray(objectType);
        } else if (i10 == 192) {
            checkcast(objectType);
        } else {
            if (i10 != 193) {
                throw new IllegalArgumentException();
            }
            instanceOf(objectType);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i10, int i11) {
        if (i10 == 169) {
            ret(i11);
            return;
        }
        switch (i10) {
            case 21:
                load(i11, Type.INT_TYPE);
                return;
            case 22:
                load(i11, Type.LONG_TYPE);
                return;
            case 23:
                load(i11, Type.FLOAT_TYPE);
                return;
            case 24:
                load(i11, Type.DOUBLE_TYPE);
                return;
            case 25:
                load(i11, OBJECT_TYPE);
                return;
            default:
                switch (i10) {
                    case 54:
                        store(i11, Type.INT_TYPE);
                        return;
                    case 55:
                        store(i11, Type.LONG_TYPE);
                        return;
                    case 56:
                        store(i11, Type.FLOAT_TYPE);
                        return;
                    case 57:
                        store(i11, Type.DOUBLE_TYPE);
                        return;
                    case 58:
                        store(i11, OBJECT_TYPE);
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public void xor(Type type) {
        this.mv.visitInsn(type.getOpcode(130));
    }

    public static void cast(MethodVisitor methodVisitor, Type type, Type type2) {
        if (type != type2) {
            Type type3 = Type.DOUBLE_TYPE;
            if (type == type3) {
                if (type2 == Type.FLOAT_TYPE) {
                    methodVisitor.visitInsn(Opcodes.D2F);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    methodVisitor.visitInsn(Opcodes.D2L);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.D2I);
                    cast(methodVisitor, Type.INT_TYPE, type2);
                    return;
                }
            }
            Type type4 = Type.FLOAT_TYPE;
            if (type == type4) {
                if (type2 == type3) {
                    methodVisitor.visitInsn(Opcodes.F2D);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    methodVisitor.visitInsn(Opcodes.F2L);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.F2I);
                    cast(methodVisitor, Type.INT_TYPE, type2);
                    return;
                }
            }
            Type type5 = Type.LONG_TYPE;
            if (type == type5) {
                if (type2 == type3) {
                    methodVisitor.visitInsn(138);
                    return;
                } else if (type2 == type4) {
                    methodVisitor.visitInsn(Opcodes.L2F);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.L2I);
                    cast(methodVisitor, Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type2 == Type.BYTE_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2B);
                return;
            }
            if (type2 == Type.CHAR_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2C);
                return;
            }
            if (type2 == type3) {
                methodVisitor.visitInsn(135);
                return;
            }
            if (type2 == type4) {
                methodVisitor.visitInsn(134);
            } else if (type2 == type5) {
                methodVisitor.visitInsn(Opcodes.I2L);
            } else if (type2 == Type.SHORT_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2S);
            }
        }
    }

    public static void newarray(MethodVisitor methodVisitor, Type type) {
        int i10;
        switch (type.getSort()) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 5;
                break;
            case 3:
                i10 = 8;
                break;
            case 4:
                i10 = 9;
                break;
            case 5:
                i10 = 10;
                break;
            case 6:
                i10 = 6;
                break;
            case 7:
                i10 = 11;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                methodVisitor.visitTypeInsn(189, type.getInternalName());
                return;
        }
        methodVisitor.visitIntInsn(Opcodes.NEWARRAY, i10);
    }

    public InstructionAdapter(int i10, MethodVisitor methodVisitor) {
        super(i10, methodVisitor);
    }

    public void invokespecial(String str, String str2, String str3, boolean z10) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, str, str2, str3, z10);
        } else {
            if (!z10) {
                invokespecial(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("INVOKESPECIAL on interfaces require ASM 5");
        }
    }

    public void invokestatic(String str, String str2, String str3, boolean z10) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(Opcodes.INVOKESTATIC, str, str2, str3, z10);
        } else {
            if (!z10) {
                invokestatic(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("INVOKESTATIC on interfaces require ASM 5");
        }
    }

    public void invokevirtual(String str, String str2, String str3, boolean z10) {
        if (this.api >= 327680) {
            this.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, str2, str3, z10);
        } else {
            if (!z10) {
                invokevirtual(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("INVOKEVIRTUAL on interfaces require ASM 5");
        }
    }
}
