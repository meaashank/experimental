package org.objectweb.asm;

import androidx.compose.ui.graphics.J2;

/* JADX INFO: loaded from: classes8.dex */
public final class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    public TypePath(byte[] bArr, int i10) {
        this.typePathContainer = bArr;
        this.typePathOffset = i10;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt == '[') {
                byteVector.put11(0, 0);
            } else if (cCharAt == '.') {
                byteVector.put11(1, 0);
            } else if (cCharAt == '*') {
                byteVector.put11(2, 0);
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new IllegalArgumentException();
                }
                int i12 = cCharAt - '0';
                while (i11 < length) {
                    int i13 = i11 + 1;
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        i12 = ((i12 * 10) + cCharAt2) - 48;
                        i11 = i13;
                    } else {
                        if (cCharAt2 != ';') {
                            throw new IllegalArgumentException();
                        }
                        i11 = i13;
                        byteVector.put11(3, i12);
                    }
                }
                byteVector.put11(3, i12);
            }
            i10 = i11;
        }
        byte[] bArr = byteVector.data;
        bArr[0] = (byte) (byteVector.length / 2);
        return new TypePath(bArr, 0);
    }

    public static void put(TypePath typePath, ByteVector byteVector) {
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.typePathContainer;
        int i10 = typePath.typePathOffset;
        byteVector.putByteArray(bArr, i10, (bArr[i10] * 2) + 1);
    }

    public int getLength() {
        return this.typePathContainer[this.typePathOffset];
    }

    public int getStep(int i10) {
        return this.typePathContainer[J2.a(i10, 2, this.typePathOffset, 1)];
    }

    public int getStepArgument(int i10) {
        return this.typePathContainer[J2.a(i10, 2, this.typePathOffset, 2)];
    }

    public String toString() {
        int length = getLength();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i10 = 0; i10 < length; i10++) {
            int step = getStep(i10);
            if (step == 0) {
                sb2.append('[');
            } else if (step == 1) {
                sb2.append('.');
            } else if (step == 2) {
                sb2.append('*');
            } else {
                if (step != 3) {
                    throw new AssertionError();
                }
                sb2.append(getStepArgument(i10));
                sb2.append(';');
            }
        }
        return sb2.toString();
    }
}
