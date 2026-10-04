package okio;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class W implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5362l f225885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5360j f225886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a0 f225887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f225888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f225889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f225890f;

    public W(@NotNull InterfaceC5362l upstream) {
        kotlin.jvm.internal.G.p(upstream, "upstream");
        this.f225885a = upstream;
        C5360j buffer = upstream.getBuffer();
        this.f225886b = buffer;
        a0 a0Var = buffer.f226050a;
        this.f225887c = a0Var;
        this.f225888d = a0Var != null ? a0Var.f225915b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f225915b) goto L15;
     */
    @Override // okio.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long L3(@org.jetbrains.annotations.NotNull okio.C5360j r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.G.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L72
            boolean r3 = r8.f225889e
            if (r3 != 0) goto L6a
            okio.a0 r3 = r8.f225887c
            if (r3 == 0) goto L2b
            okio.j r4 = r8.f225886b
            okio.a0 r4 = r4.f226050a
            if (r3 != r4) goto L23
            int r3 = r8.f225888d
            kotlin.jvm.internal.G.m(r4)
            int r4 = r4.f225915b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            okio.l r0 = r8.f225885a
            long r1 = r8.f225890f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            okio.a0 r0 = r8.f225887c
            if (r0 != 0) goto L51
            okio.j r0 = r8.f225886b
            okio.a0 r0 = r0.f226050a
            if (r0 == 0) goto L51
            r8.f225887c = r0
            kotlin.jvm.internal.G.m(r0)
            int r0 = r0.f225915b
            r8.f225888d = r0
        L51:
            okio.j r0 = r8.f225886b
            long r0 = r0.f226051b
            long r2 = r8.f225890f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.j r2 = r8.f225886b
            long r4 = r8.f225890f
            r3 = r9
            r2.y(r3, r4, r6)
            long r9 = r8.f225890f
            long r9 = r9 + r6
            r8.f225890f = r9
            return r6
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L72:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.collection.Q.a(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.W.L3(okio.j, long):long");
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f225889e = true;
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return this.f225885a.timeout();
    }
}
