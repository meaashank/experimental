package kotlinx.collections.immutable;

import fd.InterfaceC4418a;
import java.util.List;
import kotlin.collections.AbstractC4859d;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5550a;
import ud.e;

/* JADX INFO: loaded from: classes5.dex */
public interface b<E> extends List<E>, InterfaceC5550a<E>, InterfaceC4418a {

    public static final class a {
        @NotNull
        public static <E> b<E> a(@NotNull b<? extends E> bVar, int i10, int i11) {
            return new C0827b(bVar, i10, i11);
        }
    }

    /* JADX INFO: renamed from: kotlinx.collections.immutable.b$b, reason: collision with other inner class name */
    public static final class C0827b<E> extends AbstractC4859d<E> implements b<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final b<E> f218502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f218503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f218504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f218505f;

        /* JADX WARN: Multi-variable type inference failed */
        public C0827b(@NotNull b<? extends E> source, int i10, int i11) {
            G.p(source, "source");
            this.f218502c = source;
            this.f218503d = i10;
            this.f218504e = i11;
            e.c(i10, i11, source.size());
            this.f218505f = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public E get(int i10) {
            e.a(i10, this.f218505f);
            return this.f218502c.get(this.f218503d + i10);
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f218505f;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List, H.c
        @NotNull
        public b<E> subList(int i10, int i11) {
            e.c(i10, i11, this.f218505f);
            b<E> bVar = this.f218502c;
            int i12 = this.f218503d;
            return new C0827b(bVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    @NotNull
    b<E> subList(int i10, int i11);
}
