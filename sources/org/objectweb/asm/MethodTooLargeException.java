package org.objectweb.asm;

import C4.q;
import androidx.constraintlayout.core.parser.b;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes8.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    /* JADX WARN: Illegal instructions before constructor call */
    public MethodTooLargeException(String str, String str2, String str3, int i10) {
        StringBuilder sbA = b.a("Method too large: ", str, IconCache.EMPTY_CLASS_NAME, str2, q.f17581a);
        sbA.append(str3);
        super(sbA.toString());
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i10;
    }

    public String getClassName() {
        return this.className;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
