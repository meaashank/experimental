package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;

/* JADX INFO: loaded from: classes2.dex */
public enum Syntax implements V.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final V.d<Syntax> internalValueMap = new a();
    private final int value;

    public static class a implements V.d<Syntax> {
        @Override // androidx.datastore.preferences.protobuf.V.d
        public V.c a(int i10) {
            return Syntax.forNumber(i10);
        }

        public Syntax b(int i10) {
            return Syntax.forNumber(i10);
        }
    }

    public static final class b implements V.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V.e f112704a = new b();

        @Override // androidx.datastore.preferences.protobuf.V.e
        public boolean a(int i10) {
            return Syntax.forNumber(i10) != null;
        }
    }

    Syntax(int i10) {
        this.value = i10;
    }

    public static Syntax forNumber(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static V.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static V.e internalGetVerifier() {
        return b.f112704a;
    }

    @Override // androidx.datastore.preferences.protobuf.V.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i10) {
        return forNumber(i10);
    }
}
