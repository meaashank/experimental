package androidx.work.impl;

import T2.r;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface e {

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public static final int f120397Y2 = 50;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public static final int f120398Z2 = 200;

    boolean b();

    void d(@NonNull String workSpecId);

    void e(@NonNull r... workSpecs);
}
