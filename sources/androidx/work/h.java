package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    public class a extends h {
        @Override // androidx.work.h
        @Nullable
        public g a(@NonNull String className) {
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static h c() {
        return new a();
    }

    @Nullable
    public abstract g a(@NonNull String className);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final g b(@NonNull String className) {
        return g.a(className);
    }
}
