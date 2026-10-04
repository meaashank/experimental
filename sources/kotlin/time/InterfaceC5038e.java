package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.time.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.3")
@O0(markerClass = {n.class})
public interface InterfaceC5038e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f218413a = a.f218414a;

    /* JADX INFO: renamed from: kotlin.time.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f218414a = new a();
    }

    /* JADX INFO: renamed from: kotlin.time.e$b */
    public static final class b implements InterfaceC5038e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f218415b = new b();

        @Override // kotlin.time.InterfaceC5038e
        @NotNull
        public Instant a() {
            return p.b();
        }
    }

    @NotNull
    Instant a();
}
