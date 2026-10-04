package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes8.dex */
public final class ModuleHashesAttribute extends Attribute {
    public String algorithm;
    public List<byte[]> hashes;
    public List<String> modules;

    public ModuleHashesAttribute(String str, List<String> list, List<byte[]> list2) {
        super("ModuleHashes");
        this.algorithm = str;
        this.modules = list;
        this.hashes = list2;
    }

    @Override // org.objectweb.asm.Attribute
    public Attribute read(ClassReader classReader, int i10, int i11, char[] cArr, int i12, Label[] labelArr) {
        String utf8 = classReader.readUTF8(i10, cArr);
        int unsignedShort = classReader.readUnsignedShort(i10 + 2);
        int i13 = i10 + 4;
        ArrayList arrayList = new ArrayList(unsignedShort);
        ArrayList arrayList2 = new ArrayList(unsignedShort);
        for (int i14 = 0; i14 < unsignedShort; i14++) {
            arrayList.add(classReader.readModule(i13, cArr));
            int unsignedShort2 = classReader.readUnsignedShort(i13 + 2);
            i13 += 4;
            byte[] bArr = new byte[unsignedShort2];
            for (int i15 = 0; i15 < unsignedShort2; i15++) {
                bArr[i15] = (byte) classReader.readByte(i13);
                i13++;
            }
            arrayList2.add(bArr);
        }
        return new ModuleHashesAttribute(utf8, arrayList, arrayList2);
    }

    @Override // org.objectweb.asm.Attribute
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(classWriter.newUTF8(this.algorithm));
        List<String> list = this.modules;
        if (list == null) {
            byteVector.putShort(0);
            return byteVector;
        }
        int size = list.size();
        byteVector.putShort(size);
        for (int i13 = 0; i13 < size; i13++) {
            String str = this.modules.get(i13);
            byte[] bArr2 = this.hashes.get(i13);
            byteVector.putShort(classWriter.newModule(str)).putShort(bArr2.length).putByteArray(bArr2, 0, bArr2.length);
        }
        return byteVector;
    }

    public ModuleHashesAttribute() {
        this(null, null, null);
    }
}
