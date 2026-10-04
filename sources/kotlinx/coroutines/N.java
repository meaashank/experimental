package kotlinx.coroutines;

import ed.InterfaceC4376a;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f218773a = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f218774b = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f218775c = "auto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f218776d = "on";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f218777e = "off";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f218778f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f218779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f218780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final AtomicLong f218781i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals(kotlinx.coroutines.N.f218776d) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.V.b(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = r2
            goto L61
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = r1
            goto L61
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.<init>(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L61:
            kotlinx.coroutines.N.f218779g = r0
            if (r0 == 0) goto L6e
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.W.d(r0, r1)
            if (r0 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r2
        L6f:
            kotlinx.coroutines.N.f218780h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.N.f218781i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N.<clinit>():void");
    }

    public static final boolean b() {
        return f218778f;
    }

    @NotNull
    public static final AtomicLong c() {
        return f218781i;
    }

    public static final boolean d() {
        return f218779g;
    }

    public static final boolean e() {
        return f218780h;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void f() {
    }

    public static final void g() {
        f218781i.set(0L);
    }

    @Xc.f
    public static final void a(InterfaceC4376a<Boolean> interfaceC4376a) {
    }
}
