package kotlin.collections.builders;

import androidx.compose.animation.core.C1610t;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217591b = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Map<?, ?> f217592a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public SerializedMap(@NotNull Map<?, ?> map) {
        G.p(map, "map");
        this.f217592a = map;
    }

    private final Object readResolve() {
        return this.f217592a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws IOException {
        G.p(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException(android.support.v4.media.c.a("Unsupported flags value: ", b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(C1610t.a("Illegal size value: ", i10, '.'));
        }
        MapBuilder mapBuilder = new MapBuilder(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        this.f217592a = mapBuilder.q();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        G.p(output, "output");
        output.writeByte(0);
        output.writeInt(this.f217592a.size());
        for (Map.Entry<?, ?> entry : this.f217592a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(n0.z());
    }
}
