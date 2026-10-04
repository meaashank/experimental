package org.objectweb.asm.commons;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes8.dex */
public class SerialVersionUIDAdder extends ClassVisitor {
    private static final String CLINIT = "<clinit>";
    private int access;
    private boolean computeSvuid;
    private boolean hasStaticInitializer;
    private boolean hasSvuid;
    private String[] interfaces;
    private String name;
    private Collection<Item> svuidConstructors;
    private Collection<Item> svuidFields;
    private Collection<Item> svuidMethods;

    public static final class Item implements Comparable<Item> {
        final int access;
        final String descriptor;
        final String name;

        public Item(String str, int i10, String str2) {
            this.name = str;
            this.access = i10;
            this.descriptor = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Item) && compareTo((Item) obj) == 0;
        }

        public int hashCode() {
            return this.name.hashCode() ^ this.descriptor.hashCode();
        }

        @Override // java.lang.Comparable
        public int compareTo(Item item) {
            int iCompareTo = this.name.compareTo(item.name);
            return iCompareTo == 0 ? this.descriptor.compareTo(item.descriptor) : iCompareTo;
        }
    }

    public SerialVersionUIDAdder(ClassVisitor classVisitor) {
        this(589824, classVisitor);
        if (getClass() != SerialVersionUIDAdder.class) {
            throw new IllegalStateException();
        }
    }

    private static void writeItems(Collection<Item> collection, DataOutput dataOutput, boolean z10) throws IOException {
        Item[] itemArr = (Item[]) collection.toArray(new Item[0]);
        Arrays.sort(itemArr);
        for (Item item : itemArr) {
            dataOutput.writeUTF(item.name);
            dataOutput.writeInt(item.access);
            String strReplace = item.descriptor;
            if (z10) {
                strReplace = strReplace.replace('/', '.');
            }
            dataOutput.writeUTF(strReplace);
        }
    }

    public void addSVUID(long j10) {
        FieldVisitor fieldVisitorVisitField = super.visitField(24, "serialVersionUID", "J", null, Long.valueOf(j10));
        if (fieldVisitorVisitField != null) {
            fieldVisitorVisitField.visitEnd();
        }
    }

    public byte[] computeSHAdigest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new UnsupportedOperationException(e10);
        }
    }

    public long computeSVUID() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeUTF(this.name.replace('/', '.'));
                int i10 = this.access;
                if ((i10 & 512) != 0) {
                    i10 = this.svuidMethods.isEmpty() ? i10 & (-1025) : i10 | 1024;
                }
                dataOutputStream.writeInt(i10 & 1553);
                Arrays.sort(this.interfaces);
                for (String str : this.interfaces) {
                    dataOutputStream.writeUTF(str.replace('/', '.'));
                }
                writeItems(this.svuidFields, dataOutputStream, false);
                if (this.hasStaticInitializer) {
                    dataOutputStream.writeUTF(CLINIT);
                    dataOutputStream.writeInt(8);
                    dataOutputStream.writeUTF("()V");
                }
                writeItems(this.svuidConstructors, dataOutputStream, true);
                writeItems(this.svuidMethods, dataOutputStream, true);
                dataOutputStream.flush();
                byte[] bArrComputeSHAdigest = computeSHAdigest(byteArrayOutputStream.toByteArray());
                long j10 = 0;
                for (int iMin = Math.min(bArrComputeSHAdigest.length, 8) - 1; iMin >= 0; iMin--) {
                    j10 = (j10 << 8) | ((long) (bArrComputeSHAdigest[iMin] & 255));
                }
                dataOutputStream.close();
                byteArrayOutputStream.close();
                return j10;
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public boolean hasSVUID() {
        return this.hasSvuid;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        boolean z10 = (i11 & 16384) == 0;
        this.computeSvuid = z10;
        if (z10) {
            this.name = str;
            this.access = i11;
            this.interfaces = (String[]) strArr.clone();
            this.svuidFields = new ArrayList();
            this.svuidConstructors = new ArrayList();
            this.svuidMethods = new ArrayList();
        }
        super.visit(i10, i11, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        if (this.computeSvuid && !this.hasSvuid) {
            try {
                addSVUID(computeSVUID());
            } catch (IOException e10) {
                throw new IllegalStateException("Error while computing SVUID for " + this.name, e10);
            }
        }
        super.visitEnd();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i10, String str, String str2, String str3, Object obj) {
        if (this.computeSvuid) {
            if ("serialVersionUID".equals(str)) {
                this.computeSvuid = false;
                this.hasSvuid = true;
            }
            if ((i10 & 2) == 0 || (i10 & Opcodes.L2I) == 0) {
                this.svuidFields.add(new Item(str, i10 & 223, str2));
            }
        }
        return super.visitField(i10, str, str2, str3, obj);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i10) {
        String str4 = this.name;
        if (str4 != null && str4.equals(str)) {
            this.access = i10;
        }
        super.visitInnerClass(str, str2, str3, i10);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i10, String str, String str2, String str3, String[] strArr) {
        if (this.computeSvuid) {
            if (CLINIT.equals(str)) {
                this.hasStaticInitializer = true;
            }
            int i11 = i10 & 3391;
            if ((i10 & 2) == 0) {
                if ("<init>".equals(str)) {
                    this.svuidConstructors.add(new Item(str, i11, str2));
                } else if (!CLINIT.equals(str)) {
                    this.svuidMethods.add(new Item(str, i11, str2));
                }
            }
        }
        return super.visitMethod(i10, str, str2, str3, strArr);
    }

    public SerialVersionUIDAdder(int i10, ClassVisitor classVisitor) {
        super(i10, classVisitor);
    }
}
