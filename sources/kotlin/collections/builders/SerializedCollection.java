package kotlin.collections.builders;

import androidx.compose.animation.core.C1610t;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
public final class SerializedCollection implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f217586c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f217587d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f217588e = 1;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Collection<?> f217589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217590b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public SerializedCollection() {
        this(EmptyList.f217510a, 0);
    }

    private final Object readResolve() {
        return this.f217589a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws IOException {
        Collection<?> collectionA;
        G.p(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException(C1610t.a("Unsupported flags value: ", b10, '.'));
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(C1610t.a("Illegal size value: ", i11, '.'));
        }
        int i12 = 0;
        if (i10 == 0) {
            ListBuilder listBuilder = new ListBuilder(i11);
            while (i12 < i11) {
                listBuilder.add(input.readObject());
                i12++;
            }
            collectionA = listBuilder.A();
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException(C1610t.a("Unsupported collection type tag: ", i10, '.'));
            }
            SetBuilder setBuilder = new SetBuilder(i11);
            while (i12 < i11) {
                setBuilder.add(input.readObject());
                i12++;
            }
            collectionA = setBuilder.g();
        }
        this.f217589a = collectionA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        G.p(output, "output");
        output.writeByte(this.f217590b);
        output.writeInt(this.f217589a.size());
        Iterator<?> it = this.f217589a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection(@NotNull Collection<?> collection, int i10) {
        G.p(collection, "collection");
        this.f217589a = collection;
        this.f217590b = i10;
    }
}
