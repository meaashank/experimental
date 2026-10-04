package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;

/* JADX INFO: loaded from: classes2.dex */
public enum NullValue implements V.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final V.d<NullValue> internalValueMap = new a();
    private final int value;

    public static class a implements V.d<NullValue> {
        @Override // androidx.datastore.preferences.protobuf.V.d
        public V.c a(int i10) {
            return NullValue.forNumber(i10);
        }

        public NullValue b(int i10) {
            return NullValue.forNumber(i10);
        }
    }

    public static final class b implements V.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V.e f112668a = new b();

        @Override // androidx.datastore.preferences.protobuf.V.e
        public boolean a(int i10) {
            return NullValue.forNumber(i10) != null;
        }
    }

    NullValue(int i10) {
        this.value = i10;
    }

    public static NullValue forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static V.d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static V.e internalGetVerifier() {
        return b.f112668a;
    }

    @Override // androidx.datastore.preferences.protobuf.V.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i10) {
        return forNumber(i10);
    }
}
