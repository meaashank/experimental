package kotlin.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class InstantSerialized implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218398c = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f218399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218400b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public InstantSerialized(long j10, int i10) {
        this.f218399a = j10;
        this.f218400b = i10;
    }

    private final Object readResolve() {
        return Instant.f218393c.c(this.f218399a, this.f218400b);
    }

    public final long d() {
        return this.f218399a;
    }

    public final int g() {
        return this.f218400b;
    }

    public final void h(long j10) {
        this.f218399a = j10;
    }

    public final void i(int i10) {
        this.f218400b = i10;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        kotlin.jvm.internal.G.p(input, "input");
        this.f218399a = input.readLong();
        this.f218400b = input.readInt();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        kotlin.jvm.internal.G.p(output, "output");
        output.writeLong(this.f218399a);
        output.writeInt(this.f218400b);
    }

    public InstantSerialized() {
        this(0L, 0);
    }
}
