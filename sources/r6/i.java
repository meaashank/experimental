package r6;

import android.content.Context;
import com.prism.commons.utils.C3861z;
import com.prism.commons.utils.S;
import com.prism.commons.utils.V;

/* JADX INFO: loaded from: classes5.dex */
public class i<T> extends C3861z<k<T>, Context> {
    public i(final V v10, final String str, final T t10, final Class<T> cls) {
        super(new C3861z.a() { // from class: r6.g
            @Override // com.prism.commons.utils.C3861z.a
            public final Object a(Object obj) {
                return i.c(v10, str, t10, cls, (Context) obj);
            }
        });
    }

    public static /* synthetic */ k b(V v10, String str, Object obj, Class cls, boolean z10, Context context) {
        return new k(S.b(context, v10, str, obj, cls), z10);
    }

    public static k c(V v10, String str, Object obj, Class cls, Context context) {
        return new k(S.b(context, v10, str, obj, cls), false);
    }

    public i(final V v10, final String str, final T t10, final Class<T> cls, final boolean z10) {
        super(new C3861z.a() { // from class: r6.h
            @Override // com.prism.commons.utils.C3861z.a
            public final Object a(Object obj) {
                return i.b(v10, str, t10, cls, z10, (Context) obj);
            }
        });
    }
}
