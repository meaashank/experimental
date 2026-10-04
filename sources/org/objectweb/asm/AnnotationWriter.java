package org.objectweb.asm;

/* JADX INFO: loaded from: classes8.dex */
final class AnnotationWriter extends AnnotationVisitor {
    private final ByteVector annotation;
    private AnnotationWriter nextAnnotation;
    private int numElementValuePairs;
    private final int numElementValuePairsOffset;
    private final AnnotationWriter previousAnnotation;
    private final SymbolTable symbolTable;
    private final boolean useNamedValues;

    public AnnotationWriter(SymbolTable symbolTable, boolean z10, ByteVector byteVector, AnnotationWriter annotationWriter) {
        super(589824);
        this.symbolTable = symbolTable;
        this.useNamedValues = z10;
        this.annotation = byteVector;
        int i10 = byteVector.length;
        this.numElementValuePairsOffset = i10 == 0 ? -1 : i10 - 2;
        this.previousAnnotation = annotationWriter;
        if (annotationWriter != null) {
            annotationWriter.nextAnnotation = this;
        }
    }

    public static int computeParameterAnnotationsSize(String str, AnnotationWriter[] annotationWriterArr, int i10) {
        int iComputeAnnotationsSize = (i10 * 2) + 7;
        for (int i11 = 0; i11 < i10; i11++) {
            iComputeAnnotationsSize += annotationWriterArr[i11] == null ? 0 : r3.computeAnnotationsSize(str) - 8;
        }
        return iComputeAnnotationsSize;
    }

