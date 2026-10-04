package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.time.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5039f {

    /* JADX INFO: renamed from: kotlin.time.f$a */
    public static final class a implements InterfaceC5038e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f218416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Instant f218417c;

        public a(F f10, Instant instant) {
            this.f218417c = instant;
            this.f218416b = f10.a();
        }

        @Override // kotlin.time.InterfaceC5038e
        public Instant a() {
            return this.f218417c.m(this.f218416b.a());
        }
    }

    @InterfaceC4887e0(version = "2.3")
    @dd.j(name = "fromTimeSource")
    @NotNull
    @O0(markerClass = {n.class})
    public static final InterfaceC5038e a(@NotNull F f10, @NotNull Instant origin) {
        kotlin.jvm.internal.G.p(f10, "<this>");
        kotlin.jvm.internal.G.p(origin, "origin");
        return new a(f10, origin);
    }
}
