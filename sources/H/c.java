package H;

import fd.InterfaceC4418a;
import java.util.List;
import kotlin.collections.AbstractC4859d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface c<E> extends List<E>, H.a<E>, InterfaceC4418a {

    public static final class a<E> extends AbstractC4859d<E> implements c<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final c<E> f45414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45417f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull c<? extends E> cVar, int i10, int i11) {
            this.f45414c = cVar;
            this.f45415d = i10;
            this.f45416e = i11;
            M.e.c(i10, i11, cVar.size());
            this.f45417f = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public E get(int i10) {
            M.e.a(i10, this.f45417f);
            return this.f45414c.get(this.f45415d + i10);
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f45417f;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List, H.c
        @NotNull
        public c<E> subList(int i10, int i11) {
            M.e.c(i10, i11, this.f45417f);
            c<E> cVar = this.f45414c;
            int i12 = this.f45415d;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    @NotNull
    c<E> subList(int i10, int i11);

    @Override // java.util.List
    /* bridge */ /* synthetic */ List subList(int i10, int i11);
}
