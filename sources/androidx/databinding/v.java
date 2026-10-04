package androidx.databinding;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface v<T> extends List<T> {

    public static abstract class a<T extends v> {
        public abstract void a(T sender);

        public abstract void f(T sender, int positionStart, int itemCount);

        public abstract void g(T sender, int positionStart, int itemCount);

        public abstract void h(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void i(T sender, int positionStart, int itemCount);
    }

    void Y1(a<? extends v<T>> callback);

    void n2(a<? extends v<T>> callback);
}
