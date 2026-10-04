package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218722e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218723f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f218724g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f218718a = new kotlinx.coroutines.internal.Q("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final kotlinx.coroutines.internal.Q f218719b = new kotlinx.coroutines.internal.Q("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f218720c = new kotlinx.coroutines.internal.Q("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f218721d = new kotlinx.coroutines.internal.Q("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f218725h = new kotlinx.coroutines.internal.Q("SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C5064h0 f218726i = new C5064h0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final C5064h0 f218727j = new C5064h0(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof InterfaceC5114u0 ? new C5116v0((InterfaceC5114u0) obj) : obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        InterfaceC5114u0 interfaceC5114u0;
        C5116v0 c5116v0 = obj instanceof C5116v0 ? (C5116v0) obj : null;
        return (c5116v0 == null || (interfaceC5114u0 = c5116v0.f220806a) == null) ? obj : interfaceC5114u0;
    }
}
