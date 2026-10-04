package org.objectweb.asm.commons;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes8.dex */
public final class ModuleResolutionAttribute extends Attribute {
    public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
    public static final int RESOLUTION_WARN_DEPRECATED = 2;
    public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
    public static final int RESOLUTION_WARN_INCUBATING = 8;
    public int resolution;

    public ModuleResolutionAttribute(int i10) {
        super("ModuleResolution");
        this.resolution = i10;
    }

    @Override // org.objectweb.asm.Attribute
    public Attribute read(ClassReader classReader, int i10, int i11, char[] cArr, int i12, Label[] labelArr) {
        return new ModuleResolutionAttribute(classReader.readUnsignedShort(i10));
    }

    @Override // org.objectweb.asm.Attribute
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.resolution);
        return byteVector;
    }

    public ModuleResolutionAttribute() {
        this(0);
    }
}
