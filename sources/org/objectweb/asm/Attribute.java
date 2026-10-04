package org.objectweb.asm;

/* JADX INFO: loaded from: classes8.dex */
public class Attribute {
    private byte[] content;
    Attribute nextAttribute;
    public final String type;

    public static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private Attribute[] data = new Attribute[6];
        private int size;

        private void add(Attribute attribute) {
            int i10 = this.size;
            Attribute[] attributeArr = this.data;
            if (i10 >= attributeArr.length) {
                Attribute[] attributeArr2 = new Attribute[attributeArr.length + 6];
                System.arraycopy(attributeArr, 0, attributeArr2, 0, i10);
                this.data = attributeArr2;
            }
            Attribute[] attributeArr3 = this.data;
            int i11 = this.size;
            this.size = i11 + 1;
            attributeArr3[i11] = attribute;
        }

        private boolean contains(Attribute attribute) {
            for (int i10 = 0; i10 < this.size; i10++) {
                if (this.data[i10].type.equals(attribute.type)) {
                    return true;
                }
            }
            return false;
        }

        public void addAttributes(Attribute attribute) {
            while (attribute != null) {
                if (!contains(attribute)) {
                    add(attribute);
                }
                attribute = attribute.nextAttribute;
            }
        }

        public Attribute[] toArray() {
            int i10 = this.size;
            Attribute[] attributeArr = new Attribute[i10];
            System.arraycopy(this.data, 0, attributeArr, 0, i10);
            return attributeArr;
        }
    }

    public Attribute(String str) {
        this.type = str;
    }

    public final int computeAttributesSize(SymbolTable symbolTable) {
        return computeAttributesSize(symbolTable, null, 0, -1, -1);
    }

    public final int getAttributeCount() {
        int i10 = 0;
        for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            i10++;
        }
        return i10;
    }

    public Label[] getLabels() {
        return new Label[0];
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    public final void putAttributes(SymbolTable symbolTable, ByteVector byteVector) {
        putAttributes(symbolTable, null, 0, -1, -1, byteVector);
    }

    public Attribute read(ClassReader classReader, int i10, int i11, char[] cArr, int i12, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        byte[] bArr = new byte[i11];
        attribute.content = bArr;
        System.arraycopy(classReader.classFileBuffer, i10, bArr, 0, i11);
        return attribute;
    }

    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12) {
        return new ByteVector(this.content);
    }

    public final int computeAttributesSize(SymbolTable symbolTable, byte[] bArr, int i10, int i11, int i12) {
        ClassWriter classWriter = symbolTable.classWriter;
        int i13 = 0;
        Attribute attribute = this;
        while (attribute != null) {
            symbolTable.addConstantUtf8(attribute.type);
            byte[] bArr2 = bArr;
            i13 += attribute.write(classWriter, bArr2, i10, i11, i12).length + 6;
            attribute = attribute.nextAttribute;
            bArr = bArr2;
        }
        return i13;
    }

    public final void putAttributes(SymbolTable symbolTable, byte[] bArr, int i10, int i11, int i12, ByteVector byteVector) {
        ClassWriter classWriter = symbolTable.classWriter;
        Attribute attribute = this;
        while (attribute != null) {
            byte[] bArr2 = bArr;
            int i13 = i10;
            int i14 = i11;
            ByteVector byteVectorWrite = attribute.write(classWriter, bArr2, i13, i14, i12);
            byteVector.putShort(symbolTable.addConstantUtf8(attribute.type)).putInt(byteVectorWrite.length);
            byteVector.putByteArray(byteVectorWrite.data, 0, byteVectorWrite.length);
            attribute = attribute.nextAttribute;
            bArr = bArr2;
            i10 = i13;
            i11 = i14;
        }
    }

    public static int computeAttributesSize(SymbolTable symbolTable, int i10, int i11) {
        int i12;
        if ((i10 & 4096) == 0 || symbolTable.getMajorVersion() >= 49) {
            i12 = 0;
        } else {
            symbolTable.addConstantUtf8("Synthetic");
            i12 = 6;
        }
        if (i11 != 0) {
            symbolTable.addConstantUtf8("Signature");
            i12 += 8;
        }
        if ((i10 & 131072) == 0) {
            return i12;
        }
        symbolTable.addConstantUtf8("Deprecated");
        return i12 + 6;
    }

    public static void putAttributes(SymbolTable symbolTable, int i10, int i11, ByteVector byteVector) {
        if ((i10 & 4096) != 0 && symbolTable.getMajorVersion() < 49) {
            byteVector.putShort(symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (i11 != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(i11);
        }
        if ((i10 & 131072) != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
    }
}
