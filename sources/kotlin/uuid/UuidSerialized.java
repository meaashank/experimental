package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.uuid.a
final class UuidSerialized implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218481c = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f218482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f218483b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public UuidSerialized(long j10, long j11) {
        this.f218482a = j10;
        this.f218483b = j11;
    }

    private final Object readResolve() {
        return Uuid.f218475c.b(this.f218482a, this.f218483b);
    }

    public final long d() {
        return this.f218483b;
    }

    public final long g() {
        return this.f218482a;
    }

    public final void h(long j10) {
        this.f218483b = j10;
    }

    public final void i(long j10) {
        this.f218482a = j10;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        G.p(input, "input");
        this.f218482a = input.readLong();
        this.f218483b = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        G.p(output, "output");
        output.writeLong(this.f218482a);
        output.writeLong(this.f218483b);
    }

    public UuidSerialized() {
        this(0L, 0L);
    }
}
