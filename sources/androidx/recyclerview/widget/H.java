package androidx.recyclerview.widget;

import androidx.recyclerview.widget.I;

/* JADX INFO: loaded from: classes2.dex */
public interface H<T> {

    public interface a<T> {
        void a(int i10, int i11, int i12, int i13, int i14);

        void b(int i10, int i11);

        void c(int i10);

        void d(I.a<T> aVar);
    }

    public interface b<T> {
        void a(int i10, int i11);

        void b(int i10, int i11);

        void c(int i10, I.a<T> aVar);
    }

    b<T> a(b<T> bVar);

    a<T> b(a<T> aVar);
}
