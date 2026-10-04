package r6;

import android.content.Context;
import androidx.annotation.NonNull;
import com.prism.commons.utils.T;
import com.prism.commons.utils.V;
import com.prism.commons.utils.w0;
import com.prism.commons.utils.y0;

/* JADX INFO: loaded from: classes5.dex */
public class j<T> extends n<T, Context> {

    public static class a<T> implements y0<T, Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0<T, Context> f227249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w0<T, Context> f227250b;

        public a(V v10, String str, @NonNull w0<T, Context> w0Var, Class<T> cls) {
            this.f227249a = T.c(v10, str, null, cls);
            this.f227250b = w0Var;
        }

        @Override // com.prism.commons.utils.w0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(Context context) {
            T tB = this.f227249a.b(context);
            return tB == null ? this.f227250b.b(context) : tB;
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(Context context, T t10) {
            this.f227249a.a(context, t10);
        }
    }

    public j(y0<T, Context> y0Var) {
        super(y0Var);
    }

    public j(V v10, String str, T t10, Class<T> cls) {
        super(T.c(v10, str, t10, cls));
    }

    public j(String str, String str2, T t10, Class<T> cls) {
        this(new V(str), str2, t10, cls);
    }

    public j(V v10, String str, w0<T, Context> w0Var, Class<T> cls) {
        super(new a(v10, str, w0Var, cls));
    }
}
