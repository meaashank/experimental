package org.objectweb.asm;

import w.y;

/* JADX INFO: loaded from: classes8.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i10) {
        super(y.a("Class too large: ", str));
        this.className = str;
        this.constantPoolCount = i10;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
