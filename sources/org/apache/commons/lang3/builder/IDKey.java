package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes6.dex */
final class IDKey {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f226121id;
    private final Object value;

    public IDKey(Object obj) {
        this.f226121id = System.identityHashCode(obj);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IDKey)) {
            return false;
        }
        IDKey iDKey = (IDKey) obj;
        return this.f226121id == iDKey.f226121id && this.value == iDKey.value;
    }

    public int hashCode() {
        return this.f226121id;
    }
}
