package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements InterfaceC2531j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f112561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f112563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112564d;

    public E0(MessageLite messageLite, String str, Object[] objArr) {
        this.f112561a = messageLite;
        this.f112562b = str;
        this.f112563c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f112564d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f112564d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public boolean a() {
        return (this.f112564d & 2) == 2;
    }

    public Object[] b() {
        return this.f112563c;
    }

    public String c() {
        return this.f112562b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public MessageLite getDefaultInstance() {
        return this.f112561a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public ProtoSyntax getSyntax() {
        return (this.f112564d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
