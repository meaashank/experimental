package androidx.compose.foundation.lazy.grid;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f91439a = a.f91442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91440b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91441c = -1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f91442a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91443b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f91444c = -1;
    }

    long b();

    long c();

    @Nullable
    Object getContentType();

    int getIndex();

    @NotNull
    Object getKey();

    int i();

    int l();
}
