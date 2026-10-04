package org.objectweb.asm;

import androidx.compose.runtime.R0;

/* JADX INFO: loaded from: classes8.dex */
public final class Handle {
    private final String descriptor;
    private final boolean isInterface;
    private final String name;
    private final String owner;
    private final int tag;

    @Deprecated
    public Handle(int i10, String str, String str2, String str3) {
        this(i10, str, str2, str3, i10 == 9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.tag == handle.tag && this.isInterface == handle.isInterface && this.owner.equals(handle.owner) && this.name.equals(handle.name) && this.descriptor.equals(handle.descriptor);
    }

    public String getDesc() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.descriptor.hashCode() * this.name.hashCode() * this.owner.hashCode()) + this.tag + (this.isInterface ? 64 : 0);
    }

    public boolean isInterface() {
        return this.isInterface;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.owner);
        sb2.append('.');
        sb2.append(this.name);
        sb2.append(this.descriptor);
        sb2.append(" (");
        sb2.append(this.tag);
        return R0.a(sb2, this.isInterface ? " itf" : "", ')');
    }

    public Handle(int i10, String str, String str2, String str3, boolean z10) {
        this.tag = i10;
        this.owner = str;
        this.name = str2;
        this.descriptor = str3;
        this.isInterface = z10;
    }
}
