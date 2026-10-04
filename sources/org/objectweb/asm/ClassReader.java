package org.objectweb.asm;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.h0;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes8.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public final byte[] f226148b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private static int calculateBufferSize(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 256) {
            return 4096;
        }
        return Math.min(iAvailable, 1048576);
    }

    private void computeImplicitFrame(Context context) {
        int i10;
        String str = context.currentMethodDescriptor;
        Object[] objArr = context.currentFrameLocalTypes;
        int i11 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if ("<init>".equals(context.currentMethodName)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
            }
            i11 = 1;
        }
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt = str.charAt(i12);
            if (cCharAt == 'F') {
                i10 = i11 + 1;
                objArr[i11] = Opcodes.FLOAT;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i10 = i11 + 1;
                        objArr[i11] = Opcodes.LONG;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i10 = i11 + 1;
                                    objArr[i11] = Opcodes.DOUBLE;
                                    break;
                                default:
                                    context.currentFrameLocalCount = i11;
                                    return;
                            }
                        } else {
                            while (str.charAt(i13) == '[') {
                                i13++;
                            }
                            if (str.charAt(i13) == 'L') {
                                do {
                                    i13++;
                                } while (str.charAt(i13) != ';');
                            }
                            int i14 = i13 + 1;
                            objArr[i11] = str.substring(i12, i14);
                            i12 = i14;
                            i11++;
                        }
                    }
                }
                i10 = i11 + 1;
                objArr[i11] = Opcodes.INTEGER;
            } else {
                int i15 = i13;
                while (str.charAt(i15) != ';') {
                    i15++;
                }
                objArr[i11] = str.substring(i13, i15);
                i11++;
                i12 = i15 + 1;
            }
            i11 = i10;
            i12 = i13;
        }
    }

    private void createDebugLabel(int i10, Label[] labelArr) {
        if (labelArr[i10] == null) {
            Label label = readLabel(i10, labelArr);
            label.flags = (short) (label.flags | 1);
        }
    }

    private Label createLabel(int i10, Label[] labelArr) {
        Label label = readLabel(i10, labelArr);
        label.flags = (short) (label.flags & (-2));
        return label;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i10) {
        if (iArr == null || i10 >= iArr.length || readByte(iArr[i10]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i10] + 1);
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i10, int i11, char[] cArr, int i12, Label[] labelArr) {
        for (Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i10, i11, cArr, i12, labelArr);
            }
        }
        return new Attribute(str).read(this, i10, i11, null, -1, null);
    }

    private int[] readBootstrapMethodsAttribute(int i10) {
        char[] cArr = new char[i10];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int unsignedShort = readUnsignedShort(firstAttributeOffset - 2); unsignedShort > 0; unsignedShort--) {
            String utf8 = readUTF8(firstAttributeOffset, cArr);
            int i11 = readInt(firstAttributeOffset + 2);
            int i12 = firstAttributeOffset + 6;
            if ("BootstrapMethods".equals(utf8)) {
                int unsignedShort2 = readUnsignedShort(i12);
                int[] iArr = new int[unsignedShort2];
                int unsignedShort3 = firstAttributeOffset + 8;
                for (int i13 = 0; i13 < unsignedShort2; i13++) {
                    iArr[i13] = unsignedShort3;
                    unsignedShort3 += (readUnsignedShort(unsignedShort3 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i12 + i11;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readCode(org.objectweb.asm.MethodVisitor r40, org.objectweb.asm.Context r41, int r42) {
        /*
            Method dump skipped, instruction units count: 3126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readCode(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int):void");
    }

    private ConstantDynamic readConstantDynamic(int i10, char[] cArr) {
        ConstantDynamic constantDynamic = this.constantDynamicValues[i10];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i11 = iArr[i10];
        int i12 = iArr[readUnsignedShort(i11 + 2)];
        String utf8 = readUTF8(i12, cArr);
        String utf82 = readUTF8(i12 + 2, cArr);
        int i13 = this.bootstrapMethodOffsets[readUnsignedShort(i11)];
        Handle handle = (Handle) readConst(readUnsignedShort(i13), cArr);
        int unsignedShort = readUnsignedShort(i13 + 2);
        Object[] objArr = new Object[unsignedShort];
        int i14 = i13 + 4;
        for (int i15 = 0; i15 < unsignedShort; i15++) {
            objArr[i15] = readConst(readUnsignedShort(i14), cArr);
            i14 += 2;
        }
        ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        ConstantDynamic constantDynamic2 = new ConstantDynamic(utf8, utf82, handle, objArr);
        constantDynamicArr[i10] = constantDynamic2;
        return constantDynamic2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i10, String str, char[] cArr) {
        int i11 = 0;
        if (annotationVisitor == null) {
            int i12 = this.classFileBuffer[i10] & 255;
            return i12 != 64 ? i12 != 91 ? i12 != 101 ? i10 + 3 : i10 + 5 : readElementValues(null, i10 + 1, false, cArr) : readElementValues(null, i10 + 3, true, cArr);
        }
        int i13 = i10 + 1;
        int i14 = this.classFileBuffer[i10] & 255;
        if (i14 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i13, cArr)), i10 + 3, true, cArr);
        }
        if (i14 != 70) {
            if (i14 == 83) {
                annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i13)])));
                return i10 + 3;
            }
            if (i14 == 99) {
                annotationVisitor.visit(str, Type.getType(readUTF8(i13, cArr)));
                return i10 + 3;
            }
            if (i14 == 101) {
                annotationVisitor.visitEnum(str, readUTF8(i13, cArr), readUTF8(i10 + 3, cArr));
                return i10 + 5;
            }
            if (i14 == 115) {
                annotationVisitor.visit(str, readUTF8(i13, cArr));
                return i10 + 3;
            }
            if (i14 != 73 && i14 != 74) {
                if (i14 == 90) {
                    annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i13)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i10 + 3;
                }
                if (i14 == 91) {
                    int unsignedShort = readUnsignedShort(i13);
                    int i15 = i10 + 3;
                    if (unsignedShort == 0) {
                        return readElementValues(annotationVisitor.visitArray(str), i10 + 1, false, cArr);
                    }
                    int i16 = this.classFileBuffer[i15] & 255;
                    if (i16 == 70) {
                        float[] fArr = new float[unsignedShort];
                        while (i11 < unsignedShort) {
                            fArr[i11] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]));
                            i15 += 3;
                            i11++;
                        }
                        annotationVisitor.visit(str, fArr);
                        return i15;
                    }
                    if (i16 == 83) {
                        short[] sArr = new short[unsignedShort];
                        while (i11 < unsignedShort) {
                            sArr[i11] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]);
                            i15 += 3;
                            i11++;
                        }
                        annotationVisitor.visit(str, sArr);
                        return i15;
                    }
                    if (i16 == 90) {
                        boolean[] zArr = new boolean[unsignedShort];
                        for (int i17 = 0; i17 < unsignedShort; i17++) {
                            zArr[i17] = readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]) != 0;
                            i15 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                        return i15;
                    }
                    if (i16 == 73) {
                        int[] iArr = new int[unsignedShort];
                        while (i11 < unsignedShort) {
                            iArr[i11] = readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]);
                            i15 += 3;
                            i11++;
                        }
                        annotationVisitor.visit(str, iArr);
                        return i15;
                    }
                    if (i16 == 74) {
                        long[] jArr = new long[unsignedShort];
                        while (i11 < unsignedShort) {
                            jArr[i11] = readLong(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]);
                            i15 += 3;
                            i11++;
                        }
                        annotationVisitor.visit(str, jArr);
                        return i15;
                    }
                    switch (i16) {
                        case 66:
                            byte[] bArr = new byte[unsignedShort];
                            while (i11 < unsignedShort) {
                                bArr[i11] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]);
                                i15 += 3;
                                i11++;
                            }
                            annotationVisitor.visit(str, bArr);
                            return i15;
                        case 67:
                            char[] cArr2 = new char[unsignedShort];
                            while (i11 < unsignedShort) {
                                cArr2[i11] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]);
                                i15 += 3;
                                i11++;
                            }
                            annotationVisitor.visit(str, cArr2);
                            return i15;
                        case 68:
                            double[] dArr = new double[unsignedShort];
                            while (i11 < unsignedShort) {
                                dArr[i11] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i15 + 1)]));
                                i15 += 3;
                                i11++;
                            }
                            annotationVisitor.visit(str, dArr);
                            return i15;
                        default:
                            return readElementValues(annotationVisitor.visitArray(str), i10 + 1, false, cArr);
                    }
                }
                switch (i14) {
                    case 66:
                        annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i13)])));
                        return i10 + 3;
                    case 67:
                        annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i13)])));
                        return i10 + 3;
                    case 68:
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        annotationVisitor.visit(str, readConst(readUnsignedShort(i13), cArr));
        return i10 + 3;
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i10, boolean z10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        int elementValue = i10 + 2;
        if (!z10) {
            while (true) {
                int i11 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue, null, cArr);
                unsignedShort = i11;
            }
        } else {
            while (true) {
                int i12 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue + 2, readUTF8(elementValue, cArr), cArr);
                unsignedShort = i12;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return elementValue;
    }

    private int readField(ClassVisitor classVisitor, Context context, int i10) {
        int i11;
        int i12;
        int i13;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int unsignedShort = readUnsignedShort(i10);
        String utf8 = readUTF8(i10 + 2, cArr);
        String utf82 = readUTF8(i10 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i10 + 6);
        int i14 = i10 + 8;
        int i15 = unsignedShort;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        String utf83 = null;
        Object obj = null;
        Attribute attribute = null;
        while (true) {
            int i20 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            int i21 = i16;
            String utf84 = readUTF8(i14, cArr);
            int i22 = readInt(i14 + 2);
            int i23 = i14 + 6;
            if ("ConstantValue".equals(utf84)) {
                int unsignedShort3 = readUnsignedShort(i23);
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
            } else if ("Signature".equals(utf84)) {
                utf83 = readUTF8(i23, cArr);
            } else {
                if ("Deprecated".equals(utf84)) {
                    i13 = 131072 | i15;
                } else if ("Synthetic".equals(utf84)) {
                    i13 = i15 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(utf84)) {
                        i16 = i23;
                        i11 = i16;
                        i23 = i17;
                        i12 = i22;
                    } else {
                        if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                            i11 = i23;
                            i18 = i11;
                        } else if ("RuntimeInvisibleAnnotations".equals(utf84)) {
                            i11 = i23;
                            i12 = i22;
                            i16 = i21;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                            i11 = i23;
                            i19 = i11;
                        } else {
                            i11 = i23;
                            int i24 = i17;
                            i12 = i22;
                            Attribute attribute2 = readAttribute(context2.attributePrototypes, utf84, i11, i12, cArr, -1, null);
                            attribute2.nextAttribute = attribute;
                            attribute = attribute2;
                            i18 = i18;
                            i23 = i24;
                            i16 = i21;
                            i19 = i19;
                        }
                        i23 = i17;
                        i12 = i22;
                        i16 = i21;
                    }
                    int i25 = i11 + i12;
                    context2 = context;
                    i17 = i23;
                    i14 = i25;
                    unsignedShort2 = i20;
                }
                i11 = i23;
                i15 = i13;
                i23 = i17;
                i12 = i22;
                i16 = i21;
                int i252 = i11 + i12;
                context2 = context;
                i17 = i23;
                i14 = i252;
                unsignedShort2 = i20;
            }
            i11 = i23;
            i23 = i17;
            i12 = i22;
            i16 = i21;
            int i2522 = i11 + i12;
            context2 = context;
            i17 = i23;
            i14 = i2522;
            unsignedShort2 = i20;
        }
        int i26 = i16;
        int i27 = i17;
        int i28 = i18;
        int i29 = i19;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i15, utf8, utf82, utf83, obj);
        if (fieldVisitorVisitField == null) {
            return i14;
        }
        if (i26 != 0) {
            int unsignedShort4 = readUnsignedShort(i26);
            int elementValues = i26 + 2;
            while (true) {
                int i30 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i30;
            }
        }
        if (i27 != 0) {
            int unsignedShort5 = readUnsignedShort(i27);
            int elementValues2 = i27 + 2;
            while (true) {
                int i31 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i31;
            }
        }
        if (i28 != 0) {
            int unsignedShort6 = readUnsignedShort(i28);
            int elementValues3 = i28 + 2;
            while (true) {
                int i32 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i32;
            }
        }
        if (i29 != 0) {
            int unsignedShort7 = readUnsignedShort(i29);
            int elementValues4 = i29 + 2;
            while (true) {
                int i33 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i33;
            }
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            fieldVisitorVisitField.visitAttribute(attribute);
            attribute = attribute3;
        }
        fieldVisitorVisitField.visitEnd();
        return i14;
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i10) {
        int i11;
        char[] cArr;
        int i12;
        int i13;
        int i14;
        char[] cArr2;
        ClassReader classReader = this;
        char[] cArr3 = context.charBuffer;
        context.currentMethodAccessFlags = classReader.readUnsignedShort(i10);
        context.currentMethodName = classReader.readUTF8(i10 + 2, cArr3);
        int i15 = i10 + 4;
        context.currentMethodDescriptor = classReader.readUTF8(i15, cArr3);
        int unsignedShort = classReader.readUnsignedShort(i10 + 6);
        int i16 = i10 + 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        Attribute attribute = null;
        int unsignedShort2 = 0;
        int i21 = 0;
        int i22 = 0;
        String[] strArr = null;
        boolean z10 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            int i27 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            int i28 = i17;
            String utf8 = classReader.readUTF8(i16, cArr3);
            int i29 = classReader.readInt(i16 + 2);
            int i30 = i18;
            int i31 = i16 + 6;
            int i32 = i28;
            if ("Code".equals(utf8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i26 = i31;
                }
            } else if ("Exceptions".equals(utf8)) {
                int unsignedShort3 = classReader.readUnsignedShort(i31);
                int i33 = i16 + 8;
                strArr = new String[unsignedShort3];
                for (int i34 = 0; i34 < unsignedShort3; i34++) {
                    strArr[i34] = classReader.readClass(i33, cArr3);
                    i33 += 2;
                }
                i23 = i31;
            } else if ("Signature".equals(utf8)) {
                unsignedShort2 = classReader.readUnsignedShort(i31);
            } else if ("Deprecated".equals(utf8)) {
                context.currentMethodAccessFlags |= 131072;
            } else if ("RuntimeVisibleAnnotations".equals(utf8)) {
                i32 = i31;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                i13 = i31;
                cArr2 = cArr3;
                i14 = i29;
                i16 = i31 + i14;
                cArr3 = cArr2;
                unsignedShort = i27;
                i18 = i30;
                i17 = i32;
                i19 = i13;
            } else if ("AnnotationDefault".equals(utf8)) {
                i22 = i31;
            } else {
                if ("Synthetic".equals(utf8)) {
                    context.currentMethodAccessFlags |= 4096;
                    i13 = i19;
                    cArr2 = cArr3;
                    i14 = i29;
                    z10 = true;
                } else if ("RuntimeInvisibleAnnotations".equals(utf8)) {
                    i30 = i31;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                    i20 = i31;
                } else if ("RuntimeVisibleParameterAnnotations".equals(utf8)) {
                    i24 = i31;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(utf8)) {
                    i25 = i31;
                } else if ("MethodParameters".equals(utf8)) {
                    i21 = i31;
                } else {
                    i13 = i19;
                    i14 = i29;
                    Attribute attribute2 = classReader.readAttribute(context.attributePrototypes, utf8, i31, i14, cArr3, -1, null);
                    cArr2 = cArr3;
                    attribute2.nextAttribute = attribute;
                    attribute = attribute2;
                    i20 = i20;
                }
                i16 = i31 + i14;
                cArr3 = cArr2;
                unsignedShort = i27;
                i18 = i30;
                i17 = i32;
                i19 = i13;
            }
            i13 = i19;
            cArr2 = cArr3;
            i14 = i29;
            i16 = i31 + i14;
            cArr3 = cArr2;
            unsignedShort = i27;
            i18 = i30;
            i17 = i32;
            i19 = i13;
        }
        int i35 = i17;
        int i36 = i18;
        int i37 = i19;
        char[] cArr4 = cArr3;
        int i38 = i20;
        int i39 = i22;
        int i40 = i21;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, unsignedShort2 == 0 ? null : classReader.readUtf(unsignedShort2, cArr4), strArr);
        if (methodVisitorVisitMethod == null) {
            return i16;
        }
        if (methodVisitorVisitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) methodVisitorVisitMethod;
            i12 = i39;
            boolean z11 = (context.currentMethodAccessFlags & 131072) != 0;
            int unsignedShort4 = classReader.readUnsignedShort(i15);
            int i41 = unsignedShort2;
            i11 = i40;
            cArr = cArr4;
            boolean zCanCopyMethodAttributes = methodWriter.canCopyMethodAttributes(classReader, z10, z11, unsignedShort4, i41, i23);
            classReader = classReader;
            if (zCanCopyMethodAttributes) {
                methodWriter.setMethodAttributesSource(i10, i16 - i10);
                return i16;
            }
        } else {
            i11 = i40;
            cArr = cArr4;
            i12 = i39;
        }
        if (i11 != 0 && (context.parsingOptions & 2) == 0) {
            int i42 = classReader.readByte(i11);
            int i43 = i11 + 1;
            while (true) {
                int i44 = i42 - 1;
                if (i42 <= 0) {
                    break;
                }
                methodVisitorVisitMethod.visitParameter(classReader.readUTF8(i43, cArr), classReader.readUnsignedShort(i43 + 2));
                i43 += 4;
                i42 = i44;
            }
        }
        if (i12 != 0) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
            classReader.readElementValue(annotationVisitorVisitAnnotationDefault, i12, null, cArr);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        if (i35 != 0) {
            int unsignedShort5 = classReader.readUnsignedShort(i35);
            int elementValues = i35 + 2;
            while (true) {
                int i45 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = classReader.readElementValues(methodVisitorVisitMethod.visitAnnotation(classReader.readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i45;
            }
        }
        if (i36 != 0) {
            int unsignedShort6 = classReader.readUnsignedShort(i36);
            int elementValues2 = i36 + 2;
            while (true) {
                int i46 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = classReader.readElementValues(methodVisitorVisitMethod.visitAnnotation(classReader.readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i46;
            }
        }
        if (i37 != 0) {
            int unsignedShort7 = classReader.readUnsignedShort(i37);
            int elementValues3 = i37 + 2;
            while (true) {
                int i47 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = classReader.readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = classReader.readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i47;
            }
        }
        if (i38 != 0) {
            int unsignedShort8 = classReader.readUnsignedShort(i38);
            int elementValues4 = i38 + 2;
            while (true) {
                int i48 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = classReader.readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i48;
            }
        }
        int i49 = i24;
        if (i49 != 0) {
            classReader.readParameterAnnotations(methodVisitorVisitMethod, context, i49, true);
        }
        int i50 = i25;
        if (i50 != 0) {
            classReader.readParameterAnnotations(methodVisitorVisitMethod, context, i50, false);
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            methodVisitorVisitMethod.visitAttribute(attribute);
            attribute = attribute3;
        }
        int i51 = i26;
        if (i51 != 0) {
            methodVisitorVisitMethod.visitCode();
            classReader.readCode(methodVisitorVisitMethod, context, i51);
        }
        methodVisitorVisitMethod.visitEnd();
        return i16;
    }

    private void readModuleAttributes(ClassVisitor classVisitor, Context context, int i10, int i11, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i12 = i10 + 6;
        ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(readModule(i10, cArr), readUnsignedShort(i10 + 2), readUTF8(i10 + 4, cArr));
        if (moduleVisitorVisitModule == null) {
            return;
        }
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        if (i11 != 0) {
            int unsignedShort = readUnsignedShort(i11);
            int i13 = i11 + 2;
            while (true) {
                int i14 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                moduleVisitorVisitModule.visitPackage(readPackage(i13, cArr));
                i13 += 2;
                unsignedShort = i14;
            }
        }
        int unsignedShort2 = readUnsignedShort(i12);
        int i15 = i10 + 8;
        while (true) {
            int i16 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            String module = readModule(i15, cArr);
            int unsignedShort3 = readUnsignedShort(i15 + 2);
            String utf8 = readUTF8(i15 + 4, cArr);
            i15 += 6;
            moduleVisitorVisitModule.visitRequire(module, unsignedShort3, utf8);
            unsignedShort2 = i16;
        }
        int unsignedShort4 = readUnsignedShort(i15);
        int i17 = i15 + 2;
        while (true) {
            int i18 = unsignedShort4 - 1;
            String[] strArr2 = null;
            if (unsignedShort4 <= 0) {
                break;
            }
            String str2 = readPackage(i17, cArr);
            int unsignedShort5 = readUnsignedShort(i17 + 2);
            int unsignedShort6 = readUnsignedShort(i17 + 4);
            i17 += 6;
            if (unsignedShort6 != 0) {
                strArr2 = new String[unsignedShort6];
                for (int i19 = 0; i19 < unsignedShort6; i19++) {
                    strArr2[i19] = readModule(i17, cArr);
                    i17 += 2;
                }
            }
            moduleVisitorVisitModule.visitExport(str2, unsignedShort5, strArr2);
            unsignedShort4 = i18;
        }
        int unsignedShort7 = readUnsignedShort(i17);
        int i20 = i17 + 2;
        while (true) {
            int i21 = unsignedShort7 - 1;
            if (unsignedShort7 <= 0) {
                break;
            }
            String str3 = readPackage(i20, cArr);
            int unsignedShort8 = readUnsignedShort(i20 + 2);
            int unsignedShort9 = readUnsignedShort(i20 + 4);
            i20 += 6;
            if (unsignedShort9 != 0) {
                strArr = new String[unsignedShort9];
                for (int i22 = 0; i22 < unsignedShort9; i22++) {
                    strArr[i22] = readModule(i20, cArr);
                    i20 += 2;
                }
            } else {
                strArr = null;
            }
            moduleVisitorVisitModule.visitOpen(str3, unsignedShort8, strArr);
            unsignedShort7 = i21;
        }
        int unsignedShort10 = readUnsignedShort(i20);
        int i23 = i20 + 2;
        while (true) {
            int i24 = unsignedShort10 - 1;
            if (unsignedShort10 <= 0) {
                break;
            }
            moduleVisitorVisitModule.visitUse(readClass(i23, cArr));
            i23 += 2;
            unsignedShort10 = i24;
        }
        int unsignedShort11 = readUnsignedShort(i23);
        int i25 = i23 + 2;
        while (true) {
            int i26 = unsignedShort11 - 1;
            if (unsignedShort11 <= 0) {
                moduleVisitorVisitModule.visitEnd();
                return;
            }
            String str4 = readClass(i25, cArr);
            int unsignedShort12 = readUnsignedShort(i25 + 2);
            i25 += 4;
            String[] strArr3 = new String[unsignedShort12];
            for (int i27 = 0; i27 < unsignedShort12; i27++) {
                strArr3[i27] = readClass(i25, cArr);
                i25 += 2;
            }
            moduleVisitorVisitModule.visitProvide(str4, strArr3);
            unsignedShort11 = i26;
        }
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i10, boolean z10) {
        int elementValues = i10 + 1;
        int i11 = this.classFileBuffer[i10] & 255;
        methodVisitor.visitAnnotableParameterCount(i11, z10);
        char[] cArr = context.charBuffer;
        for (int i12 = 0; i12 < i11; i12++) {
            int unsignedShort = readUnsignedShort(elementValues);
            elementValues += 2;
            while (true) {
                int i13 = unsignedShort - 1;
                if (unsignedShort > 0) {
                    elementValues = readElementValues(methodVisitor.visitParameterAnnotation(i12, readUTF8(elementValues, cArr), z10), elementValues + 2, true, cArr);
                    unsignedShort = i13;
                }
            }
        }
    }

    private int readRecordComponent(ClassVisitor classVisitor, Context context, int i10) {
        int i11;
        int i12;
        Attribute attribute;
        char[] cArr = context.charBuffer;
        String utf8 = readUTF8(i10, cArr);
        String utf82 = readUTF8(i10 + 2, cArr);
        int unsignedShort = readUnsignedShort(i10 + 4);
        int i13 = i10 + 6;
        int i14 = 0;
        Attribute attribute2 = null;
        int i15 = 0;
        String utf83 = null;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            String utf84 = readUTF8(i13, cArr);
            int i19 = readInt(i13 + 2);
            int i20 = i13 + 6;
            if ("Signature".equals(utf84)) {
                utf83 = readUTF8(i20, cArr);
                int i21 = i14;
                i11 = i20;
                i20 = i21;
            } else {
                if ("RuntimeVisibleAnnotations".equals(utf84)) {
                    i16 = i20;
                    attribute = attribute2;
                    i12 = i19;
                    i20 = i14;
                    i11 = i16;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                    i11 = i20;
                } else if ("RuntimeInvisibleAnnotations".equals(utf84)) {
                    i17 = i20;
                    attribute = attribute2;
                    i12 = i19;
                    i20 = i14;
                    i11 = i17;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                    i15 = i20;
                    attribute = attribute2;
                    i12 = i19;
                    i20 = i14;
                    i11 = i15;
                } else {
                    int i22 = i14;
                    i11 = i20;
                    Attribute attribute3 = attribute2;
                    i12 = i19;
                    Attribute attribute4 = readAttribute(context.attributePrototypes, utf84, i11, i12, cArr, -1, null);
                    attribute4.nextAttribute = attribute3;
                    attribute = attribute4;
                    i20 = i22;
                    i15 = i15;
                }
                int i23 = i11 + i12;
                i14 = i20;
                i13 = i23;
                attribute2 = attribute;
                unsignedShort = i18;
            }
            attribute = attribute2;
            i12 = i19;
            int i232 = i11 + i12;
            i14 = i20;
            i13 = i232;
            attribute2 = attribute;
            unsignedShort = i18;
        }
        int i24 = i14;
        Attribute attribute5 = attribute2;
        int i25 = i15;
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(utf8, utf82, utf83);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return i13;
        }
        if (i16 != 0) {
            int unsignedShort2 = readUnsignedShort(i16);
            int elementValues = i16 + 2;
            while (true) {
                int i26 = unsignedShort2 - 1;
                if (unsignedShort2 <= 0) {
                    break;
                }
                elementValues = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort2 = i26;
            }
        }
        if (i17 != 0) {
            int unsignedShort3 = readUnsignedShort(i17);
            int elementValues2 = i17 + 2;
            while (true) {
                int i27 = unsignedShort3 - 1;
                if (unsignedShort3 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort3 = i27;
            }
        }
        if (i24 != 0) {
            int unsignedShort4 = readUnsignedShort(i24);
            int elementValues3 = i24 + 2;
            while (true) {
                int i28 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort4 = i28;
            }
        }
        if (i25 != 0) {
            int unsignedShort5 = readUnsignedShort(i25);
            int elementValues4 = i25 + 2;
            while (true) {
                int i29 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort5 = i29;
            }
        }
        Attribute attribute6 = attribute5;
        while (attribute6 != null) {
            Attribute attribute7 = attribute6.nextAttribute;
            attribute6.nextAttribute = null;
            recordComponentVisitorVisitRecordComponent.visitAttribute(attribute6);
            attribute6 = attribute7;
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
        return i13;
    }

    private int readStackMapFrame(int i10, boolean z10, boolean z11, Context context) {
        int verificationTypeInfo;
        int i11;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z10) {
            verificationTypeInfo = i10 + 1;
            i11 = this.classFileBuffer[i10] & 255;
        } else {
            context.currentFrameOffset = -1;
            verificationTypeInfo = i10;
            i11 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i11 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i11 < 128) {
            i11 -= 64;
            verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else {
            if (i11 < 247) {
                throw new IllegalArgumentException();
            }
            int unsignedShort = readUnsignedShort(verificationTypeInfo);
            int i12 = verificationTypeInfo;
            verificationTypeInfo = i12 + 2;
            if (i11 == 247) {
                verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else if (i11 >= 248 && i11 < 251) {
                context.currentFrameType = 2;
                int i13 = 251 - i11;
                context.currentFrameLocalCountDelta = i13;
                context.currentFrameLocalCount -= i13;
                context.currentFrameStackCount = 0;
            } else if (i11 == 251) {
                context.currentFrameType = 3;
                context.currentFrameStackCount = 0;
            } else if (i11 < 255) {
                int i14 = i11 - 251;
                int i15 = z11 ? context.currentFrameLocalCount : 0;
                int i16 = i14;
                while (i16 > 0) {
                    verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameLocalTypes, i15, cArr, labelArr);
                    i16--;
                    i15++;
                }
                context.currentFrameType = 1;
                context.currentFrameLocalCountDelta = i14;
                context.currentFrameLocalCount += i14;
                context.currentFrameStackCount = 0;
            } else {
                int unsignedShort2 = readUnsignedShort(verificationTypeInfo);
                int verificationTypeInfo2 = i12 + 4;
                context.currentFrameType = 0;
                context.currentFrameLocalCountDelta = unsignedShort2;
                context.currentFrameLocalCount = unsignedShort2;
                for (int i17 = 0; i17 < unsignedShort2; i17++) {
                    verificationTypeInfo2 = readVerificationTypeInfo(verificationTypeInfo2, context.currentFrameLocalTypes, i17, cArr, labelArr);
                }
                int unsignedShort3 = readUnsignedShort(verificationTypeInfo2);
                verificationTypeInfo = verificationTypeInfo2 + 2;
                context.currentFrameStackCount = unsignedShort3;
                for (int i18 = 0; i18 < unsignedShort3; i18++) {
                    verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, i18, cArr, labelArr);
                }
            }
            i11 = unsignedShort;
        }
        int i19 = i11 + 1 + context.currentFrameOffset;
        context.currentFrameOffset = i19;
        createLabel(i19, labelArr);
        return verificationTypeInfo;
    }

    private static byte[] readStream(InputStream inputStream, boolean z10) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        int iCalculateBufferSize = calculateBufferSize(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[iCalculateBufferSize];
                int i10 = 0;
                while (true) {
                    int i11 = inputStream.read(bArr, 0, iCalculateBufferSize);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                    i10++;
                }
                byteArrayOutputStream.flush();
                if (i10 == 1) {
                    byteArrayOutputStream.close();
                    return bArr;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (z10) {
                    inputStream.close();
                }
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } finally {
            if (z10) {
                inputStream.close();
            }
        }
    }

    private String readStringish(int i10, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i10)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int readTypeAnnotationTarget(org.objectweb.asm.Context r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.readInt(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.readUnsignedShort(r1)
            int r11 = r11 + 3
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeStarts = r3
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeEnds = r3
            int[] r3 = new int[r1]
            r10.currentLocalVariableAnnotationRangeIndices = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.readUnsignedShort(r11)
            int r5 = r11 + 2
            int r5 = r9.readUnsignedShort(r5)
            int r6 = r11 + 4
            int r6 = r9.readUnsignedShort(r6)
            int r11 = r11 + 6
            org.objectweb.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeStarts
            org.objectweb.asm.Label[] r8 = r10.currentMethodLabels
            org.objectweb.asm.Label r8 = r9.createLabel(r4, r8)
            r7[r3] = r8
            org.objectweb.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeEnds
            int r4 = r4 + r5
            org.objectweb.asm.Label[] r5 = r10.currentMethodLabels
            org.objectweb.asm.Label r4 = r9.createLabel(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.currentLocalVariableAnnotationRangeIndices
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.currentTypeAnnotationTarget = r0
            int r0 = r9.readByte(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            org.objectweb.asm.TypePath r1 = new org.objectweb.asm.TypePath
            byte[] r3 = r9.classFileBuffer
            r1.<init>(r3, r11)
        L86:
            r10.currentTypeAnnotationTargetPath = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readTypeAnnotationTarget(org.objectweb.asm.Context, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] readTypeAnnotations(org.objectweb.asm.MethodVisitor r12, org.objectweb.asm.Context r13, int r14, boolean r15) {
        /*
            r11 = this;
            char[] r0 = r13.charBuffer
            int r1 = r11.readUnsignedShort(r14)
            int[] r2 = new int[r1]
            r3 = 2
            int r14 = r14 + r3
            r4 = 0
        Lb:
            if (r4 >= r1) goto L83
            r2[r4] = r14
            int r5 = r11.readInt(r14)
            int r6 = r5 >>> 24
            r7 = 23
            if (r6 == r7) goto L4d
            switch(r6) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r6) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L25:
            int r14 = r14 + 4
            goto L4f
        L28:
            int r7 = r14 + 1
            int r7 = r11.readUnsignedShort(r7)
            int r14 = r14 + 3
        L30:
            int r8 = r7 + (-1)
            if (r7 <= 0) goto L4f
            int r7 = r11.readUnsignedShort(r14)
            int r9 = r14 + 2
            int r9 = r11.readUnsignedShort(r9)
            int r14 = r14 + 6
            org.objectweb.asm.Label[] r10 = r13.currentMethodLabels
            r11.createLabel(r7, r10)
            int r7 = r7 + r9
            org.objectweb.asm.Label[] r9 = r13.currentMethodLabels
            r11.createLabel(r7, r9)
            r7 = r8
            goto L30
        L4d:
            int r14 = r14 + 3
        L4f:
            int r7 = r11.readByte(r14)
            r8 = 66
            r9 = 0
            r10 = 1
            if (r6 != r8) goto L77
            if (r7 != 0) goto L5c
            goto L63
        L5c:
            org.objectweb.asm.TypePath r9 = new org.objectweb.asm.TypePath
            byte[] r6 = r11.classFileBuffer
            r9.<init>(r6, r14)
        L63:
            int r14 = androidx.compose.ui.graphics.J2.a(r7, r3, r10, r14)
            java.lang.String r6 = r11.readUTF8(r14, r0)
            int r14 = r14 + r3
            r5 = r5 & (-256(0xffffffffffffff00, float:NaN))
            org.objectweb.asm.AnnotationVisitor r5 = r12.visitTryCatchAnnotation(r5, r9, r6, r15)
            int r14 = r11.readElementValues(r5, r14, r10, r0)
            goto L80
        L77:
            r5 = 3
            int r14 = androidx.compose.ui.graphics.J2.a(r7, r3, r5, r14)
            int r14 = r11.readElementValues(r9, r14, r10, r0)
        L80:
            int r4 = r4 + 1
            goto Lb
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readTypeAnnotations(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int, boolean):int[]");
    }

    private int readVerificationTypeInfo(int i10, Object[] objArr, int i11, char[] cArr, Label[] labelArr) {
        int i12 = i10 + 1;
        switch (this.classFileBuffer[i10] & 255) {
            case 0:
                objArr[i11] = Opcodes.TOP;
                return i12;
            case 1:
                objArr[i11] = Opcodes.INTEGER;
                return i12;
            case 2:
                objArr[i11] = Opcodes.FLOAT;
                return i12;
            case 3:
                objArr[i11] = Opcodes.DOUBLE;
                return i12;
            case 4:
                objArr[i11] = Opcodes.LONG;
                return i12;
            case 5:
                objArr[i11] = Opcodes.NULL;
                return i12;
            case 6:
                objArr[i11] = Opcodes.UNINITIALIZED_THIS;
                return i12;
            case 7:
                objArr[i11] = readClass(i12, cArr);
                break;
            case 8:
                objArr[i11] = createLabel(readUnsignedShort(i12), labelArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i10 + 3;
    }

    public void accept(ClassVisitor classVisitor, int i10) {
        accept(classVisitor, new Attribute[0], i10);
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public final int getFirstAttributeOffset() {
        int i10 = this.header;
        int unsignedShort = (readUnsignedShort(i10 + 6) * 2) + i10 + 8;
        int unsignedShort2 = readUnsignedShort(unsignedShort);
        int i11 = unsignedShort + 2;
        while (true) {
            int i12 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            int unsignedShort3 = readUnsignedShort(i11 + 6);
            i11 += 8;
            while (true) {
                int i13 = unsignedShort3 - 1;
                if (unsignedShort3 > 0) {
                    i11 += readInt(i11 + 2) + 6;
                    unsignedShort3 = i13;
                }
            }
            unsignedShort2 = i12;
        }
        int unsignedShort4 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = unsignedShort4 - 1;
            if (unsignedShort4 <= 0) {
                return i14 + 2;
            }
            int unsignedShort5 = readUnsignedShort(i14 + 6);
            i14 += 8;
            while (true) {
                int i16 = unsignedShort5 - 1;
                if (unsignedShort5 > 0) {
                    i14 += readInt(i14 + 2) + 6;
                    unsignedShort5 = i16;
                }
            }
            unsignedShort4 = i15;
        }
    }

    public String[] getInterfaces() {
        int i10 = this.header + 6;
        int unsignedShort = readUnsignedShort(i10);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i11 = 0; i11 < unsignedShort; i11++) {
                i10 += 2;
                strArr[i11] = readClass(i10, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i10) {
        return this.cpInfoOffsets[i10];
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public int readByte(int i10) {
        return this.classFileBuffer[i10] & 255;
    }

    public String readClass(int i10, char[] cArr) {
        return readStringish(i10, cArr);
    }

    public Object readConst(int i10, char[] cArr) {
        int i11 = this.cpInfoOffsets[i10];
        byte b10 = this.classFileBuffer[i11 - 1];
        switch (b10) {
            case 3:
                return Integer.valueOf(readInt(i11));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i11)));
            case 5:
                return Long.valueOf(readLong(i11));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i11)));
            case 7:
                return Type.getObjectType(readUTF8(i11, cArr));
            case 8:
                return readUTF8(i11, cArr);
            default:
                switch (b10) {
                    case 15:
                        int i12 = readByte(i11);
                        int i13 = this.cpInfoOffsets[readUnsignedShort(i11 + 1)];
                        int i14 = this.cpInfoOffsets[readUnsignedShort(i13 + 2)];
                        return new Handle(i12, readClass(i13, cArr), readUTF8(i14, cArr), readUTF8(i14 + 2, cArr), this.classFileBuffer[i13 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i11, cArr));
                    case 17:
                        return readConstantDynamic(i10, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int readInt(int i10) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public Label readLabel(int i10, Label[] labelArr) {
        if (labelArr[i10] == null) {
            labelArr[i10] = new Label();
        }
        return labelArr[i10];
    }

    public long readLong(int i10) {
        return (((long) readInt(i10)) << 32) | (((long) readInt(i10 + 4)) & ZipKt.f225990j);
    }

    public String readModule(int i10, char[] cArr) {
        return readStringish(i10, cArr);
    }

    public String readPackage(int i10, char[] cArr) {
        return readStringish(i10, cArr);
    }

    public short readShort(int i10) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String readUTF8(int i10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        if (i10 == 0 || unsignedShort == 0) {
            return null;
        }
        return readUtf(unsignedShort, cArr);
    }

    public int readUnsignedShort(int i10) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final String readUtf(int i10, char[] cArr) {
        String[] strArr = this.constantUtf8Values;
        String str = strArr[i10];
        if (str != null) {
            return str;
        }
        int i11 = this.cpInfoOffsets[i10];
        String utf = readUtf(i11 + 2, readUnsignedShort(i11), cArr);
        strArr[i10] = utf;
        return utf;
    }

    public ClassReader(byte[] bArr, int i10, int i11) {
        this(bArr, i10, true);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i10) {
        Context context;
        ClassReader classReader;
        Context context2;
        String str;
        int i11;
        int i12;
        String utf8;
        int i13;
        String str2;
        String str3;
        int i14;
        Context context3 = new Context();
        context3.attributePrototypes = attributeArr;
        context3.parsingOptions = i10;
        char[] cArr = new char[this.maxStringLength];
        context3.charBuffer = cArr;
        int i15 = this.header;
        int unsignedShort = readUnsignedShort(i15);
        String str4 = readClass(i15 + 2, cArr);
        String str5 = readClass(i15 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i15 + 6);
        String[] strArr = new String[unsignedShort2];
        int i16 = i15 + 8;
        for (int i17 = 0; i17 < unsignedShort2; i17++) {
            strArr[i17] = readClass(i16, cArr);
            i16 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int unsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str6 = null;
        String utf = null;
        String str7 = null;
        int i18 = 0;
        int i19 = 0;
        String utf82 = null;
        int i20 = 0;
        int i21 = 0;
        String str8 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        Attribute attribute = null;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (unsignedShort3 > 0) {
            int i29 = firstAttributeOffset;
            String utf83 = readUTF8(i29, cArr);
            int i30 = readInt(i29 + 2);
            String str9 = str6;
            int i31 = i29 + 6;
            String str10 = utf;
            if ("SourceFile".equals(utf83)) {
                utf8 = readUTF8(i31, cArr);
                i14 = unsignedShort;
                i12 = i31;
                str2 = str4;
                utf = str10;
                i13 = i30;
                context2 = context3;
            } else {
                if ("InnerClasses".equals(utf83)) {
                    i14 = unsignedShort;
                    i12 = i31;
                    i27 = i12;
                } else if ("EnclosingMethod".equals(utf83)) {
                    i14 = unsignedShort;
                    i12 = i31;
                    i19 = i12;
                } else {
                    if ("NestHost".equals(utf83)) {
                        str7 = readClass(i31, cArr);
                    } else if ("NestMembers".equals(utf83)) {
                        i14 = unsignedShort;
                        i12 = i31;
                        i25 = i12;
                    } else if ("PermittedSubclasses".equals(utf83)) {
                        i14 = unsignedShort;
                        i12 = i31;
                        i26 = i12;
                    } else if ("Signature".equals(utf83)) {
                        utf82 = readUTF8(i31, cArr);
                    } else if ("RuntimeVisibleAnnotations".equals(utf83)) {
                        i14 = unsignedShort;
                        i12 = i31;
                        i18 = i12;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf83)) {
                        i14 = unsignedShort;
                        i12 = i31;
                        i23 = i12;
                    } else {
                        if ("Deprecated".equals(utf83)) {
                            i14 = 131072 | unsignedShort;
                        } else if ("Synthetic".equals(utf83)) {
                            i14 = unsignedShort | 4096;
                        } else if ("SourceDebugExtension".equals(utf83)) {
                            if (i30 > this.classFileBuffer.length - i31) {
                                throw new IllegalArgumentException();
                            }
                            utf = readUtf(i31, i30, new char[i30]);
                            i14 = unsignedShort;
                            i12 = i31;
                            context2 = context3;
                            utf8 = str9;
                            i13 = i30;
                            str2 = str4;
                        } else if ("RuntimeInvisibleAnnotations".equals(utf83)) {
                            i14 = unsignedShort;
                            i12 = i31;
                            i22 = i12;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf83)) {
                            i14 = unsignedShort;
                            i12 = i31;
                            i24 = i12;
                        } else if ("Record".equals(utf83)) {
                            i14 = 65536 | unsignedShort;
                            i12 = i31;
                            i28 = i12;
                        } else if ("Module".equals(utf83)) {
                            i14 = unsignedShort;
                            i12 = i31;
                            i20 = i12;
                        } else if ("ModuleMainClass".equals(utf83)) {
                            str8 = readClass(i31, cArr);
                        } else if ("ModulePackages".equals(utf83)) {
                            i14 = unsignedShort;
                            i12 = i31;
                            i21 = i12;
                        } else {
                            if ("BootstrapMethods".equals(utf83)) {
                                context2 = context3;
                                str = str10;
                                i11 = unsignedShort;
                                i12 = i31;
                                utf8 = str9;
                                i13 = i30;
                                str2 = str4;
                                str3 = str7;
                            } else {
                                context2 = context3;
                                str = str10;
                                utf8 = str9;
                                str2 = str4;
                                str3 = str7;
                                i11 = unsignedShort;
                                i12 = i31;
                                i13 = i30;
                                Attribute attribute2 = readAttribute(attributeArr, utf83, i12, i13, cArr, -1, null);
                                attribute2.nextAttribute = attribute;
                                attribute = attribute2;
                            }
                            utf = str;
                            str7 = str3;
                            i14 = i11;
                        }
                        i12 = i31;
                    }
                    i14 = unsignedShort;
                    i12 = i31;
                }
                utf = str10;
                utf8 = str9;
                i13 = i30;
                context2 = context3;
                str2 = str4;
            }
            int i32 = i12 + i13;
            unsignedShort3--;
            unsignedShort = i14;
            str6 = utf8;
            context3 = context2;
            str4 = str2;
            firstAttributeOffset = i32;
        }
        String str11 = str6;
        Context context4 = context3;
        String str12 = str4;
        String str13 = utf;
        String str14 = str7;
        Attribute attribute3 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), unsignedShort, str12, utf82, str5, strArr);
        if ((i10 & 2) == 0 && (str11 != null || str13 != null)) {
            classVisitor.visitSource(str11, str13);
        }
        if (i20 != 0) {
            context = context4;
            classReader = this;
            classReader.readModuleAttributes(classVisitor, context, i20, i21, str8);
        } else {
            context = context4;
            classReader = this;
        }
        if (str14 != null) {
            classVisitor.visitNestHost(str14);
        }
        if (i19 != 0) {
            String str15 = classReader.readClass(i19, cArr);
            int unsignedShort4 = classReader.readUnsignedShort(i19 + 2);
            classVisitor.visitOuterClass(str15, unsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[unsignedShort4], cArr), unsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[unsignedShort4] + 2, cArr));
        }
        if (i18 != 0) {
            int unsignedShort5 = classReader.readUnsignedShort(i18);
            int elementValues = i18 + 2;
            while (true) {
                int i33 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i33;
            }
        }
        int i34 = i22;
        if (i34 != 0) {
            int unsignedShort6 = classReader.readUnsignedShort(i34);
            int elementValues2 = i34 + 2;
            while (true) {
                int i35 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i35;
            }
        }
        int i36 = i23;
        if (i36 != 0) {
            int unsignedShort7 = classReader.readUnsignedShort(i36);
            int elementValues3 = i36 + 2;
            while (true) {
                int i37 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = classReader.readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i37;
            }
        }
        int i38 = i24;
        if (i38 != 0) {
            int unsignedShort8 = classReader.readUnsignedShort(i38);
            int elementValues4 = i38 + 2;
            while (true) {
                int i39 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i39;
            }
        }
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.nextAttribute;
            attribute3.nextAttribute = null;
            classVisitor.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i40 = i25;
        if (i40 != 0) {
            int unsignedShort9 = classReader.readUnsignedShort(i40);
            int i41 = i40 + 2;
            while (true) {
                int i42 = unsignedShort9 - 1;
                if (unsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(classReader.readClass(i41, cArr));
                i41 += 2;
                unsignedShort9 = i42;
            }
        }
        int i43 = i26;
        if (i43 != 0) {
            int unsignedShort10 = classReader.readUnsignedShort(i43);
            int i44 = i43 + 2;
            while (true) {
                int i45 = unsignedShort10 - 1;
                if (unsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(classReader.readClass(i44, cArr));
                i44 += 2;
                unsignedShort10 = i45;
            }
        }
        int i46 = i27;
        if (i46 != 0) {
            int unsignedShort11 = classReader.readUnsignedShort(i46);
            int i47 = i46 + 2;
            while (true) {
                int i48 = unsignedShort11 - 1;
                if (unsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(classReader.readClass(i47, cArr), classReader.readClass(i47 + 2, cArr), classReader.readUTF8(i47 + 4, cArr), classReader.readUnsignedShort(i47 + 6));
                i47 += 8;
                unsignedShort11 = i48;
            }
        }
        int i49 = i28;
        if (i49 != 0) {
            int unsignedShort12 = classReader.readUnsignedShort(i49);
            int recordComponent = i49 + 2;
            while (true) {
                int i50 = unsignedShort12 - 1;
                if (unsignedShort12 <= 0) {
                    break;
                }
                recordComponent = classReader.readRecordComponent(classVisitor, context, recordComponent);
                unsignedShort12 = i50;
            }
        }
        int unsignedShort13 = classReader.readUnsignedShort(i16);
        int field = i16 + 2;
        while (true) {
            int i51 = unsignedShort13 - 1;
            if (unsignedShort13 <= 0) {
                break;
            }
            field = classReader.readField(classVisitor, context, field);
            unsignedShort13 = i51;
        }
        int unsignedShort14 = classReader.readUnsignedShort(field);
        int method = field + 2;
        while (true) {
            int i52 = unsignedShort14 - 1;
            if (unsignedShort14 <= 0) {
                classVisitor.visitEnd();
                return;
            } else {
                method = classReader.readMethod(classVisitor, context, method);
                unsignedShort14 = i52;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[PHI: r8
      0x0060: PHI (r8v3 int) = (r8v0 int), (r8v1 int), (r8v4 int) binds: [B:12:0x004f, B:22:0x006c, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ClassReader(byte[] r11, int r12, boolean r13) {
        /*
            r10 = this;
            r10.<init>()
            r10.classFileBuffer = r11
            r10.f226148b = r11
            if (r13 == 0) goto L2c
            int r13 = r12 + 6
            short r0 = r10.readShort(r13)
            r1 = 62
            if (r0 > r1) goto L14
            goto L2c
        L14:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported class file major version "
            r12.<init>(r0)
            short r13 = r10.readShort(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L2c:
            int r13 = r12 + 8
            int r13 = r10.readUnsignedShort(r13)
            int[] r0 = new int[r13]
            r10.cpInfoOffsets = r0
            java.lang.String[] r0 = new java.lang.String[r13]
            r10.constantUtf8Values = r0
            int r12 = r12 + 10
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r2
            r4 = r1
        L41:
            if (r4 >= r13) goto L72
            int[] r5 = r10.cpInfoOffsets
            int r6 = r4 + 1
            int r7 = r12 + 1
            r5[r4] = r7
            r5 = r11[r12]
            r8 = 3
            r9 = 5
            switch(r5) {
                case 1: goto L67;
                case 2: goto L52;
                case 3: goto L59;
                case 4: goto L59;
                case 5: goto L62;
                case 6: goto L62;
                case 7: goto L60;
                case 8: goto L60;
                case 9: goto L59;
                case 10: goto L59;
                case 11: goto L59;
                case 12: goto L59;
                case 13: goto L52;
                case 14: goto L52;
                case 15: goto L5f;
                case 16: goto L60;
                case 17: goto L5c;
                case 18: goto L58;
                case 19: goto L60;
                case 20: goto L60;
                default: goto L52;
            }
        L52:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L58:
            r3 = r1
        L59:
            r4 = r6
            r8 = r9
            goto L70
        L5c:
            r2 = r1
            r3 = r2
            goto L59
        L5f:
            r8 = 4
        L60:
            r4 = r6
            goto L70
        L62:
            int r4 = r4 + 2
            r8 = 9
            goto L70
        L67:
            int r4 = r10.readUnsignedShort(r7)
            int r8 = r8 + r4
            if (r8 <= r0) goto L60
            r4 = r6
            r0 = r8
        L70:
            int r12 = r12 + r8
            goto L41
        L72:
            r10.maxStringLength = r0
            r10.header = r12
            r11 = 0
            if (r2 == 0) goto L7c
            org.objectweb.asm.ConstantDynamic[] r12 = new org.objectweb.asm.ConstantDynamic[r13]
            goto L7d
        L7c:
            r12 = r11
        L7d:
            r10.constantDynamicValues = r12
            if (r3 == 0) goto L85
            int[] r11 = r10.readBootstrapMethodsAttribute(r0)
        L85:
            r10.bootstrapMethodOffsets = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.<init>(byte[], int, boolean):void");
    }

    private String readUtf(int i10, int i11, char[] cArr) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArr = this.classFileBuffer;
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if ((b10 & 128) == 0) {
                cArr[i14] = (char) (b10 & 127);
                i14++;
                i10 = i15;
            } else {
                if ((b10 & 224) == 192) {
                    i12 = i14 + 1;
                    i10 += 2;
                    cArr[i14] = (char) (((b10 & Ascii.US) << 6) + (bArr[i15] & h0.f225962a));
                } else {
                    i12 = i14 + 1;
                    int i16 = i10 + 2;
                    i10 += 3;
                    cArr[i14] = (char) (((b10 & Ascii.SI) << 12) + ((bArr[i15] & h0.f225962a) << 6) + (bArr[i16] & h0.f225962a));
                }
                i14 = i12;
            }
        }
        return new String(cArr, 0, i14);
    }

    public ClassReader(InputStream inputStream) throws IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(readStream(ClassLoader.getSystemResourceAsStream(str.replace('.', '/') + ".class"), true));
    }
}
