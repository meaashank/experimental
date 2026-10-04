package org.objectweb.asm;

/* JADX INFO: loaded from: classes8.dex */
final class SymbolTable {
    private int bootstrapMethodCount;
    private ByteVector bootstrapMethods;
    private String className;
    final ClassWriter classWriter;
    private ByteVector constantPool;
    private int constantPoolCount;
    private Entry[] entries;
    private int entryCount;
    private int majorVersion;
    private final ClassReader sourceClassReader;
    private int typeCount;
    private Entry[] typeTable;

    public SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
        this.sourceClassReader = null;
        this.entries = new Entry[256];
        this.constantPoolCount = 1;
        this.constantPool = new ByteVector();
    }

    private void add(Entry entry) {
        this.entryCount++;
        int i10 = entry.hashCode;
        Entry[] entryArr = this.entries;
        int length = i10 % entryArr.length;
        entry.next = entryArr[length];
        entryArr[length] = entry;
    }

    private Symbol addConstantDynamicOrInvokeDynamicReference(int i10, String str, String str2, int i11) {
        int iHash = hash(i10, str, str2, i11);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i10 && entry.hashCode == iHash && entry.data == i11 && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry;
            }
        }
        this.constantPool.put122(i10, i11, addConstantNameAndType(str, str2));
        int i12 = this.constantPoolCount;
        this.constantPoolCount = i12 + 1;
        return put(new Entry(i12, i10, null, str, str2, i11, iHash));
    }

    private Symbol addConstantIntegerOrFloat(int i10, int i11) {
        int iHash = hash(i10, i11);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i10 && entry.hashCode == iHash && entry.data == i11) {
                return entry;
            }
        }
        this.constantPool.putByte(i10).putInt(i11);
        int i12 = this.constantPoolCount;
        this.constantPoolCount = i12 + 1;
        return put(new Entry(i12, i10, i11, iHash));
    }

    private Symbol addConstantLongOrDouble(int i10, long j10) {
        int iHash = hash(i10, j10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i10 && entry.hashCode == iHash && entry.data == j10) {
                return entry;
            }
        }
        int i11 = this.constantPoolCount;
        this.constantPool.putByte(i10).putLong(j10);
        this.constantPoolCount += 2;
        return put(new Entry(i11, i10, j10, iHash));
    }

    private Entry addConstantMemberReference(int i10, String str, String str2, String str3) {
        int iHash = hash(i10, str, str2, str3);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i10 && entry.hashCode == iHash && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        this.constantPool.put122(i10, addConstantClass(str).index, addConstantNameAndType(str2, str3));
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Entry(i11, i10, str, str2, str3, 0L, iHash));
    }

    private Symbol addConstantUtf8Reference(int i10, String str) {
        int iHash = hash(i10, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i10 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry;
            }
        }
        this.constantPool.put12(i10, addConstantUtf8(str));
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Entry(i11, i10, str, iHash));
    }

    private int addTypeInternal(Entry entry) {
        if (this.typeTable == null) {
            this.typeTable = new Entry[16];
        }
        int i10 = this.typeCount;
        Entry[] entryArr = this.typeTable;
        if (i10 == entryArr.length) {
            Entry[] entryArr2 = new Entry[entryArr.length * 2];
            System.arraycopy(entryArr, 0, entryArr2, 0, entryArr.length);
            this.typeTable = entryArr2;
        }
        Entry[] entryArr3 = this.typeTable;
        int i11 = this.typeCount;
        this.typeCount = i11 + 1;
        entryArr3[i11] = entry;
        return put(entry).index;
    }

    private void copyBootstrapMethods(ClassReader classReader, char[] cArr) {
        byte[] bArr = classReader.classFileBuffer;
        int firstAttributeOffset = classReader.getFirstAttributeOffset();
        int unsignedShort = classReader.readUnsignedShort(firstAttributeOffset - 2);
        while (true) {
            if (unsignedShort <= 0) {
                break;
            }
            if ("BootstrapMethods".equals(classReader.readUTF8(firstAttributeOffset, cArr))) {
                this.bootstrapMethodCount = classReader.readUnsignedShort(firstAttributeOffset + 6);
                break;
            } else {
                firstAttributeOffset += classReader.readInt(firstAttributeOffset + 2) + 6;
                unsignedShort--;
            }
        }
        if (this.bootstrapMethodCount > 0) {
            int i10 = firstAttributeOffset + 8;
            int i11 = classReader.readInt(firstAttributeOffset + 2) - 2;
            ByteVector byteVector = new ByteVector(i11);
            this.bootstrapMethods = byteVector;
            byteVector.putByteArray(bArr, i10, i11);
            int i12 = i10;
            for (int i13 = 0; i13 < this.bootstrapMethodCount; i13++) {
                int i14 = i12 - i10;
                int unsignedShort2 = classReader.readUnsignedShort(i12);
                int unsignedShort3 = classReader.readUnsignedShort(i12 + 2);
                i12 += 4;
                int iHashCode = classReader.readConst(unsignedShort2, cArr).hashCode();
                while (true) {
                    int i15 = unsignedShort3 - 1;
                    if (unsignedShort3 > 0) {
                        int unsignedShort4 = classReader.readUnsignedShort(i12);
                        i12 += 2;
                        iHashCode ^= classReader.readConst(unsignedShort4, cArr).hashCode();
                        unsignedShort3 = i15;
                    }
                }
                add(new Entry(i13, 64, i14, iHashCode & Integer.MAX_VALUE));
            }
        }
    }

    private Entry get(int i10) {
        Entry[] entryArr = this.entries;
        return entryArr[i10 % entryArr.length];
    }

    private static int hash(int i10, int i11) {
        return (i10 + i11) & Integer.MAX_VALUE;
    }

    private Entry put(Entry entry) {
        int i10 = this.entryCount;
        Entry[] entryArr = this.entries;
        if (i10 > (entryArr.length * 3) / 4) {
            int length = entryArr.length;
            int i11 = (length * 2) + 1;
            Entry[] entryArr2 = new Entry[i11];
            for (int i12 = length - 1; i12 >= 0; i12--) {
                Entry entry2 = this.entries[i12];
                while (entry2 != null) {
                    int i13 = entry2.hashCode % i11;
                    Entry entry3 = entry2.next;
                    entry2.next = entryArr2[i13];
                    entryArr2[i13] = entry2;
                    entry2 = entry3;
                }
            }
            this.entries = entryArr2;
        }
        this.entryCount++;
        int i14 = entry.hashCode;
        Entry[] entryArr3 = this.entries;
        int length2 = i14 % entryArr3.length;
        entry.next = entryArr3[length2];
        entryArr3[length2] = entry;
        return entry;
    }

    public Symbol addBootstrapMethod(Handle handle, Object... objArr) {
        ByteVector byteVector = this.bootstrapMethods;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.bootstrapMethods = byteVector;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = addConstant(objArr[i10]).index;
        }
        int i11 = byteVector.length;
        byteVector.putShort(addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface()).index);
        byteVector.putShort(length);
        for (int i12 = 0; i12 < length; i12++) {
            byteVector.putShort(iArr[i12]);
        }
        int i13 = byteVector.length - i11;
        int iHashCode = handle.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        return addBootstrapMethod(i11, i13, iHashCode & Integer.MAX_VALUE);
    }

    public Symbol addConstant(Object obj) {
        if (obj instanceof Integer) {
            return addConstantInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return addConstantInteger(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return addConstantInteger(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return addConstantInteger(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return addConstantFloat(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return addConstantLong(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return addConstantDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return addConstantString((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            return sort == 10 ? addConstantClass(type.getInternalName()) : sort == 11 ? addConstantMethodType(type.getDescriptor()) : addConstantClass(type.getDescriptor());
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface());
        }
        if (obj instanceof ConstantDynamic) {
            ConstantDynamic constantDynamic = (ConstantDynamic) obj;
            return addConstantDynamic(constantDynamic.getName(), constantDynamic.getDescriptor(), constantDynamic.getBootstrapMethod(), constantDynamic.getBootstrapMethodArgumentsUnsafe());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    public Symbol addConstantClass(String str) {
        return addConstantUtf8Reference(7, str);
    }

    public Symbol addConstantDouble(double d10) {
        return addConstantLongOrDouble(6, Double.doubleToRawLongBits(d10));
    }

    public Symbol addConstantDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(17, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    public Symbol addConstantFieldref(String str, String str2, String str3) {
        return addConstantMemberReference(9, str, str2, str3);
    }

    public Symbol addConstantFloat(float f10) {
        return addConstantIntegerOrFloat(4, Float.floatToRawIntBits(f10));
    }

    public Symbol addConstantInteger(int i10) {
        return addConstantIntegerOrFloat(3, i10);
    }

    public Symbol addConstantInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(18, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    public Symbol addConstantLong(long j10) {
        return addConstantLongOrDouble(5, j10);
    }

    public Symbol addConstantMethodHandle(int i10, String str, String str2, String str3, boolean z10) {
        int iHash = hash(15, str, str2, str3, i10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 15 && entry.hashCode == iHash && entry.data == i10 && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        if (i10 <= 4) {
            this.constantPool.put112(15, i10, addConstantFieldref(str, str2, str3).index);
        } else {
            this.constantPool.put112(15, i10, addConstantMethodref(str, str2, str3, z10).index);
        }
        int i11 = this.constantPoolCount;
        this.constantPoolCount = i11 + 1;
        return put(new Entry(i11, 15, str, str2, str3, i10, iHash));
    }

    public Symbol addConstantMethodType(String str) {
        return addConstantUtf8Reference(16, str);
    }

    public Symbol addConstantMethodref(String str, String str2, String str3, boolean z10) {
        return addConstantMemberReference(z10 ? 11 : 10, str, str2, str3);
    }

    public Symbol addConstantModule(String str) {
        return addConstantUtf8Reference(19, str);
    }

    public int addConstantNameAndType(String str, String str2) {
        int iHash = hash(12, str, str2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 12 && entry.hashCode == iHash && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Entry(i10, 12, str, str2, iHash)).index;
    }

    public Symbol addConstantPackage(String str) {
        return addConstantUtf8Reference(20, str);
    }

    public Symbol addConstantString(String str) {
        return addConstantUtf8Reference(8, str);
    }

    public int addConstantUtf8(String str) {
        int iHash = hash(1, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 1 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i10 = this.constantPoolCount;
        this.constantPoolCount = i10 + 1;
        return put(new Entry(i10, 1, str, iHash)).index;
    }

    public int addMergedType(int i10, int i11) {
        long j10;
        long j11;
        if (i10 < i11) {
            j10 = i10;
            j11 = i11;
        } else {
            j10 = i11;
            j11 = i10;
        }
        long j12 = j10 | (j11 << 32);
        int iHash = hash(130, i10 + i11);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 130 && entry.hashCode == iHash && entry.data == j12) {
                return entry.info;
            }
        }
        Entry[] entryArr = this.typeTable;
        int iAddType = addType(this.classWriter.getCommonSuperClass(entryArr[i10].value, entryArr[i11].value));
        put(new Entry(this.typeCount, 130, j12, iHash)).info = iAddType;
        return iAddType;
    }

    public int addType(String str) {
        int iHash = hash(128, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 128 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, 128, str, iHash));
    }

    public int addUninitializedType(String str, int i10) {
        int iHash = hash(129, str, i10);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 129 && entry.hashCode == iHash && entry.data == i10 && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, 129, str, i10, iHash));
    }

    public int computeBootstrapMethodsSize() {
        if (this.bootstrapMethods == null) {
            return 0;
        }
        addConstantUtf8("BootstrapMethods");
        return this.bootstrapMethods.length + 8;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }

    public int getConstantPoolLength() {
        return this.constantPool.length;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public ClassReader getSource() {
        return this.sourceClassReader;
    }

    public Symbol getType(int i10) {
        return this.typeTable[i10];
    }

    public void putBootstrapMethods(ByteVector byteVector) {
        if (this.bootstrapMethods != null) {
            ByteVector byteVectorPutShort = byteVector.putShort(addConstantUtf8("BootstrapMethods")).putInt(this.bootstrapMethods.length + 2).putShort(this.bootstrapMethodCount);
            ByteVector byteVector2 = this.bootstrapMethods;
            byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
        }
    }

    public void putConstantPool(ByteVector byteVector) {
        ByteVector byteVectorPutShort = byteVector.putShort(this.constantPoolCount);
        ByteVector byteVector2 = this.constantPool;
        byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
    }

    public int setMajorVersionAndClassName(int i10, String str) {
        this.majorVersion = i10;
        this.className = str;
        return addConstantClass(str).index;
    }

    public static class Entry extends Symbol {
        final int hashCode;
        Entry next;

        public Entry(int i10, int i11, String str, String str2, String str3, long j10, int i12) {
            super(i10, i11, str, str2, str3, j10);
            this.hashCode = i12;
        }

        public Entry(int i10, int i11, String str, int i12) {
            super(i10, i11, null, null, str, 0L);
            this.hashCode = i12;
        }

        public Entry(int i10, int i11, String str, long j10, int i12) {
            super(i10, i11, null, null, str, j10);
            this.hashCode = i12;
        }

        public Entry(int i10, int i11, String str, String str2, int i12) {
            super(i10, i11, null, str, str2, 0L);
            this.hashCode = i12;
        }

        public Entry(int i10, int i11, long j10, int i12) {
            super(i10, i11, null, null, null, j10);
            this.hashCode = i12;
        }
    }

    private static int hash(int i10, long j10) {
        return (i10 + ((int) j10) + ((int) (j10 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int hash(int i10, String str) {
        return Integer.MAX_VALUE & (str.hashCode() + i10);
    }

    private static int hash(int i10, String str, int i11) {
        return Integer.MAX_VALUE & (str.hashCode() + i10 + i11);
    }

    private static int hash(int i10, String str, String str2) {
        return Integer.MAX_VALUE & ((str2.hashCode() * str.hashCode()) + i10);
    }

    private static int hash(int i10, String str, String str2, int i11) {
        return Integer.MAX_VALUE & (((i11 + 1) * str2.hashCode() * str.hashCode()) + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SymbolTable(org.objectweb.asm.ClassWriter r12, org.objectweb.asm.ClassReader r13) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.SymbolTable.<init>(org.objectweb.asm.ClassWriter, org.objectweb.asm.ClassReader):void");
    }

    private void addConstantIntegerOrFloat(int i10, int i11, int i12) {
        add(new Entry(i10, i11, i12, hash(i11, i12)));
    }

    private void addConstantUtf8Reference(int i10, int i11, String str) {
        add(new Entry(i10, i11, str, hash(i11, str)));
    }

    private static int hash(int i10, String str, String str2, String str3) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i10);
    }

    private static int hash(int i10, String str, String str2, String str3, int i11) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i11) + i10);
    }

    private void addConstantDynamicOrInvokeDynamicReference(int i10, int i11, String str, String str2, int i12) {
        add(new Entry(i11, i10, null, str, str2, i12, hash(i10, str, str2, i12)));
    }

    private void addConstantLongOrDouble(int i10, int i11, long j10) {
        add(new Entry(i10, i11, j10, hash(i11, j10)));
    }

    private void addConstantUtf8(int i10, String str) {
        add(new Entry(i10, 1, str, hash(1, str)));
    }

    private void addConstantNameAndType(int i10, String str, String str2) {
        add(new Entry(i10, 12, str, str2, hash(12, str, str2)));
    }

    private void addConstantMemberReference(int i10, int i11, String str, String str2, String str3) {
        add(new Entry(i10, i11, str, str2, str3, 0L, hash(i11, str, str2, str3)));
    }

    private void addConstantMethodHandle(int i10, int i11, String str, String str2, String str3) {
        add(new Entry(i10, 15, str, str2, str3, i11, hash(15, str, str2, str3, i11)));
    }

    private Symbol addBootstrapMethod(int i10, int i11, int i12) {
        byte[] bArr = this.bootstrapMethods.data;
        for (Entry entry = get(i12); entry != null; entry = entry.next) {
            if (entry.tag == 64 && entry.hashCode == i12) {
                int i13 = (int) entry.data;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (bArr[i10 + i14] != bArr[i13 + i14]) {
                        break;
                    }
                }
                this.bootstrapMethods.length = i10;
                return entry;
            }
        }
        int i15 = this.bootstrapMethodCount;
        this.bootstrapMethodCount = i15 + 1;
        return put(new Entry(i15, 64, i10, i12));
    }
}