    public static AnnotationWriter create(SymbolTable symbolTable, String str, AnnotationWriter annotationWriter) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    public static void putParameterAnnotations(int i10, AnnotationWriter[] annotationWriterArr, int i11, ByteVector byteVector) {
        int iComputeAnnotationsSize = (i11 * 2) + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iComputeAnnotationsSize += annotationWriterArr[i12] == null ? 0 : r4.computeAnnotationsSize(null) - 8;
        }
        byteVector.putShort(i10);
        byteVector.putInt(iComputeAnnotationsSize);
        byteVector.putByte(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            AnnotationWriter annotationWriter = null;
            for (AnnotationWriter annotationWriter2 = annotationWriterArr[i13]; annotationWriter2 != null; annotationWriter2 = annotationWriter2.previousAnnotation) {
                annotationWriter2.visitEnd();
                i14++;
                annotationWriter = annotationWriter2;
            }
            byteVector.putShort(i14);
            while (annotationWriter != null) {
                ByteVector byteVector2 = annotationWriter.annotation;
                byteVector.putByteArray(byteVector2.data, 0, byteVector2.length);
                annotationWriter = annotationWriter.nextAnnotation;
            }
        }
    }

    public int computeAnnotationsSize(String str) {
        if (str != null) {
            this.symbolTable.addConstantUtf8(str);
        }
        int i10 = 8;
        for (AnnotationWriter annotationWriter = this; annotationWriter != null; annotationWriter = annotationWriter.previousAnnotation) {
            i10 += annotationWriter.annotation.length;
        }
        return i10;
    }

    public void putAnnotations(int i10, ByteVector byteVector) {
        int i11 = 2;
        int i12 = 0;
        AnnotationWriter annotationWriter = null;
        for (AnnotationWriter annotationWriter2 = this; annotationWriter2 != null; annotationWriter2 = annotationWriter2.previousAnnotation) {
            annotationWriter2.visitEnd();
            i11 += annotationWriter2.annotation.length;
            i12++;
            annotationWriter = annotationWriter2;
        }
        byteVector.putShort(i10);
        byteVector.putInt(i11);
        byteVector.putShort(i12);
        while (annotationWriter != null) {
            ByteVector byteVector2 = annotationWriter.annotation;
            byteVector.putByteArray(byteVector2.data, 0, byteVector2.length);
            annotationWriter = annotationWriter.nextAnnotation;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        if (obj instanceof String) {
            this.annotation.put12(115, this.symbolTable.addConstantUtf8((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.annotation.put12(66, this.symbolTable.addConstantInteger(((Byte) obj).byteValue()).index);
            return;
        }
        if (obj instanceof Boolean) {
            this.annotation.put12(90, this.symbolTable.addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0).index);
            return;
        }
        if (obj instanceof Character) {
            this.annotation.put12(67, this.symbolTable.addConstantInteger(((Character) obj).charValue()).index);
            return;
        }
        if (obj instanceof Short) {
            this.annotation.put12(83, this.symbolTable.addConstantInteger(((Short) obj).shortValue()).index);
            return;
        }
        if (obj instanceof Type) {
            this.annotation.put12(99, this.symbolTable.addConstantUtf8(((Type) obj).getDescriptor()));
            return;
        }
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.annotation.put12(91, bArr.length);
            int length = bArr.length;
            while (i10 < length) {
                this.annotation.put12(66, this.symbolTable.addConstantInteger(bArr[i10]).index);
                i10++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.annotation.put12(91, zArr.length);
            int length2 = zArr.length;
            while (i10 < length2) {
                this.annotation.put12(90, this.symbolTable.addConstantInteger(zArr[i10] ? 1 : 0).index);
                i10++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.annotation.put12(91, sArr.length);
            int length3 = sArr.length;
            while (i10 < length3) {
                this.annotation.put12(83, this.symbolTable.addConstantInteger(sArr[i10]).index);
                i10++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.annotation.put12(91, cArr.length);
            int length4 = cArr.length;
            while (i10 < length4) {
                this.annotation.put12(67, this.symbolTable.addConstantInteger(cArr[i10]).index);
                i10++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.annotation.put12(91, iArr.length);
            int length5 = iArr.length;
            while (i10 < length5) {
                this.annotation.put12(73, this.symbolTable.addConstantInteger(iArr[i10]).index);
                i10++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.annotation.put12(91, jArr.length);
            int length6 = jArr.length;
            while (i10 < length6) {
                this.annotation.put12(74, this.symbolTable.addConstantLong(jArr[i10]).index);
                i10++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.annotation.put12(91, fArr.length);
            int length7 = fArr.length;
            while (i10 < length7) {
                this.annotation.put12(70, this.symbolTable.addConstantFloat(fArr[i10]).index);
                i10++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            Symbol symbolAddConstant = this.symbolTable.addConstant(obj);
            this.annotation.put12(".s.IFJDCS".charAt(symbolAddConstant.tag), symbolAddConstant.index);
            return;
        }
        double[] dArr = (double[]) obj;
        this.annotation.put12(91, dArr.length);
        int length8 = dArr.length;
        while (i10 < length8) {
            this.annotation.put12(68, this.symbolTable.addConstantDouble(dArr[i10]).index);
            i10++;
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(64, this.symbolTable.addConstantUtf8(str2)).putShort(0);
        return new AnnotationWriter(this.symbolTable, true, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(91, 0);
        return new AnnotationWriter(this.symbolTable, false, this.annotation, null);
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
        int i10 = this.numElementValuePairsOffset;
        if (i10 != -1) {
            byte[] bArr = this.annotation.data;
            int i11 = this.numElementValuePairs;
            bArr[i10] = (byte) (i11 >>> 8);
            bArr[i10 + 1] = (byte) i11;
        }
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.numElementValuePairs++;
        if (this.useNamedValues) {
            this.annotation.putShort(this.symbolTable.addConstantUtf8(str));
        }
        this.annotation.put12(101, this.symbolTable.addConstantUtf8(str2)).putShort(this.symbolTable.addConstantUtf8(str3));
    }

    public static int computeAnnotationsSize(AnnotationWriter annotationWriter, AnnotationWriter annotationWriter2, AnnotationWriter annotationWriter3, AnnotationWriter annotationWriter4) {
        int iComputeAnnotationsSize = annotationWriter != null ? annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations") : 0;
        if (annotationWriter2 != null) {
            iComputeAnnotationsSize += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        if (annotationWriter3 != null) {
            iComputeAnnotationsSize += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        return annotationWriter4 != null ? iComputeAnnotationsSize + annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations") : iComputeAnnotationsSize;
    }

    public static AnnotationWriter create(SymbolTable symbolTable, int i10, TypePath typePath, String str, AnnotationWriter annotationWriter) {
        ByteVector byteVector = new ByteVector();
        TypeReference.putTarget(i10, byteVector);
        TypePath.put(typePath, byteVector);
        byteVector.putShort(symbolTable.addConstantUtf8(str)).putShort(0);
        return new AnnotationWriter(symbolTable, true, byteVector, annotationWriter);
    }

    public static void putAnnotations(SymbolTable symbolTable, AnnotationWriter annotationWriter, AnnotationWriter annotationWriter2, AnnotationWriter annotationWriter3, AnnotationWriter annotationWriter4, ByteVector byteVector) {
        if (annotationWriter != null) {
            annotationWriter.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleAnnotations"), byteVector);
        }
        if (annotationWriter2 != null) {
            annotationWriter2.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleAnnotations"), byteVector);
        }
        if (annotationWriter3 != null) {
            annotationWriter3.putAnnotations(symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
        }
        if (annotationWriter4 != null) {
            annotationWriter4.putAnnotations(symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
        }
    }
}
