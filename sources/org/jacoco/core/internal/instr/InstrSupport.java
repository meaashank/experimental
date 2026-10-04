package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes6.dex */
public final class InstrSupport {
    public static final int ASM_API_VERSION = 589824;
    static final int CLINIT_ACC = 4104;
    static final String CLINIT_DESC = "()V";
    static final String CLINIT_NAME = "<clinit>";
    public static final int DATAFIELD_ACC = 4234;
    public static final String DATAFIELD_DESC = "[Z";
    public static final int DATAFIELD_INTF_ACC = 4121;
    public static final String DATAFIELD_NAME = "$jacocoData";
    public static final int INITMETHOD_ACC = 4106;
    public static final String INITMETHOD_DESC = "()[Z";
    public static final String INITMETHOD_NAME = "$jacocoInit";

    private InstrSupport() {
    }

    public static void assertNotInstrumented(String str, String str2) throws IllegalStateException {
        if (str.equals(DATAFIELD_NAME) || str.equals(INITMETHOD_NAME)) {
            throw new IllegalStateException(String.format("Cannot process instrumented class %s. Please supply original non-instrumented classes.", str2));
        }
    }

    public static ClassReader classReaderFor(byte[] bArr) {
        int majorVersion = getMajorVersion(bArr);
        if (majorVersion == 63) {
            setMajorVersion(62, bArr);
        }
        ClassReader classReader = new ClassReader(bArr);
        setMajorVersion(majorVersion, bArr);
        return classReader;
    }

    public static int getMajorVersion(byte[] bArr) {
        return (bArr[7] & 255) | ((bArr[6] & 255) << 8);
    }

    public static boolean needsFrames(int i10) {
        return (i10 & 65535) >= 50;
    }

    public static void push(MethodVisitor methodVisitor, int i10) {
        if (i10 >= -1 && i10 <= 5) {
            methodVisitor.visitInsn(i10 + 3);
            return;
        }
        if (i10 >= -128 && i10 <= 127) {
            methodVisitor.visitIntInsn(16, i10);
        } else if (i10 < -32768 || i10 > 32767) {
            methodVisitor.visitLdcInsn(Integer.valueOf(i10));
        } else {
            methodVisitor.visitIntInsn(17, i10);
        }
    }

    public static void setMajorVersion(int i10, byte[] bArr) {
        bArr[6] = (byte) (i10 >>> 8);
        bArr[7] = (byte) i10;
    }

    public static int getMajorVersion(ClassReader classReader) {
        return classReader.readUnsignedShort(classReader.getItem(1) - 5);
    }
}
