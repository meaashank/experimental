package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes5.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f159944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f159945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f159946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f159947d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f159945b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f159944a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f159946c;
    }

    public e(int i10, int i11) {
        this(i10, 60000L, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f159946c + 1;
        this.f159946c = i10;
        return i10 <= this.f159947d;
    }

    public e(int i10, long j10, int i11) {
        this.f159945b = j10;
        this.f159944a = i10;
        this.f159947d = i11;
    }
}
